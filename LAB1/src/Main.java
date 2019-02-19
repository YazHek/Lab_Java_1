public class Main {

    public static void main(String[] args) {

        ElectricShaver XiaomiShaver = new ElectricShaver(3, "Xiaomi",
                2, 10, "Mijia MJTXD01SKS", true, false);


        ElectricShaver PhilipsShaver = new ElectricShaver(1, "Philips", 3);
        ElectricShaver BraunShaver = new ElectricShaver();



        System.out.println(XiaomiShaver.toString());
        System.out.println(PhilipsShaver.toString());
        System.out.println(BraunShaver.toString());

        XiaomiShaver.printSvaluse();
        ElectricShaver.printStaticValue();
    }
}
