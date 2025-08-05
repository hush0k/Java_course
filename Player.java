
public class Player {
	private int hp;
	private int food;
	private int inventory;
	private AttackType type;
	
	Player(int hp, int food, int inventory, AttackType type){
		this.hp = hp;
		this.food = food;
		this.inventory = inventory;
		this.type = type;
	}
	
	

	public void attack(AttackType type) {
		System.out.println("Supper Attack");
	}
	
	public void attack(int hp) {
		System.out.println("He took big damage!!!");
	}
	
	

}
