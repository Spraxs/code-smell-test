package test.test;

import static test.test.Utils.print;

public class Bad {

    private int num = 0;

    public void start() {
        count();
        count();
        count();
        count();
        count();
        count();
        count();
        count();
        count();
        count();
    }

    private void count() {
        if (num == 0) {
            print(num);
            num++;
        } else if (num == 1) {
            print(num);
            num++;
        } else if (num == 2) {
            print(num);
            num++;
        } else if (num == 3) {
            print(num);
            num++;
        } else if (num == 4) {
            print(num);
            num++;
        } else if (num == 5) {
            print(num);
            num++;
            print(num);
        } else if (num == 6) {
            print(num);
            num++;
        } else if (num == 7) {
            print(num);
            num++;
        } else if (num == 8) {
            print(num);
            num++;
        } else if (num == 9) {
            print(num);
            num++;
        }
    }
}
