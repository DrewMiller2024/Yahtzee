public class Yahtzee
{
  private Die6 dieValue;
  private int[] dice = new int[5];
  private String diceValues;
  private String summarizedNumbers;
  private int one;
  private int two;
  private int three;
  private int four;
  private int five;
  private int six;
  public Yahtzee() {
      this.roll();
  }
  public void roll() {
      int i = 0;
      dieValue = new Die6();
        while (i < 5) {
        dieValue.roll();
        this.dice[i] = dieValue.getValue();
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
      this.summarizedNumbers = "";
      one = 0;
      two = 0;
      three = 0;
      four = 0;
      five = 0;
      six = 0;
      int i = 0;
      while (i < 5) {
          if (dice[i] == 1) {
              one += 1;
          } else if (dice[i] == 2) {
              two += 1;
          } else if (dice[i] == 3) {
              three += 1;
          } else if (dice[i] == 4) {
              four += 1;
          } else if (dice[i] == 5) {
              five += 1;
          } else {
              six += 1;
          }
          i++;
      }
      this.summarizedNumbers = "1-" + one + "; 2-" + two + "; 3-" + three 
          + "; 4-" + four + "; 5-" + five + "; 6-" + six;
      return summarizedNumbers;
  }
}