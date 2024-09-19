public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printInfo() {
        System.out.println("Boss health: " + getHealth());
        System.out.println("Boss damage: " + getDamage());
        System.out.println("Boss weapon: " + weapon.getName() + " (Type: " + weapon.getType() + ")");
    }
}
