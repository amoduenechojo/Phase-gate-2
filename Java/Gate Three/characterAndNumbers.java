//public class characterAndNumbers{
//
//        public static String replacingLettersWithNumbers(String word){
//        String newWord = "";
//        int index = 0;
//        String letter;
//        int value = 0;
//    
//
//                for(index = 0; index < word.length()-1; index ++){
//                        value = 0;
//
//                    for(int count = 0; count < word.length(); count ++){
//                        if(word.charAt(index) == word.charAt(count)){
//                                value++;
//                                    newWord = value;
//                                                 
//                        }
//
//                     }
//            }
//            return (word.charAt(index) + "shows" + value + "times");
//    }
//}


public class CharacterAndNumbers {

    public static String replacingLettersWithNumbers(String word) {

        String newWord = "";
        int count = 1;

        for (int index = 0; index < word.length(); index++) {

            if (index < word.length() - 1 && 
                word.charAt(index) == word.charAt(index + 1)) {

                count++; // increase count if same as next character

            } else {

                newWord += word.charAt(index);

                // Only add number if greater than 1 (based on your expected output)
                if (count > 1) {
                    newWord += count;
                }

                count = 1; // reset for next character
            }
        }

        return newWord;
    }
