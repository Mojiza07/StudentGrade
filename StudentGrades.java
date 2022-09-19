package ClassWork.regex3;

public class StudentGrades {


    private String name;
    private double average;

    private String letterGrades;





    public String StudentGrades() {
        return letterGrades;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getLetterGrades() {
        return letterGrades;
    }

    public String setLetterGrades(String letterGrades) {
        letterGrades = letterGrades;
        if (average >= 90.0) {
            letterGrades = "A";
        }
        else if (average>= 80.0) {
            letterGrades = "B";
        }
            else if (average>= 60.0) {
                letterGrades = "C";
            }
            else if (average>= 50.0) {
                letterGrades = "D";
            }
            else if (average>= 40.0) {
            letterGrades = "E";
            }
            else{
                letterGrades = "F";
        }
            return letterGrades;


    }

    public StudentGrades(String name, double average) {

        if (average > 0.0) {
            if (average <= 100.0) {
                this.average = average;
                if (average >= 90.0) {
                    letterGrades = "A";
                }
                else if (average>= 80.0) {
                    letterGrades = "B";
                }
                else if (average>= 60.0) {
                    letterGrades = "C";
                }
                else if (average>= 50.0) {
                    letterGrades = "D";
                }
                else if (average>= 40.0) {
                    letterGrades = "E";
                }
                else{
                    letterGrades = "F";
                }

            }
        }




        }


    }
