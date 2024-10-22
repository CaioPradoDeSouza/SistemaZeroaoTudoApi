package br.com.caio.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.caio.projeto.dto.AcessDTO;
import br.com.caio.projeto.dto.AuthenticationDTO;
import br.com.caio.projeto.security.jwt.JwtUtils;

@Service
public class AuthService {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtils jwtUtils;
	
	public AcessDTO login(AuthenticationDTO authDTO) {
		
		try {
		
		UsernamePasswordAuthenticationToken userAuth = 
				new UsernamePasswordAuthenticationToken(authDTO.getUsername(), authDTO.getPassword());
		
		Authentication authentication = authenticationManager.authenticate(userAuth);
		
		UserDetailsImpl userAuthenticate = (UserDetailsImpl).authentication.getPrincipal();
		
		String token = jwtUtils.generateTokenFromUserDetailsImpl(userAuthenticate);
		
		AcessDTO acessDto = new AcessDTO(token);
		
		return acessDto;
		
		}catch(BadCredentialsException e){
			//todo Login ou Senha inválido
		}
		return null;
		
	}
	
}
