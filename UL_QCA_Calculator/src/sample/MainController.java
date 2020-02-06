package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML private Label subjectNumLabel;
    @FXML private Label qcaLabel;
    private int numSubjects;
    private double score;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked the button!");
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
    }
    @FXML
    private void clRAction(ActionEvent event) {
        System.out.println("You clicked the button!");
        numSubjects=0;
        score=0;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(0));
    }

    @FXML
    private void scoreA1(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=4;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreA2(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=3.6;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreB1(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=3.2;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreB2(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=3;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreB3(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=2.8;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreC1(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=2.6;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreC2(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=2.4;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreC3(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=2.0;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreD1(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=1.6;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreD2(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=1.2;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreF(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=0;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }
    @FXML
    private void scoreNG(ActionEvent event) {
        System.out.println("You clicked the button!");

        score+=0;
        numSubjects++;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(score/numSubjects*1.0));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        score=0;
        numSubjects=0;
        subjectNumLabel.setText(Integer.toString(numSubjects));
        qcaLabel.setText(Double.toString(0));
    }
}
