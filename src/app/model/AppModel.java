package app.model;

import app.entity.User;

import java.util.Arrays;
import java.util.List;

public class AppModel {
    public List<User> initList() {
        return Arrays.asList(
                new User("Ann", "+38 (067) 123-45-67"),
                new User("Ivan", "+38 (097) 056-23-48"),
                new User("Jon", "+38 (067) 653-24-89"),
                new User("Tom", "+38 (050) 246-85-97"),
                new User("Fox", "+38 (063) 364-98-72")
        );
    }

}
