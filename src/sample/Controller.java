package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller
{
    @FXML
    public TextField textField;
    public TextArea textArea;

    String textFieldString;

    public void textFieldKnap(ActionEvent actionEvent)
    {

        this.textFieldString=textField.getText();


    }

    public void kommandoKnap(ActionEvent actionEvent)
    {
        textArea.setText(textFieldString);

    }
}
