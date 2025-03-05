class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + ".");
  }

  public static void main(String[] args) {
    Mayan chontal = new Mayan("Chontal", 60563);
    chontal.getInfo();

    System.out.println();

    SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 940000000);
    mandarinChinese.getInfo();

    System.out.println();

    SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
    burmese.getInfo();
  }
}