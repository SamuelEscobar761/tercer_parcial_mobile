package activities.notes;

import control.Button;
import org.openqa.selenium.By;

public class MainNotes {
    public Button allowPermitionsButton = new Button(By.xpath("//android.widget.Button[@text='ALLOW']"));
    public Button screenButton = new Button(By.xpath("//android.widget.FrameLayout"));
    public Button addNoteButton = new Button(By.id("com.miui.notes:id/content_add"));

    public Button getNewNoteButton(String title){
        return new Button(By.xpath("//android.widget.TextView[contains(@text, '" + title + "')]"));
    }
}
