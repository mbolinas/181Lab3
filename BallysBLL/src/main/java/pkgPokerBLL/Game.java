package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers;
	
	public Game(){
		
	}

	
	public UUID getGameID() {
		return GameID;
	}

	public void setGameID(UUID gameID) {
		GameID = gameID;
	}

	public UUID getTableID() {
		return TableID;
	}

	public void setTableID(UUID tableID) {
		TableID = tableID;
	}

	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	
	public void AddPlayerToTable(){
		
	}
	
	public void RemovePlayerFromTable(){
		
	}
	
}
