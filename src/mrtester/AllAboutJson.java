/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrtester;

import java.util.ArrayList;
import model.Student;

/**
 *
 * @author komyo
 */
public class AllAboutJson extends BaseFunction {

    public static void main(String[] args) {
        try {
            Student stu = new Student();
            stu.setId(1);
            stu.setName("stuname");
            stu.setGrade("secondary");
            String jsonStu = gson.toJson(stu);
            System.out.println(jsonStu);

            Student stuFromJson = gson.fromJson(jsonStu, Student.class);
            System.out.println(stuFromJson.getId());
            System.out.println(stuFromJson.getName());
            System.out.println(stuFromJson.getGrade());

            ArrayList<Student> stuList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                Student s = new Student();
                s.setId(i + 1);
                s.setName("stuname" + i + 1);
                s.setGrade("grade" + i + 1);
                stuList.add(s);
            }
            String jsonStuList = convertToJsonArray("jsonStudentList", gson.toJson(stuList));
            System.out.println(jsonStuList);
//                        AccountDataModel model = gson.fromJson(jsonFromStr(account_List), AccountDataModel.class);

            StudentDataModel stuList1 = gson.fromJson(jsonFromStr(jsonStuList), StudentDataModel.class);
            System.out.println(stuList1.jsonStudentList.size());
            for (Student s : stuList1.jsonStudentList) {
                System.out.println(s.getId());
                System.out.println(s.getName());
                System.out.println(s.getGrade());
            }
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }

    }

    public class StudentDataModel {

        ArrayList<Student> jsonStudentList = new ArrayList<>();
    }
}
