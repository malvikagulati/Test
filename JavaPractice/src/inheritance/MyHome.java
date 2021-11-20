package inheritance;

import java.util.*;

public class MyHome implements Home {
    List<Room> rooms = new ArrayList<>();

    @Override
    public int getNumberOfLights() {
        int totalLights = 0;
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            totalLights = totalLights + room.getNoOfLights();
        }
        return totalLights;
    }

    @Override
    public void addRoom(Room room) {
        rooms.add(room);
    }


}
