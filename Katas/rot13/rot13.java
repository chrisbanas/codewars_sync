class Solution {
  
   public static String rot13(String message) {
     String alpha = "abcdefghijklmnopqrstuvwxyz";
     StringBuilder newWord = new StringBuilder();
      
       for (int i = 0; i < message.length(); i++) {
         char letter = message.charAt(i);
         char lower = Character.toLowerCase(message.charAt(i));
         
        if (alpha.contains(String.valueOf(lower))) {
           int letterIndex = alpha.indexOf(lower);
           char newLetter = alpha.charAt((letterIndex + 13) % 26);
          
           if (Character.isUpperCase(letter)) {
            newWord.append(Character.toUpperCase(newLetter));
          } else {
             newWord.append(newLetter);
          }
         } else {
           newWord.append(letter);
         }
       }
       
       
     return newWord.toString();
   }
}