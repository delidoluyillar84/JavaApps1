
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class App1
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Hashmap<AnahtarTuru, DegerTuru> hm = ....
           HashMap<Integer,Integer> hm = new HashMap<>();
           HashMap<String, String> hm2 = new HashMap<>();
           HashMap<Integer, String> hm3 = new HashMap<>();
           
           // HashMap'e Değer Ekleme
           hm2.put("ad", "Emir");
           hm2.put("soyad", "Civaş");
           hm2.put("e-posta", "i.am@live.jp");
           //hm2.put("ad", "Duygu"); --> Emir'i Yokeder
           
           // HashMap'i Ekrana Bastırma
           System.out.println(hm2);
           
           // HashMap'ten Değer Okuma
           System.out.println("Adı : "+hm2.get("ad"));
           System.out.println("Soyadı : "+hm2.get("soyad"));
           System.out.println("E-Posta : "+hm2.get("e-posta"));
           
           // HashMap'in Boyutu
           int len = hm2.size();
           System.out.println("HM'de "+len+" Adet Veri Var");
           
           // HashMap'teki Anahtar Listesi
           // Set : İçinde Bulunan Elemanları Sıralamayan
           // Bir Nesne
           Object[] anahtarlar = hm2.keySet().toArray();
           
           for (int i = 0; i< anahtarlar.length; i++)
           {
               String key = anahtarlar[i].toString();
               String val = hm2.get(key);
               System.out.println("KEY : "+key+" VAL : "+val);
           }
           
           // http://pastie.org/10773393
           
    }
}
