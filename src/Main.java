import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //        Oğlan və qız adlarını saxlayan bir Map yaradın.
//        Oğlan və qız adlarını ayrı-ayrı qruplara ayırın və nəticəni çap edin.

        Map<String, String> map = new HashMap<>();
        map.put("Mustafa", "Aydan");
        map.put("Orxan", "Aysel");
        map.put("Nicat", "Aysun");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println("Boy: " + entry.getKey() + " Girl: " + entry.getValue());
        }
    }
}
