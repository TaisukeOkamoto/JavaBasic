package practice13.common;

public class SuperHero extends Hero {
	private Item equipment;

	public SuperHero(int hp, int power, int endurance) {
		super(hp,power,endurance);
	}

	public Item getEquipment() {
		return equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	//オーバーライドしたメソッド
	public int attack() {
		return super.attack() + this.getEquipment().getAdditionalDamage();
	}

}
