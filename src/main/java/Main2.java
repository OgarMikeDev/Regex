public class Main2 {
    /*
   Cоставить регулярное выражение,
   кот-е будет подходить под любой символ,
   не являющийся цифрой или буквой!
     */
    public static String regexForAllNoLettersAndNumbers = "[^(a-zA-Z0-9)]";

    public static void main(String[] args) {
        String text1 = "Hello. My name is Mike. My age - 24 years!";
        String text2 = "Hello. My name is Mike. My age - 24 years!";
        String text3 = "Hello. My name is Mike. My age - 24 years!";
        String text4 = "Hello. My name is Mike. My age - 24 years!";

        System.out.println(formatText(text1));
        System.out.println(formatText(text2));
        System.out.println(formatText(text3));
        System.out.println(formatText(text4));
    }

    public static String formatText(String text) {
        String finalText = text.replaceAll(regexForAllNoLettersAndNumbers, "");
        return finalText;
    }
}
