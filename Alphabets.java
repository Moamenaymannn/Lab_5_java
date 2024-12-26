public class Alphabets {
    public static void check(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                System.out.println("The word does not contain only alphabets");
                return; 
            }
        }
        System.out.println("The word contains only alphabets");
    }
    public static void main(String[] args) {
        String word = "Hello"; 
        check(word); 
        word = "java";
        check(word);  
    }
}

