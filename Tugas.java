import java.util.Scanner;

public class Tugas implements Comparable<Tugas> {
    private String mataKuliah;
    private String tugas;
    private String deadline;
    
    public Tugas() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nMasukan Nama Mata Kuliah: ");
        this.mataKuliah = s.nextLine();
        System.out.println("Masukan Tugas: ");
        this.tugas = s.nextLine();
        System.out.println("Masukan Deadline: ");
        this.deadline = s.nextLine();
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    @Override
    public String toString() {
        return "Data [mataKuliah=" + mataKuliah + ", tugas=" + tugas + ", deadline=" + deadline + "]";
    }

    @Override
    public int compareTo(Tugas o) {
        return this.getMataKuliah().compareTo(o.getMataKuliah());
    }

    
}