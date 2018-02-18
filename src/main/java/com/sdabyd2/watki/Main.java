package com.sdabyd2.watki;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Procesuj dane....");


        Waiter waiter = new Waiter(message);
        new Thread(waiter, "waiter").start();

        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "waiter1").start();

        Waiter waiter2 = new Waiter(message);
        new Thread(waiter2,"waiter2").start();
        Notifier notifier = new Notifier(message);
        new Thread(notifier, "powiadamiacz").start();
        notifier.run();

        System.out.println("Koniec na dzis " + System.currentTimeMillis());
    }
}
