package lt.vtmc.praktiniai.users;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {

        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) {
                count++;
            }
        }
        return count;

    }

    public static double getAverageAge(List<User> users) {

        int totalAge = 0;
        int count = 0;

        for (User user : users) {
            totalAge += user.getAge();
            count++;
        }

        return count > 0 ? (double) totalAge / count : 0.0;
    }

    public Praktiniai() {
    }


    // TODO: Naudokite klase Collections.min(). Paduokite Comparator

    public static Integer getMinAge(List<User> users) {
        return Collections.min(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        }).getAge();
    }


    public static User findByName(List<User> users, String name) {
//        if (users == null || name == null) return null;
        for (User user : users) {
            if (name.equals(user.getName())) return user;
        }
        return null;
    }


    // TODO: Naudokite klase Collections.sort(). Paduokite Comparator
    public static List<User> sortByAge(List<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return users;
    }

    // TODO: Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {
        return Collections.max(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }


    public static int sumAge(List<User> users) {

        int totalAge = 0;
        for (User user : users) {
            totalAge += user.getAge();
        }
        return totalAge;
    }

}



