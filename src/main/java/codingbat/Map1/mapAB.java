package codingbat.Map1;

import java.util.Map;

public class mapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String getA = map.get("a");
            String getB = map.get("b");
            map.put("ab", getA + getB);
        }
        return map;
    }

// Измените и верните данную карту следующим образом: для этой проблемы
// карта может содержать или не содержать ключи «a» и «b». Если присутствуют
// оба ключа, соедините их два строковых значения и сохраните результат
// под ключом «ab».
}
