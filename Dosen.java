import java.util.ArrayList;
import java.util.List;

public class Dosen {
    private String nama;
    private String nidn;
    private List<Mahasiswa> mahasiswaBimbingan; // Agregasi

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
        this.mahasiswaBimbingan = new ArrayList<>();
    }

    // METODE UNTUK MEMENUHI USER STORY #1
    public void tambahMahasiswaBimbingan(Mahasiswa mhs) {
        this.mahasiswaBimbingan.add(mhs);
        System.out.println("INFO: " + mhs.getNama() + " berhasil menjadi bimbingan " + this.nama);
    }

    // Metode untuk US-003 (bisa kita implementasikan juga)
    public void lihatDaftarBimbingan() {
        System.out.println("--- Daftar Bimbingan Dosen: " + this.nama + " ---");
        for (Mahasiswa mhs : this.mahasiswaBimbingan) {
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
        }
    }

    // ... getter
}
