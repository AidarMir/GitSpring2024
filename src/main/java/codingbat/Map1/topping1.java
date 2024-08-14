package codingbat.Map1;

import java.util.Map;

public class topping1 {
    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread", "butter");
        // Независимо от этого установите «хлеб» на «масло».

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry"); // Поменяйте «мороженое» на «вишня».
        }

        return map;
    }
// Учитывая карту ключей еды и значений начинки, измените и верните карту
// следующим образом: если присутствует ключ «мороженое»,
// установите для него значение «вишня». Во всех случаях установите для
// ключа «хлеб» значение «масло».
}
