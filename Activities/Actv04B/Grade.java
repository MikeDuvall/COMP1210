/**This program represents my grade in Comp 1210.
Actvity04B
@author Michael Duvall - Comp 1210 - 08
@version 9/20/18
*/
public class Grade {
   private double exam1 = 0.0;
   private double exam2 = 0.0;
   private double finalExam = 0.0;
   private double activityAvg = 0.0;
   private double quizAvg = 0.0;
   private double projectAvg = 0.0;
   private String studentName = "";
/**Represents the three possible exams as constants.
*/
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
/**Represents the weight of wach portion of my grade
as constants.
*/
   private static final double EXAM_WEIGHT = 0.15, FINAL_WEIGHT = 0.30,
      ACT_WEIGHT = 0.05,  QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;

/**This constructor accepts the student name.
@param studentNameIn - The student's name
*/
   public Grade(String studentNameIn) {
      studentName = studentNameIn;
   }
/**This method sets the lab average.
@param activityAvgIn - the activity average
@param quizAvgIn - the quiz average
*/
   public void setLabAverages(double activityAvgIn, double quizAvgIn) {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
/**This method sets the project average.
@param projectAvgIn - project average
*/
   public void setProjectAvg(double projectAvgIn) {
      projectAvg = projectAvgIn;
   }
/**This method sets the exam scores.
@param examType - Which exam it is
@param examScoreIn - inputted Score
*/
   public void setExamScore(double examType, double examScoreIn) {
      if (examType == EXAM_1) {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2) {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL) {
         finalExam = examScoreIn;
      }
   }
/**This method calculates the grade for the class.
@return grade - the grade for the class
*/
   public double calculateGrade() {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT 
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
/**This method creates a string object of the Grade class.
@return  - the String obj of Grade
*/
   public String toString() {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
         
   }
}