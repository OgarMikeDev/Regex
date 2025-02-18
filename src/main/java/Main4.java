public class Main4 {
    public static void main(String[] args) {
        String number = "А474МР197";

        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regexForNumber = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";

        String correctAutoNumber = number.matches(regexForNumber) ? "YES" : "NO";
        System.out.println("Подходит ли автомбильный номер: " + correctAutoNumber);
    }
}
