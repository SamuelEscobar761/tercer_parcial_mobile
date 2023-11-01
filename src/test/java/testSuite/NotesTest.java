package testSuite;

import activities.notes.MainNotes;
import activities.notes.NewNoteActivity;
import activities.notes.NoteActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Random;

public class NotesTest {
    MainNotes mainNotes = new MainNotes();
    NewNoteActivity newNoteActivity = new NewNoteActivity();
    NoteActivity noteActivity = new NoteActivity();
    String title = "Nota del primer test" + (100 + new Random().nextInt(900));
    String body = "El Test se realiza de forma exitosa";
    String newBody = "Nota modificada";

    @Test
    public void preguntaUno(){
        createNoteTest();
        editNoteTest();
        deleteNoteTest();
    }

    @Test
    public void createNoteTest(){
        mainNotes.addNoteButton.click();
        newNoteActivity.titleTextBox.clearSetText(title);
        newNoteActivity.bodyTextBox.clearSetText(body);
        newNoteActivity.saveButton.click();
        Assertions.assertTrue(mainNotes.getNewNoteTitleNotesButton(title).isControlDisplayed(), "No se pudo crear la Nota");
    }

    @Test
    public void editNoteTest(){
        mainNotes.getNewNoteTitleNotesButton(title).click();
        newNoteActivity.bodyTextBox.clearSetText(newBody);
        newNoteActivity.saveButton.click();
        Assertions.assertTrue(mainNotes.getNewNoteTitleNotesButton(newBody).isControlDisplayed(), "No se pudo modificar");
    }

    @Test
    public void deleteNoteTest(){
        createNoteTest();
        mainNotes.getNewNoteTitleNotesButton(title).click();
        noteActivity.deleteButton.click();
        noteActivity.confirmDeleteButton.click();
        Assertions.assertFalse(mainNotes.getNewNoteTitleNotesButton(title).isControlDisplayed(), "No se pudo borrar la Nota");
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }
}
