public class Main3 {
    public static void main(String[] args) {
        String text = "I     know something about it";
        String[] words = text.split("\s+");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
