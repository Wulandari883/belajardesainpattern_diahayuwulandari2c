package contoh1;
import java.util.ArrayList;

interface Observer {
    void receiveNotification(String msg);
}

interface Observable {
    void addSubscriber(User user);
    void removeSubscriber(User user);
    void notifyUser(String msg);
}

class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(String msg) {
        System.out.println(msg);
    }

    public void subscribe(Channel channel) {
        channel.addSubscriber(this);
    }

    public void unsubscribe(Channel channel) {
        channel.removeSubscriber(this);
    }

    public String getName() {
        return name;
    }
}


