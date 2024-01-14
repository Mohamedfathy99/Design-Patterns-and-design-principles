package TheInterfaceSegragationPrincipleExample2;

public class OnlineClient implements Restaurant{
    @Override
    public void acceptOnlineOrder() {
        // Logic for placing online order
        System.out.println("Your order was accepted");
    }

    @Override
    public void takeTelephone() {
        // Not Applicable for online order
        throw new UnsupportedOperationException();
    }

    @Override
    public void payOnline() {
        // Logic for paying online
    }

    @Override
    public void walkInCustomer() {
        // Not Applicable for online order
        throw new UnsupportedOperationException();
    }

    @Override
    public void payInPerson() {
        // Not Applicable for online order
        throw new UnsupportedOperationException();
    }
}
