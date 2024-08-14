package codingbat.Map1;

import java.util.Map;

public class topping2 {
    public Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }


// Учитывая карту ключей еды и их верхних значений, измените и верните карту
// следующим образом: если ключ «мороженое» имеет значение, установите его также
// как значение для ключа «йогурт». Если ключ «шпинат» имеет значение,
// измените это значение на «орехи».
}
