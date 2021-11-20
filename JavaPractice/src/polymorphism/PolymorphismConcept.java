package polymorphism;

public class PolymorphismConcept {

    public static void main(String[] args) {
        BaseClass baseClass =new SubClass();
        baseClass.sum("Hello","Folks");

        baseClass=new BaseClass();
        baseClass.sum("4","7");
    }
}
