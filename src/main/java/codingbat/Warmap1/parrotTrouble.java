package CodingBat.Warmap1;

public class parrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking) {

            if (hour <7  || hour > 20){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
//У нас есть громко говорящий попугай. Параметр «час» — текущее время часа
//в диапазоне 0..23. У нас проблемы, если попугай разговаривает, а час до 7 или
// после 20. Верните true, если у нас проблемы.
}
