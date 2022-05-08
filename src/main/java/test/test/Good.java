package test.test;

import static test.test.Utils.print;

public class Good {
    public void start() {
        for (int i = 1; i <= 10; i++) {
            print(i);

            if (i == 5) {
                print(i + 1);
            }
        }
    }
}
