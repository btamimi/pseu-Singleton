
/*
 *
 *  Copyright (C) 2019.  PSEU - Palestine Polytechnic University - All Rights Reserved
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

/*
 * Created by Basel.Altamimi on 8/4/2019.
 */

import Forms.MainForm;

import java.io.File;

public class main {
    public static void main(String[] arguments) {

        // Delete log file on project start
        File file = new File("log_file.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully");
        }

        // Create main form
        new MainForm();
    }

}
