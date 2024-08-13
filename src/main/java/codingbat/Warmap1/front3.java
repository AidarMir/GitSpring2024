package CodingBat.Warmap1;

public class front3 {
    public String front3(String str) {

        if (str.length() >=3) {
            return str.substring(0,3)
                    + str.substring(0,3)
                    + str.substring(0,3);
        }
        return str+str+str;
    }
// Учитывая строку, мы скажем, что впереди — это первые 3 символа строки.
// Если длина строки меньше 3, передняя часть — это все, что есть.
// Верните новую строку, которая представляет собой 3 копии передней части.
}
