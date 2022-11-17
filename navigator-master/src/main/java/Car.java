import java.util.Random;
public class Car {
    private int v;
    public int getV() {   //возвращает в
        Random random = new Random();
        v += random.nextInt(6)+1;
        if (v >= 120){
            v -= 8;
        }
        return v;
    }
}
