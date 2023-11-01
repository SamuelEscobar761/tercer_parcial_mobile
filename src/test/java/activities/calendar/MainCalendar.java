package activities.calendar;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainCalendar {
    public Button allowNotificationsButton = new Button(By.id("com.android.permissioncontroller:id/permission_allow_button"));
    public Button addTaskTextButton = new Button(By.id("com.xiaomi.calendar:id/new_event"));
    public TextBox eventCreated(String title){
        return new TextBox(By.xpath("//android.widget.TextView[@text='"+title+"']"));
    }


}
