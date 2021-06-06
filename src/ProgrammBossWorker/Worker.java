package ProgrammBossWorker;
import java.util.Deque;
import java.util.Queue;

public class Worker {
    private Deque toDoDeque;
    public Worker(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }
    public void takeTask() {
        Object task = toDoDeque.pollLast();
        if(task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Задач больше нет, можно идти домой.");
        }
    }

}
