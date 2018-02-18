package com.sdabyd2.watki;

public class Notifier implements Runnable {

    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    public void run() {
        String name = Thread.currentThread().getName();

        try{
            Thread.sleep(1000);
            synchronized (message){
                message.setMessage(name + " skonczyl prace");
                message.notify();
                message.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
