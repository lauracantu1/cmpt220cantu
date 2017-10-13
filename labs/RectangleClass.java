public class RectangleClass {
	
	
	/** Main method */
	
	
	public static void main(String[] args) {

		
// Create a rectangle 
// Width= 4
// Height= 40
		Rectangle rectangleOne = new Rectangle(4, 40); //Another class named Rectangle will be created

// Create a Rectangle
// Width 3.5 
// Height 35.9
		Rectangle rectangleTwo = new Rectangle(3.5, 35.9);


//The width, height, area and perimeter for Rectangle one will be displayed
		System.out.println("Rectangle 1");
		System.out.println("Width: " + rectangleOne.width + " Height: " + rectangleOne.height 
				+ " Area:  " + rectangleOne.getArea() + 
				" Perimeter: " + rectangleOne.getPerimeter());

//The width, height, area and perimeter for Rectangle two will be displayed
		
		System.out.println(" \nRectangle 2");
		System.out.println("Width: " + rectangleTwo.width + " Height: " + rectangleTwo.height +
				" Area: " + rectangleTwo.getArea() + " Perimeter: " + rectangleTwo.getPerimeter());
	}
}

