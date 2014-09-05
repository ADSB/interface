package io.chronize.adsb.interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// create some test shapes

		Rectangle rectangle = new Rectangle(5., 6.);
		Circle circle = new Circle(2.5);

		System.out.println(rectangle.getArea());
		System.out.println(circle.getArea());

		System.out.println(rectangle.compareTo(circle));

		// initialize io.chronize.adsb.interfaces.Shape array

		Shape[] myShapes = new Shape[] {
			new Rectangle(8., 12.),
			new Circle(5.),
			new Circle(7.),
			new Rectangle(10., 10.)
		};

		// print each io.chronize.adsb.interfaces.Shape

		for (Shape shape : myShapes) {
			System.out.println(shape);
		}

		// sort io.chronize.adsb.interfaces.Shape array

		Arrays.sort(myShapes);

		// print each io.chronize.adsb.interfaces.Shape again, sorted

		for (Shape shape : myShapes) {
			System.out.println(shape);
		}

		// initialize io.chronize.adsb.interfaces.Name array

		Name[] names = new Name[] {
			new Name("Alex"),
			new Name("John"),
			new Name("Lisa"),
			new Name("Dean")
		};

		// print each io.chronize.adsb.interfaces.Name

		for (Name name : names) {
			System.out.println(name);
		}

		// sort Names array

		Arrays.sort(names);

		// print each io.chronize.adsb.interfaces.Name again, sorted

		for (Name name : names) {
			System.out.println(name);
		}
	}

}
