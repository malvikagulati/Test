package abstraction;

public abstract class Bank {
    private String bankName;
    private String ifscCode;
    private String branchName;
    private String address;

    private String denomination;

    public Bank(String bankName, String ifscCode, String branchName, String address) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
        this.address = address;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printBankDetails() {
        System.out.println("Bank Name:" + bankName + " branchName:" + branchName + " ifscCode:" + ifscCode + " address:" + address);
    }

    public abstract void denominationAvailable();
}
