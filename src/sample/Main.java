package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
/*        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("CampusBased");
        WebView webview = new WebView();
        WebEngine webEngine = webview.getEngine();
        webEngine.load("https://erp.gtuc.edu.gh/sip/index.php?accesscheck=%2Fsip%2Fresults_slip.php");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        stage.setWidth(400);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());


        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(browser);

        webEngine.getLoadWorker().stateProperty()
                .addListener(new ChangeListener<State>() {
                    @Override
                    public void changed(ObservableValue ov, State oldState, State newState) {

                        if (newState == Worker.State.SUCCEEDED) {
                            stage.setTitle(webEngine.getLocation());
                        }

                    }
                });
        webEngine.load(
                "http://java2s.com"
        //        "https://erp.gtuc.edu.gh/sip/index.php?accesscheck=%2Fsip%2Fresults_slip.php"
        );

        scene.setRoot(scrollPane);

        stage.setScene(scene);
        stage.show();*/

        WebView webView = new WebView();
        WebEngine engine = webView.getEngine();

        Button btnColt = new Button("Colt");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("http://gtuconline.gtuc.edu.gh/online/login/index.php");
            }
        });

        Button btnSip = new Button("Sip");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("https://erp.gtuc.edu.gh/");
            }
        });

        Button btnLib = new Button("E-library");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("http://library.gtuc.edu.gh/library/");
            }
        });

        Button btnAdm = new Button("Admissions");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("https://site.gtuc.edu.gh/undergraduate-admission-requirement/");
            }
        });

        Button btnNews = new Button("News");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("https://site.gtuc.edu.gh/gtuc-history/");
            }
        });

        Button btnHistory = new Button("History");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("https://site.gtuc.edu.gh/gtuc-history/");
            }
        });

        Button btnCourses = new Button("Online Courses");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("http://gtuconline.gtuc.edu.gh/online/login/index.php");
            }
        });

        Button btnReload = new Button("Reload Page");
        btnColt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.reload();
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(webView, btnColt, btnCourses, btnAdm, btnHistory, btnSip, btnLib, btnNews,btnReload);

        Scene scene = new Scene(vBox, 800, 500);

        stage.setTitle("CampusBased");
        stage.setScene(scene);
        stage.show();
    }
}
