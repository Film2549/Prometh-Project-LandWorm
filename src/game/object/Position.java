package game.object;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Position {
	public static int maxHeight = 28;
	public static int maxWidth = 49;
	public int row, col;

	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public void updateRow(int x) {
		this.row += x;
		if (this.row < 1)
			this.row = 1;
		else if (this.row >= maxHeight)
			this.row = maxHeight - 1;
	}

	public void updateCol(int x) {
		this.col += x;
		if (this.col < 1)
			this.col = 1;
		else if (this.col >= maxWidth)
			this.col = maxWidth - 1;
	}

	@Override
	public boolean equals(Object obj) {
		Position other = (Position) obj;
		return (this.row == other.row) && (this.col == other.col);
	}

}
