import java.util.ArrayList;

public class TimeCalculator {
    public double calculateTime(Assignment todo, SimilarAssignments pastAssignments) {
        return todo.questions * timePerQuestion(pastAssignments);
    }

    private double timePerQuestion(SimilarAssignments assignments) {
        double time = 0;
        int questions = 0;

        int count = 0;

        for (Assignment assignment : assignments.assignments) {
            time += assignment.time;
            questions += assignment.questions;

            count++;
        }

        if (count != 0) {
            return time / questions;
        } 
        else {
            return -1;
        }
    }

    public static double findTPQVariance(SimilarAssignments assignments) {
        ArrayList<Double> timePerQuestions = new ArrayList<>();

        for (Assignment assignment : assignments.assignments) {
            timePerQuestions.add(assignment.time / assignment.questions);
        }

        Double mean = 0.0;
        for (Double tpq : timePerQuestions) {
            mean += tpq;
        }
        mean = mean / timePerQuestions.size();

        Double variance = 0.0;
        for (Double tpq : timePerQuestions) {
            variance += Math.pow(tpq - mean, 2);
        }
        variance = variance / (timePerQuestions.size() - 1);

        return variance;
    }

    public static double findTPQSTD(SimilarAssignments assignments) {
        return Math.pow(findTPQVariance(assignments), .5);
    }
}
