package activities.notes;

import control.Button;
import org.openqa.selenium.By;

public class MainNotes {
//    public Button allowPermitionsButton = new Button(By.xpath("//android.widget.Button[@text='ALLOW']"));
//    public Button screenButton = new Button(By.xpath("//android.widget.FrameLayout"));
    public Button addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Button getNewNoteTitleNotesButton(String title){
        return new Button(By.xpath("//android.widget.TextView[contains(@text, '" + title + "')]"));
    }
}
