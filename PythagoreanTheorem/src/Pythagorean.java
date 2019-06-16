import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        legA = 4;
        legB = 3;

        double legC;
        legC = Math.sqrt ((legA *legA)+ (legB*legB));
        return legC;
    }
}