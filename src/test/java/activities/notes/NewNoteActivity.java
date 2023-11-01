package activities.notes;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NewNoteActivity {
    public TextBox titleTextBox = new TextBox(By.id("com.miui.notes:id/note_title"));
    public TextBox bodyTextBox = new TextBox(By.id("com.miui.notes:id/rich_editor"));
    public Button homeButton = new Button(By.id("com.miui.notes:id/home"));
}
