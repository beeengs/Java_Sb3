public class staticJava {
    public static void main(String[] args) {

        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared responses.

        FriendStatic friendStatic1 = new FriendStatic("Spongebob");
        FriendStatic friendStatic2 = new FriendStatic("Patrick");
        FriendStatic friendStatic3 = new FriendStatic("Squidward");
        FriendStatic friendStatic4 = new FriendStatic("Sandy");
        FriendStatic friendStatic5 = new FriendStatic("Gary");

        System.out.println(FriendStatic.numOfFriends);

        FriendStatic.showFriends();

        System.out.println();

        Math.round(3.99);

    }
}
