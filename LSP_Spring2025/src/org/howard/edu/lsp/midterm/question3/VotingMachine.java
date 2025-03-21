package org.howard.edu.lsp.midterm.question3;

import java.util.ArrayList;
import java.util.List;

public class VotingMachine {
    private List<String> candidates = new ArrayList<String>();
    private List<Integer> votes = new ArrayList<Integer>();

    public VotingMachine(){

    }

/**
 * Adds a new candidate using candidate name.
 * Adds a vote count of zero to the same index in the votes list.
 */
    public void addCandidate(String n){
        candidates.add(n);
        votes.add(0);
    }
/**
 * Searches for candidate by name and increments their vote count.
 */
    public boolean castVote(String n){
        for(int i = 0; i < candidates.size(); i++){
            if (candidates.get(i).equalsIgnoreCase(n)){
                votes.set(i, votes.get(i) + 1);
                return true;
            }
        }
        return false;
    }
/**
 * Searches for highest vote count and returns the corresponding name.
 */
    public String getWinner(){
        if(candidates.isEmpty()){
            return "No Candidates.";
        }

        int maxVotes = 0;
        int winIndex = 0;

        for(int i = 0; i < votes.size(); i++){
            if (votes.get(i) > maxVotes ){
                maxVotes = votes.get(i);
                winIndex = i;
            }
        }
        return candidates.get(winIndex) + " WINS with " + maxVotes + " votes!! ";
    }
}
