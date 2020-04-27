package ui;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * welcome сцена в игре
 */
public class StartScene extends GameScene {
	
	public StartScene(GameUI manager, int SIZE) {
		super(manager, SIZE);
	}
	
	/**
	 * возвращает кнопки в начале игры
	 */
	private Node initStartViewButtons() {
    	VBox buttons = new VBox();
    	
    	buttons.setPadding(new Insets(15, 12, 15, 12));
        buttons.setSpacing(100);
        
        Button startButton = uiManager.initStartButton();
    	
    	Text text = new Text();
		text.setFont(new Font(16));
		text.setWrappingWidth(400);
		text.setTextAlignment(TextAlignment.CENTER);
		text.setText("W A S D чтобы двигаться\n\n'Пробел выстрел'\n\n");
		
    	buttons.getChildren().addAll(text, startButton);
    	buttons.setAlignment(Pos.CENTER);
    	
    	return buttons;
    }
    
    /**
     * возврат заголовка на старте сцены
     */
    private Label initTitle() {
    	Label title = new Label("Tank Battle");
    	title.setFont(new Font(20));
    	title.setPadding(new Insets(15, 15, 15, 15));
    	title.setTextAlignment(TextAlignment.CENTER);
    	return title;
    }
    
    public Scene initScene() {
    	BorderPane root = new BorderPane();
    	
    	Node startViewButtons = initStartViewButtons();
    	Label title = initTitle();
    	
    	root.setTop(title);
    	root.setCenter(startViewButtons);
    	BorderPane.setAlignment(title, Pos.CENTER);
    	Scene scn = new Scene(root, SIZE, SIZE);
    	return scn;
    }
}
