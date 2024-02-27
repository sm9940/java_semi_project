package studentInfo.application;

public class BasicEvaluation implements GradeEvaluation{
    @Override
    public String getGrade(int point) {
        if (point >= 90 && point <= 100) {return "A";
        } else if (point<90 && point>=80) { return "B";
        } else if (point<80 && point>=70) {return "C";
        } else if(point<70 && point>=55){return "D";
    } else {
        return "F";}
    }
    }

