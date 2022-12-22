import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TallerBank {


    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        java.io.File txt = new java.io.File("struk.txt");


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

                case 1:
                    data.informasiIn();

                    System.out.println(" ====Setor Uang==== ");
                    System.out.print(" Silahkan Masukan Nomer Rekening Anda ");
                    double NORek = in.nextDouble();
                    System.out.print(" Silahkan Masukan Besar Uang Yang Akan Disetor : ");
                    double Setoran = in.nextDouble();
                    System.out.println();

                    data.tambahSaldo(Setoran);
                    System.out.println("=================================");
                    System.out.println(" Nomer Rekening anda : "+NORek);
                    System.out.println(" Jumlah uang yang akan di setor  : "+Setoran);
                    System.out.println(" Saldo anda adalah : "+ data.getSaldo());
                    System.out.println();


                    break;

                case 2 :
                    data.informasiIn();

                    System.out.println("===Pengambilan Uang===");
                    System.out.print(" Masukan Nomer Rekening : ");
                    double NoRek = in.nextDouble();
                    System.out.print(" Masukan uang yang akan di Ambil : ");
                    double UangDiTarik = in.nextDouble();
                    System.out.println();

                    double hasilA = data.ambilTunai(UangDiTarik);
                    if (hasilA > 0) {
                        System.out.println("=================================");
                        System.out.println(" Masukan Nomer Rekening     : "+NoRek);
                        System.out.println(" Masukan Jumlah Pengambilan    : "+UangDiTarik);
                        System.out.println(" Saldo anda adalah : "+ data.getSaldo());
                        System.out.println();
                    }

                    break;
                case 3 :
                    data.informasiIn();
                    Wifi tag1 = new Wifi();

                    System.out.println("===Tagihan===");
                    System.out.println(" Jenis Tagihan Pembayaran ");
                    System.out.println(" 1. Tagihan Wifi");



                    System.out.print("\n Masukan Jenis Tagihan : ");
                    double Tagihan1 = in.nextDouble();

                    if (Tagihan1 == 1){
                        tag1.detail();
                        double wifi = 150000;
                        double hasilT = data.tagihan(wifi);
                        if (hasilT > 0) {
                            System.out.println("=================================");
                            System.out.println(" Jumlah Pembayaran  : "+wifi);
                            System.out.println(" Saldo anda adalah : "+ data.getSaldo());
                            System.out.println();
                        }
                        try{
                            java.io.PrintWriter tag = new java.io.PrintWriter(txt);
                            tag.println ("||======= Tagihan Wifi ========");
                            tag.println ("|| Jumlah Pembayaran : "+wifi);
                            tag.println ("|| Saldo anda adalah : "+ data.getSaldo());
                            tag.println();
                            tag.close();
                        }catch (FileNotFoundException e){
                            e.printStackTrace();
                        }
                    }
                    break;


                case 4:
                    data.informasiExit();
                    System.exit(0);
                    break;
            }
        }
    }
}
