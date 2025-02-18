public class Main {
    public static String regexForAllNoNumbers = "[^0-9]";

    public static void main(String[] args) {
        String phone1 = "+7 988 123 83-23";
        String phone2 = "7,988.123 83-23";
        String phone3 = "7 (988)123-83-23";
        String phone4 = "+7 988 - 123-83-23";

        System.out.println(formatNumberPhone(phone1));
        System.out.println(formatNumberPhone(phone2));
        System.out.println(formatNumberPhone(phone3));
        System.out.println(formatNumberPhone(phone4));
    }

    public static String formatNumberPhone(String phone) {
        String finalPhone = phone.replaceAll(regexForAllNoNumbers, "");
        return finalPhone;
    }
}
