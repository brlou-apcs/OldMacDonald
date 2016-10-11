public class NamedCow extends Cow{
  private String name;

  public NamedCow(String type, String sound, String name) {
    this.type = type;
    this.sound = sound;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}