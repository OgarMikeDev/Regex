import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static String listIndexSpace;

    public static void main(String[] args) {
        String firstText = "And Back Client Day Eminem Flight";

        listIndexSpace = "";
        System.out.println(sequentialWordsNumbers(firstText));
    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder result = new StringBuilder();
        int wordCount = 0;


        for (int index = 0; index < text.length(); ) {
            int spaceIndex = text.indexOf(' ', index);
            if (spaceIndex == -1) {
                result.append("(").append(wordCount + 1).append(") ").append(text.substring(index));
                break;
            } else {
                result.append("(").append(wordCount + 1).append(") ").append(text.substring(index, spaceIndex)).append(" ");
                wordCount++;
            }
            index = spaceIndex + 1;
        }

        return result.toString();
    }
}
