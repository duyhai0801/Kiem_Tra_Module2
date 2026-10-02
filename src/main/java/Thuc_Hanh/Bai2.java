package Thuc_Hanh;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chieuCao;
        do {
            System.out.print("Nhập chiều cao h (h > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số nguyên: ");
                scanner.next();
            }
            chieuCao = scanner.nextInt();
        } while (chieuCao <= 0);

        for (int hang = 1; hang <= chieuCao; hang++) {
            int soDauCach = chieuCao - hang;
            int soSao = 2 * hang - 1;

            StringBuilder dong = new StringBuilder();
            for (int i = 0; i < soDauCach; i++) {
                dong.append(' ');
            }
            for (int i = 0; i < soSao; i++) {
                dong.append('*');
            }
            System.out.println(dong);
        }
    }
}
