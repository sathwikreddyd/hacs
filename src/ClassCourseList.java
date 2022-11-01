package hacs;

import java.util.ArrayList;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 */

public class ClassCourseList extends ArrayList<Course> {

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	void InitializeFromFile() {
		try {
			BufferedReader file;
			String strCourseName;
			file = new BufferedReader(new FileReader("CourseInfo.txt"));

			strCourseName = file.readLine();
			while (strCourseName != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, 0);
				add(theCourse);
				strCourseName = file.readLine();
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	Course FindCourseByCourseName(String CourseName) {
		for (Course course : this) {
			Course theCourse;
			theCourse = course;
			if (theCourse.CourseName.compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}

}