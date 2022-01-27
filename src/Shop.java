public class Shop {
    private int product = 0;
    public synchronized void get(){
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Покупець купив 1 товар");
        System.out.println("Товарів на складі: " + product);
        notify();
    }
    public synchronized void put(){
        while (product >= 10){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Виробник добавив 1 товар.");
        System.out.println("Товарів на складі: " + product);
        notify();
    }
}
