public class Provaider implements Runnable {
    Shop shop;

    public Provaider(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            shop.put();
        }
    }
}
