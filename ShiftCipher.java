
public class ShiftCipher extends Cipher {
	
	int shift = 0;

	public ShiftCipher(int s) {
		
		shift = s;
}
	
	
	public String encode(String input)
	{
		String encodedInput = new String();

		for(int i = 0, n = input.length() ; i < n ; i++)
		{
			char c = input.charAt(i);

			int index = ALPHABET.indexOf(c);
			if (index >= 26 - shift )
			{
				index -= 26;
			}
			else if (index < shift)
			{
				index += 26;
			}
			System.out.println(index);
			encodedInput += ALPHABET.charAt(index + shift);
		}
		return encodedInput;
	 }
   	

}
