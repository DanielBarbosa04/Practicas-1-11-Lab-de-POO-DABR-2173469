import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class SistemaEstudiantilD3469 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema Estudiantil D3469");

        // Menu
        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        MenuItem miSalir = new MenuItem("Salir");
        miSalir.setOnAction(e -> primaryStage.close());
        menuArchivo.getItems().add(miSalir);
        menuBar.getMenus().add(menuArchivo);

        // Tabla de estudiantes
        TableView<Estudiante> tabla = new TableView<>();
        ObservableList<Estudiante> estudiantes = FXCollections.observableArrayList();
        tabla.setItems(estudiantes);
        TableColumn<Estudiante, String> colNombre = new TableColumn<>("Nombre");
        TableColumn<Estudiante, String> colMatricula = new TableColumn<>("Matricula");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        tabla.getColumns().addAll(colNombre, colMatricula);

        // Formularios y botones
        CampoBarbosaValidado tfNombre = new CampoBarbosaValidado();
        tfNombre.setPromptText("Nombre");

        Boton05Estilizado btnAgregar = new Boton05Estilizado("Agregar");
        btnAgregar.setOnAction(e -> {
            String nombre = tfNombre.getText().trim();
            if (!nombre.isEmpty()) {
                //se genera una matricula automatica como ejemplo
                String matricula = "MAT" + (estudiantes.size() + 1);
                Estudiante est = new Estudiante(nombre, matricula);
                estudiantes.add(est); //agrega el estudiante a la tabla
                tfNombre.clear();
            } else {
                System.out.println("El nombre no puede estar vacio");
            }
        });

        VBox vbox = new VBox(menuBar, tabla, tfNombre, btnAgregar);
        Scene scene = new Scene(vbox, 600, 400);
        scene.getStylesheets().add(getClass().getResource("/estilos_3469.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}