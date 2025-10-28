public class Mahasiswa {
    private String nama;
    private String nim;
    private Dosen pembimbing; // Asosiasi

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // METODE UNTUK MEMENUHI USER STORY #2 (Bagian 1: Pencatatan)
    public void setPembimbing(Dosen dosen) {
        this.pembimbing = dosen;
    }

    // METODE UNTUK MEMENUHI USER STORY #2 (Bagian 2: Melihat)
    public void lihatDosenPembimbing() {
        if (this.pembimbing != null) {
            System.out.println("INFO: Dosen pembimbing " + this.nama + " adalah " + this.pembimbing.getNama());
        } else {
            System.out.println("INFO: " + this.nama + " belum memiliki dosen pembimbing.");
        }
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Dosen getPembimbing() {
        return pembimbing;
    }
}
