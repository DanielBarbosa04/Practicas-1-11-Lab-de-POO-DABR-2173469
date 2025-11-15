import javafx.scene.control.Button;

public class Boton05Estilizado extends Button {

    public Boton05Estilizado(String text) {
        super(text);
        setStyle("-fx-background-color: #3498db; -fx-text-fill: white;");
        setOnMouseEntered(e -> setStyle("-fx-background-color: #2980b9; -fx-text-fill: white;"));
        setOnMouseExited(e -> setStyle("-fx-background-color: #3498db; -fx-text-fill: white;"));
    }
}