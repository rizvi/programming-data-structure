package nmn.geeks.driver;

import nmn.geeks.stack.StackCustom;

import static nmn.geeks.driver.Print.*;

/**
 * Created by naman.nigam on 09/02/16.
 */
class DriveStack {

    static void LevelOne() {

        StackCustom stackCustom = new StackCustom();
        stackCustom.push(23);
        stackCustom.push(12);
        stackCustom.push(3);
        stackCustom.push(6);
        stackCustom.push(7);
        stackCustom.push(3);
        stackCustom.push(2);

        nextProblem();

    }
}