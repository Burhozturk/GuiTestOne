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




    }

    public void kommandoKnap(ActionEvent actionEvent)
    {
        this.textFieldString=textField.getText();
        textArea.setText(textFieldString);
        textField.clear();

    }
}
