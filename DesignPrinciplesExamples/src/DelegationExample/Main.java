package DelegationExample;

class RealPrinter {
    // The delegates

    void print(){
        System.out.println("The Delegate");
    }
}

class Printer{
    // The delegator

    RealPrinter rp = new RealPrinter();

    // create the delegate
    void print(){
        rp.print();  // delegation
    }
}


class Tester {
    // to the outside world it looks like actually prints
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}