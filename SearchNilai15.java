import java.util.Scanner;
public class SearchNilai15 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int jmlNilai, key, hasil;
    hasil = 0;
    // mengambil input dari user
    System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
    jmlNilai = userInput.nextInt();
    int[] arrNilai = new int[jmlNilai];  // membuat array
    // mengisi nilai pada elemen array
    for (int i = 0; i < arrNilai.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
      arrNilai[i] = userInput.nextInt();
    }
    // input nilai yg ingin dicari
    System.out.print("Masukkan nilai yang ingin dicari : ");
    key = userInput.nextInt();
    // mencari nilai
    for (int i = 0; i < arrNilai.length; i++) {
      if (arrNilai[i] == key) {
        hasil = i + 1;
        break;
      } 
    }
    // menampilkan nilai ketemu atau tidak ketemu
    if (hasil != 0) {
      System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil + "\n");
    } else {
      System.out.println("\nNilai yang dicari tidak ditemukan\n");
    }
  }
}