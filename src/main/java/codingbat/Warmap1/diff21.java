package CodingBat.Warmap1;

public class diff21 {

    public int diff21(int n) {

        int difference = Math.abs(n - 21);
        return (n > 21) ? difference * 2 : difference;

    }
}
