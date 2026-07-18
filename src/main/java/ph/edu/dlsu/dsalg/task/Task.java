package ph.edu.dlsu.dsalg.task;

import java.time.Duration;

/**
 * A task in a workflow.
 *
 * @param name the task name
 * @param type the task execution type
 * @param duration the task duration
 */
public record Task(String name, Type type, Duration duration) {

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