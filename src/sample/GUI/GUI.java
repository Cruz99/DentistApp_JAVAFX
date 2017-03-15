package sample.GUI;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by Pavel on 15/03/2017.
 */
public class GUI extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{

        StackPane framework = new StackPane();




        ImageView background_image = new ImageView(new Image("file:src/Sample/GUI/Images/LoginScreen.jpg"));
        background_image.setId("background_image_main");
        background_image.setFitHeight(800);
        background_image.setFitWidth(1000);


        BorderPane mainBorderPane = new BorderPane();
        mainBorderPane.setPadding(new Insets(70));
        mainBorderPane.setId("main-borderPane");



        /// HEADER


        GridPane gridPane_header = new GridPane();
        gridPane_header.setId("header-box");
        gridPane_header.setPrefSize(800, 50);


        HBox login_hBox = new HBox();  /////  LOGIN SECTION
        login_hBox.setPadding(new Insets(20));
        login_hBox.setId("login-Hbox");
        login_hBox.setSpacing(10);
        login_hBox.setLayoutX(300);


        TextField txtFld_name = new TextField();;
        TextField txtFld_password = new TextField();
        Button btn_login = new Button("Login");
        btn_login.setPrefSize(60,20);
        Button btn_quit = new Button("Quit");

        login_hBox.getChildren().addAll(txtFld_name, txtFld_password, btn_login, btn_quit);


        gridPane_header.add(login_hBox, 1,0);

        ///CENTER
        HBox login_label_hbox = new HBox();
        login_label_hbox.setAlignment(Pos.CENTER);
        login_label_hbox.setId("login-label-hbox");

        Label label = new Label("PLEASE LOG IN");
        label.setId("login-info-label");
        label.setAlignment(Pos.CENTER);
        label.setPrefSize(300, 100);

        login_label_hbox.getChildren().add(label);

        HBox hbox_login_label = new HBox();
        hbox_login_label.setId("center-box");
        hbox_login_label.setAlignment(Pos.CENTER);

        hbox_login_label.getChildren().add(login_label_hbox);




        mainBorderPane.setTop(gridPane_header);
        mainBorderPane.setCenter(hbox_login_label);

        framework.getChildren().addAll(background_image, mainBorderPane);

        Scene scene = new Scene(framework, 1000, 800);

        scene.getStylesheets().add("sample/GUI/jenova.css");


        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
