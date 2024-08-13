package CodingBat.Warmap1;

public class lastDigit {
    public boolean lastDigit(int a, int b) {

        int last = a % 10;
        int last2 = b % 10;

        return last == last2;

    }


// Учитывая два неотрицательных целочисленных значения, верните true,
// если они имеют одну и ту же последнюю цифру, например, 27 и 57.
// Обратите внимание, что оператор % «mod» вычисляет остатки, поэтому 17 % 10 равно 7.
}
