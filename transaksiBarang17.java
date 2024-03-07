

public class transaksiBarang17 {
    ArrayList<Barang> barangs;

    public TransaksiBarang() {
        this.barangs = new ArrayList<>();
    }

    public void tambahBarang(Barang barang) {
        this.barangs.add(barang);
    }

    public void tampilkanBarang() {
        for (Barang barang : this.barangs) {
            System.out.println("Kode Barang: " + barang.kode_barang +
                    ", Nama Barang: " + barang.nama_barang +
                    ", Harga: " + barang.harga_barang);
        }
    }
}

class Pembelian {
    ArrayList<Barang> barangPembelian;
    
    public Pembelian() {
        this.barangPembelian = new ArrayList<>();
    }

    public void tambahPembelian(Barang barang) {
        this.barangPembelian.add(barang);
    }

    public void tampilkanBarangPembelian() {
        for (Barang barang : this.barangPembelian) {
            System.out.println("Kode Barang: " + barang.kode_barang +
                    ", Nama Barang: " + barang.nama_barang +
                    ", Harga: " + barang.harga_barang);
        }
    }

    public void melakukanPembelian(TransaksiBarang transaksiBarang) {
        for (Barang barang : this.barangPembelian) {
            transaksiBarang.tambahBarang(barang);
        }
    }
}

