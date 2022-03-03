package hw1;

public class Task1 {
    public static void main(String[] args) {
        int start = 500000, end = 100000;
        int res = start > end ? start - (start / 100 * 10) : start;
        System.out.println(res);
    }
}
