package edu.lonestar.RFLOREScosc1337;
/**
 * 
 * @author Robert
 *
 */
public class Rectangle {
	/** rectangle width */
	private double width;
	/** rectangle length */
	private double length;
	
	/**
	 * constructor
	 * @param rectangle width
	 * @param rectangle length
	 */
	 
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getArea(){
		return (width * length);
	}
	/**
	 * 
	 */
	@Override
	public String toString(){
		return String.format("Rectangle width = %f\nRectangle length = %f\nRectangle area = %f",
				width, length, getArea());
	}
	}

