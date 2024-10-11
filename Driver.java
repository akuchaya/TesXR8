package BUKUH;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bukunya Textbook atau Novel? ");
        String kondisi_satu = input.next();
        
        System.out.println("Judul buku apa? ");
        String nama = input.next();
        System.out.println("Harga buku? ");
        double harga = input.nextDouble();
        System.out.println("Tahun buku? ");
        int tahun = input.nextInt();

        Book satu = new Book(nama, tahun, harga);
        satu.uraikan();



        if (kondisi_satu.equalsIgnoreCase("Textbook")) {
            System.out.println("Subject apa? ");
            String subject = input.next();
            Novel satu_text = new Novel(subject,nama, tahun, harga);
            satu_text.uraikan();
            System.out.println("Apakah termasuk Bio");
            String kondisi_dua = input.next();
            if (kondisi_dua.equals("iya")) {
                System.out.println("Bio tentang apa? ");
                String tentang = input.next();
                Bio satu_bio = new Bio(tentang,subject, nama, tahun, harga);
                satu_bio.uraikan();
            }
        } else if (kondisi_satu.equalsIgnoreCase("Novel")) {
            System.out.println("Genrenya apa? ");
            String genre = input.next();
            Novel satu_novel = new Novel(genre,nama, tahun, harga);
            satu_novel.uraikan();

        }

    }
}
