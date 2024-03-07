import java.util.Scanner;

public class Barang17 {
        String kode;
        String nama;
        double harga;
        int stok;
    
        public Barang(String kode_barang, String nama_barang, double harga_barang, int stok_barang) {
            this.kode = kode_barang;
            this.nama = nama_barang;
            this.harga = harga_barang;
            this.stok = stok_barang;
        }

        public void tampilBarang(){
            System.out.println("1. " + hasilBarang1);
        }

        public void daftarPembelian(){
            Scanner sc17 = new Scanner(System.in);
            System.out.println("==========================");
            System.out.println("TOKO PAK LINOW");
            System.out.println("==========================");
            System.out.println("1. tampilkan barang");
            System.out.println("2. beli");
            System.out.println("3. tampilkan pembelian");
            System.out.println("4. keluar");
            System.out.print("pilih (1-4) : ");
        }
    }