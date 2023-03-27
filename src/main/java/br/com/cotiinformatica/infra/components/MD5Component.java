package br.com.cotiinformatica.infra.components;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component
public class MD5Component {
	
	//Método de criptografar Senha
		public String encrypt(String value) {
			MessageDigest md;
			try {
				md = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
			}
			BigInteger hash = new BigInteger(1, md.digest(value.getBytes()));
			return hash.toString(16);
		}
	
}
