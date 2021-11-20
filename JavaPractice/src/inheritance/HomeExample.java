package inheritance;

public class HomeExample {
    public static void main(String[] args) {
        Home myHome = new MyHome();
        Room livingRoom = new Room("LivingRoom");
        Room kidsRoom = new Room("Kids Room");

        livingRoom.setNoOfLights(4);
        kidsRoom.setNoOfLights(2);
        myHome.addRoom(livingRoom);
        myHome.addRoom(kidsRoom);

        System.out.println("Total NoOfLights in my Home are: "+myHome.getNumberOfLights());
    }
}
