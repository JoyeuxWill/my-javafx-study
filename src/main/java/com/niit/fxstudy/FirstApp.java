package com.niit.fxstudy;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;


public class FirstApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //加载布局文件
        URL location = getClass().getResource("/fxml/main.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        BorderPane borderPane = fxmlLoader.load();
        //获取屏幕大小
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Scene scene = new Scene(borderPane,screenSize.width,screenSize.height);
        //添加样式
        scene.getStylesheets().addAll("org/kordamp/bootstrapfx/bootstrapfx.css",
                "/css/style.css");
        primaryStage.setTitle("JavaFX Layout Sample");
        primaryStage.getIcons().add(new Image("/img/logo.png")); //设置窗体的logo
        primaryStage.setScene(scene); //舞台设置场景
        primaryStage.show();   //舞台可见

    }
}
