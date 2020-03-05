package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Macbeth top 20!");
        button = new Button();
        button.setText("Click Me For Top 20 Words!");

        button.setOnAction(e -> {
        	System.out.println("1. 'the' --> 731");
        	System.out.println("2. 'and' --> 565");
        	System.out.println("3. 'to' --> 381");
        	System.out.println("4. 'of' --> 342");
        	System.out.println("5. 'i' --> 315");
        	System.out.println("6. 'macbeth' --> 277");
        	System.out.println("7. 'a' --> 248");
        	System.out.println("8. 'that' --> 228");
        	System.out.println("9. 'in' --> 205");
        	System.out.println("10. 'you' --> 203");
        	
        	System.out.println("11. 'my' --> 192");
        	System.out.println("12. 'is' --> 185");
        	System.out.println("13. 'not' --> 163");
        	System.out.println("14. 'it' --> 154");
        	System.out.println("15. 'with' --> 153");
        	System.out.println("16. 'his' --> 145");
        	System.out.println("17. 'be' --> 136");
        	System.out.println("18. 'have' --> 125");
        	System.out.println("19. 'but' --> 124");
        	System.out.println("20. 'your' --> 121");
        	
        });
      

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}