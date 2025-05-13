public class BankExample{
    public static void main(String[] args){
        AXIS axis = new AXIS();
        ICICI ici = new ICICI();
        SBI sbi = new SBI();
        System.out.println("Axis has an interest rate of " + axis.getRateOfInterest() + " %");
        System.out.println("ICICI has an interest rate of " + ici.getRateOfInterest() + " %");
        System.out.println("SBI has an interest rate of " + sbi.getRateOfInterest() + " %");

    }
}
