// prepare Grade sheet by using IF ELSE use following details
  // Score greater than 90 and less than or equal to 100 A+
// Score greater than 80 and less than or equal 90 A
// Score greater than 70 and less than or equal 80 B+
// Score Greater than 60 and less than or equal 50 B
// Like Wise the person who gets less than 36 is considered as Grade F
// Variables should use
public class IfElse{
  public int score=60;
   public static void main(String[] args) {
        IfElse f = new IfElse();
     
    public void determineGrade() {
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A+");
        } else if (score >= 80 && score <= 90) {
            System.out.println("Grade: A");
        } else if (score >= 70 && score <= 80) {
            System.out.println("Grade: B+");
        } else if (score >= 60 && score <= 70) {
            System.out.println("Grade: B");
        } else if (score >= 36 && score < 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
    }
}
