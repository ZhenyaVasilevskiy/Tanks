package ui;
import java.nio.file.Paths;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * звук
 */
public class SoundManager {
	
	/**
	 * победа
	 */
	public void playVictory() {
		play("sounds/victory.mp3");
	}
	
	/**
	 * простойзвук
	 */
	public void playDefeat() {
		play("sounds/defeat.mp3");
	}
	
	/**
	 * функция проигрывания
	 */
	private void play(String filepath) {
		Media hit = new Media(Paths.get(filepath).toUri().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}
	
}
