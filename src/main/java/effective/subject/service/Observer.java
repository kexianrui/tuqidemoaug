package effective.subject.service;

/**
 * @author tuqi
 * @date 2018/9/28
 */
public interface Observer {
    /**
     * 收到提醒作出动作
     *
     * @param subject
     */
    void update(Subject subject);
}
