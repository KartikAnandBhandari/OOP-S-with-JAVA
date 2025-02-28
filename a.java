import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ECommerceApp extends Application {
    
    private Stage primaryStage;
    private Scene loginScene, productScene;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("E-Commerce App");

        // Login Screen
        Label userLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");

        loginButton.setOnAction(e -> showProducts());

        VBox loginLayout = new VBox(10, userLabel, usernameField, passLabel, passwordField, loginButton);
        loginLayout.setAlignment(Pos.CENTER);
        loginScene = new Scene(loginLayout, 400, 300);

        // Set Scene
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private void showProducts() {
        Label title = new Label("Product List");
        ListView<String> productList = new ListView<>();
        productList.getItems().addAll("Laptop - $800", "Phone - $500", "Headphones - $100");

        Button backButton = new Button("Logout");
        backButton.setOnAction(e -> primaryStage.setScene(loginScene));

        VBox productLayout = new VBox(10, title, productList, backButton);
        productLayout.setAlignment(Pos.CENTER);
        productScene = new Scene(productLayout, 400, 300);

        primaryStage.setScene(productScene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
