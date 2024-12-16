package PraktikumPBO.Sesi12.Latihan2;

class OperasiPengurangan extends OperasiBilanganAbs {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C() {
        this.c = a - b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan: " + c);
    }
}
