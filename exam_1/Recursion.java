public class App {
    public static void main(String[] args) throws Exception {
        
        
        String fullName = "aldrex ibe suarez";
        
        //First name:Aldrex
        //Middle name:Ibe
        //Surname:Suarez

        removeLetters(fullName);

    }


    static String removeLetters(String fullName, String result, int index) {
        
        if (index >= fullName.length()) {
          
          return result;
        
            
        }
        

        //vowels:A E I O U
        //consonants:B C D F G H J K L M N P Q R S T V W X Z
        char letter = fullName.charAt(index);
        
        String vowels = "aeiou";
        
        int isVowel = vowels.indexOf(letter) >= 0 ? 0 : 1;

        return removeLetters(fullName, isVowel == 1 ? result + letter : result, index + 1);

        
    }
    
    static void removeLetters(String str) {
        
        String result = removeLetters(str, "", 0);
        
        System.out.println(result);
    }

}
