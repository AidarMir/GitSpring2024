package CodingBat.Warmap1;

public class close10 {
    public int close10(int a, int b) {
        int one = Math.abs(a - 10);
        int two = Math.abs(b - 10);
        if (one < two)  {
            return a;
        } else if (two < one) {
            return b;
        } else {
            return 0;
        }
    }
}
