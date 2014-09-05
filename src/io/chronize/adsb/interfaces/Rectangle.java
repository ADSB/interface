package io.chronize.adsb.interfaces;

public class Rectangle implements Shape, Comparable<Shape> {

	private double _width;
	private double _height;

	/**
	 * Constructs rectangle with default dimensions of 0, 0
	 */
	public Rectangle() {
		this(0., 0.);
	}

	public Rectangle(double width, double height) {
		_width = width;
		_height = height;
	}

	/**
	 * Gets the area of the rectangle
	 *
	 * @return area of the rectangle
	 */
	@Override
	public double getArea() {
		return _width * _height;
	}

	/**
	 * Gets the perimeter of the rectangle
	 *
	 * @return perimeter of the rectangle
	 */
	@Override
	public double getPerimeter() {
		return 2 * _width + 2 * _height;
	}

	/**
	 * Gets the width of the rectangle
	 *
	 * @return width of the rectangle
	 */
	public double getWidth() {
		return _width;
	}

	/**
	 * Gets the height of the rectangle
	 *
	 * @return height of the rectangle
	 */
	public double getHeight() {
		return _height;
	}

	/**
	 * Sets the width of the rectangle
	 *
	 * @param width width of the rectangle
	 */
	public void setWidth(double width) {
		_width = width;
	}

	/**
	 * Sets the height of the rectangle
	 *
	 * @param height height of the rectangle
	 */
	public void setHeight(double height) {
		_height = height;
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
	 * Returns a string representation containing the Area, Perimeter, Width, and Height.
	 *
	 * @return string representation
	 */
	@Override
	public String toString() {
		return "[Type: io.chronize.adsb.interfaces.Rectangle] [Area: " + getArea() + "] [Perimeter: " + getPerimeter() + "] [Width: " + _width + "] [Height: " + _height + "]";
	}
}
