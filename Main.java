import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
		Cipher test = new Cipher();

		//Scanner in = new Scanner(System.in);
		//System.out.println(test.encode(in.nextLine()));
		//System.out.pkrintln(test.decode(in.nextLine()));
		//in.close();


		System.out.println(test.encode("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(test.decode("abcdefghijklmnopqrstuvwxyz"));
		
	}


}