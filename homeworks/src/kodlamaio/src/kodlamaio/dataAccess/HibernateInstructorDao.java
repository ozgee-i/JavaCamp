package kodlamaio.dataAccess;

import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eğitmen veri tabanına ekleme işlemi yapıldı.");

	}

}
