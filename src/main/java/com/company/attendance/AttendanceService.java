package com.company.attendance;

import java.io.FileWriter;
import java.time.LocalDateTime;

public class AttendanceService {

    public static void markAttendance(String name, String action) {
        try (FileWriter fw = new FileWriter("attendance.txt", true)) {
            fw.write(name + " | " + action + " | " + LocalDateTime.now() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
