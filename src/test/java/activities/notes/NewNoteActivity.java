package activities.notes;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewNoteActivity {
    public TextBox titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox bodyTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
}
