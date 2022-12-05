package main;

import user.User;

public class Main {
    public static void main(String[] args) {
        User Nikita = new User("Developer");
        User Aleksandr = new User("Admin");
        Nikita.TestAccess();//доступ к файлу запрещён => данные из файла не читаются
        Aleksandr.TestAccess();//доступ к файлу разрешён => данные можно прочитать
    }

}
