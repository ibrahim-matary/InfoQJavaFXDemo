import javafx.application.Application;
import javafx.application.Launcher;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Hello extends Application {
    @Override
    public void start(Stage stage) {
        // �R���e�i
        Group container = new Group();

        // �V�[���O���t�̃��[�g�v�f�𐶐����A�R���e�i��\��
        Scene scene = new Scene(container, 100, 20);
        stage.setScene(scene);

        // ���x���𐶐����R���e�i�ɓ\��
        Label label = new Label("Hello, World!");
        container.getChildren().add(label);

        // �\��
        stage.setVisible(true);
    }

    public static void main(String[] args) {
        Launcher.launch(Hello.class, null);
    }
}