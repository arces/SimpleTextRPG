package textRPG;

public class Room {
	private String description;
	private Boolean isBossRoom;
	
	//Compiles a new room
	private Room(String description, Boolean isBossRoom){
		this.description = description;
		this.isBossRoom = isBossRoom;
	}
	//makes a new Normal Room
	public static Room newRoom(){
		return new Room("A big brick walled room", false);
	}
	//makes a new Boss Room
	public static Room newBossRoom(){
		return new Room("A huge cavern room with a horrible smell",true);
	}
}
