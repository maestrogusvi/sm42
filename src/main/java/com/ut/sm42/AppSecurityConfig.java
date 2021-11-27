package com.ut.sm42;


import com.ut.sm42.config.CustomAuthenticationManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.security.interfaces.RSAPublicKey;

import static com.ut.sm42.constants.AuthenticationConstants.URL_CONFIG_PRIVATE_AUTHETICATION;
import java.security.interfaces.RSAPublicKey;

import static com.ut.sm42.constants.AuthenticationConstants.URL_CONFIG_PRIVATE_AUTHETICATION;

@EnableWebSecurity
@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${spring.security.oauth2.resourceserver.jwt.key-value}")
    RSAPublicKey publicKey;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable().formLogin(AbstractHttpConfigurer::disable).csrf(AbstractHttpConfigurer::disable)
                .cors().and()
                .authorizeRequests(authorize -> authorize.antMatchers(URL_CONFIG_PRIVATE_AUTHETICATION).authenticated()
                        .antMatchers("/voltux/login*").permitAll())
                .sessionManagement(
                        sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .oauth2ResourceServer().jwt().authenticationManager(customAuthenticationManager());
    }

    @Bean
    public CustomAuthenticationManager customAuthenticationManager() {
        return new CustomAuthenticationManager();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
