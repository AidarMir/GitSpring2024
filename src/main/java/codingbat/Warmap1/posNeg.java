package CodingBat.Warmap1;

public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return (a < 0 && b < 0);

        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);

        }
    }

// Учитывая два целочисленных значения, верните true, если одно отрицательное,
// а другое положительное. За исключением случаев, когда параметр «отрицательный»
// имеет значение true,возвращайте true только в том случае, если оба параметра
// отрицательны.
}
