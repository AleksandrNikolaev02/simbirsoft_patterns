package implem;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import inter.ObjectAccess;

public class SomeObjectAccess implements ObjectAccess{
    private final String ROLE = "Admin";

    @Override
    public String access(String UserRole) {
        ArrayList<String> list = new ArrayList<>();
        if(UserRole == ROLE) {
            System.out.println("Доступ к файлу предоставлен!");
            try {
                Scanner scanner = new Scanner(new FileReader(new File("file/file.txt")));
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    list.add(line);
                }
            } catch (IOException e) {
                System.err.println("Error:  " + e);
            }
        }
        else {
            System.out.println("Доступ к файлу запрещён!");
        }
        return list.toString();
    }
    
}
