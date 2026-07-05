/*Object oriented programming Lab 1 question 3

Complete the main method in the Arithmetic class by
1.	Declaring two integer-typed variables x = 5, and y = 3
2.	Printing the formatted output of x and y on separate lines on the console
3.	Declaring three integer-typed variables sum = x + y, product = x * y and mod = x % y
4.	Printing the formatted output of sum, product and mod on separate lines on the console
For example:
Test	Result
Arithmetic.main(new String[]{})	x = 5
y = 3
sum = 8
product = 15
mod = 2

public class Arithmetic 
{

    public static void main(String[] args) 
    {

    
    
    }
}
basic arithmetic operations and integer manipulation
*/


public class Arithmetic 
{
public static void main(String[] args)
{
int x = 5;
int y =3;
System.out.println("x = "+x);
System.out.println("y = "+y);
int sum = x + y;
int product = x * y;
int mod = x % y;
System.out.println("sum = " + sum);
System.out.println("product = " + product);
System.out.println("mod = " +mod);
}
}
