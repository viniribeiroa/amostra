package com.stormdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stormdev.dto.UserDTO;
import com.stormdev.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<UserDTO> listarTodos(){
		return userService.listarTodos();
		
	}
	
	@PostMapping
	public void inserir(@RequestBody UserDTO userDTO) {
		userService.inserir(userDTO);
	}
	
	@PutMapping
	public UserDTO alterar(@RequestBody UserDTO userDTO ) {
		return userService.alterar(userDTO);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		userService.excluir(id);
		return ResponseEntity.ok().build();
		
	}
	

}
