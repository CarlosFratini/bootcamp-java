public class CommandLineInput
{
    public static void main(String[] args) {
        String name = args[0];
        String surName = args[1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + name + " " + surName);
        System.out.println("Tenho " + age + " anos");
        System.out.println("Minha altura é " + height + "m.");
    }
}
