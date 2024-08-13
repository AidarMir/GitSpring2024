package CodingBat.Warmap1;

public class notString {
    public String notString(String str) {

        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;

        }
    }


// Учитывая строку, верните новую строку, в которой впереди добавлено «не».
// Однако если строка уже начинается с «нет», верните строку без изменений.
// Примечание. используйте .equals() для сравнения двух строк.
}
