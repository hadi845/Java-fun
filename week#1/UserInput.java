import java.util.Scanner;
public class UserInput
{
	public static void main(String[] args)
	{
		int num = 10;
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		System.out.print("Enter Id:");
		int bookId = input.nextInt();
		//input.nextLine();
		System.out.print("Enter Title:");
		String bookTitle = inputString.nextLine();
		System.out.print("Enter Gender:");
		char authorGender = input.next().charAt(0);
		System.out.print("Enter Price:");
		float price = input.nextFloat();
		System.out.print("Enter Avaliablity Status:");
		boolean status = input.nextBoolean();
		//System.out.println("ID:"+bookId);
		//System.out.println("Title:"+bookTitle);
		System.out.println("ID:"+bookId+"\nTitle:"+bookTitle+"\nPrice:"+price+"\nAvailability Status:"+status+"\nAuthor Gender"+authorGender);
		
	}
}