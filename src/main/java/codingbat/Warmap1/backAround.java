package CodingBat.Warmap1;

public class backAround {

    public String backAround(String str) {

        char st = str.charAt(str.length()-1);
        return st+str+st;

    }


// Учитывая строку, возьмите последний символ и верните новую строку
// с последним символом, добавленным спереди и сзади,
// поэтому «cat» дает «tcatt». Исходная строка будет иметь длину 1 или более.
}
