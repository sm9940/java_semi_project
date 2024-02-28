package studentInfo.school.report;

import studentInfo.grade.BasicEvaluation;
import studentInfo.grade.GradeEvaluation;
import studentInfo.grade.MajorEvaluation;
import studentInfo.school.School;
import studentInfo.school.Score;
import studentInfo.school.Student;
import studentInfo.school.Subject;
import studentInfo.utils.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public  static final  String TITLE = "수강생 학점 \t\t\n";
    public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 \n";
    public static final String LINE = "----------------------------\n";
    //문자열 연산을 빈번하게 하는 경우에는 메모리 효율을 위해 StringBuffer를 사용한다.
    private StringBuffer buffer = new StringBuffer();
    public String getReport(){
        ArrayList<Subject> subjectList = school.getSubjectList();
        for(Subject subject: subjectList){
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString(); //StringBuffer타입의 데이터를 String 타입으로 바꿔준다.
    }
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
            Student student =studentLIst.get(i); //해당과목을 수강신청한 학생을 한명씩 가져옴
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName()+"\t");
            buffer.append(" | ");
            //학생별 수강과목의 점수, 학점 계산
            getScoreGrade(student, subject.getSubjectId());
            buffer.append("\n");
        }
    }
    public void makeFooter(){
        buffer.append("\n");
    }

    //학생의 수강과목 점수와 학점을 얻는 메소드
    public void getScoreGrade(Student student, int subjectId){
        //해당 학생이 수강한 과목의 점수리스트(국어,수학)
        ArrayList<Score> scoreList = student.getScoreList();
        //해당 학생의 필수과목의 과목코드
        int majorId = student.getMajorSubject().getSubjectId();

        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(),new MajorEvaluation()};

        for (int i = 0; i < scoreList.size(); i++) {
            Score score = scoreList.get(i);
            //과목코드가 같은지 확인(내가 원하는 과목의 학점을 얻기위해)
            if(score.getSubject().getSubjectId()== subjectId){
                String grade;
                //필수 과목일때 학점 산출
                if(score.getSubject().getSubjectId()==majorId){//필수과목 학점 산출
                    grade =gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                } else {//일반과목 학점 산출
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                }
                buffer.append(score.getPoint());
                buffer.append(" : ");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }
}
