package com.zgodnji.fifastattracker;

public class Challenge {

    private String id;
    private String userId1;
    private String userId2;
    private String gameId;
    private boolean done;
    private boolean rejected;
    private String scoreId;

    public Challenge(String id, String userId1, String userId2, String gameId, boolean done, boolean rejected, String scoreId) {
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
        this.gameId = gameId;
        this.done = done;
        this.rejected = rejected;
        this.scoreId = scoreId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public boolean isRejected() {
        return rejected;
    }

    public String getGameId() {
        return gameId;
    }

    public String getScoreId() {
        return scoreId;
    }

    public String getUserId1() {
        return userId1;
    }

    public String getUserId2() {
        return userId2;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public void setUserId1(String userId1) {
        this.userId1 = userId1;
    }

    public void setUserId2(String userId2) {
        this.userId2 = userId2;
    }

}

