package Threading.BaiTap_TaoThreadDonGian;

public class NumberGenerator implements Runnable {
    public NumberGenerator() {
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Thread");
            System.out.println("Print" + (i + 1));
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
