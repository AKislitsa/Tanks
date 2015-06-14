package Tanks;

public class Bullet {

	private int speed = 5;
	private int x;
	private int y;
	private int direction;

	public Bullet(int x, int y, int direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void distroy() {
		x = -100;
		y = -100;
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getDirection() {
		return direction;
	}
	
	public int getSpeed() {
		return speed;
	}
}
