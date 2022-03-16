package TinHieu;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        TinhToan a = new TinhToan();
        double[] ts1 = {0.0, 1.0, 1.0, 1.0, 0.0};
        double[] ts2 = {0.0, 0.0, 1.0, 1.5, 1.0};
        int goc1 = 2;
        int goc2 = 3;
        ArrayList<Double> thamso1 = new ArrayList<>();
        ArrayList<Double> thamso2 = new ArrayList<>();

        for(double i : ts1) {
            thamso1.add(i);
        }

        for(double i : ts2) {
            thamso2.add(i);
        }

        System.out.println("---------------------------------------------------------");

        System.out.println("Ban dau");
        System.out.println(thamso1);
        System.out.println(thamso2);
        System.out.println("Sau");

        a.setA1(thamso1);
        a.setA2(thamso2);
        a.setGoc1(goc1);
        a.setGoc2(goc2);
        a.DichMang();

        System.out.println(a.getA1());
        System.out.println(a.getA2());

        System.out.println("---------------------------------------------------------");

        System.out.println("Cong 2 tin hieu");
        System.out.println(a.Cong());

        System.out.println("---------------------------------------------------------");

        System.out.println("Nhan 2 tin hieu");
        System.out.println(a.Nhan());

        System.out.println("---------------------------------------------------------");

        System.out.println("Nhan voi hang so");
        int hangso = 5;
        ArrayList<Double> thamso3 = new ArrayList<>();
        for(double i : ts1) {
            thamso3.add(i);
        }

        System.out.println(a.NhanHangSo(thamso3, hangso));

        System.out.println("---------------------------------------------------------");

        System.out.println("Dao thoi gian");
        int goc = 2;
        System.out.println(a.DaoThoiGian(thamso3, goc));

        System.out.println("---------------------------------------------------------");

        System.out.println("Dich thoi gian");
        int m = -1;
        int n = 1;
        System.out.println("    Voi m nho hon 0");
        System.out.println(a.DichThoiGian(thamso3, m));
        System.out.println("    Voi m lon hon 0");
        System.out.println(a.DichThoiGian(thamso3, n));

        System.out.println("---------------------------------------------------------");

        System.out.println("Giam tan so lay mau");
        int chiso = 2;
        System.out.println(a.GiamTanSoLaymau(thamso3, chiso, goc));

        System.out.println("---------------------------------------------------------");

        System.out.println("Tang tan so lay mau");
        System.out.println(a.TangTanSoLayMau(thamso3, chiso, goc));

        System.out.println("---------------------------------------------------------");
        System.out.println("Tinh tich chap");
        System.out.println(Arrays.toString(a.TinhTichChap(ts1, ts2)));

        System.out.println("---------------------------------------------------------");
        System.out.println("Tuong quan cheo");
        System.out.println(Arrays.toString(a.TuongQuanCheo(ts1, ts2)));

        try {
            FileWriter fw = new FileWriter("C:\\Users\\ntu27\\IdeaProjects\\LapTrinhAmThanh\\src\\TinHieu\\ghifile.txt");
            fw.write("Cong tin hieu");
            fw.write(a.Cong().toString() + "\n");
            fw.write("Nhan tin hieu");
            fw.write(a.Nhan().toString() + "\n");
            fw.write("Nhan hang so");
            fw.write(a.NhanHangSo(thamso3, hangso).toString() + "\n");
            fw.write("Dao thoi gian");
            fw.write(a.DaoThoiGian(thamso3, goc).toString() + "\n");
            fw.write("Dich thoi gian");
            fw.write(a.DichThoiGian(thamso3, m).toString() + "\n");
            fw.write("Giam tan so lay mau");
            fw.write(a.GiamTanSoLaymau(thamso3, chiso, goc).toString() + "\n");
            fw.write("Tang tan so lay mau");
            fw.write(a.TangTanSoLayMau(thamso3, chiso, goc).toString() + "\n");
            fw.write("Tinh tich chap");
            fw.write(Arrays.toString(a.TinhTichChap(ts1, ts2)) + "\n");
            fw.write("Tuong quan cheo");
            fw.write(Arrays.toString(a.TuongQuanCheo(ts1, ts2)) + "\n");

            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
