import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    //here we display everything we want without any methods except constructor
    //item declared
    private String name;
    private LocalDateTime createdAt;

    //constructor when the new item/s is created
    public Item(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now(); //time set
    }

    public String getName() { //item name returned
        return name;
    }

    @Override //taking from the top formater
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")";
    }
}
