import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Integer> items = new ArrayList<Integer>();
//		items.add(1);
//		items.add(2);
//		items.add(3);
//		//items.add("tongue");
//		items.add(4);
//		items.add(5);
//		
//		printDoubledItems(items);
		
		
//		FootballPlayer joe = new FootballPlayer("Joe");
//		BaseballPlayer pat = new BaseballPlayer("Pat");
//		SoccerPlayer beckham = new SoccerPlayer("Beckham");
//		
//		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckham);
		
//		System.out.println(adelaideCrows.numPlayers());
//		
//		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
//		baseballTeam.addPlayer(pat);
//		
//		Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
//		brokenTeam.addPlayer(beckham);
//		
//		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
//		FootballPlayer banks = new FootballPlayer("Gordon");
//		melbourne.addPlayer(banks);
//		
//		Team<FootballPlayer> hawthorn = new Team<>("Hawthorrn");
//		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//
//
//		hawthorn.matchResult(fremantle, 1, 0);
//		hawthorn.matchResult(adelaideCrows, 3, 8);
//		
//		adelaideCrows.matchResult(fremantle, 2, 1);
////		adelaideCrows.matchResult(baseballTeam, 3, 8);
//		
//		System.out.println("Rankings");
//		System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//		System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//		System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//		System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//		
//		System.out.println(adelaideCrows.compareTo(melbourne));
//		System.out.println(adelaideCrows.compareTo(hawthorn));
//		System.out.println(hawthorn.compareTo(adelaideCrows));
//		System.out.println(melbourne.compareTo(fremantle));
		
		League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
		Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
		Team<FootballPlayer> melbourne = new Team<>("Melbourne");
		Team<FootballPlayer> hawthorn = new Team<>("Hawthorrn");
		Team<FootballPlayer> fremantle = new Team<>("Fremantle");
		Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
		
		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		
		adelaideCrows.matchResult(fremantle, 2, 1);
		
		footballLeague.add(adelaideCrows);
		footballLeague.add(melbourne);
		footballLeague.add(hawthorn);
		footballLeague.add(fremantle);
		
		footballLeague.showLeagueTable();
		
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		
		Team rawTeam = new Team("Raw Team");
		rawTeam.addPlayer(beckham);
		rawTeam.addPlayer(pat);
		
		footballLeague.add(rawTeam);
		
		League<Team> rawLeague = new League<>("Raw");
		rawLeague.add(adelaideCrows);
		rawLeague.add(baseballTeam);
		rawLeague.add(rawTeam);
		
		League<Team> reallyRaw = new League<>("Reeally Raw");
		reallyRaw.add(adelaideCrows);
		reallyRaw.add(baseballTeam);
		reallyRaw.add(rawTeam);
	}
	

//	private static void printDoubledItems(ArrayList<Integer> n){
//		for(int i: n)
//			System.out.println( i*2);
//	}
}
