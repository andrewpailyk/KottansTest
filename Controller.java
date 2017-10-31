package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.*;

public class Controller {

    @FXML
    private Label label;
    private String input;

    @FXML
    private void number (ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        label.setText(label.getText() + value);
    }


    @FXML
    private void clear(ActionEvent event) {
        label.setText("");

    }

    @FXML
    private void delete(ActionEvent event) {
        input = label.getText();
        input = input.substring(0, input.length() - 1);
        label.setText(input);
    }

    @FXML
    private void enter(ActionEvent event){
        input = label.getText();
        JOptionPane.showMessageDialog(null,input);
    }

    @FXML
    private void hide(ActionEvent event) {
        label.setVisible(false);

    }

    @FXML
    private void show(ActionEvent event){
        label.setVisible(true);
    }
    @FXML
    private void shuffle (ActionEvent event) {
        input = label.getText();
        String r = input;
        input = "";
        int i = 0;
        int j = i + 1;

        for(i = 0; i < r.length(); ++i) {
            if(j + 1 == r.length()) {
                j = 0;
            } else {
                ++j;
            }
            char rnd = r.charAt(j);
            input = input + rnd;
        }
        label.setText(this.input);
    }
}
