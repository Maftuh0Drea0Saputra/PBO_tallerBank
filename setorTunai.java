public class setorTunai extends Rekening{

    setorTunai(double NomerRekeningNasabah, double UangSetor) {
        super(NomerRekeningNasabah, UangSetor);
    }

    @Override
    public double getNomerRekening() {
        return super.getNomerRekening();
    }

    @Override
    public final double getUangSetor() {
        return super.getUangSetor();
    }

    public final double MenghitungTabungan(int value) {
        double saldo = value + getUangSetor();
        return saldo;
    }



}
