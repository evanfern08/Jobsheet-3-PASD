import java.util.Scanner;

public class MataKuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Mata Kuliah:");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        MataKuliah09[] arrayOfMatakuliah09 = new MataKuliah09[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i<3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" +(i+1));
             System.out.print("Kode    :");
             kode = sc.nextLine();
             System.out.print("Nama    :");
             nama = sc.nextLine();
             System.out.print("SKS     :");
             dummy = sc.nextLine();
             sks = Integer.parseInt(dummy);
             System.out.print("Jumlah Jam :");
             dummy = sc.nextLine();
             jumlahJam = Integer.parseInt(dummy);

             arrayOfMatakuliah09[i] = new MataKuliah09(kode, nama, sks, jumlahJam);

             for(int j=0; j<3; j++) {
                System.out.println("Data Mata Kuliah ke-" +(j+1));
                System.out.println("Kode    : " +arrayOfMatakuliah09[j].kode);
                System.out.println("Nama    : " +arrayOfMatakuliah09[j].nama);
                System.out.println("SKS     : " +arrayOfMatakuliah09[j].sks);
                System.out.println("Jumlah Jam : " +arrayOfMatakuliah09[j].jumlahJam);
                System.out.println("-----------------------------------------");
             }

             for (int i=0; i<jumlah; i++) {
                arrayOfMatakuliah09[i].cetakInfo();
             }
        }
    }
}