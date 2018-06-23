import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("object.fxml"));
        primaryStage.setTitle("Object Project WIP");

        ObjectController objectController = new ObjectController();
        ObjectModel objectModel = new ObjectModel();
        objectController.initModel(objectModel);

        primaryStage.setScene(new Scene(root, root.prefWidth(-1), root.prefHeight(-1)));
        primaryStage.setMinWidth(root.minWidth(-1));
        primaryStage.setMinHeight(root.minHeight(-1));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
