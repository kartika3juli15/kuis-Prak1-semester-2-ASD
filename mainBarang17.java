import java.util.Scanner;

public class mainBarang17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        String milih, masuk;

        //transaksiBarang17 transaksi = new transaksiBarang17();
        //transaksi.transaksiBarang17();
        hasilBarang.daftarPembelian();
        int pilih = sc17.nextInt();
        switch (pilih){
            case 1 :  
            Barang17 hasilBarang1 = new Barang17("K01", "Sabun", 1000.0, 5);
            Barang17 hasilBarang2 = new Barang17("K02", "Pasta gigi", 2000.0, 10);
            Barang17 hasilBarang3 = new Barang17("K03", "Biore", 3000.0, 23);
            Barang17 hasilBarang4 = new Barang17("K04", "Shampoo", 4000.0, 55);
            Barang17 hasilBarang5 = new Barang17("K05", "Sikat gigi", 5000.0, 65);
            Barang17[] items = new Barang17[5];
            items[0] = hasilBarang1;
            items[1] = hasilBarang2;
            items[2] = hasilBarang3;
            items[3] = hasilBarang4;
            items[4] = hasilBarang5;
        }
        System.out.println("masukkan kode barang : ");
        masuk = sc17.nextLine();
        System.out.println("apakah anda belanja lagi (y/n) : ");
        milih = sc17.nextLine();
        if (milih.equalsIgnoreCase("y")){
            System.out.println("--silahkan memilih lagi--");
        }else{
            System.out.println("--silahkan melakukan pembayaran--");
        }
        
        

        
    }
}
