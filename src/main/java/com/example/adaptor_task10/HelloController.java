package com.example.adaptor_task10;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Adaptor;

import javax.swing.*;

public class HelloController {
    public ListView demolist;
    public TextArea addtext;
    public TextArea fronttext;
    public TextField isFound;
    public Adaptor adaptor = new Adaptor(10);
    public TextField findtext;

    public void Display(){
        demolist.getItems().clear();
        String input = adaptor.Display();
        String delimiter = " ";
        String[] result = input.split(delimiter);
        for(String word: result){
            demolist.getItems().add(word);
        }
    }


    public void AddButton(ActionEvent actionEvent) {
        fronttext.setText("");
        adaptor.Add(Long.parseLong(addtext.getText()));
        Display();
        addtext.setText("");
    }



    public void DeleteButton(ActionEvent actionEvent) {
        adaptor.Delete();
        Display();
        fronttext.setText("");
    }

    public void GetFrontButton(ActionEvent actionEvent) {
        fronttext.setText(Long.toString(adaptor.PeekFront()));
    }

    public void CheckButton(ActionEvent actionEvent) {
        if(adaptor.Check() != null){
            JOptionPane.showMessageDialog(null,
                    adaptor.Check(),
                    "Состояние очереди",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void FindButton(ActionEvent actionEvent) {
        //найти выбранный нами элемент в массиве
        //и нужно всё загрузить в репозитори

        //findField.setText("");
        isFound.setText(adaptor.Find(findtext.getText()));


    }
}