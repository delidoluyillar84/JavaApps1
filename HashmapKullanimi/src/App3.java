
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class App3
{
    public static Scanner oku = new Scanner(System.in);

    public static void main(String[] args)
    {
        String adlar[] = { "Emir", "Emir"," Efe", "Onur","Sercan","Aras","Onur","Sercan" };
        HashMap<String, String> hm = new HashMap<>();
        
        for (String ad : adlar)
            hm.put(ad, "");
        
        // HashMap'te Kullanılan Keyleri Bir Object[] Olarak Doner
        Object tekil[] = hm.keySet().toArray();
        // Eğer Object Array Değilde, Başka Bir Türde Veri İsteniyorsa
        // String[] tekil = hm.keySet().toArray(new String[0]);
        System.out.println(Arrays.toString(tekil));
    }  
    // http://pastie.org/10773459
    // http://pastie.org/10773460
}
