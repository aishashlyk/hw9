public class Student {
    private String studentName;
    private int studentId;
    private int yearOfStudy;
    //Constructors
    public Student(){}
    public Student(String studentName, int studentId){
        this.studentName = studentName;
        this.studentId = studentId;
        this.yearOfStudy = 1;
    }
    //Getters
    public String getStudentName(){return studentName;}
    public int getStudentId(){return studentId;}
    public int getYearOfStudy(){return yearOfStudy;}
    //Method to increase years of study
    public void increaseYearsOfStudy(){yearOfStudy++;}
    //toString method
    @Override
    public String toString(){
        return String.format("Name: %s, ID: %d, Year of studying: %d", studentName, studentId, yearOfStudy);
    }
}
