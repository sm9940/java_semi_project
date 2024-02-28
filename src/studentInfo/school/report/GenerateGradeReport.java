package studentInfo.school.report;

import studentInfo.school.School;
import studentInfo.school.Student;
import studentInfo.school.Subject;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public  static final  String TITLE = "수강생 학점 \t\t\n";
    public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 \n";
    public static final String LINE = "----------------------------\n";
    //문자열 연산을 빈번하게 하는 경우에는 메모리 효율을 위해 StringBuffer를 사용한다.
    private StringBuffer buffer = new StringBuffer();
//    public String getReport(){
//        makeHeader();
//        makeBody();
//        makeFooter();
//    }
    public void makeHeader(Subject subject){
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t"+ subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }
    public void makeBody(Subject subject){
        ArrayList<Student> studentLIst = subject.getStudentList();

        for (int i = 0; i < studentLIst.size(); i++) {
            Student student =studentLIst.get(i);

        }
    }
    public void makeFooter(){
        buffer.append("\n");
    }

    //학생의 수강과목 점수와 학점을 얻는 메소드
    public void getScoreGrade(){}
}
