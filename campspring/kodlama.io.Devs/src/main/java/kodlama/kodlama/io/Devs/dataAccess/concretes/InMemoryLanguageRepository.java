package kodlama.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "JavaScript"));

	}

	@Override
	public void add(Language language) {
		languages.add(language);

	}

	@Override
	public void delete(int id) {
		Language language = getById(id);
		languages.remove(language);

	}

	@Override
	public void update(Language language) {
		for (Language language_ : languages) {
			if (language_.getId() == language.getId()) {
				language_.setName(language.getName());
			}
		}

	}

	@Override
	public Language getById(int id) {
		for (Language language_ : languages) {
			if (language_.getId() == id) {
				return language_;
			}
		}
		return null;
	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

}
