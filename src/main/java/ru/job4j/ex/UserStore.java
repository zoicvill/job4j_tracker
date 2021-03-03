package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                user = value;
            }
            if (user == null) {
                throw new UserNotFoundException("User not found");
            }
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() <= 3){
            throw new UserInvalidException("User Invalid Exception");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Pej", true)
            };
            User user = findUser(users, "Pej");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        }
        catch (UserInvalidException eh){
            eh.printStackTrace();
        }
        catch (UserNotFoundException e){
            e.printStackTrace();
        }
    }
}
