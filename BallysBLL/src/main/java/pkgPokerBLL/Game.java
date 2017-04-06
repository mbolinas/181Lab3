package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	
	public Game(){
		GameID = UUID.randomUUID();
		TableID = UUID.randomUUID();
	}

	
	public UUID getGameID() {
		return GameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}
	
	public void AddPlayerToGame(Player p){
		GamePlayers.add(p);
	}
	
}
