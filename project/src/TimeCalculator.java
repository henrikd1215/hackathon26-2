public class TimeCalculator {
    public double calculateTime(Assignment todo, SimilarAssignments pastAssignments) {
        return todo.questions * timePerQuestion(pastAssignments);
    }

    public double calculateTimeWithDifficulty(Assignment todo, SimilarAssignments pastAssignments) {
        return todo.questions * timePerQuestion(pastAssignments, todo.diff);
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

    private double timePerQuestion(SimilarAssignments assignments, Difficulty diff) {
        double time = 0;
        int questions = 0;

        for (Assignment assignment : assignments.assignments) {
            if (assignment.diff == diff)
            {
                time += assignment.time;
                questions += assignment.questions;
            }
        }

        return time / questions;
    }
}
