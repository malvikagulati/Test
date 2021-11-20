package inheritance;

public class Room {
    private int noOfLights;
    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public int getNoOfLights() {
        return noOfLights;
    }

    public void setNoOfLights(int noOfLights) {
        this.noOfLights = noOfLights;
    }
}
