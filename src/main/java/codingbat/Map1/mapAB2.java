package codingbat.Map1;

import java.util.Map;

public class mapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") &&
                map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

// Измените и верните данную карту следующим образом: если ключи «a» и «b»
// присутствуют в карте и имеют одинаковые значения, удалите их оба.
}
