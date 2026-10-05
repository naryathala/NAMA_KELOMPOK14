import java.util.Scanner;

public class tugas_Modul4_kel14 {
    //kelompok 14 :D
    public static void intro() {
        System.out.println("=".repeat(15) + "Raccoon Rescue_Post-14" + "=".repeat(15));
    }

    public static String penentuan(String mata, double suhu, String gigit) {
        mata = mata.toLowerCase();
        gigit = gigit.toLowerCase();

        if (gigit.equals("ada")) {
            return "Positif terinfeksi (tenang masih ada ruangan khusus^^)";
        } else {
            if (mata.equals("merah")) {
                if (suhu < 35.0 || suhu > 37.5) {
                    return "Karantina ketat (kemungkinan terinfeksi)";
                } else {
                    return "Karantina sementara (kemungkinan belum terinfeksi)";
                }
            } else {
                if (suhu < 35.0) {
                    return "Karantina singkat (indikasi zombie mayat)";
                } else if (suhu > 37.5) {
                    return "Karantina singkat (indikasi rendah menjadi zombie)";
                } else {
                    return "silahkan masuk (stay safe :3)";
                }
            }
        }
    }

    public static void main(String[] args) {
        tugas_Modul4_kel14.intro();
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah penyintas: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] listnama = new String[jumlah];
        String[] listmata = new String[jumlah];
        double[] listsuhu = new double[jumlah];
        String[] listgigit = new String[jumlah];
        String[] listhasil = new String[jumlah];

        System.out.println("~".repeat(50));

        for (int i = 0; i < jumlah; i++) {
            System.out.println("---Penyintas-" + (i+1) + "---");
            System.out.print("nama       : ");
            listnama[i] = input.nextLine();
            System.out.println("Cek kondisi tubuh");
            System.out.print("Pengecekan mata (merah/normal): ");
            listmata[i] = input.nextLine();
            System.out.print("Pengecekan suhu(dalam °C): ");
            listsuhu[i] = input.nextDouble();
            input.nextLine();
            System.out.print("Pengecekan luka gigitan(ada/tidak): ");
            listgigit[i] = input.nextLine();

            listhasil[i] = tugas_Modul4_kel14.penentuan(listmata[i], listsuhu[i], listgigit[i]);
        }

        System.out.println("\n"+"=".repeat(15) + "Raccoon Rescue_Post-14_Results" + "=".repeat(15));

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n>>>>> Hasil pengecekan " + (i + 1) + " <<<<<");
            System.out.println("Nama             : " + listnama[i]);
            System.out.println("Terdapat gigitan : " + listgigit[i]);
            System.out.println("Kondisi mata     : " + listmata[i]);
            System.out.println("Kondisi suhu     : " + listsuhu[i] + " °C");
            System.out.println("Keputusan akhir  : " + listhasil[i]);
        }
        input.close();
    }
}
