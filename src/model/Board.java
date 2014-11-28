package model;

import java.util.Arrays;

public class Board {
	private Field[][] fields = new Field[3][3];
	
	public Board() {
		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields[i].length; j++) {
				fields[i][j] = Field.EMPTY;
				Arrays.fill(fields[i], Field.EMPTY);
			}
		}
	}
	
	public Field getField(int xCoord, int yCoord) {
		if (xCoord <= fields.length && yCoord <= fields[0].length && xCoord > 0 && yCoord > 0)
			return fields[xCoord - 1][yCoord - 1];
		else
			return null;
	}
	
}
