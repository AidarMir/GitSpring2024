package codingbat.Map1;

import java.util.Map;

public class mapShare {

    public Map<String, String> mapShare(Map<String, String> map) {

        // Шаг 1: Проверяем, есть ли ключ "a" и имеет ли он значение
    if (map.containsKey("a")) {
        String значениеA = map.get("a");
        // Шаг 2: Устанавливаем ключ "b" с тем же значением, что и у "a"
        map.put("b", значениеA);
    }
    // Шаг 3: Удаляем ключ "c" из карты
    map.remove("c");

    // Возвращаем измененную карту
    return map;
    }
}
