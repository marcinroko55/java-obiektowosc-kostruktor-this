public class TaskApp {
    public static void main(String[] args) {
        char[] title1 = {'u', 'm', 'y', 'j'};
        char[] desc1 = {'p', 'o', 'd', 'ł', 'o', 'g', 'ę', ' ', 'w', ' ', 'k', 'u', 'c', 'h', 'n', 'i'};
        Task t1 = new Task(title1, desc1, false);

        char[] title2 = {'p', 'r', 'z', 'e', 'c', 'z', 'y', 't', 'a', 'j'};
        char[] desc2 = {'k', 'o', 'm', 'p', 'e', 'n', 'd', 'i', 'u', 'm', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'i', 's', 't', 'y'};
        Task t2 = new Task(title2, desc2, false);

        char[] title3 = {'o', 'b', 'i', 'e', 'r', 'z'};
        char[] desc3 = {'z', 'i', 'e', 'm', 'n', 'i', 'a', 'k', 'i'};
        Task t3 = new Task(title3, desc3, true);

        char[] desc4 = {'m', 'a', 'r', 'c', 'h', 'e', 'w', 'k', 'ę'};
        Task t4 = new Task(title3, desc4, false);
        Task[] tasks = new Task[34];
        tasks[0] = t1;
        tasks[1] = t2;
        tasks[2] = t3;
        tasks[3] = t4;

        for (Task task : tasks) {
            System.out.print("Title: ");
            for (char c : task.title) {
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Description: ");
            for (char c : task.desc) {
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Status: " + (task.done ? "Zadanie wykonane" : "Zadanie niewykonane"));
        }

    }
}


