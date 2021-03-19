package ru.job4j.stream;

public class User {
    private String name;
    private String lastName;
    private byte age;
    private String login;
    private String password;
    private boolean activated;

    @Override
    public String toString() {
        return "BuilderUser{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", activated=" + activated +
                '}';
    }

   public static class BuilderUser {
        private String name;
        private String lastName;
        private byte age;
        private String login;
        private String password;
        private boolean activated;

        BuilderUser builderName(String name) {
            this.name = name;
            return this;
        }

        BuilderUser builderLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        BuilderUser builderAge(byte age) {
            this.age = age;
            return this;
        }

        BuilderUser builderLogin(String login) {
            this.login = login;
            return this;
        }

        BuilderUser builderPassword(String password) {
            this.password = password;
            return this;
        }

        BuilderUser builderActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

       public User build() {
            User user = new User();
            user.name = name;
            user.lastName = lastName;
            user.age = age;
            user.login = login;
            user.password = password;
            user.activated = activated;
            return user;
        }

    }

    public static void main(String[] args) {
        User user = new BuilderUser().builderName("Jok")
                .builderLastName("Golr")
                .builderAge((byte) 8).build();
        System.out.println(user);

    }
}
