import java.util.List;
import java.util.Objects;

public class Score {
    private String id;
    private String studentId;
    private String subjectId;
    private List<Double> regularPoint;
    private double midterm;
    private double finalPoint;

    public Score(String id, String studentId, String subjectId, List<Double> regularPoint, double midterm, double finalPoint) {
        this.id = id;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.regularPoint = regularPoint;
        this.midterm = midterm;
        this.finalPoint = finalPoint;
    }

    public double getFinalPoint() {
        return finalPoint;
    }

    public void setFinalPoint(double finalPoint) {
        this.finalPoint = finalPoint;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMidterm() {
        return midterm;
    }

    public void setMidterm(double midterm) {
        this.midterm = midterm;
    }

    public List<Double> getRegularPoint() {
        return regularPoint;
    }

    public void setRegularPoint(List<Double> regularPoint) {
        this.regularPoint = regularPoint;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return Objects.equals(id, score.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public double getFinalScore(){
        double regularAvg = regularPoint.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        return (regularAvg * 0.2) + (midterm * 0.3) + (finalPoint * 0.5);
    }
    public Object[] getObject(){
        return new Object[]{this.getId(), this,getStudentId(),
                this.getSubjectId(), this.getRegularPoint(),
                this.getMidterm(), this.getFinalPoint(), this.getFinalScore()};
    }
}
