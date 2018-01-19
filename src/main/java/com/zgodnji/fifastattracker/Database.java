package com.zgodnji.fifastattracker;

import java.util.ArrayList;
import java.util.List;


public class Database {
    private static List<Challenge> challenges = new ArrayList<>();

    public static List<Challenge> getChallenges() {
        return challenges;
    }

    public static List<Challenge> getUserChallenges(String userId) {

        List<Challenge> user_challenges = new ArrayList<>();

        for (Challenge c : challenges) {
            if (c.getUserId1().equals(userId) || c.getUserId2().equals(userId))
                user_challenges.add(c);
        }

        return user_challenges;
    }

    public static void addChallenge(Challenge c) {
        challenges.add(c);
    }

    public static void deleteChallenge(String challengeId) {
        for (Challenge c : challenges) {
            if (c.getId().equals(challengeId)) {
                challenges.remove(c);
                break;
            }
        }
    }
}
