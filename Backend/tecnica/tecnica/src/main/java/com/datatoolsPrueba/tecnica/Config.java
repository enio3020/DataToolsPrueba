package com.datatoolsPrueba.tecnica;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter {
	
	/*Configuracion de Seguridad---------------------------------------------------*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("datatools").password("{noop}DataT00L5*%").roles("ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.headers().frameOptions().disable()
		.and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET, "/").permitAll()
		.antMatchers(HttpMethod.POST, "/").permitAll()
		.antMatchers(HttpMethod.PUT, "/").permitAll()
		.antMatchers(HttpMethod.DELETE, "/**").permitAll()
		.antMatchers(HttpMethod.OPTIONS, "*").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.cors()
		.configurationSource(corsConfigurationSource())
		.and()
		.httpBasic()
		.and()
		.csrf()
		.disable();
	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
	    CorsConfiguration configuration = new CorsConfiguration();
	    configuration.setAllowedOriginPatterns(Arrays.asList("*")); // <-- you may change "*"
	    configuration.setAllowedMethods(Arrays.asList("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH"));
	    configuration.setAllowCredentials(true);
	    configuration.setAllowedHeaders(Arrays.asList(
	            "Accept", "Origin", "Content-Type", "Depth", "User-Agent", "If-Modified-Since,",
	            "Cache-Control", "Authorization", "X-Req", "X-File-Size", "X-Requested-With", "X-File-Name"));
	    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    source.registerCorsConfiguration("/**", configuration);
	    return source;
	}
	
	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilterRegistrationBean() {
	    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(corsConfigurationSource()));
	    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	    return bean;
	}
}
