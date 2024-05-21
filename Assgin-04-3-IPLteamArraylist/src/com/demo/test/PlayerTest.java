package com.demo.test;

import java.util.Scanner;

import com.demo.beans.IPLTeam;
import com.demo.beans.Team;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPLTeam iplTeams = new IPLTeam();
		Scanner scanner = new Scanner(System.in);

		boolean exit = false;
		while (!exit) {
			System.out.println("\n1. Add new Team");
			System.out.println("2. Delete a Team");
			System.out.println("3. Delete a Player from Team");
			System.out.println("4. Display all Batsmen");
			System.out.println("5. Display all Players with Speciality");
			System.out.println("6. Add a new Player in a Team");
			System.out.println("7. Modify Coach of a Team");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Team ID: ");
				int teamId = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Team Name: ");
				String teamName = scanner.nextLine();
				System.out.print("Enter Coach Name: ");
				String coachName = scanner.nextLine();
				iplTeams.addTeam(new Team(teamId, teamName, coachName));
				System.out.println("team added successfully");
				break;
			case 2:
				System.out.print("Enter Team ID to delete: ");
				int deleteTeamId = scanner.nextInt();
				iplTeams.deleteTeam(deleteTeamId);
				System.out.println("team deleted successfully");

				break;
			case 3:
				System.out.print("Enter Team ID from which you want to delete player: ");
				int deleteFromTeamId = scanner.nextInt();
				System.out.print("Enter Player ID to delete: ");
				int deletePlayerId = scanner.nextInt();
				iplTeams.deletePlayerFromTeam(deleteFromTeamId, deletePlayerId);
				System.out.println("player deleted successfully");

				break;
			case 4:
				iplTeams.displayAllBatsman();
				System.out.println(iplTeams);
				break;
			case 5:
				System.out.print("Enter speciality to display players: ");
				String speciality = scanner.nextLine();
				iplTeams.displayPlayersWithSpeciality(speciality);
				break;
			case 6:
				// Add new player in a team
				// Implement this based on your requirement
				break;
			case 7:
				System.out.print("Enter Team ID to modify coach: ");
				int modifyTeamId = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter new Coach Name: ");
				String newCoachName = scanner.nextLine();
				iplTeams.modifyCoach(modifyTeamId, newCoachName);
				System.out.println("modification done sucessfully");
				
				break;
				
			case 8:
				exit = true;
				System.out.println("thank for visiting  the team");
				break;
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 8.");
			}
		}
		scanner.close();
	}
}


