public class BankExample{
    public static void main(String[] args){
        Bank axis = new AXIS();
        Bank ici = new ICICI();
        Bank sbi = new SBI();
        System.out.println("Axis has an interest rate of " + axis.getRateOfInterest() + " %");
        System.out.println("ICICI has an interest rate of " + ici.getRateOfInterest() + " %");
        System.out.println("SBI has an interest rate of " + sbi.getRateOfInterest() + " %");

    }
}
