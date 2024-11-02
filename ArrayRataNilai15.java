import java.util.Scanner;

public class ArrayRataNilai15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // mengambil input dari user
    System.out.print("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();

    int[] nilaiMhs = new int[jmlMhs];
    double totalLulus = 0;
    double totalTdkLulus = 0;
    double rata2Lulus, rata2TdkLulus;
    int jmlLulus = 0;
    int jmlTdkLulus = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
      nilaiMhs[i] = sc.nextInt();
    }

    for (int i = 0; i < nilaiMhs.length; i++) {
      // menyeleksi mahasiswa yg nilainya > 70
      if (nilaiMhs[i] > 70) {
        totalLulus += nilaiMhs[i];
        jmlLulus++;
      } else {
        totalTdkLulus += nilaiMhs[i];
        jmlTdkLulus++;
      }
    }
    // menghitung rata2 yang lulus dan tidak lulus
    rata2Lulus = totalLulus / jmlLulus;
    rata2TdkLulus = totalTdkLulus / jmlTdkLulus;
    System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
    System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
  }
}