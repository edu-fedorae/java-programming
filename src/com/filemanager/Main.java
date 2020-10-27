package com.filemanager;

public class Main {

    public static void main(String[] args) {
        System.out.println("Windows 10  Operating System - File Manager\n");

        // Documents
        System.out.println("#### Documents ####");

        Document.Word docx = new Document.Word(11);
        docx.print(); // You printed [pages] Pages.

        Document.Excel xlsx = new Document.Excel(21);
        xlsx.print(); // You printed [sheets] Sheets.

        Document.PDF pdf = new Document.PDF("Ryan Gosling");
        pdf.print(); // You printed a PDF by [author].

        System.out.println("\n########################################\n");

        // Files
        System.out.println("#### Files ####");
        System.out.println("Sound File:");
        File.Media.Sound mp3 = new File.Media.Sound("Music", 17, 4);
        mp3.Open();
        mp3.play();
        mp3.Copy();
        mp3.Delete();
        System.out.println("Picture File:");
        File.Media.Picture png = new File.Media.Picture("Picture", 21, 17, 21);
        png.Open();
        png.print();
        png.Copy();
        png.Delete();
    }

}
