public class PrintData
{
	public static void main(String[] args)
	{
		int bookId = 101;
		String bookTitle = "JHTP";
		char authorGender = 'F';
		float price = 775.5f;
		boolean status = true;
		System.out.println("ID:"+bookId);
		System.out.println("Title:"+bookTitle);
		System.out.print("ID:"+bookId);
		System.out.print("\nTitle:"+bookTitle);
		System.out.printf("ID:%d",bookId);
		System.out.printf("\nTitle:%s",bookTitle);
	}
}