package builderPattern2;

public class UserApp {
    public static void main(String[] args){
        User myUser = new User.UserBuilder()
                .firstName("Britney")
                .lastName("Beligan")
                .email("britney.beligan@neu.edu.ph")
                .address("NELD 2")
                .phone(021232)
                .age(21).build();

        System.out.println();
        System.out.println("Welcome to your Application Info!!!");
        System.out.println();
        System.out.println("Firstname: "+ myUser.firstName);
        System.out.println("Lastname: "+ myUser.lastName);
        System.out.println("Email: "+ myUser.email);
        System.out.println("Phone Contact: "+ myUser.phone);
        System.out.println("Age: "+ myUser.age);
    }
}
