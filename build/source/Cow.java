public class Cow implements Animal {

  public String type;
  public String sound;

  public Cow(String type, String sound) {
    this.type = type;
    this.sound = sound;
  }

  public Cow() {
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