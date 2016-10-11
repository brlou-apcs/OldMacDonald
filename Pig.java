public class Pig implements Animal {
  private String type;
  private String sound;

  public Pig(String type, String sound) {
    this.type = type;
    this.sound = sound;
  }

  public Pig() {
    this.type = "unknown";
    this.sound = "unknown";
  }

  public String getSound() {
    return this.sound;
  }

  public String getType() {
    return this.type;
  }
}
