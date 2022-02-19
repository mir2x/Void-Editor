package com.mir.voideditor;

import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EditorModel {

    public StringBuilder getContentFromFile() {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        String currentLine;
        StringBuilder fileContent = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(selectedFile.getAbsolutePath()));

            while ((currentLine = reader.readLine()) != null) {
                assert false;
                fileContent.append(currentLine).append("\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

       return fileContent;
    }
}
