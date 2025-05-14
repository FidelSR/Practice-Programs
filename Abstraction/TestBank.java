package Abstraction;

public class TestBank {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank pnb = new PNB();

        System.out.println(sbi.getRateOfInterest() + " %");
        System.out.println(pnb.getRateOfInterest() + " %");
    }
}
