import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {
        String text = "Алексей, добрый день!\n" +
                      "Мой гитхаб - https://github.com/OgarMikeDev," +
                      "а также ссылка на мой персональный сайт - https://tommilabs.ru/\n" +
                      "Если возникнут вопросы, пишите мне напрямую.\n" +
                      "Я всегда доступен";

        String regexForLink = "https://[^(,\\s)]+";

        Pattern pattern = Pattern.compile(regexForLink);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            //1-й способ вырезать нужную подстроку
//            int start = matcher.start();
//            int end = matcher.end();
//            String link = text.substring(start, end);
//            System.out.println(link);

            //2-й способ вырезать нужную подстроку
            String link = matcher.group();
            System.out.println(link);
        }
    }
}
