package app.view;

import app.entity.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class AppView {
    AtomicInteger count = new AtomicInteger(1);

    public void printList(List<User> users, Consumer<User> consumer) {
        for (User element : users) {
            consumer.accept(element);
        }
    }

    public Consumer<User> getConsumer() {
        return user -> System.out.println(count.getAndIncrement() + ") " + user);
    }

}
