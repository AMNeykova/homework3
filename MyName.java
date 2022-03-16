public class MyName {
    public static void main (String [] args) {

        String myFirstName = "Albena";
        String myFamily = "Neykova";
        byte myAge = 52;
        String myFriendName = "Alexandar";
        String myFriendFamily = "Lubomirov";
        byte myFriendAge = 49;

        System.out.println(myFirstName);
        System.out.println(myFirstName.equals(myFriendName));
        System.out.println(myFirstName.equalsIgnoreCase(myFriendName));
        System.out.println(myFirstName.compareTo(myFriendName));
        System.out.println(myFirstName+""+myFamily);
        System.out.println(myAge);
        System.out.println(myFirstName+" "+myFamily+" "+myAge);
        System.out.println(myFriendName+" "+myFriendFamily+" "+myFriendAge);



    }

}
