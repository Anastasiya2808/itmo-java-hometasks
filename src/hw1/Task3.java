package hw1;

public class Task3 {
    public static void main(String[] args) {
        int number = 11;
        int sum = 0;
        int currentDigit;

        currentDigit = number % 10;
        sum = sum + currentDigit;

        number = number / 10;
        sum = sum + number;
        System.out.println(sum);
    }
}
