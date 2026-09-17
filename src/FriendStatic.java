public class FriendStatic {

    static int numOfFriends;
    String name;

    FriendStatic(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friend.");
    }
}
