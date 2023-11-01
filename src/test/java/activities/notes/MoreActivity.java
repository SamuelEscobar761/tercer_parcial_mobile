package activities.notes;

import control.Button;
import org.openqa.selenium.By;

public class MoreActivity {
    public Button deleteButton = new Button(By.xpath("//android.widget.TextView[@text='Delete']"));
    public Button deleteConfirmationButton = new Button(By.xpath("//android.widget.Button[@text='Delete']"));
}
