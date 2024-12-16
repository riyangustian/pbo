package PraktikumPBO.Sesi12.Latihan1;

public class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = a + b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan: " + c);
    }
}

