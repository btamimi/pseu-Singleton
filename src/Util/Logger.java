
/*
 *
 *  Copyright (C) 2019.  PSEU - Palestine Polytechnic University - All Rights Reserved
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

/*
 * Created by Basel.Altamimi on 8/4/2019.
 */

package Util;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Logger {

    public static void log(String s) {
        try {
            FileWriter fw = new FileWriter("log_file.txt", true);
            fw.write("New Log (" + getCurrentTime() + "): " + s + '\n');
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done...\n");
    }

    private static String getCurrentTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(cal.getTime());
    }
}
