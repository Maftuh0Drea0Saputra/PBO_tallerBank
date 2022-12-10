public class Wifi extends InfoTagihan{
    public String nama = "wifi"  ;

    public int harga = 150000 ;
    @Override
    public void detail() {
        System.out.println("Nama Tagihan "+nama);
        System.out.println("Biaya Tagihan sebesar "+harga);
    }
}
