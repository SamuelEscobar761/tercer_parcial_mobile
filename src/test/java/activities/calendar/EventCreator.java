package activities.calendar;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EventCreator {
    public TextBox titleTextBox = new TextBox(By.id("com.xiaomi.calendar:id/title"));
    public Button createEventButton = new Button(By.id("com.xiaomi.calendar:id/action_done"));
}
