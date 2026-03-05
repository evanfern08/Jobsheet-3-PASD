import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen09[] arrayOfDosen09 = new Dosen09[3];
        String kode, nama, dummy;
        int usia;

        for (int i=0; i<3;i++){
            System.out.println("Masukan data dosen ke-" +(i+1));
            System.out.print("Kode                        :");
            kode = sc.nextLine();
            System.out.print("Nama                        :");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P)         :");
            char jk = sc.nextLine().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia                        :");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

            arrayOfDosen09[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }

        //untuk menampilkan data
        // for(int i=0; i<3;i++) {
        //     System.out.println("Data Dosen ke- " +(i+1));
        //     arrayOfDosen09[i].cetakInfo();
        //     System.out.println("--------------------------------------");
        // }

        DataDosen09 data = new DataDosen09();

        System.out.println("---- Semua Data Dosen ----");
        data.dataSemuaDosen09(arrayOfDosen09);
        System.out.println();
        System.out.println("---- Jumlah Dosen Per Jenis Kelamin ----");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen09);
        System.out.println();
        System.out.println("---- Rata-rata Usia Per Jenis Kelamin ----");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen09);
        System.out.println();
        System.out.println("---- Dosen Paling Tua ----");
        data.infoDosenPalingTua(arrayOfDosen09);
        System.out.println();
        System.out.println("---- Dosen Paling Muda ----");
        data.infoDosenPalingMuda(arrayOfDosen09);


    }
}
