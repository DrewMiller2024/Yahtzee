public class Yahtzee
{
  private int value;
  private int[] dice = new int[5];
  private String diceValues;
  private String summarizedNumbers;
  private int one = 0;
  private int two = 0;
  private int three = 0;
  private int four = 0;
  private int five = 0;
  private int six = 0;
  public Yahtzee() {
      this.roll();
  }
  public void roll() {
      int i = 0;
        while (i < 5) {
        this.value = (int)(Math.random() * 6) + 1;
        this.dice[i] = value;
        i++;
      }
  }
  public void roll(int dieNumber) {
      this.dice[dieNumber - 1] = (int)(Math.random() * 6) + 1;
  }
  public String toString() {
      this.diceValues = "{" + dice[0] + ", " + dice[1] + ", " + dice[2] 
          + ", " + dice[3] + ", " + dice[4] + "}";
      return diceValues;
  }
  public String summarize() {
      
      this.summarizedNumbers = 
      return summarizedNumbers;
  }
}