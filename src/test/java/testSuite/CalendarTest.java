package testSuite;

import activities.calendar.EventCreator;
import activities.calendar.MainCalendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class CalendarTest {
    MainCalendar mainCalendar = new MainCalendar();
    EventCreator eventCreator = new EventCreator();
    @Test
    public void verifyAddEvent(){
        String evento = "Nuevo evento agregado al Calendario";
        mainCalendar.allowNotificationsButton.click();
        mainCalendar.addTaskTextButton.click();
//        eventCreator.titleTextBox.click();
        eventCreator.titleTextBox.clearSetText(evento);
        eventCreator.createEventButton.click();
        String actualResult = mainCalendar.eventCreated(evento).getText();
        Assertions.assertEquals(evento, actualResult, "Error, no se pudo crear el evento");

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
