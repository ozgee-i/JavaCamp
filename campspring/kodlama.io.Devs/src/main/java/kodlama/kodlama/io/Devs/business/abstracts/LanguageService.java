package kodlama.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();

	void add(Language language) throws Exception;

	void update(Language language) throws Exception;

	void delete(int id);

	Language getById(int id);
}
