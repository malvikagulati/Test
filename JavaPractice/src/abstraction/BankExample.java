package abstraction;

public class BankExample {
    public static void main(String[] args) {
        Bank hdfcBank = new MyBank("HDFC Bank", "HDFC00001111", "Sarjapur", "Bangalore", "50, 100, 500");
        Bank iciciBank = new MyBank("ICICI Bank", "ICIC00001111", "Sarjapur", "Bangalore", "10, 50, 100, 500");
        Bank kotakBank = new MyBank("Kotak Bank", "KTK00001111", "Sarjapur", "Bangalore", "5, 10, 50, 100, 500");

        hdfcBank.denominationAvailable();
        iciciBank.denominationAvailable();
        kotakBank.denominationAvailable();
    }
}
