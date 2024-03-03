 class DisplayThread extends Thread {

     String message;
int intervalMillis;

   DisplayThread(String message, int intervalMillis) {
        this.message = message;
        this.intervalMillis = intervalMillis;
    }

    @Override // Recommended to explicitly override run() from Thread
    public void run() {
        while (true) {
            try {
                System.out.println(message);
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class DisplayThreadDemo {

    public static void main(String[] args) {
        System.out.println("Bharath C\t1BMM22CS068");
        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10000);
        DisplayThread thread2 = new DisplayThread("CSE", 2000);
    
        thread1.start();
        thread2.start();
    }
}
