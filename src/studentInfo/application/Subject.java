package studentInfo.application;

import java.util.ArrayList;

public class Subject {
    protected String subjectName;
    protected int subjectId;
    protected int gradeType;
    protected ArrayList<Student>studentList;
    public Subject(String subjectName, int subjectId){
        this.subjectName = subjectName;
        this.subjectId = subjectId;
    }
    public void register(Student student){
studentList.add(student);
    }
}
