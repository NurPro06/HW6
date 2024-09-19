public class Skeleton extends Boss {
    private int arrowsCount;

    public Skeleton(int health, int damage, Weapon weapon, int arrowsCount) {
        super(health, damage, weapon);
        this.arrowsCount = arrowsCount;
    }

    public int getArrowsCount() {
        return arrowsCount;
    }

    public void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Skeleton arrows count: " + arrowsCount);
    }
}