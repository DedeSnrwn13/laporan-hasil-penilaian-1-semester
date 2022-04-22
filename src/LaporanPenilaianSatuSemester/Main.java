/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaporanPenilaianSatuSemester;
import java.util.Scanner;

/**
 *
 * @author Dede Sunarwan
 */
class Mahasiswa {
    protected String nama;
    protected float tugas;
    protected float quiz;
    protected float uts;
    protected float uas;
}

class Data extends Mahasiswa {
    Scanner getData = new Scanner(System.in);
    
    public void setData() {
        System.out.println("Masukan Masukan Nama : ");
        this.nama = getData.nextLine();
        
        System.out.println("Masukan Nilai Tugas : ");
        this.tugas = getData.nextInt();
        
        System.out.println("Masukan Nilai Quiz : ");
        this.quiz = getData.nextInt();
        
        System.out.println("Masukan Nilai UTS : ");
        this.uts = getData.nextInt();
        
        System.out.println("Masukan Nilai UAS : ");
        this.uas = getData.nextInt();
    }
    
    public void tampilkan() {
        System.out.println("-----------------");
        System.out.println("LAPORAN HASIL");
        System.out.println("-----------------");
        System.out.println("Nilai Quiz : " + this.quiz);
        float nilaiQuiz = (float) (0.20 * this.quiz);
        System.out.println("Nilai Tugas : " + this.tugas);
        float nilaiTugas = (float) (0.20 * this.tugas);
        System.out.println("Nilai UTS : " + this.uts);
        float nilaiUts = (float) (0.30 * this.uts);
        System.out.println("Nilai UAS : " + this.uas);
        float nilaiUas = (float) (0.30 * this.uas);
        System.out.println("-----------------");
        
        float akhirQuiz = nilaiQuiz;
        float akhirTugas = nilaiTugas;
        float akhirUts = nilaiUts;
        float akhirUas = nilaiUas;
        float nilai = akhirQuiz + akhirTugas + akhirUts + akhirUas;
        
        float hasil = nilai;
        
        if (hasil >= 80 && hasil <= 100) {
            System.out.println("Selamat " + this.nama + " sudah LULUS");
            System.out.println("Nilai Total : " + hasil);
            System.out.println("Grade : A");
        }else if (hasil >= 70 && hasil <= 79) {
            System.out.println("Selamat " + this.nama + " sudah LULUS");
            System.out.println("Nilai Total : " + hasil);
            System.out.println("Grade : B");
        } else if (hasil <= 69 && hasil >= 60) {
            if (this.quiz < 70) {
                System.out.println("Nilai Quiz masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.tugas < 70) {
                System.out.println("Nilai Tugas masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uts < 70) {
                System.out.println("Nilai UTS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uas < 70) {
                System.out.println("Nilai UAS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            System.out.println("Nilai Total : " + hasil);
            System.out.println("Grade : B");
        } else if (hasil <= 59 && hasil >= 40) {
            if (this.quiz < 70) {
                System.out.println("Nilai Quiz masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.tugas < 70) {
                System.out.println("Nilai Tugas masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uts < 70) {
                System.out.println("Nilai UTS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uas < 70) {
                System.out.println("Nilai UAS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            System.out.println("Nilai Total : " + hasil);
            System.out.println("Grade : C");
        } else if (hasil <= 39 && hasil >= 20) {
             if (this.quiz < 70) {
                System.out.println("Nilai Quiz masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.tugas < 70) {
                System.out.println("Nilai Tugas masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uts < 70) {
                System.out.println("Nilai UTS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uas < 70) {
                System.out.println("Nilai UAS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            System.out.println("Nilai Total : " + hasil);
            System.out.println("Grade : D");
        } else if (hasil <= 19 && hasil >= 1) {
             if (this.quiz < 70) {
                System.out.println("Nilai Quiz masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.tugas < 70) {
                System.out.println("Nilai Tugas masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uts < 70) {
                System.out.println("Nilai UTS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            if (this.uas < 70) {
                System.out.println("Nilai UAS masih kurang dari 70, Silahkan Perbaikan terlebih dahulu");
            }
            
            System.out.println("Nilai Total : " + hasil);
            System.out.println("Grade : E");
        } else {
            System.out.println("Oops. Ada kesalahan");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Data nilaiAkhir;
        
        nilaiAkhir = new Data();
        
        nilaiAkhir.setData();
        nilaiAkhir.tampilkan();
    }
}
