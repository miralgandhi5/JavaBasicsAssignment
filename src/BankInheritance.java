/**
 * Created by miral on 6/21/2017.
 */
public class BankInheritance {
    public static void main(String[] args) {

        Bank b = new Bank(3,"any");
        b.getDetails();

        SBI s = new SBI(8,"State Bank of India");
        s.getDetails();

        BOI bo = new BOI(6,"Bank Of India");
        bo.getDetails();

        ICICI ic = new ICICI(8,"ICICI");
        ic.getDetails();

    }
}

class Bank {
    int rateofinterest;
    String bankname;
    Bank(int rateofinterest,String bankname){
        this.bankname=bankname;
        this.rateofinterest=rateofinterest;
    }
    void getDetails() {
        System.out.println("Bank Name : " + bankname);
        System.out.println("Rate of interest : " + rateofinterest);
    }
}

class SBI extends Bank {
    SBI(int rateofinterest,String bankname){
        super(rateofinterest,bankname);
    }

    void getDetails() {
        System.out.println("Bank Name : " + bankname);
        System.out.println("Rate of interest : " + rateofinterest);
    }
}

class BOI extends Bank {
    BOI(int rateofinterest,String bankname){
        super(rateofinterest,bankname);
    }

    void getDetails() {
        System.out.println("Bank Name : " + bankname);
        System.out.println("Rate of interest : " + rateofinterest);
    }
}

class ICICI extends Bank {
    ICICI(int rateofinterest,String bankname){
        super(rateofinterest,bankname);
    }

    void getDetails() {
        System.out.println("Bank Name : " + bankname);
        System.out.println("Rate of interest : " + rateofinterest);
    }
}
