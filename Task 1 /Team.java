import java.util.ArrayList;
class Team {
	


private String teamName;
private int teamRank;
private ArrayList<String> playerNames = new ArrayList <String>();


public Team (String teamName){
this.teamName = teamName;
}

public void setRank(int rank){
 this.teamRank = rank;
}

public String toString(){
return 
( "Team: " + teamName + "\n" 
	+ "Rank: " + teamRank + "\n" 
		+ "players:"+ "\n" + String.join("\n", playerNames )); // String.join tilføjer \n efter hver navn i array

}

public void addPlayer(String playerName){

playerNames.add(playerName);


}




}