package threads_part;

public class ThreadMain {
    public static void main(String[] args) {








        /*List<Integer> list = new ArrayList<>();
        CountDownLatch count = new CountDownLatch(2);
        Object monitor = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                        synchronized (monitor) {
                            list.add(i);

                        }
                    }
                    count.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                        synchronized (monitor) {
                            list.add(i);
                        }
                    }
                    count.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            count.await();
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
        for (
                int numbers : list) {
            System.out.println(numbers);
        }
*/
    }
}
