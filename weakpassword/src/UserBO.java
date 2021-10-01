public class UserBO {
    public static void validate(User u) throws WeakPasswordException{
		String password=u.getPassword();
		int digit_count=0,letter_count=0,special_count=0;
		if(password.length()<20&&password.length()>=8)
        {
			for(int i=0;i<password.length();i++){
				if(Character.isDigit(password.charAt(i))){
					digit_count++;
				}
				else if(Character.isAlphabetic(password.charAt(i))){
					letter_count++;
				}
				else if((!Character.isDigit(password.charAt(i)))&&(!Character.isAlphabetic(password.charAt(i)))&&(!Character.isWhitespace(password.charAt(i)))){
					special_count++;
				}
				
			}
			if(digit_count>=1&&letter_count>=1&&special_count>=1){
			}
			else{
				throw new WeakPasswordException("Your password is weak");
			}
		}
        else{
    			throw new WeakPasswordException("Your password is weak");
			}
    }
    
}

