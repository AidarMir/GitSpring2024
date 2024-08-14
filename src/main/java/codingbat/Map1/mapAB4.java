package codingbat.Map1;

import java.util.Map;

public class mapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String getA = map.get("a");
            String getB = map.get("b");
            // Сравниваем длины значений ключей "a" и "b"
            if (getA.length() > getB.length()) {
                map.put("c", getA); // Устанавливаем более длинное значение для ключа "c"
            } else if (getB.length() > getA.length()) {
                map.put("c", getB); // Устанавливаем более длинное значение для ключа "c"
            } else {
                map.put("a", ""); // Устанавливаем пустую строку для ключа "a"
                map.put("b", ""); // Устанавливаем пустую строку для ключа "b"
            }
        }
        return map;
    }
// если ключи «a» и «b»
// имеют значения разной длины, установите для «c» более длинное значение.
// Если значения существуют и имеют одинаковую длину, измените их на пустую строку
// на карте.
}
