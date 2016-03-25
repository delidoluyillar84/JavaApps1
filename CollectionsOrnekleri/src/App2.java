
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App2
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        List<String> al = new ArrayList<>();
        
        
        
        while (true)
        {
            System.out.print("Kelime : ");
            String w = oku.next();
            
            if (w.equals("bye"))    break;
            
            if (!al.contains(w))
                al.add(w);
        }
        System.out.println(al);
        
        // ArrayList'i K->B Dogru Siralamak
        Collections.sort(al);
        System.out.println(al);
        // ArrayList'i Ters Cevir
        Collections.reverse(al);
        System.out.println(al);
    }
} // http://pastie.org/10771284

/*
Menu : 
1 - Kayıt Ekle
2 - Değere Göre Sil
3 - Ara
4 - Tümünü Listele
5 - Çıkış
Seçiniz : [1-5] : 

*/
