package testSuite;

import activities.notes.MainNotes;
import activities.notes.MoreActivity;
import activities.notes.NewNoteActivity;
import activities.notes.NoteActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class NotesTest {
    MainNotes mainNotes = new MainNotes();
    MoreActivity moreActivity = new MoreActivity();
    NewNoteActivity newNoteActivity = new NewNoteActivity();
    NoteActivity noteActivity = new NoteActivity();
    String title = "Nota del primer test";
    String body = "El Test se realiza de forma exitosa";

    @Test
    public void createNoteTest(){
        mainNotes.allowPermitionsButton.click();
        mainNotes.screenButton.click();
        mainNotes.addNoteButton.click();
        newNoteActivity.titleTextBox.clearSetText(title);
        newNoteActivity.bodyTextBox.clearSetText(body);
        newNoteActivity.homeButton.click();
        Assertions.assertTrue(mainNotes.getNewNoteButton(title).isControlDisplayed(), "No se pudo crear la Nota");
    }

    @Test
    public void deleteNoteTest(){
        createNoteTest();
        mainNotes.getNewNoteButton(title).click();
        noteActivity.moreButton.click();
        moreActivity.deleteButton.click();
        moreActivity.deleteConfirmationButton.click();
        Assertions.assertFalse(mainNotes.getNewNoteButton(title).isControlDisplayed(), "No se pudo borrar la Nota");
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
