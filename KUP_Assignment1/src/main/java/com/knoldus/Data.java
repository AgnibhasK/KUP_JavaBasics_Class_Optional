package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Data {

	static Student firstStudent =
			new Student("Agnibhas", 1, Optional.ofNullable(null)); //Student with no subject
	static    Student secondStudent =
			new Student("Agni", 2, Optional.ofNullable(Arrays.asList("Spanish", "English", "Maths")));



	public static List<Student> StudentList()
	{

		List<Student> students=new ArrayList<Student>();
		students.add(firstStudent);
		students.add(secondStudent);


		return students;
	}


	public static List<ClassRoom> ClassList()

	{

		ClassRoom noSubjects = new ClassRoom("abc", Optional.ofNullable(Arrays.asList(firstStudent)));
		ClassRoom uniqueId = new ClassRoom("xyz", Optional.ofNullable(Arrays.asList(secondStudent)));
		ClassRoom noStudents = new ClassRoom("def", Optional.ofNullable(null));



		List<ClassRoom> rooms = new ArrayList<ClassRoom>();
		rooms.add(noSubjects);
		rooms.add(uniqueId);
		rooms.add(noStudents);

		return rooms;
	}
}


