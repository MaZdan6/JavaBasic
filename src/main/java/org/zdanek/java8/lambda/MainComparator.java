package org.zdanek.java8.lambda;

import java.util.Comparator;
import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {

        //Comparator z lambda
        Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p2.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p2.getLastName().compareTo(p2.getFirstName());

        Function<Person, Integer> f1 = p -> p.getAge();
        Function<Person, String> f2 = p -> p.getFirstName();
        Function<Person, String> f3 = p -> p.getLastName();
        
        org.zdanek.java8.lambda.Comparator<Person> cmpPersonAge= org.zdanek.java8.lambda.Comparator.comparing(Person::getAge);
        
        org.zdanek.java8.lambda.Comparator<Person> cmpPersonLastName= org.zdanek.java8.lambda.Comparator.comparing(Person::getLastName);
        
        org.zdanek.java8.lambda.Comparator<Person> cmp= org.zdanek.java8.lambda.Comparator.comparing(Person::getLastName)
        													.thenCompare(Person::getFirstName)
        													.thenCompare(Person::getAge);
    }
}
