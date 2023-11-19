package jobcompass.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import jobcompass.service.UserService;

/*
@Configuration
@EnableWebSecurity
public class WebSecurityConfig implements SecurityConfigurer<DefaultSecurityFilterChain, HttpSecurity> {

    @Autowired
    private UserService userService;

    @Override

    public void init(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/edit/*").hasAnyRole("USER", "ADMIN")
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .defaultSuccessUrl("/")
                .permitAll()
                .and()
                .logout().logoutSuccessUrl("/").permitAll();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {}

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {}

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserService();
    }

}
*/