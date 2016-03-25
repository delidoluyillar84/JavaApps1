
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Soru1
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        Integer tmp1[] = { 1,2,2,2,2,3,5,6,9,2,4,10,8,22,37 };
        Integer tmp2[] = { 19,6,4,2,5,10,8,2 };
        
        ArrayList<Integer> a1 = new ArrayList(Arrays.asList(tmp1));
        
        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i : tmp2)
            a2.add(i);
        
        int toplam = 0, cnt = 0;
        
        //<editor-fold defaultstate="collapsed" desc="Çözüm 1">
        /*
        
        // a1 ArrayList'indeki Her Sayı İçin
        for (int sayi : a1)
        {
        // Eğer Sayı a2'de Yoksa
        if (!a2.contains(sayi))
        {
        System.out.print(sayi+" ");
        toplam += sayi;
        cnt++;
        }
        }
        System.out.println();
        double ort = (double)toplam / cnt;
        System.out.println("Toplam : "+toplam+" Ortalama : "+ort);
        */
//</editor-fold>
    
        // Çözüm 2
        a1.removeAll(a2);
        
        for (int i = 0; i<a1.size(); i++)
        {
            toplam += a1.get(i);
        }
        
        double ort = (double)toplam / a1.size();
        
        System.out.println("Toplam : "+toplam+" Ortalama : "+ort);
        
        
    }
}
