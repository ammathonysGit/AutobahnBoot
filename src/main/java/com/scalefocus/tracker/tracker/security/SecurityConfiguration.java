package com.scalefocus.tracker.tracker.security;

import com.scalefocus.tracker.tracker.constants.CarConstants;
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
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    private UserDetailsService userDetailsService;

    @Autowired
    public SecurityConfiguration(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return true;
            }
        });

        return daoAuthenticationProvider;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests().antMatchers(CarConstants.CAR_VIEW_CARS).authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .and()
                .logout().invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl(HomeConstant.INDEX_URL);
    }




//         .authorizeRequests().antMatchers(LoginConstant.LOGIN_URL).permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login").permitAll()
//                .and()
//                .logout().invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//            .logoutSuccessUrl(HomeConstant.INDEX_URL);

//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        List<UserDetails> userDetails = new ArrayList<>();
//
//        userDetails.add(User.withDefaultPasswordEncoder().username("user").password("1234").roles("USER").build());
//        userDetails.add(User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN").build());
//
////        UserDetails user =
////                User.withDefaultPasswordEncoder()
////                        .username("user")
////                        .password("password")
////                        .roles("USER")
////                        .build();
//
//        return new InMemoryUserDetailsManager(userDetails);
//}

}
