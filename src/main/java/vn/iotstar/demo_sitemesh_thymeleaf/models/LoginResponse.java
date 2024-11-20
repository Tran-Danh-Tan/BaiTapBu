package vn.iotstar.demo_sitemesh_thymeleaf.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor
@Data
public class LoginResponse {
	private String token;
	private long expiresIn;
	public String getToken() {
	return token;
	}
}
