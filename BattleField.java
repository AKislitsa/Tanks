package Tanks;

public class BattleField {

	private int bfWidth = 576;
	private int bfHeight = 576;

	String[][] battleField = {
			{ "B", "B", "B", "B", "B", "B", "B", "B", "B" },
			{ "B", " ", " ", " ", " ", " ", " ", " ", "B" },
			{ "B", "B", "B", " ", "B", " ", "B", "B", "B" },
			{ "B", "B", "B", " ", " ", " ", "B", "B", "B" },
			{ "B", "B", "B", " ", "B", " ", "B", "B", "B" },
			{ "B", "B", " ", "B", "B", "B", " ", "B", "B" },
			{ "B", "B", " ", " ", " ", " ", " ", "B", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" },
			{ "B", " ", " ", "B", "B", "B", " ", " ", "B" } };

	public BattleField() {
	}
	
	public BattleField(String[][] battleField){
		this.battleField = battleField;
	}
	
	public String scanQuadrant(int v, int h){
		return battleField[v][h];
	}
	
	public void updateQuadrant(int v, int h, String cell){
		battleField[v][h] = cell;
	}
	
	public int getDimentionX(){
		return battleField.length;
	}
	
	public int getDimentionY(){
		return battleField[0].length;
	}

	public int getBfWidth() {
		return bfWidth;
	}

	public int getBfHeight() {
		return bfHeight;
	}
}
