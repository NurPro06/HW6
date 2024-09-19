public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        Boss boss = new Boss(900, 125, bossWeapon);
        boss.printInfo();

        System.out.println();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        Skeleton skeleton1 = new Skeleton(250, 50, skeletonWeapon1, 15);
        skeleton1.printInfo();

        System.out.println();

        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Dark Bow");
        Skeleton skeleton2 = new Skeleton(300, 50, skeletonWeapon2, 10);
        skeleton2.printInfo();
    }
}
