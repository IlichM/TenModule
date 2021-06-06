package ProgrammBossWorker;
import java.util.Queue;
import java.util.Deque;

public class Boss {
    private Deque toDoDeque;
    public Boss(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }

    public void giveTask(String task) {
        toDoDeque.add(task);
        System.out.println("Дал задачу: " + task );
    }
}
