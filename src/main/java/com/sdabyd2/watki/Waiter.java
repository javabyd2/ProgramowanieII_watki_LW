package com.sdabyd2.watki;

public class Waiter implements Runnable {

    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    public void run() {
        String name = Thread.currentThread().getName();

        synchronized (message){
            try{
                System.out.println("Watek o nazwie name " + name + " zostal powiadomiony o godzinie " + System.currentTimeMillis());
                message.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Obiekt waiter otrzymal " + " notyfikacje" + System.currentTimeMillis());
            System.out.println("Wiadomosc: " + message.getMessage());
        }
    }
}
