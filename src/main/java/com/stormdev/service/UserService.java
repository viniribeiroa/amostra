package com.stormdev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stormdev.dto.UserDTO;
import com.stormdev.entity.UserEntity;
import com.stormdev.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//listar todos
	public List<UserDTO> listarTodos(){
		List<UserEntity> usuarios = userRepository.findAll();
		return usuarios.stream().map(UserDTO::new).toList();
	}
	
	//iserir dados
	public void inserir(UserDTO usuario) {
		UserEntity userEntity = new UserEntity(usuario);
		userRepository.save(userEntity);
	}
	
	//alterar dados
	public UserDTO alterar(UserDTO usuario) {
		UserEntity userEntity = new UserEntity(usuario);
		return new UserDTO(userRepository.save(userEntity));
	}
	
	//excluir dados
	public void excluir(Long id) {
		UserEntity userEtity = userRepository.findById(id).get();
		userRepository.delete(userEtity);
	}
	
	//buscar dados por id
	public UserDTO buscarPorId(Long id) {
		return new UserDTO(userRepository.findById(id).get());
	}

}
