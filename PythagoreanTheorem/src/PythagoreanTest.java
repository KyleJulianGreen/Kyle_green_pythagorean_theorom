public class PythagoreanTest {
    public static void main (String[] args){
        Pythagorean iD = new Pythagorean();
        double Hypotenuse;
        Hypotenuse = iD.calculateHypotenuse(9, 10);
        System.out.println(Hypotenuse);
        Hypotenuse = iD.calculateHypotenuse(5, 4);
        System.out.println(Hypotenuse);
        Hypotenuse = iD.calculateHypotenuse(3, 4);
        System.out.println(Hypotenuse);
        Hypotenuse = iD.calculateHypotenuse(7, 5);
        System.out.println(Hypotenuse);
    }
}
