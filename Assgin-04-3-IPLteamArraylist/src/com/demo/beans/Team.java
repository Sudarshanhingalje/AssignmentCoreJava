package com.demo.beans;

import java.util.ArrayList;
import java.util.Iterator;

public class Team {
	
	private int teamId;
    private String teamName;
    private String coachName;
    private ArrayList<Player> players;

    public Team(int teamId, String teamName, String coachName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.coachName = coachName;
        this.players = new ArrayList<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player);
    }

    public void removePlayer(int playerId) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getPlayerId() == playerId) {
                iterator.remove();
                break;
            }
        }
    }

    public void displayBatsman() {
        for (Player player : players) {
            if (player.getSpeciality().equalsIgnoreCase("batsman")) {
                System.out.println(player.getPlayerName());
            }
        }
    }

    public void displayPlayersWithSpeciality(String speciality) {
        for (Player player : players) {
            if (player.getSpeciality().equalsIgnoreCase(speciality)) {
                System.out.println(player.getPlayerName());
            }
        }
    }
}


