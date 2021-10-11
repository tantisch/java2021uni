package hw5;

import java.util.Random;

public class ex1_16 {

    public static int N = 500; // amount of candidates
    public static int NUM_OF_TRIALS = 500; // amount of trials

    public static void main(String[] args) {

        float hired_best = 0; // amount of times best candidate was hired

        // loop for NUM_OF_TRIALS trials to check probability
        for (int j = 0; j < NUM_OF_TRIALS; j++) {
            Random random = new Random();

            // initializing array of candidates' ratings with random function
            float max_rating = 0;
            float[] candidates_ratings = new float[N];
            for (int i = 0; i < N; i++) {
                float r = random.nextFloat();
                candidates_ratings[i] = r;
                if(r > max_rating) max_rating = r;
            }

            // finding best candidate from N/2 candidates (and not hiring him)
            float best_candidate_from_half = 0;
            for (int i = 0; i < N / 2; i++) {
                if (candidates_ratings[i] > best_candidate_from_half) best_candidate_from_half = candidates_ratings[i];
            }

            // finding first candidate who is better than best from first half (and hiring him)
            int candidate_to_hire_ind = 0;
            float candidate_to_hire_rating = 0;

            for (int i = N / 2; i < N; i++) {
                if (candidates_ratings[i] > best_candidate_from_half) {
                    candidate_to_hire_ind = i;
                    candidate_to_hire_rating = candidates_ratings[i];
                }
            }

            // check if hired candidate is best
            if(candidate_to_hire_rating == max_rating) hired_best++;
        }

        // print probability after trials
        System.out.println(hired_best / (float)NUM_OF_TRIALS);

    }
}