package ru.job4j.ex;

/* public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = new User(login, true);
        for (User one : users) {
            String tow = one.getUsername();
            if (tow == login) {
                System.out.println(" User " + user.toString() + " found");
                return user;
            } else {
                throw new UserNotFoundException(" User " + login + " not found!");
            }


        }return user;
    }

     //  public static boolean validate(User user) throws UserInvalidException {
       // return false;
    //}

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User( "Petr Arsentev", true)
        };
try {
    User user = findUser(users, "Petr Arsentev");

   User user1 = findUser(users, "Nort America");
   System.out.println(user);
     System.out.println(user1);
} catch (UserNotFoundException e) {
     e.printStackTrace();
}
            //   if (validate(user)) {
            //     System.out.println("This user has an access");


    }
} */
