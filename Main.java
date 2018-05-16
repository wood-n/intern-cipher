import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
		Cipher test = new ShiftCipher(-3);

		Scanner in = new Scanner(System.in);
		//System.out.println(test.encode(in.nextLine()));
		
		//System.out.pkrintln(test.decode(in.nextLine()));

		System.out.println(test.encode("abcdefghijklmnopqrstuvwxyz"));
		//System.out.println(test.decode("abcdefghijklmnopqrstuvwxyz"));
		
		in.close();
	}


}