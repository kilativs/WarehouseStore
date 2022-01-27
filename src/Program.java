public class Program {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Provaider provaider = new Provaider(shop);
        Consumer consumer = new Consumer(shop);
        new Thread(provaider).start();
        new Thread(consumer).start();
    }
}
