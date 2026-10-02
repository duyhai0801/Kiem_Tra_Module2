package Thuc_Hanh;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tuSo = nhapSoNguyen(scanner, "Nhập tử số a: ");
        int mauSo;
        do {
            mauSo = nhapSoNguyen(scanner, "Nhập mẫu số b (b ≠ 0): ");
        } while (mauSo == 0);

        int ucln = timUCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;




        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }

        System.out.println(tuSo + "/" + mauSo);
    }

    static int nhapSoNguyen(Scanner scanner, String thongBao) {
        System.out.print(thongBao);
        while (!scanner.hasNextInt()) {
            System.out.print("Vui lòng nhập số nguyên: ");
            scanner.next();
        }
        return scanner.nextInt();
    }



    static int timUCLN(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        while (y != 0) {
            int du = x % y;
            x = y;
            y = du;
        }
        return x;
    }
}
