package activities.notes;

import control.Button;
import org.openqa.selenium.By;

public class NoteActivity {
    public Button deleteButton = new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDeleteButton = new Button(By.xpath("//android.widget.Button[contains(@text, 'DELETE')]"));
}
