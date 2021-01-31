package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = new User(login, true);
        for (User one : users) {
            String tow = one.getUsername();
            if (tow.equals(login)) {
                System.out.println(" User " + user.toString() + " found");
                return user;
            }
            throw new UserNotFoundException(" User " + login + " not found!");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
       String x = user.getUsername();
        boolean y = user.isValid();
        if ( x.length() < 3 ||  !y) {
            throw new UserInvalidException("User " + "x" +
                    " not valid or the name is less than 3 characters");
        }
    return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr", true)
        };
       try {
            User user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println("This " + user + " has an access");
            }
           // System.out.println(user);
        } catch (UserInvalidException ea) {
            System.out.println("User not validate!");
            ea.printStackTrace();
        } catch (UserNotFoundException e) {
            System.out.println("User not found!");
            e.printStackTrace();
        }
    }
}
