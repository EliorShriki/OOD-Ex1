package Ex1;

import Ex1.Ex1Backend.FifaWorldCupData;
import Ex1.Ex1Backend.FifaWorldCupFileManager;
import Ex1.Ex1Backend.Team;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.IOException;

public class GeneratingTeamsUsingPhotos {

    public static void main(String[] args) throws IOException {
        FifaWorldCupData fifa = new FifaWorldCupFileManager(".\\res\\files\\teams.bin",".\\res\\files\\games.bin");

       File dir = new File(".\\res\\teams_pic");
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
            	System.out.println(child.getName().replaceAll(".png","").toCharArray());
                fifa.saveTeam(new Team(child.getName().replaceAll(".png","").toCharArray(),Color.color(Math.random(), Math.random(),Math.random()),
                        Color.color(Math.random(),Math.random(),Math.random())));
            }
        }

        for(int i = 0 ; i <= fifa.getNumOfTeams() ; i++){
            System.out.println(fifa.nextTeam());
        }

        for(int i = 0 ; i <= fifa.getNumOfTeams() ; i++){
            System.out.println(fifa.previousTeam());
        }

    }
}
