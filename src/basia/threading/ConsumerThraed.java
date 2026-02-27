package basia.threading;

public class ConsumerThraed implements Runnable{

    private SharedBuffer sharedBuffer;

    public ConsumerThraed(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {

        while(true)
        {
            try{
                sharedBuffer.consumer();
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
