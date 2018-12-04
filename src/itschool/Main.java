package itschool;

import java.io.File;
import java.io.IOException;
import java.util.Random;

class Main {

    public static String alphabet = "";

    public static void main(String[] args) {

        final int STRLEN = 2;
        for (int i = 33; i <= 126; i++)
        {
            alphabet += (char) (i);
        }
        //System.out.println(alphabet);

        Users users = new Users();

        long time = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            users.Add(new User(generateString(STRLEN), generateString(STRLEN), generateString(STRLEN)));
        }
        System.out.println("Time: " + (System.currentTimeMillis() - time));
        //System.out.println(users);

        System.out.println("Users in list: " + users.UsersQuantity());

        String pathname;
        final File folder = new File("..");

        listFilesForFolder(folder);


        /*
        for(String s : users.hash.values())
            System.out.print(s);
*/
        /*ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");

        for (String s : map.values())
        {
            System.out.println(s);
        }

	*/
        File file = new File("A:\\new.txt");
        try {
            if (file.createNewFile())
                System.out.println("File is created");;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String generateString(int length) {
        String result = "";
        Random r = new Random();

        for (int i = 0; i < length; i++) {
            result += alphabet.charAt(r.nextInt(alphabet.length()));
        }

        return result;
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory())
            {
                listFilesForFolder(fileEntry);
            }
            else
            {
                if (fileEntry.getName().endsWith(".txt"))
                    System.out.println(fileEntry.getName());
            }
        }
    }




}
