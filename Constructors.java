/* Design a class Rectangle with the following specifications :

Attributes :

length (double) : Represents the length of the rectangle
width (double) : Represents the width of the rectangle.
area (double) : Represents the area of rectangle.
Constructors :

A default constructor that initializes both length and width to 1.0
A parameterized constructor that takes two arguments to initialize length and width.
Methods :

void calculateArea() : Computes the area of rectangle.
void displayDetails() : Prints the rectangle's details, including its dimensions and area, in format specified below :*/

class Rectangle{
    private double length;
    private double width;
    private double area;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        this.area = this.length * this.width;
    }

    public void displayDetails(){
        System.out.printf("Length: %.2f\n", this.length);
        System.out.printf("Width: %.2f\n", this.width);
        System.out.printf("Area: %.2f\n", this.area);
    }
}
