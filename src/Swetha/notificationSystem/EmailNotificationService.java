package Swetha.notificationSystem;

public class EmailNotificationService implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Email sent: "+message);
    }
}
