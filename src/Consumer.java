public class Consumer implements Runnable{
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            shop.get();
        }
    }
}
