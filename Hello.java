import java.util.Scanner;

public class Hello {

public static void main(String[] args) {
    // String nama= "Chaya";
    // String Asalkota="Jaktim";
    // int usia=16;
    // int BB=59;
    // int TinggiBadan =165;
    // char Kelamin = 'P';
    // boolean status= true;
    // int Aura=99999;
    // String SigmaLevel= "GOAT";
    // String nomorhp="081282378218";
    // String Istridari="Alfi";

    // System.out.println("Nama:"+nama);
    // System.out.println("Usia:"+usia);                   
    // System.out.println("Askot:"+Asalkota);  
    // System.out.println("Berat Badan:"+BB);
    // System.out.println("Tinggi Badan:"+TinggiBadan);
    // System.out.println("Kelamin:"+Kelamin);
    // System.out.println("True or false:"+status);

    // System.out.println("Aura:"+Aura);
    // System.out.println("SigmaLevel:"+SigmaLevel);
    // System.out.println("Nomor HP:"+nomorhp);
    // System.out.println("Istri Dari:"+Istridari);

    double alas,tinggi,hasil;
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan alas segitiga");
    alas = input.nextDouble();
    System.out.println("Masukkan tinggi segitiga");
    tinggi = input.nextDouble();
    hasil = alas*tinggi;
    System.out.println("Hasil Luas Segitiga Adalah:" +hasil);
}

}



