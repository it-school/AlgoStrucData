package itschool;

import java.util.ArrayList;
import java.util.HashMap;

class Users {
    private ArrayList<User> list;
    //private HashMap<Integer, String> hash;

    public Users() {
        this.list = new ArrayList<>();
        //hash = new HashMap<>();
    }

    public boolean Add(User user) {
        for (final User aList : list) {
            if (aList.getLogin().equals(user.getLogin())) {
                //System.out.println("Login is used!");
                return false;
            }
        }

        list.add(user);

        //        System.out.println(hash.size() + " | " + user.getLogin());
        /*
        if (!hash.containsValue(user.getLogin()) )
        {
            hash.put(hash.size()+1, user.getLogin());
            list.add(user);
            result = true;
        }
        */

        return true;
    }

    @Override
    public String toString() {
        String result = "\nUsers:\n";
        for (User aList : list) {
            result += aList.toString() + "\n";
        }
        return result;
    }

    public int UsersQuantity() {
        return list.size();
    }

}
