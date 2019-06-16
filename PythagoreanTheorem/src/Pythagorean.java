import java.lang.Math;
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        legA = legA*legA;
        legB = legB*legB;

        double legC;
        legC = Math.sqrt (legA+ legB);
        return legC;
    }
}