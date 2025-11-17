import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main5 {
    public static void main(String[] args) {
        String text1 = "Hello. My name is Mike. My phone \"89676400931\". My post vegar.f.vmail.ru";
        String text2 = "Hello. My name is Nikita. My phone \"8967640093124242\". My post vegar.f.v@mail.ru";
        String text3 = "Hello. My name is Mi";

        String templateForName = "is ";
        String templateForPhone = " \"";
        String templateForPost = "post ";

        String regexForName = "[A-Z][a-z]+";
        String regexForPhone = "8[0-9]{10}";
        String regexForPost = "[a-z._0-9]+@[a-z]+(.ru|.com)";
        List<String> listText = new ArrayList<>() {{
            add(text1);
            add(text2);
            add(text3);
        }};
        /*
        TODO Задание:
         1) Вырезать имя и проверить на корректность
                (1-я буква должна быть большой, остальных маленьких букв сколько угодно);
         2) Вырезать номер телефона и проверить на корректность
                (первый символ должен быть 8, а остальные 10 любыми цифрами);
         3) Вырезать почту и проверить на корректность
                (до символа @ могут идти маленькие буквы, точки, нижние подчёркивания и цифры,
                затем @,
                затем маленькие буквы,
                затем либо .ru, либо .com)
         */
        /*
        TODO
         8 означает, что первым символом должно быть число 8;
         [0-9] означает, что следующим после 8 должно быть любое число от 0 до 9;
         {10} означает, что ближайший элемент слева(у нас число, т.е [0-9]) должен повторяться 10 раз.
         Если хотим, чтобы ближайший элемент слева повторялся более 1-го раза,
         вместо {} ставим +.
         */
        for (String text : listText) {
            int leftIndexForName = text.indexOf(templateForName);
            if (leftIndexForName >= 0) {
                leftIndexForName += templateForName.length();
                int rightIndexForName = text.indexOf(".", leftIndexForName);
                if (rightIndexForName >= 0) {
                    String name = text.substring(leftIndexForName, rightIndexForName);
                    System.out.println(name + " - " + name.matches(regexForName));
                }
            }

            int leftIndexForPhone = text.indexOf(templateForPhone);
            if (leftIndexForPhone >= 0) {
                leftIndexForPhone += templateForPhone.length();
                int rightIndexForPhone = text.indexOf("\"", leftIndexForPhone);
                if (rightIndexForPhone >= 0) {
                    String phone = text.substring(leftIndexForPhone, rightIndexForPhone);
                    System.out.println(phone + " - " + phone.matches(regexForPhone));
                }
            }

            int leftIndexForPost = text.indexOf(templateForPost);
            if (leftIndexForPost >= 0) {
                leftIndexForPost += templateForPost.length();
                String post = text.substring(leftIndexForPost);
                System.out.println(post + " - " + post.matches(regexForPost));
            }
        }
        
//         String text = "Алексей, добрый день!\n" +
//                       "Мой гитхаб - https://github.com/OgarMikeDev," +
//                       "а также ссылка на мой персональный сайт - https://tommilabs.ru/\n" +
//                       "Если возникнут вопросы, пишите мне напрямую.\n" +
//                       "Я всегда доступен";

//         String regexForLink = "https://[^(,\\s)]+";

//         Pattern pattern = Pattern.compile(regexForLink);
//         Matcher matcher = pattern.matcher(text);

//         while (matcher.find()) {
//             //1-й способ вырезать нужную подстроку
// //            int start = matcher.start();
// //            int end = matcher.end();
// //            String link = text.substring(start, end);
// //            System.out.println(link);

//             //2-й способ вырезать нужную подстроку
//             String link = matcher.group();
//             System.out.println(link);
//         }
    }
}
