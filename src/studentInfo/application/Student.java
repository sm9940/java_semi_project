package studentInfo.application;

import java.util.ArrayList;

public class Student {
protected int studentId;
protected String studentName;
protected Subject majorSubject;
protected  ArrayList<Score>scoreList;
public Student(int studentId, String studentName, Subject majorSubject ){
    this.studentId = studentId;
    this.studentName =studentName;
    this.majorSubject = majorSubject;
}

public void addSubjectScore(Score score){
    scoreList.add(score);
}
}
