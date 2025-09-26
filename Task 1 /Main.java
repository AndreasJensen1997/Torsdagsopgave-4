class Main {
	
public static void main (String[] args){
	
Team team1 = new Team("Liverpool");
team1.setRank(52);
team1.addPlayer("Mohammed Salah");
team1.addPlayer(" Virgil Van Dijk");
team1.addPlayer("Alexis Mac Allister");
team1.addPlayer("Trent Alexander-Arnold");
team1.addPlayer("Harvey Elliott");

Team team2 = new Team("Manchester City");
team2.setRank(48);
team2.addPlayer("Erling Haaland");
team2.addPlayer("Phil Foden");
team2.addPlayer("Bernardo Silva");
team2.addPlayer("Rodri");
team2.addPlayer("Kevin De Bruyne");

Team team3 = new Team("Arsenal");
team3.setRank(41);
team3.addPlayer("Bukayo Saka");
team3.addPlayer("Martin Ødegaard");
team3.addPlayer("William Saliba");
team3.addPlayer("Declan Rice");
team3.addPlayer("Kai Havertz");

Team team4 = new Team("Manchester United");
team4.setRank(35);
team4.addPlayer("Marcus Rashford");
team4.addPlayer("Bruno Fernandes");
team4.addPlayer("Rasmus Højlund");
team4.addPlayer("Manuel Ugarte");
team4.addPlayer("Kobbie Mainoo");

Team team5 = new Team("Chelsea");
team5.setRank(30);
team5.addPlayer("Moises Caicedo");
team5.addPlayer("Cole Palmer");
team5.addPlayer("Enzo Fernández");
team5.addPlayer("Kiernan Dewsbury-Hall");
team5.addPlayer("Trevoh Chalobah");

Team team6 = new Team("Tottenham");
team6.setRank(23);
team6.addPlayer("Son Heung-min");
team6.addPlayer("Cristian Romero");
team6.addPlayer("James Maddison");
team6.addPlayer("Micky van de Ven");
team6.addPlayer("Brennan Johnson");


Team[] teams = {team1,team2,team3,team4,team5,team6};

for (Team e : teams){

	System.out.println(e+ "\n");

}


}
	}