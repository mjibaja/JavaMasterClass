package com.migueljibaja;

public class Main {

    public static void main(String[] args) {
	    League<Team<FootballPlayer>> footballLeague = new League<>("Liga 1 Movistar");
	    Team<FootballPlayer> alianza = new Team<>("Alianza Lima");
        Team<FootballPlayer> universitario = new Team<>("Universitario");
        Team<FootballPlayer> boys = new Team<>("Sport Boys");
        Team<FootballPlayer> municipal = new Team<>("Municipal");
        //Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        alianza.matchResult(universitario,4,0);
        boys.matchResult(municipal,2,2);
        alianza.matchResult(boys,2,1);
        universitario.matchResult(municipal,0,2);
        boys.matchResult(universitario,2,0);

        footballLeague.add(alianza);
        footballLeague.add(universitario);
        footballLeague.add(boys);
        footballLeague.add(municipal);
        //footballLeague.add(baseballTeam);

x
        footballLeague.showLeagueTable();
    }
}
