package input;

import java.util.ArrayList;

import javafx.scene.input.KeyCode;

public class InputUtility {

	private static ArrayList<KeyCode> keyPressed = new ArrayList<>();

	public static ArrayList<KeyCode> getKeyPressed() {
		return keyPressed;
	}

	public static void setKeyPressed(KeyCode keycode, boolean pressed) {
		if (pressed) {
			if (!keyPressed.contains(keycode)) {
				keyPressed.add(keycode);
			}
		} else {
			keyPressed.remove(keycode);
		}
	}

}
