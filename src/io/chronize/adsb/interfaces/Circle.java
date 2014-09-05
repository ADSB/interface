package io.chronize.adsb.interfaces;

public class Circle implements Shape, Comparable<Shape> {

	private double _radius;

	/**
	 * Constructs circle with default radius of 0
	 */
	public Circle() {
		this(0.);
	}

	public Circle(double radius) {
		_radius = radius;
	}

	/**
	 * Gets the area of the circle
	 *
	 * @return area of the circle
	 */
	@Override
	public double getArea() {
		return Math.PI * _radius * _radius;
	}

	/**
	 * Gets the perimeter of the circle
	 *
	 * @return perimeter of the circle
	 */
	@Override
	public double getPerimeter() {
		return Math.PI * 2 * _radius;
	}

	/**
	 * Gets the radius of the circle
	 *
	 * @return radius of the circle
	 */
	public double getRadius() {
		return _radius;
	}

	/**
	 * Sets the radius of the circle
	 *
	 * @param radius radius of the circle
	 */
	public void setRadius(double radius) {
		_radius = radius;
	}

	/**
	 * Calculates the relative comparison between two Shapes by comparing area.
	 *
	 * @param shape An instance of io.chronize.adsb.interfaces.Shape to compare.
	 *
	 * @return relative comparison
	 */
	@Override
	public int compareTo(Shape shape) {
		return Double.compare(getArea(), shape.getArea());
	}

	/**
	 * Returns a string representation containing the Area, Perimeter, and Radius.
	 *
	 * @return string representation
	 */
	@Override
	public String toString() {
		return "[Type: io.chronize.adsb.interfaces.Circle] [Area: " + getArea() + "] [Perimeter: " + getPerimeter() + "] [Radius: " + _radius + "]";
	}
}
