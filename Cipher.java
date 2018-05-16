
public class Cipher
{
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	public static final int SHIFT = 3;

	// method to encode a given string by a shift cipher of size SHIFT
	public String encode(String input)
	{
		String encodedInput = new String();

		for(int i = 0, n = input.length() ; i < n ; i++)
		{
			char c = input.charAt(i);

			int index = ALPHABET.indexOf(c);
			if (index >= 26 - SHIFT )
			{
				index -= 26;
			}
			encodedInput += ALPHABET.charAt(index + SHIFT);
		}
		return encodedInput;
	 }
	
	 // method to decode a given string, input, by a shift cipher of -size SHIFT.
	
	   	public String decode(String input)
	   	{
	
	   		String decodedInput = new String();
	   		for(int i = 0, n = input.length() ; i < n ; i++)
	   		{
	   			char c = input.charAt(i);
	   			int index = ALPHABET.indexOf(c);
	
	   			if (index < SHIFT)
	   			{
	   				index += 26;
	   			}
	   			decodedInput += ALPHABET.charAt(index - SHIFT);
	   		}
	   		return decodedInput;
	   	}
	   	
}


