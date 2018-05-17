import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
		Cipher test = new Cipher();

		// test with console input
		/*Scanner in = new Scanner(System.in);
		System.out.println(test.encode(in.nextLine()));
		System.out.println(test.decode(in.nextLine()));
		System.out.println(test.encode(in.nextLine(), in.nextInt()));
		in.close();*/
		
		//test origninal encode and decode methods
		System.out.println(test.encode("HELLO"));
		System.out.println(test.decode("KHOOR"));

		System.out.println(test.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		System.out.println(test.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
		
		
		//test overloaded method 
		System.out.println(test.encode("HELLO", 3));
		System.out.println(test.encode("KHOOR", -3));

		System.out.println(test.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3));
		System.out.println(test.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", -3));
		
	}


}