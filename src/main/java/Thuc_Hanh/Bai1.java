package Thuc_Hanh;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        int[] danhSachMaMon = {3, 1, 3, 2, 1, 3};

        Map<Integer, Integer> tanSuat = new LinkedHashMap<>();
        for (int maMon : danhSachMaMon) {
            tanSuat.put(maMon, tanSuat.getOrDefault(maMon, 0) + 1);
        }

        int soLanBanCaoNhat = 0;
        for (int soLan : tanSuat.values()) {
            if (soLan > soLanBanCaoNhat) {
                soLanBanCaoNhat = soLan;
            }
        }

        StringBuilder ketQua = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : tanSuat.entrySet()) {
            if (entry.getValue() == soLanBanCaoNhat) {
                if (ketQua.length() > 0) {
                    ketQua.append(", ");
                }
                ketQua.append(entry.getKey());
            }
        }

        System.out.println("Món " + ketQua + " bán chạy nhất (" + soLanBanCaoNhat + " lần)");
    }
}