package randomTroop.warriors;

public class Swordsman extends Warrior {
  private int swordLen;
  
  public Swordsman(String name, int x, int y) { 
    super(name, random.nextInt(3) + 8, 10, 8, x, y);
  }

  public void createShieldWall() {}
}
