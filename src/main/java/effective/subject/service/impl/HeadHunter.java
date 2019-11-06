package effective.subject.service.impl;

import effective.subject.service.Observer;
import effective.subject.service.Subject;

import java.util.LinkedList;

/**
 *
 * @author tuqi
 * @date 2018/9/28
 */
public class HeadHunter implements Subject {
    private LinkedList<Observer> userList;
    private LinkedList<String> jobs;

    public HeadHunter() {
        userList = new LinkedList<>();
        jobs = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : userList) {
            observer.update(this);
        }
    }

    public LinkedList<String> getJobs() {
        return jobs;
    }

    public void addJob(String job) {
        jobs.add(job);
        notifyAllObserver();
    }

    public void removeJob(String job) {
        jobs.remove(job);
    }
    @Override
    public String toString() {
        return jobs.toString();
    }
}
