import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        LinkedList<Data> linkedList = new LinkedList<Data>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Memilih Inputan : \n 1. Input Tugas\n 2. Delete Tugas\n 3. Lihat List Tugas\n 4. Keluar");
            System.out.print("Pilihan :");
            int pilihan = input.nextInt();input.nextLine();

            if (pilihan == 1) {
                System.out.print("Mata Kuliah :");
                String matkul = input.nextLine();
                System.out.println();
                System.out.print("Nama Tugas :");
                String Tugas = input.nextLine();
                System.out.println();
                System.out.print("Deadline :");
                String Deadline = input.nextLine();
                System.out.println();

                linkedList.add(new Data(matkul, Tugas, Deadline));
            } else if (pilihan == 2) {

                ListIterator<Data> iterator = linkedList.listIterator();
                System.out.print("Hapus Matkul :");

                String masukan = input.nextLine();
                while (iterator.hasNext()) {
                    Data t = iterator.next();
                    if (t.getMatkul().equals(masukan)) {
                        iterator.remove();
                    }
                }

            } else if (pilihan == 3) {

                Collections.sort(linkedList, Data.tanggalComparator);

                for (Data tugas : linkedList) {
                    System.out.println(tugas);
                }
            } else if (pilihan == 4) {
                break;
            }
        }
        input.close();
    }
}