public class ElectricShaver {

    private static int howMuchShavers = 0;

    protected boolean hasWirelessCharghing;
    protected boolean isWaterproof;

    private int power;
    private String model;

    private int workTime;
    private int changingNozzles;
    private String company;


    public ElectricShaver() {

        this(3, "Braun", 1, 0, "6", false, false);

    }

    ElectricShaver(int workTime, String company, int changhingNozzles) {

        this(workTime, company, changhingNozzles, 10, "model", false, false);


    }

    ElectricShaver(int workTime, String company, int changingNozzles, int power, String model, boolean hasWirelessCharghing, boolean iswaterproof) {

        this.workTime = workTime;
        this.company = company;
        this.changingNozzles = changingNozzles;
        this.power = power;
        this.model = model;
        this.hasWirelessCharghing = true;
        this.isWaterproof = false;
        howMuchShavers++;

    }


    public void setWorkTime(int workTime) {

        this.workTime = workTime;
    }

    public int getworkTime() {

        return workTime;
    }

    public void setCompany(String company) {

        this.company = company;
    }

    public String getCompany() {

        return company;
    }

    public void setChangingNozzles(int changhingNozzles) {

        this.changingNozzles = changhingNozzles;
    }

    public int getChangingNozzles() {

        return changingNozzles;
    }


    public void setPower(int power) {

        this.power = power;


    }

    public int getPower() {

        return power;
    }


    public void setModel(String model) {

        this.model = model;
    }

    public String getModel() {

        return model;
    }


    public String toString() {


        return "Working Time: " + workTime
                + ", Company: " + company
                + ", Changhing Nozzles: "
                + changingNozzles + ", Power: "
                + power + ", Model: "
                + model + ", Has Wireless Charge: " + hasWirelessCharghing
                + ", Is Waterproof " + isWaterproof;
    }


    public void printSvaluse() {
        printStaticValue();
    }


    static void printStaticValue() {

        System.out.println("Number Of Shavers:" + howMuchShavers);
    }


    public void resetValues(int workTime, String company, int changhingNozzles, int power, String model, boolean hasWirelessCharghing, boolean iswaterproof) {

        this.workTime = workTime;
        this.company = company;
        this.changingNozzles = changhingNozzles;
        this.power = power;
        this.model = model;
        this.hasWirelessCharghing = hasWirelessCharghing;
        this.isWaterproof = iswaterproof;


    }


}
