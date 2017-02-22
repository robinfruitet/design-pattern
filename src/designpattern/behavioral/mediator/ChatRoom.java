package designpattern.behavioral.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rfruitet on 22/02/2017.
 */
public class ChatRoom implements ChatMediator {

    @Override
    public void showMessage(User user, String message) {
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String userName = user.getName();

        System.out.println(dateFormat.format(today) +
                " [" +
                userName +
                "]: " +
                message
        );
    }
}
