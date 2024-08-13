package CodingBat.Warmap1;

public class front22 {
    public String front22(String str) {

        if (str.length() > 2) {
            return str.substring(0,2) + str + str.substring(0,2);
        }

        return str+str+str;
    }
// Учитывая строку, возьмите первые два символа и верните строку
// с добавленными двумя символами спереди и сзади, так что «котенок»
// дает «кикиттенки».
// Если длина строки меньше 2, используйте любые имеющиеся символы.
}
