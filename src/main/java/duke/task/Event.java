package duke.task;

public class Event extends Task {

    /*ATTRIBUTES*/

    private String name; //name of duke.task only (eg return book)
    protected String at; //time

    /*CONSTRUCTOR*/

    public Event(String name, String at) {
        description = name + " (at: " + at + ")"; //name + time
        this.at = at;
        type = "E";
        this.name = name;
    }


    /*METHODS*/

    @Override
    public void printTaskDisplay() {
        System.out.println("Got it. I've added this duke.task:");
        System.out.println("[E] [ ] " + description);
    }

}
