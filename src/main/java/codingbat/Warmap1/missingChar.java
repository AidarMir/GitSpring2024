package CodingBat.Warmap1;

public class missingChar {
    public String missingChar(String str, int n) {

        StringBuilder sb = new StringBuilder(str);

        return (sb.deleteCharAt(n).toString());

    }
// Учитывая непустую строку и целое число n, верните новую строку,
// в которой символ с индексом n был удален. Значение n будет допустимым
// индексом символа в исходной строке
// (т. е. n будет находиться в диапазоне 0..str.length()-1 включительно).
}
