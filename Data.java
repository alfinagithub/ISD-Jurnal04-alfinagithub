import java.util.Comparator;

public class Data {

    private String matkul;
    private String tugas;
    private String tanggal;

    public Data (String matkul, String tugas, String tanggal) {
        this.matkul = matkul;
        this.tugas = tugas;
        this.tanggal = tanggal;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getTugas() {
        return tugas;
    }

    public String getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + matkul + ", tugas = " + tugas + ", deadline = " + tanggal;
    }

    public static Comparator<Data> tanggalComparator = new Comparator<Data>() {
        @Override
        public int compare (Data tugas1, Data tugas2) {
            // Menggunakan metode compareTo untuk membandingkan tanggal
            return tugas1.getTanggal().compareTo(tugas2.getTanggal());
        }
    };
}