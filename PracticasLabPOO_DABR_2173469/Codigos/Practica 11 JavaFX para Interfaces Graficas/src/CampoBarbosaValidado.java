import javafx.scene.control.TextField;

public class CampoBarbosaValidado extends TextField {

    public CampoBarbosaValidado() {
        this.textProperty().addListener((obs, oldText, newText) -> {
            if (!newText.matches("[a-zA-Z ]*")) {
                setStyle("-fx-border-color: red;");
            } else {
                setStyle("-fx-border-color: blue;");
            }
        });
    }
}