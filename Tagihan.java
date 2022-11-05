public class Tagihan extends Rekening{


    Tagihan(double NomerRekeningNasabah, double BiayaTagihan, int NamaTagihan) {
        super(NomerRekeningNasabah, BiayaTagihan, NamaTagihan);
    }

    @Override
    public  double getBiayaTagihan() {
        return super.getBiayaTagihan();
    }

    @Override
     public final int getNamaTagihan() {
        return super.getNamaTagihan();
    }
    public final double MenghitungTransferUang() {
        double SaldoTagihan = TabunganAwal - getBiayaTagihan();
        return SaldoTagihan;
    }
}
