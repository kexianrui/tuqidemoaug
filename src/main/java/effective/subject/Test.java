package effective.subject;

import effective.subject.service.impl.HeadHunter;
import effective.subject.service.impl.JobSeeker;

/**
 *
 * @author tuqi
 * @date 2018/9/28
 */
public class Test {

    public static void main(String[] args) {
        HeadHunter hh = new HeadHunter();
        JobSeeker lbd = new JobSeeker("lbd");
        JobSeeker lbx = new JobSeeker("lbx");
        JobSeeker lbn = new JobSeeker("lbn");
        JobSeeker lbb = new JobSeeker("lbb");

        hh.registerObserver(lbd);
        hh.registerObserver(lbx);
        hh.registerObserver(lbn);
        hh.registerObserver(lbb);
        hh.addJob("looking for C++ engineers");

        hh.removeObserver(lbb);
        hh.removeJob("looking for C++ engineers");

        hh.addJob("looking for Java engineers");
        hh.addJob("looking for Python engineers");
    }
}
