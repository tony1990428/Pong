package es.antonio.pong;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {
    short ballCenterX = 500;
    byte ballCurrentSpeedX = 3;
    int ballIncSpeed
    
    short rectheight = 50;
    short stickPosY = (scene height-rectheight)/2;
    byte stickCurrentSpeed = 10;
    byte stickDirection = 1;
    
    @Override
    public void start(Stage stage) {
        
//      StackPane root = new StackPane();
        StackPane root = new StackPane();
        var scene = new Scene(root,640,480);
        scene.setFill(color.BLACK);
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Circle circleBall = new Circle();
        circleBall.setCenterX(10);
        circleBall.setCenterY(30);
        circleBall.setRadius(7);
        circleBall.setfill(color.WHITE);
        
        //Circle circleBall = new circle(10,30,7);
        
        root.getChildren().add(circleBall);
        
        Rectangle rectstick = new Rectangle();
        rectStick.setWith(10);
        rectStick.setHeight(20);
        rectStick.setX(600);
        rectStick.setY(240);
        
        Timeline timeline = new Timeline(
            // 0.017 ~= 60 FPS
            new KeyFrame(Duration.seconds(0.017), new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    int ballCenterX = 10;
                    circleBall.setCenterX(ballCenterX);
                    ballCenterX++;
                    if(ballCenterX == 640) {
                        ballCurrentSpeedX = -3;
                        else if(ballCenterX <= 0){
                                }
                        ballCenterX--;
                    System.out.println("Probando animación");
                     }
                    rectStick.setY(stickPosY);
                    stickPosY += stickCurrentSpeed = stickDirection;
                    if(stickPosY) <= 0) {
                        stickDirection = 0;
                        stickPosY = 0;
                        else if(stickPosY >= SCENE_HEIGHT-stickHeight) {
                         stickDirection = 0;
                 }
                }
            })                
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();        
                }
    }
    public static void main(String[] args) {
        launch();
    }

}