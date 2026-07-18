package ph.edu.dlsu.dsalg.task;

/**
 * A task in a workflow.
 *
 * @param name the task name
 * @param type the task execution type
 * @param duration the task duration, in minutes
 */
public record Task(String name, Type type, double duration) {

    /**
     * The execution behavior of a task.
     */
    public enum Type {

        /**
         * Occupies a worker while executing.
         */
        ACTIVE,

        /**
         * Executes without occupying a worker.
         */
        PASSIVE
    }
}