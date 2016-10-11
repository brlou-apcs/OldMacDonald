class Farm {
  private Animal[] stable = new Animal[3];
  public Farm() {
    stable[0] = new NamedCow("cow", "moo", "Elsie");
    stable[1] = new Chick("chick", "cluck", "cheep");
    stable[2] = new Pig("pig", "oink");
  }
  public void getAnimalSounds() {
    for(int i = 0; i < stable.length; i++) {
      System.out.println(stable[i].getType() + " goes " + stable[i].getSound());
    }
    System.out.println("The cow is known as " + ((NamedCow)stable[0]).getName());
  }
}