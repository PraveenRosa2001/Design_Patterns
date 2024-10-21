abstract class PhoneOrder{
    final void createOrder()
    {
        selectProduct();
        packProduct();
        makePayment();
        deliverProduct();
    }
    abstract void selectProduct();
    abstract void makePayment();
    void packProduct() {
        System.out.println("paking the product");
    }
    abstract void deliverProduct();
}
class OnlineShop extends PhoneOrder
{
    @Override
    void selectProduct()
    {
        System.out.println("selecting the product in online store");
    }
    @Override
    void makePayment() {
        System.out.println("making the payment in online store");
    }
    @Override
    void deliverProduct() {
        System.out.println("product delivered at home of the client");
    }
}
class OfflineShop extends PhoneOrder {
    @Override
    void selectProduct()
    {
        System.out.println("selecting the product in offline store");
    }
    @Override
    void makePayment() {
        System.out.println("making the payment in offline store");
    }
    @Override
    void deliverProduct() {
        System.out.println("product deliverd in hands in offline store");
    }
}
public class TemplateDesignPattern {
    public static void main(String[] args) {
        PhoneOrder offlineStore = new OfflineShop();
        offlineStore.createOrder();

        PhoneOrder onlineStore = new OnlineShop();
        onlineStore.createOrder();
    }
}