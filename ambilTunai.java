public class ambilTunai extends Rekening{

    ambilTunai(double NomerRekeningNasabah, int JumlahAmbil) {
        super(NomerRekeningNasabah, JumlahAmbil);
    }

    @Override
    public double getNomerRekening() {
        return super.getNomerRekening();
    }

    @Override
     public final int getJumlahAmbil() {
        return super.getJumlahAmbil();
    }

    public final int MenghitungSaldoPenarikanUang(int value) {
        int SaldoPenarikan = value - getJumlahAmbil();
        return SaldoPenarikan;
    }

}
