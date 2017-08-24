import java.util.Scanner;

public class divingRightIn
	{
		String name;
		static int age;
		public static void main(String[] args)
			{
			//sayingHello();
			askingAge();
			askingNumberOfYears();
			askingNumberOfDogYears();
			}

		
		public static void sayingHello()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, what is your name?");
			String name =userInput.nextLine();
			System.out.println("Hello" + " " + name + "!");
			}
		private static void askingAge()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("How old are you?");
			age = userInput.nextLine();
			System.out.println("Nice you are " + age + " years old, that's old!");
			}
		private static void askingNumberOfYears()
			{
			for(int i = 2004; i > 1994; i--)
				{
				int agediff = 2017 - age;
				System.out.println("You were born in " + i);
				}
				
			}
		private static void askingNumberOfDogYears()
			{
			
				
			}
	}