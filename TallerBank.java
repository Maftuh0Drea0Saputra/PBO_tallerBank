import java.util.Scanner;

public class TallerBank {


    public static void main (String []args) {
        Scanner in = new Scanner(System.in);


        System.out.print(" Masukan nama Anda : ");
        String Nasabah = in.nextLine();
        System.out.print(" Masukan Nomer Telepon Anda : ");
        int Nomor = in.nextInt();
        System.out.println();
        System.out.print(" Masukan Nomer Telepon Cadangan : ");
        int Nomor2 = in.nextInt();

        Rekening data = new Rekening(Nasabah, Nomor);
        data.setTelp(Nomor2);
        System.out.println();



        while (true) {
            int saldoAwal = 5000000;
            System.out.println("---Bank Makmur Jaya---");
            System.out.println(" 1. Setor Uang");
            System.out.println(" 2. Ambil Uang");
            System.out.println(" 3. Bayar Tagihan");
            System.out.println(" 4. Keluar");



            //inputan
            System.out.print(" Silahkan Masukan Pilihan : ");
            int pilih = in.nextInt();
            System.out.println("  ");
            //proses dan output

            switch (pilih){
                //jika memilih 1
                case 1:
                    System.out.println(" ====Setor Uang==== ");
                    System.out.print(" Silahkan Masukan Nomer Rekening Anda ");
                    double NORek = in.nextDouble();
                    System.out.print(" Silahkan Masukan Besar Uang Yang Akan Disetor : ");
                    double Setoran = in.nextDouble();
                    System.out.println();

                    setorTunai Atm = new setorTunai (NORek, Setoran);
                    System.out.println("=================================");
                    System.out.println(" Nomer Rekening anda : "+NORek);
                    System.out.println(" Jumlah uang yang akan di setor  : "+Setoran);
                    System.out.println(" Saldo anda adalah : "+ Atm.MenghitungTabungan(saldoAwal));
                    System.out.println();
                    break;

                case 2 :

                    System.out.println("===Pengambilan Uang===");
                    System.out.print(" Masukan Nomer Rekening : ");
                    double NoRek = in.nextDouble();
                    System.out.print(" Masukan uang yang akan di Ambil : ");
                    double UangDiTarik = in.nextDouble();
                    System.out.println();

                    System.out.println("=================================");
                    System.out.println(" Masukan Nomer Rekening     : "+NoRek);
                    System.out.println(" Masukan Jumlah Pengambilan    : "+UangDiTarik);
                    ambilTunai AtmB = new ambilTunai(NoRek, (int) UangDiTarik);
                    System.out.println(" Saldo anda adalah : "+ AtmB.MenghitungSaldoPenarikanUang(saldoAwal));
                    System.out.println();

                    break;
                case 3 :

                    System.out.println("===Transfer===");
                    System.out.print(" Masukan Nomer Rekening : ");
                    double NOrek = in.nextDouble();

                    System.out.println(" Jenis Tagihan Pembayaran ");
                    System.out.println(" 1. Tagihan Wifi");
                    Wifi tag1 = new Wifi();
                    tag1.detail();


                    System.out.print(" Masukan Jenis Tagihan : ");
                    int Tagihan1 = in.nextInt();
                    System.out.print(" Masukan jumlah Pembayaran : ");
                    double JumlahTransfer = in.nextDouble();



                    Tagihan AtmC = new Tagihan(NOrek, JumlahTransfer, Tagihan1);
                    System.out.println("=================================");
                    System.out.println(" No Rekening anda  : "+NOrek);
                    System.out.println(" Nama Tagihan yang di pilih : "+ Tagihan1);
                    System.out.println(" Jumlah Pembayaran : "+ JumlahTransfer);
                    System.out.println(" Saldo : "+ AtmC.MenghitungTransferUang(saldoAwal));
                    System.out.println();

                    break;


                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}