
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class ArrayListKullanimi
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        ArrayList<String> al = new ArrayList<>();
        // ArrayList'in Boyutu
        int length = al.size();
        System.out.println("Size : "+al.size());
        
        // ArrayList'in Sonuna Eleman Ekle
        al.add("Can");
        al.add("Onur");
        
        System.out.println("Size : "+al.size());
        System.out.println(al);
        // ArrayList'in İstenildiği Index'e Eleman Ekleme
        al.add(1, "Mustafa");
        System.out.println(al);
        
        // ArrayList'ten Eleman Silme
        // Eleman Değeriyle Silme
        boolean sonuc = al.remove("Can");
        System.out.println(al);
        // Eleman Index'iyle silme
        String silinenVeri = al.remove(0);
        System.out.println(al);
        
        // ArrayList'i Temizleme
        al.clear();
        System.out.println(al);
        
       // Arama Methodları
       boolean varMi = al.contains("Emir");
       int pos = al.indexOf("Emir");        // 0 - n-1, Yoksa -1
       int sonPos = al.lastIndexOf("Emir");
       
       // ArrayList BosMu
       boolean isEmpty1 = al.size() == 0;
       boolean isEmpty2 = al.isEmpty();
       
       // ArrayList'teki Bir Elemanı Güncelleme
        al.add("Q");
        al.add("W");
        al.add("E");
        
        System.out.println(al);
       // ArrayList'teki Bir Elemanı Güncelleme
       al.set(1, "B");      // 1. Index'teki Elemanı B İle Güncelle
       System.out.println(al);
       
       al.clear();
       al.add("Istanbul");
       al.add("Bursa");
       al.add("Ankara");
       
       ArrayList<String> digerSehirler = new ArrayList<>();
       digerSehirler.add("Tokyo");
       digerSehirler.add("Doha");
       digerSehirler.add("Newyork");
       
       // DigerSehirlerdeki Butun Elemanlari, al'ye Ekle
       al.addAll(digerSehirler);
        System.out.println(al);
        
        // 2 ArrayListteki Ortak Elemanları Bul Ve Temizle
        ArrayList<String> blockList = new ArrayList<>();
        blockList.add("Ankara");
        blockList.add("Doha");
        blockList.add("Antaly");
        blockList.add("Adana");
        
        al.removeAll(blockList);
        System.out.println(al);
        
        // ArrayList'in Yedegini Al
        ArrayList<String> backup = (ArrayList<String>) al.clone();
        
        ArrayList<String> a2 = al;      //REFERENCE!
        System.out.println("AL : "+al);
        System.out.println("A2 : "+a2);
        al.clear();
        System.out.println("A2 : "+a2);
        
        System.out.println("Backup : "+backup);
       
        
        for (String sehir : backup)
            System.out.println("Sehir : "+sehir);
        
        
        // http://pastie.org/10771233
    }
}
