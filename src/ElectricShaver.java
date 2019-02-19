public class ElectricShaver {

    private static int howMuchShavers = 0;


    protected boolean hasWirelessCharghing;
    protected boolean isWaterproof;


    private int power;
    private String model;

    private int workTime;
    private int changingNozzles;
    private String company;








    ElectricShaver(){

        this(2, "Company", 3, 10, "Model", true, false);

    }


    ElectricShaver(int WorkTime, String Company, int ChangingNozzles, int Power, String Model, boolean HasWirelessCharghing, boolean Iswaterproof){

        this.workTime = WorkTime;
        this.company = Company;
        this.changingNozzles = ChangingNozzles;
        this.power = Power;
        this.model = Model;
        this.hasWirelessCharghing = true;
        this.isWaterproof = false;
        howMuchShavers++;

    }

    ElectricShaver(int WorkTime, String Company, int ChanghingNozzles){

        this(WorkTime, Company, ChanghingNozzles, 10, "model", true, false);


    }




    public void setWorkTime(int WorkTime){

        this.workTime = WorkTime;
    }

    public int getWorkTime(){

        return workTime;
    }

    public void setCompany (String Company){

        this.company = Company;
    }

    public String getCompany(){

        return company;
    }

    public void setChangingNozzles (int ChanghingNozzles){

        this.changingNozzles = ChanghingNozzles;
    }

    public int getChangingNozzles(){

        return changingNozzles;
    }



    public void setPower(int Power){

        this.power = Power;


    }

    public int getPower(){

        return power;
    }



    public void setModel( String Model){

        this.model = Model;
    }

    public String getModel(){

        return model;
    }


    public String toString(){



        return "Working Time: " + workTime
                + ", Company: " + company
                + ", Changhing Nozzles: "
                + changingNozzles + ", Power: "
                + power + ", Model: "
                + model + ", Has Wireless Charge: "+ hasWirelessCharghing
                + ", Is Waterproof " + isWaterproof;
    }


    public void printSvaluse(){
        printStaticValue();
    }


     static void printStaticValue(){

        System.out.println("Number Of Shavers:" + howMuchShavers);
    }


    public  void resetValues(int WorkTime, String Company, int ChanghingNozzles, int Power, String Model, boolean HasWirelessCharghing, boolean Iswaterproof){

        this.workTime = WorkTime;
        this.company = Company;
        this.changingNozzles = ChanghingNozzles;
        this.power = Power;
        this.model = Model;
        this.hasWirelessCharghing = HasWirelessCharghing;
        this.isWaterproof = Iswaterproof;


    }



}
