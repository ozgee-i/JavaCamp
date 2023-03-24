package kodlama.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	void add(Language language);

	void delete(int id);

	void update(Language language);

	Language getById(int id);

	List<Language> getAll();

}
