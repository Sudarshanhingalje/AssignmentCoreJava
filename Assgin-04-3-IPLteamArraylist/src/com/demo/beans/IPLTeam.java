package com.demo.beans;

import java.util.ArrayList;
import java.util.Iterator;

public class IPLTeam {
	private ArrayList<Team> teams;

    public IPLTeam() {
        teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void deleteTeam(int teamId) {
        Iterator<Team> iterator = teams.iterator();
        while (iterator.hasNext()) {
            Team team = iterator.next();
            if (team.getTeamId() == teamId) {
                iterator.remove();
                break;
            }
        }
    }

    public void deletePlayerFromTeam(int teamId, int playerId) {
        for (Team team : teams) {
            if (team.getTeamId() == teamId) {
                team.removePlayer(playerId);
                break;
            }
        }
    }

    public void modifyCoach(int teamId, String newCoachName) {
        for (Team team : teams) {
            if (team.getTeamId() == teamId) {
                team.setCoachName(newCoachName);
                break;
            }
        }
    }

    public void displayAllBatsman() {
        for (Team team : teams) {
            System.out.println("Team: " + team.getTeamName());
            team.displayBatsman();
        }
    }

    public void displayPlayersWithSpeciality(String speciality) {
        for (Team team : teams) {
            System.out.println("Team: " + team.getTeamName());
            team.displayPlayersWithSpeciality(speciality);
        }
    }

}
