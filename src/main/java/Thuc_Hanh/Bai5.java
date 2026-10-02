package Thuc_Hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {

        int[] daySo = {1, 4, 7, 9, 12};
        System.out.println("Dãy số: " + Arrays.toString(daySo));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm x: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Vui lòng nhập số nguyên: ");
            scanner.next();
        }

        int x = scanner.nextInt();


        int chiSo = timKiemNhiPhan(daySo, x);
        if (chiSo == -1) {
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Vị trí " + (chiSo + 1));
        }
    }

    static int timKiemNhiPhan(int[] daySo, int x) {
        int trai = 0;

        int phai = daySo.length - 1;

        while (trai <= phai) {
            int giua = trai + (phai - trai) / 2;
            if (daySo[giua] == x) {
                return giua;
            }
            if (daySo[giua] < x) {
                trai = giua + 1;
            } else {
                phai = giua - 1;
            }
        }


        return -1;


    }


}
