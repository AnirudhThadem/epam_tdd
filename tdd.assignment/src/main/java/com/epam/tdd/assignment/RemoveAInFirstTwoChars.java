package com.epam.tdd.assignment;

public class RemoveAInFirstTwoChars {
	public String remove(String string)
	{
	
		int stringLength = string.length();
				
				String result = "";
				
				if(stringLength >=2 ) {
					result = string;
					if(string.charAt(0) == 'A' && string.charAt(1) == 'A') {
						result = string.substring(2, stringLength);
					}
					else if(string.charAt(0) != 'A' && string.charAt(1) == 'A')
					{
						result = string.charAt(0) + string.substring(2, stringLength);
					}
					else if(string.charAt(0) == 'A' && string.charAt(1) != 'A') 
					{
						result = string.charAt(1) + string.substring(2, stringLength);
					}
				}
				
				return result;
		}

}
