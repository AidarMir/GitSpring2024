package codingbat.Map1;

import java.util.Map;

public class topping3 {
    public Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }



// Учитывая карту ключей еды и значений начинки, измените и верните карту
// следующим образом: если ключ «картофель» имеет значение, установите его как
// значение для ключа «фри». Если ключ «салат» имеет значение,
// установите его как значение для ключа «шпинат».
}
