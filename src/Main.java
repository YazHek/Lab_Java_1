public class Main {

    public static void main(String[] args) {


        ElectricShaver BraunShaver = new ElectricShaver();
        ElectricShaver PhilipsShaver = new ElectricShaver(1, "Philips", 3);
        ElectricShaver XiaomiShaver = new ElectricShaver(3, "Xiaomi",
                2, 10, "Mijia MJTXD01SKS", false, false);

        System.out.println(XiaomiShaver.toString());
        System.out.println(PhilipsShaver.toString());
        System.out.println(BraunShaver.toString());


        XiaomiShaver.printSvaluse();
        ElectricShaver.printStaticValue();

        XiaomiShaver.resetValues(0, "",
                0,0, "", false, false);


    }
}
