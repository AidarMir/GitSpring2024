package CodingBat.Warmap1;

public class icyHot {

    public boolean icyHot(int temp1, int temp2) {

        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0) ? true : false;

    }

// если одна меньше 0, а другая больше 100.
//  верните true
}
