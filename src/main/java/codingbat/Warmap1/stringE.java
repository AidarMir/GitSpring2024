package CodingBat.Warmap1;

public class stringE {
    public boolean stringE(String str) {

        int count = 0; // Переменная для подсчета количества символов 'e' в строке
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++; // Увеличиваем счетчик, если текущий символ 'e'
            }
        }
        // Возвращаем true, если количество 'e' в строке от 1 до 3
        return count >= 1 && count <= 3;
    }

// Возвращает true, если данная строка содержит от 1 до 3 символов «e».
}
