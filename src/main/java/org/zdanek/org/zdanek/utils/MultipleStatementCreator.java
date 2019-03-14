package org.zdanek.org.zdanek.utils;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MultipleStatementCreator {

    static String CSVfile = "r:\\tmp\\slo_11_uchylenia.csv";
    static String directory = "";



    public static void main(String[] args) {
        createInsertScript();
    }

    private static void createInsertScript(){
        System.out.println("CSVfile: "+CSVfile);
        String statement = "INSERT INTO [dbo].[tabela]([grupa],[tekst],[wartosc],[lp])VALUES('grupa',<tekst, varchar(255),>,<wartosc, varchar(150),>,<lp, int,>,NULL,'666666',GETDATE())";

        Reader in = null;
        try {
            in = new FileReader(CSVfile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Iterable<CSVRecord> records = null;
        try {
            records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int lp= 0;

        System.out.println("USE cn3");
        System.out.println("GO");
        for (CSVRecord record : records) {

            String tekst = record.get("tekst");
            String wartosc = record.get("wartosc");
            String insertStatement= createInsertStatement(statement,tekst,wartosc,Integer.toString(lp) );
            System.out.println(insertStatement);
            System.out.println("GO");
            lp++;
        }


    }

    private static String createInsertStatement(String insertQuery, String tekst, String wartosc, String lp) {
        String insertStatement = StringUtils.replace(insertQuery,"<tekst, varchar(255),>","'"+wartosc+"'");
        insertStatement= StringUtils.replace(insertStatement,"<wartosc, varchar(150),>","'"+tekst+"'");
        insertStatement= StringUtils.replace(insertStatement,"<lp, int,>",lp);
        return insertStatement;
    }
}
