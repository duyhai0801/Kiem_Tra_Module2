package Thuc_Hanh;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cau;
        do {
            System.out.print("Nhập một câu: ");
            cau = scanner.nextLine().trim();
        } while (cau.isEmpty());

        String[] danhSachTu = cau.split("\\s+");

        String tuDaiNhat = danhSachTu[0];
        for (String tu : danhSachTu) {
            if (tu.length() > tuDaiNhat.length()) {
                tuDaiNhat = tu;
            }
        }

        System.out.println(danhSachTu.length + " từ, từ dài nhất: \"" + tuDaiNhat + "\"");
    }
}
