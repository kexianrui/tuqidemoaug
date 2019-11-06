package effective.subject.service.impl;

import effective.subject.service.Observer;
import effective.subject.service.Subject;

/**
 *
 * @author tuqi
 * @date 2018/9/28
 */
public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(this.name + " got notified!");
        System.out.println(subject);
    }
}
