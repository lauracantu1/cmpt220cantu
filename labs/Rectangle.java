// Rectangle class represents the rectangle
public class Rectangle {
	
	double height;	// Height of rectangle
	double width;	// Width of rectangle
	

	/** A no-arg constructor that creates a default rectangle */
	Rectangle() {
		height = 1;
		width = 1;
		
	} 

	/** A constructor that will create
	 *  a rectangle with the specified width and height    */
	Rectangle(double newWidth, double newHeight) {
		height = newHeight;
		width = newWidth;
			}

	/** Return the area of this rectangle */
	
	double getArea() {
		
	return width * height; //Obtain a rectangle's Area
	}

	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (width + height); 
	}
}
