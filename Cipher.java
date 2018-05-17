public class Cipher
{
	
	public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  // Variable to represent alphabet string
	public static final int SHIFT = 3;  // Size of shift 

	// method to encode a given string by a shift cipher of size SHIFT
	public String encode(String input)
	{
		String encodedInput = new String();
		
		// iterate over each element in the input string
		for(int i = 0, n = input.length() ; i < n ; i++)
		{
			// get the character at each element in the input
			char c = input.charAt(i);
			// convert the character to its corresponding alphabet index, and increment the index by the shift value
			int index = ALPHABET.indexOf(c) + SHIFT;
			//check if the shifted index is outside the alphabet index  
			if (index >= 26)
			{
				//if it is outside the index, then decrement by 26 to bring to the start of the alphabet index
				index -= 26;
			}
			//find the character at the shifted index
			encodedInput += ALPHABET.charAt(index);
		}
		//return converted character
		return encodedInput;
	 }
	
	 // method to decode a given string, input, by a shift cipher of size -(SHIFT).
	
   	public String decode(String input)
   	{

   		String decodedInput = new String();
   		
		// iterate over each character in the input string
   		for(int i = 0, n = input.length() ; i < n ; i++)
   		{
			// get the character at each element in the input
   			char c = input.charAt(i);
			// convert the character to its corresponding alphabet index, and decrement the index by the shift value
   			int index = ALPHABET.indexOf(c) - SHIFT;
			//check if the shifted index is outside the alphabet index  

   			if (index < 0)
   			{
				//if it is outside the index, then increment by 26 to bring to the start of the alphabet index

   				index += 26;
   			}
			//find the character at the shifted index
   			decodedInput += ALPHABET.charAt(index);
   		}
		//return converted character
   		return decodedInput;
   	}
   	
	// overloaded method to encode an input string, input, by an input shift value, shift

   	public String encode(String input, int shift) {
   		
   		String encodedInput = new String();
		// iterate over each element in the input string
		for(int i = 0, n = input.length() ; i < n ; i++)
		{
			// get the character at each element in the input
			char c = input.charAt(i);
			// convert the character to its corresponding alphabet index, and increment the index by the shift value
			int index = ALPHABET.indexOf(c) + shift;
			//check if the shifted index is outside the alphabet index range
			if (index >= 26)
			{
				//if it is above the index, then subtract 26 to bring to the start of the alphabet index
				index -= 26;
			} else if (index < 0) 	//check if the shifted index is less than 0 (out of bounds)
			{
				index += 26;
			}
			//find the character at the shifted index
			encodedInput += ALPHABET.charAt(index);
		}
		//return converted character
		return encodedInput;
   		
   	}
	   	
}


