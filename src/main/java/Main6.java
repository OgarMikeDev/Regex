public class Main6 {
    public static String listIndexSpace;

    public static void main(String[] args) {
        String firstText = "And Back Client";
        listIndexSpace = "";
        System.out.println(sequentialWordsNumbers(firstText));
    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder allWords = new StringBuilder();
        int numberWord = 0;
        for (int currentIndex = 0; currentIndex < text.length();) {
            int indexSpace = text.indexOf(" ", currentIndex);
            if (indexSpace != -1) {
                allWords.append("(" + (numberWord + 1) + ") " + text.substring(currentIndex, indexSpace) + " ");
                currentIndex = indexSpace + 1;
                numberWord++;
            } else if (indexSpace == -1) {
                allWords.append("(" + (numberWord + 1) + ") " + text.substring(currentIndex));
                return String.valueOf(allWords);
            }
        }
        return String.valueOf(allWords);
    }

}
