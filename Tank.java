package Tanks;

public class Tank {

	private int speed = 10;

	// 1 - up, 2 - down, 3 - left, 4 - right
	private int direction;

	private int x;
	private int y;

	private int step = 1; // value: 1 - 64

	private ActionField af;
	private BattleField bf;

	public Tank(ActionField af, BattleField bf, int x, int y, int direction) {
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void turn(int direction) throws Exception {
		if (this.direction != direction) {
			this.direction = direction;
			af.proccessTurn(this);
		}
	}

	public void move() throws Exception {
		af.proccessMove(this);
	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet((x + 25), (y + 25), direction);
		af.proccessFire(bullet);
	}

	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}

	public int getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getStep() {
		return step;
	}
	
	public int getSpeed() {
		return speed;
	}
}
