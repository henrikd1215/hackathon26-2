public class TimeCalculator {
    public double calculateTime(Assignment todo, SimilarAssignments pastAssignments) {
        return todo.questions * timePerQuestion(pastAssignments);
    }

    private double timePerQuestion(SimilarAssignments assignments) {
        double time = 0;
        int questions = 0;

        for (Assignment assignment : assignments.assignments) {
            time += assignment.time;
            questions += assignment.questions;
        }

        return time / questions;
    }
}
