package basia.threading;

public class Main {

    public static void main(String[] args) {
        SharedBuffer buffer=new SharedBuffer(5);

        Thread producer= new Thread(new ProducerThraed(buffer));
        Thread consumer= new Thread(new ConsumerThraed(buffer));

        producer.start();
        consumer.start();
    }
}
