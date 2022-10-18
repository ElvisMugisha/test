package overridingExample;

public class Bank {
    float getRateOfInterest () {
        return 0;
    }
}

class Equity extends Bank {
    float getRateOfInterest () {
        return 9.2f;
    }
}

class BK extends Bank {
    float getRateOfInterest () {
        return 7f;
    }
}

class BPR extends Bank {
    float getRateOfInterest () {
        return 6.8f;
    }
}

class TestOverriding {
    public static void main(String[] args) {
        Equity equity = new Equity();
        BK bk = new BK();
        BPR bpr = new BPR();

        System.out.println("Equity Rate of Interest : " + equity.getRateOfInterest());
        System.out.println("BK Rate of Interest : " + bk.getRateOfInterest());
        System.out.println("BPR Rate of Interest : " + bpr.getRateOfInterest());
    }
}
