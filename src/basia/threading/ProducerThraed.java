package basia.threading;

public class ProducerThraed implements Runnable{

    private SharedBuffer sharedBuffer;

    public ProducerThraed(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        int value=0;

        while(true)
        {
            try{
                sharedBuffer.produce(value++);
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
