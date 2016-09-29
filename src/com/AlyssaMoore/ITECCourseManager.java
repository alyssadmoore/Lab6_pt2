package com.AlyssaMoore;

public class ITECCourseManager {

    public static void main(String[] args) {

        ITECCourse infotech = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
        infotech.addStudent("Max");
        infotech.addStudent("Nancy");
        infotech.addStudent("Orson");
        infotech.writeCourseInfo();

    }
}