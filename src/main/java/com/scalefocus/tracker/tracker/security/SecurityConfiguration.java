package com.scalefocus.tracker.tracker.security;

import com.scalefocus.tracker.tracker.constants.HomeConstant;
import com.scalefocus.tracker.tracker.constants.LoginConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HomeConstant.INDEX_URL, HomeConstant.HOME_URL).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage(LoginConstant.LOGIN_URL)
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers(HomeConstant.INDEX_URL, HomeConstant.HOME_URL).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage(LoginConstant.LOGIN_URL)
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }




//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//
//        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
       // daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
//
//        return  daoAuthenticationProvider;
//    }


    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        List<UserDetails> userDetails = new ArrayList<>();

        userDetails.add(User.withDefaultPasswordEncoder().username("user").password("1234").roles("USER").build());
        userDetails.add(User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN").build());

//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();

        return new InMemoryUserDetailsManager(userDetails);
}

}
