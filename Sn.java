import java.util.Scanner;

public class Sn {
    public static void main(String[] args) {

        int count = 0;
        int N = 2;
        int number = 20;

        for (int i = 1; i < 1000; i++) {
            if (count < number) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        N++;
                    }
                }
                if (N == 2) {
                    System.out.println(i + " là số nguyên tố");
                    count++;
                }
                N = 0;
            } else {
                break;
            }
        }
    }
}
