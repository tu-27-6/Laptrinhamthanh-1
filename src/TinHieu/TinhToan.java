package TinHieu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TinhToan {
    private ArrayList<Double> a1 = new ArrayList<>();
    private ArrayList<Double> a2 = new ArrayList<>();
    private int goc1;
    private int goc2;
    private int hangSo;

    public int getHangSo() {
        return hangSo;
    }

    public void setHangSo(int hangSo) {
        this.hangSo = hangSo;
    }

    public TinhToan(ArrayList<Double> a1, ArrayList<Double> a2, int goc1, int goc2) {
        this.a1 = a1;
        this.a2 = a2;
        this.goc1 = goc1;
        this.goc2 = goc2;
    }

    public TinhToan() {
    }

    public ArrayList<Double> getA1() {
        return a1;
    }

    public void setA1(ArrayList<Double> a1) {
        this.a1 = a1;
    }

    public ArrayList<Double> getA2() {
        return a2;
    }

    public void setA2(ArrayList<Double> a2) {
        this.a2 = a2;
    }

    public int getGoc1() {
        return goc1;
    }

    public void setGoc1(int goc1) {
        this.goc1 = goc1;
    }

    public int getGoc2() {
        return goc2;
    }

    public void setGoc2(int goc2) {
        this.goc2 = goc2;
    }

    public void DichMang() {
        if(goc1 < goc2) {
            int tmp1 = goc2 - goc1;

            while(tmp1 > 0) {
                a1.add(0, 0.0);
                a2.add(0.0);
                tmp1--;
            }
        }
        else {
            int tmp2 = goc1 - goc2;

            while(tmp2 > 0) {
                a1.add(0.0);
                a2.add(0, 0.0);
                tmp2--;
            }
        }

    }

    public ArrayList<Double> Cong() {
        ArrayList<Double> ketqua = new ArrayList<>();

        for(int i = 0; i < a1.size(); i++) {
            ketqua.add(a1.get(i) + a2.get(i));
        }

        return ketqua;
    }

    public ArrayList<Double> Nhan() {
        ArrayList<Double> ketqua = new ArrayList<>();

        for(int i = 0; i < a1.size(); i++) {
            ketqua.add(a1.get(i) * a2.get(i));
        }

        return ketqua;
    }

    public ArrayList<Double> NhanHangSo(ArrayList<Double> x, int hs) {
        ArrayList<Double> ketqua = new ArrayList<>();

        for(int i = 0; i < x.size(); i++) {
            ketqua.add(hs * x.get(i));
        }

        return ketqua;
    }

    public ArrayList<Double> DaoThoiGian(ArrayList<Double> x, int goc) {
        ArrayList<Double> ketqua = new ArrayList<>();

        for(int i = x.size() - 1; i >= 0; i--) {
            ketqua.add(x.get(i));
        }

        return ketqua;
    }

    public ArrayList<Double> DichThoiGian(ArrayList<Double> x, int m) {
        ArrayList<Double> ketqua = new ArrayList<>(x);
        int tmp = Math.abs(m);
        if(m > 0) {
            while(tmp > 0) {
                ketqua.remove(ketqua.size() - 1);
                ketqua.add(0, 0.0);
                tmp--;
            }
        }
        else {
            while(tmp > 0) {
                ketqua.remove(0);
                ketqua.add(ketqua.size() - 1, 0.0);
                tmp--;
            }
        }


        return ketqua;
    }

    public ArrayList<Double> GiamTanSoLaymau(ArrayList<Double> x, int m, int goc) {
        ArrayList<Double> ketqua = new ArrayList<>();

        int tmp = goc;
        while(tmp < x.size()) {
            ketqua.add(x.get(tmp));
            tmp += m;
        }

        int tmp2 = goc - m;
        while(tmp2 >= 0) {
            ketqua.add(0, x.get(tmp2));
            tmp2 -= m;
        }


        return ketqua;
    }

    public double[] TinhTichChap(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;
        double[][] x = new double[n][m];

        double[] ketqua = new double[n + m - 1];

        for(double i : ketqua) {
            i = 0.0;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                x[i][j] = a[i] * b[j];
            }
        }

        for(int k = 0; k < ketqua.length; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(i + j - 1 == k) {
                        ketqua[k] += x[i][j];
                    }
                }
            }
        }

        return ketqua;
    }

    public ArrayList<Double> TangTanSoLayMau(ArrayList<Double> x, int m, int goc) {
        ArrayList<Double> ketqua = new ArrayList<>();

        for(double i : x) {
            ketqua.add(i);
        }

        int tmp = 1;
        for(int i = 0; i < ketqua.size(); i++) {
            if(tmp >= ketqua.size()) break;
            ketqua.add(tmp, 0.0);
            tmp += m;
        }

        return ketqua;
    }

    public double[] TuongQuanCheo(double[] a, double[] b) {
        int n = a.length;
        int m = b.length;

        double[] c = new double[m];

        for(int i = m - 1; i >= 0; i--) {
            c[i] = a[i];
        }

        double[][] x = new double[n][m];

        double[] ketqua = new double[n + m - 1];

        for(double i : ketqua) {
            i = 0.0;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                x[i][j] = a[i] * c[j];
            }
        }

        for(int k = 0; k < ketqua.length; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(i + j - 1 == k) {
                        ketqua[k] += x[i][j];
                    }
                }
            }
        }

        return ketqua;
    }

}
