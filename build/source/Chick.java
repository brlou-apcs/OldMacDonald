public class Chick implements Animal {

  private String type;
  private String sound1;
  private String sound2;

  public Chick() {
    this.type = "unknown";
    this.sound2 = "unknown";
  }
  
  public Chick(String type, String sound) {
    this.type = type;
    this.sound1 = sound;
  }

  public Chick(String type, String sound1, String sound2) {
    this.type = type;
    this.sound1 = sound1;
    this.sound2 = sound2;
  }

  public String getSound() {
    int i = (int)(Math.random()*2);
    if(i == 0) return this.sound1;
    return this.sound2;
  }

  public String getType() {
    return this.type;
  }
}