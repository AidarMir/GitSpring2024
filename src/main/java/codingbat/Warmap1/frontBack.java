package CodingBat.Warmap1;

public class frontBack {
    public String frontBack(String str) {
        if (str.length() >= 2) {
            String lastChar = str. substring(str.length()-1);
            String firstChar = str.substring(0,1);
            String middle = str.substring(1, str.length()-1);
            return lastChar + middle + firstChar;
        }
        return str;
    }
// Учитывая непустую строку и целое число n, верните новую строку,
// в которой символ с индексом n был удален. Значение n будет допустимым
// индексом символа в исходной строке
// (т. е. n будет находиться в диапазоне 0..str.length()-1 включительно).
}
