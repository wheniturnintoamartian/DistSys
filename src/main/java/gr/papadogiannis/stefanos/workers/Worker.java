package gr.papadogiannis.stefanos.workers;

/**
 * @author Stefanos Papadogiannis
 * <p>
 * Created on 15/4/2017
 */
public interface Worker {

    void initialize();

    void waitForTasksThread();

}
