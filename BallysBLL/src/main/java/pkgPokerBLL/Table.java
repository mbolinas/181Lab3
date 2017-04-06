package pkgPokerBLL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	//	Change this from ArrayList to HashMap.
	private HashMap<UUID, Player> TablePlayers = new HashMap<UUID, Player>();
	
	public Table() {
		super();
		TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		TablePlayers.put(p.getPlayerID(), p);
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		TablePlayers.remove(p.getPlayerID());
		return this;
	}

	public HashMap<UUID, Player> getTablePlayers() {
		return TablePlayers;
	}

	public void setTablePlayers(HashMap<UUID, Player> tablePlayers) {
		TablePlayers = tablePlayers;
	}

	public UUID getTableID() {
		return TableID;
	}
	
	
}
