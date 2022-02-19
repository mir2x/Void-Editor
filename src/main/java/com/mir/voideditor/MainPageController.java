package com.mir.voideditor;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;


public class MainPageController {

    @FXML
    private MenuItem openFileMenuItem;
    @FXML
    private TextArea editorTextArea;

    private EditorModel editorModel;


    @FXML
    public void initialize() {

        editorModel = new EditorModel();

        openFileMenuItem.setOnAction(event ->  {
            editorTextArea.setText(String.valueOf(editorModel.getContentFromFile()));
        });
    }


}
