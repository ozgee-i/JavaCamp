package kodlama.kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}

		for (Language language_ : languageRepository.getAll()) {
			if (language_.getName().toLowerCase().equals(language.getName().toLowerCase())) {
				throw new Exception("Programlama dili mevcuttur");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public void update(Language language) throws Exception {
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş geçilemez!");
		}

		for (Language language_ : languageRepository.getAll()) {
			if (language_.getName().toLowerCase().equals(language.getName().toLowerCase())) {
				throw new Exception("Programlama dili mevcuttur");
			}
		}
		languageRepository.update(language);

	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);

	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

}
