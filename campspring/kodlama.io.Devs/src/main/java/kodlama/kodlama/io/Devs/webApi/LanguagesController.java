package kodlama.kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody Language Language) throws Exception {
		languageService.add(Language);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		languageService.delete(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody Language Language) throws Exception {
		languageService.update(Language);
	}

	@GetMapping("/{id}")
	public Language getById(@PathVariable int id) {
		return languageService.getById(id);
	}

}
