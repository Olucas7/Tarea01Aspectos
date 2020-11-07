package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {	
		        Button b1 = new Button("Boton 1");
		        Button b2 = new Button("Boton 2");
		        Button b3 = new Button("Boton 3");
		        Button b4 = new Button("Boton 4");
		        Group root = new Group();
		        VBox vpanel= new VBox();
		        final HBox contenedor = new HBox();
		        Label titulo = new Label("CAMBIA COLOR");
		        final Scene escena = new Scene(root,600,600,Color.BLACK);
		        titulo.setStyle(" -fx-font: 70px Family;" +"-fx-font-weight: bold;"+
		                "    -fx-text-fill: white;");
		       
		        
		        b1.setOnAction(new EventHandler<ActionEvent>(){
		            public void handle(ActionEvent evento1) {
		                escena.setFill(Color.BLUE);
		                
		            }
		            });
		        
		        b2.setOnAction(new EventHandler<ActionEvent>(){
		            public void handle(ActionEvent evento2){
		                escena.setFill(Color.CORAL);
		                
		            }
		        });
		        
		        b3.setOnAction(new EventHandler<ActionEvent>(){
		            public void handle(ActionEvent event3){
		                escena.setFill(Color.GREEN);
		                
		            
		            }
		        });
		        b4.setOnAction(new EventHandler<ActionEvent>(){
		            
		            public void handle(ActionEvent event4){
		                Circle c1 = new Circle(90,90,30, Color.INDIGO);
		                VBox v2 = new VBox();
		                v2.getChildren().add(c1);
		                v2.setAlignment(Pos.CENTER_RIGHT);
		                contenedor.getChildren().add(v2);
		            }
		        });
		        
		        contenedor.getChildren().addAll(b1,b2,b3,b4);
		        contenedor.setAlignment(Pos.CENTER);
		        vpanel.getChildren().addAll(titulo,contenedor);
		        root.getChildren().add(vpanel);
		        primaryStage.setTitle("Observer");
		        primaryStage.setScene(escena);
		        primaryStage.show();
			}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}