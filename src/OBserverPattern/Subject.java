package OBserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject {
    private final List<Observer> list = new ArrayList<Observer>();

    public void AttachObserver(Observer observer)
    {
        this.list.add(observer);
    }

    public void deleteObserver(Observer observer)
    {
        this.list.remove(observer);
    }

    public void notificationObserver(Objects arr)
    {
        for(Observer ob : this.list)
        {
            ob.notification(null);
        }
    }
}
