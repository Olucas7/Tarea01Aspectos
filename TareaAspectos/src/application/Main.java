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


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {	
		        Button b1 = new Button("Boton 1");
		        Button b2 = new Button("Boton 2");
		        Button b3 = new Button(" Boton 3");
		        Group root = new Group();
		        VBox vpanel= new VBox();
		        HBox contenedor = new HBox();
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
		        
		        contenedor.getChildren().addAll(b1,b2,b3);
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