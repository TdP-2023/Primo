package it.polito.tdp.primo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnPremi;

    @FXML
    private Label txtMessaggio;
    
    @FXML
    private TextField txtNome;

    @FXML
    void handlePremi(ActionEvent event) {
//    	System.out.println("Premuto!");
    	String messaggio = txtNome.getText();
    	if (messaggio.length()==0) {
    		txtMessaggio.setText("Buongiorno, anonimo");
    	} else {
    		txtMessaggio.setText("Buongiorno, "+messaggio);
    		txtNome.setText("");
    	}
    }

    @FXML
    void initialize() {
        assert btnPremi != null : "fx:id=\"btnPremi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtMessaggio != null : "fx:id=\"txtMessaggio\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
