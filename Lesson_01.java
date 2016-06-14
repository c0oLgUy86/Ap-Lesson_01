public class Lesson_01
{
	//variables-visible throughout the class
	public static void main(String[]args)//driver for all your programs
	{
		//variables here only visible within the main method
		System.out.println("Ass");
	}
	
	public static void newMethod()
	{
		//can't access variables from main here
	}
}