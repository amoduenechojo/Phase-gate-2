public class characterAndNumbers{

        public static String replacingLettersWithNumbers(String word){
        String newWord = "";
        int index = 0;
//        String letter;
        int value = 0;
    

                for(index = 0; index < word.length()-1; index ++){
                        value = -1;

                    for(int count = 0; count < word.length(); count ++){
                        if(word.charAt(index) == word.charAt(count)){
                                value++;
//                                    newWord = value;
                                                 
                        }

                     }
            }
            return (word.charAt(index) + "shows" + value + "times");
    }
}



