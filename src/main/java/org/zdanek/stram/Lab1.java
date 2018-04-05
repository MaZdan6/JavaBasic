package org.zdanek.stram;

import java.util.Random;
import java.util.stream.IntStream;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// TODO dokończyć
	public static void strumienieIpredykaty() {
		// podsumuj rękę pokerową
		IntStream stream = rzucKością5razyV3();
		/*
		 * int sum= stream.sum(); System.out.println(sum);
		 */

		// przefiltruj, by mieć rękę tylko parzystych, zwróć wynik, ile ich jest
		// metoda pośrednicząca
		stream.filter(n -> n % 2 == 0).forEach((n) -> System.out.println(n));

		// Czy ręka pokerowa składa się z nieparzystych(tylko)?
		// metoda kończąca
		// stream.allMatch(predicate)
	}

	public static IntStream rzucKością5razyV3() {
		IntStream stream = new Random().ints(5, 1, 6);
		return stream;
	}

	// skończony strumień losowych liczb
	public static void rzucKością5razyV2() {
		IntStream stream = new Random().ints(5, 1, 6);
		stream.forEach((i) -> System.out.println(i));
	}

	// lambda blokowa powinna coś zwracać. na końc bloku dodać return
	public static void rzucKością5razy() {
		IntStream.rangeClosed(1, 5).forEach((i) -> System.out.println(new Random().nextInt(6) + 1));
	}

	public static void rzutKością() {
		Random random = new Random();
		int number = random.nextInt(6) + 1;
		System.out.println(number);
	}

	public static void cw1() {
		System.out.println("zwykła pętla for");
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}

		// wywołuję strumień prawostronnie otwarty
		// lambdą wypisuję
		System.out.println("IntStream.range(1, 11).forEach(i->System.out.println(i));");
		IntStream.range(1, 11).forEach(i -> System.out.println(i));

		// strumień obustronnie zamknięty
		System.out.println("IntStream.rangeClosed(1, 10).forEach(i->System.out.println(i));");
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.println(i));

	}

}
