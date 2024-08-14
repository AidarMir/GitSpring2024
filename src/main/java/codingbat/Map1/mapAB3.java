package codingbat.Map1;

import java.util.Map;

public class mapAB3 {
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b"))  {
            map.put("b", map.get("a"));
        }
        if (!map.containsKey("a") && map.containsKey("b")) {
            map.put("a", map.get("b"));
        }
        return map;
    }

// Измените и верните данную карту следующим образом: если ровно один из ключей
//«a» или «b» имеет значение на карте (но не оба), установите для другого такое же
// значение на карте.
}
