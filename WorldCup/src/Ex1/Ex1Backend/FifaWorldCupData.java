package Ex1.Ex1Backend;

import java.io.IOException;

import application.Game;
import application.Team;

public interface FifaWorldCupData {

    void saveTeam(Team team) throws IOException;

    void saveTeam(Team team, int index) throws IOException;

    Team nextTeam() throws IOException;

    Team previousTeam() throws IOException;

    void saveGame(Game game) throws IOException;

    void saveGame(Game game, int index) throws IOException;

    Game getGameAt(int index) throws IOException;

    int getNumOfTeams();

    int getNumOfGames();

	void saveTeam(Ex1.Ex1Backend.Team team);
}
