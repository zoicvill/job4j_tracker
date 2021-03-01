package ru.job4j.tracker;


public class StartUI {
    private final Output myOut;

    public StartUI(Output myOut) {
        this.myOut = myOut;
    }

    public static void main(String[] args) {
        Output myOut = new ConsoleOutput();
        Input input = new ConsoleInput();

        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(myOut), new ShowAction(myOut), new ReplaceAction(myOut),
                new DeletedAction(myOut), new FindActionById(myOut), new FindActionByName(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(input, tracker, actions);
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction actionInit = actions[select];
            run = actionInit.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        myOut.myPrintln("Menu.");
        for (int index = 0; index < actions.length; index++) {
            myOut.myPrintln(index + ". " + actions[index].name());
        }
    }

}
