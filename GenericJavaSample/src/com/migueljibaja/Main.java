package com.migueljibaja;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
	    BaseballPlayer pat = new BaseballPlayer("Pat");
	    SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer cueto = new SoccerPlayer("Cueto");

	    Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
	    adelaideCrows.addPlayer(joe);

	    Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
	    baseballTeam.addPlayer(pat);


	    Team<SoccerPlayer> soccerTeam = new Team<>(("Alianza Lima"));
	    soccerTeam.addPlayer(beckham);
        soccerTeam.addPlayer(cueto);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");

        hawthorn.matchResult(freemantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(freemantle,2,1);
        //adelaideCrows.matchResult(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(freemantle.getName() + ": " + freemantle.ranking()) ;
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking()) ;

        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(adelaideCrows.compareTo(freemantle));
        System.out.println(hawthorn.compareTo(freemantle));
        System.out.println(hawthorn.compareTo(adelaideCrows));




        //System.out.println(soccerTeam.numPlayers());
    }
}
