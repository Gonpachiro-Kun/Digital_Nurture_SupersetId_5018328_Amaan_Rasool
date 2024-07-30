public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();
        taskList.add(new Task(1, "Task One", "Pending"));
        taskList.add(new Task(2, "Task Two", "In Progress"));
        taskList.add(new Task(3, "Task Three", "Completed"));
        System.out.println("All Tasks:");
        taskList.traverse();
        Task task = taskList.search(3);
        if (task != null) {
            System.out.println("Found task: " + task);
        } else {
            System.out.println("Task not found.");
        }
        taskList.delete(1);
        System.out.println("Tasks after deletion:");
        taskList.traverse();
    }
}