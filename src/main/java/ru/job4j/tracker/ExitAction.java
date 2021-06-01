package ru.job4j.tracker;

public class ExitAction {
   private Callback callback;

    public ExitAction(Callback callback) {
        this.callback = callback;
    }
    public void exit(int exit){
        callback.execute(exit);
    }
}
