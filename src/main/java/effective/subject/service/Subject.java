package effective.subject.service;

/**
 * Created by tuqi on 2018/9/28.
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 提醒所有观察者
     */
    void notifyAllObserver();
}
