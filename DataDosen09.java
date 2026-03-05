public class DataDosen09 {

    public void dataSemuaDosen09(Dosen09[] arrayOfDosen09) {
        for(int i=0; i<arrayOfDosen09.length;i++) {
            System.out.println("Data Dosen ke-" +(i+1));
            arrayOfDosen09[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen09){
        int pria = 0;
        int wanita = 0;
        for(int i=0; i<arrayOfDosen09.length; i++) {
            if (arrayOfDosen09[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria adalah: " +pria);
        System.out.println("Jumlah Dosen Wanita adalah: " +wanita) ;
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen09) {
        int totalPria=0, totalWanita=0;
        int jumlahPria=0, jumlahWanita=0;

        for(int i=0; i<arrayOfDosen09.length;i++) {
            if (arrayOfDosen09[i].jenisKelamin) {
                totalPria += arrayOfDosen09[i].usia;
                jumlahPria++;
            } else {
                totalWanita += arrayOfDosen09[i].usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria>0) {
            System.out.println("Rata-rata usia dosen pria:" +(totalPria/jumlahPria));
        }

        if (jumlahWanita>0) {
            System.out.println("Rata-rata usia dosen wanita adalah: " +(totalWanita/jumlahWanita));
        }
    }

    public void infoDosenPalingTua (Dosen09[] arrayOfDosen09) {
        int idxTertua = 0;

        for(int i =0; i<arrayOfDosen09.length; i++) {
            if(arrayOfDosen09[i].usia > arrayOfDosen09[idxTertua].usia) {
                idxTertua=i;
            }
        }

        System.out.println("Dosen paling tua: ");
        arrayOfDosen09[idxTertua].cetakInfo();

    }

    public void infoDosenPalingMuda (Dosen09[] arrayOfDosen09) {
        int idxTermuda = 0;

        for(int i =0; i<arrayOfDosen09.length; i++) {
            if(arrayOfDosen09[i].usia<arrayOfDosen09[idxTermuda].usia) {
                idxTermuda=i;
            }
        }

        System.out.println("Dosen paling muda: ");
        arrayOfDosen09[idxTermuda].cetakInfo();
        }
    }
