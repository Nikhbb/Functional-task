package app.controller;

import app.model.AppModel;
import app.view.AppView;

public class AppController {
    public void run() {
        AppView appView = new AppView();

        appView.printList(
                new AppModel().initList(),
                appView.getConsumer());
    }
}
