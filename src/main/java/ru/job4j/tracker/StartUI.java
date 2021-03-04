package ru.job4j.tracker;


public class StartUI {
    private final Output output;

    public StartUI(Output output) {
        this.output = output;
    }


    public static void main(String[] args) {
        Output myOut = new ConsoleOutput();
        Input input = new ValidateInput(myOut, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(myOut), new ShowAction(myOut), new ReplaceAction(myOut),
                new DeletedAction(myOut), new FindActionById(myOut), new FindActionByName(myOut),
                new EndAction()
        };
        new StartUI(myOut).init(input, tracker, actions);

        SingleTracker singleTracker = SingleTracker.getSingle();
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.length) {
                output.outPrintln("Ошибка ввода введите число от 0 до " + (actions.length - 1));
                continue;
            }
            UserAction actionInit = actions[select];
            run = actionInit.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        output.outPrintln("Menu.");
        for (int index = 0; index < actions.length; index++) {
            output.outPrintln(index + ". " + actions[index].name());
        }
    }

}
