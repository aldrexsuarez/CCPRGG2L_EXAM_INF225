public class App {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "aldrex ibe suarez";
        
        //vowels:A E I O U
        //consonants:B C D F G H J K L M N P Q R S T V W X Z

        removeLetter(fullName);
    }
     
        //First name:Aldrex
        //Middle name:Ibe
        //Surname:Suarez

private static String removeLetter (String fullName, int consonantCheck, String result, int index) {
    
    
    
    if (index >= fullName.length()) {
      return result;
      
      
      
      
    }
    char letter = fullName.charAt(index);
    
    String consonant = "bcdfgkjlmnpqstvxzhrwy";
    
    int isconsonant = consonant.indexOf(letter) >= 0 ? 0 : 1;
    
    return removeLetter (fullName, consonantCheck, isconsonant == consonantCheck ? result + letter : result, index + 1);
   }




static void removeLetter (String str) {
    
    int nameLength = str.length();
    
    int spaceIndex = str.lastIndexOf( " ") + 1;
    
    String surname = str.substring(spaceIndex, nameLength);
    
    char lastLetter = surname.charAt(surname.length() - 2);
    
    String consonant = "bcdfgkjlmnpqstvxzhrwy";
    
    int consonantCheck = consonant.indexOf(lastLetter) >= 0 ? 0 : 1;
    
    String result = removeLetter(str, consonantCheck, "", 0);
    
    System.out.println(result);
    }

}
