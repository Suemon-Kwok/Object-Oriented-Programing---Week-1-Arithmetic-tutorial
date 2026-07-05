/*Object oriented programming Lab 1 question 4

Complete the main method in the CircleAreaCalculator class to print the formatted output value of area
For example:
Test	Result
CircleAreaCalculator.main(new String[]{})

	area = 346.36059005827474



public class CircleAreaCalculator 
{
	public static void main(String[] args)
	{
		double radius = 10.5;
		double area = Math.PI * radius * radius;
		System.out.println(“   ”);	
	}
}
basic mathematical operations
*/



public class CircleAreaCalculator 
{
	public static void main(String[] args)
	{
		double radius = 10.5;
		double area = Math.PI * radius * radius;
		System.out.println("area = " + area);	
	}
}
