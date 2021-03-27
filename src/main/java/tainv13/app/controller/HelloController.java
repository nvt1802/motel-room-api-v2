package tainv13.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tainv13.app.repository.AccountRepository;

@CrossOrigin
@RequestMapping("/")
@RestController
public class HelloController {
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping
	public ResponseEntity<?> findAccountByUserName() {
		return ResponseEntity.ok(accountRepository.findAll());
	}
}
