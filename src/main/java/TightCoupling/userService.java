package TightCoupling;

public class userService {
    notificationService notificationService = new notificationService();
    public void notifyUser(String message){
        notificationService.send("Hello This is me!!");
    }
}
