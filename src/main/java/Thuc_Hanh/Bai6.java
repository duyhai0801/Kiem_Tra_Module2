package Thuc_Hanh;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số nguyên: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println(doiSangNhiPhan(n));
    }

    static String doiSangNhiPhan(int n) {
        StringBuilder cacBit = new StringBuilder();
        while (n > 0) {
            cacBit.append(n % 2);
            n /= 2;
        }
        return cacBit.reverse().toString();
    }
}
