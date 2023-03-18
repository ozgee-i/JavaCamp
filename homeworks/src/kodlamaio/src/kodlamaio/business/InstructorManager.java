package kodlamaio.business;

import java.util.List;

import kodlamaio.core.logging.Logger;

import kodlamaio.dataAccess.InstructorDao;

public class InstructorManager {
	private InstructorDao ınstrustordao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao ınstrustordao, Logger[] loggers) {
		this.ınstrustordao = ınstrustordao;
		this.loggers = loggers;

	}
}
