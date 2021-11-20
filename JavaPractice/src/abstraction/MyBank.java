package abstraction;

public class MyBank extends Bank{

    public MyBank(String bankName, String ifscCode, String branchName, String address, String denomination) {
        super(bankName, ifscCode, branchName, address);
        this.setDenomination(denomination);
    }

    @Override
    public void denominationAvailable() {
        System.out.println(getBankName()+ " have denomination of Rs."+getDenomination());
    }
}
