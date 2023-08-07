package edu.kosa.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        auth
                .inMemoryAuthentication()
                .withUser("user").password("{noop}user").roles("USER")
                .and()
                .withUser("admin").password("{noop}admin").roles("ADMIN", "USER");
                /*.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(encoder())
                .usersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username = ?")
                .authoritiesByUsernameQuery("SELECT u.username, a.authority FROM authorities a, users u WHERE u.username = ? AND u.authorityId = a.id");*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()    // 요청에 권한 설정을 적용
                .anyRequest().authenticated()   // 모든 요청에 대해 인증된(로그인된) 사용자만 접근할 수 있도록 설정
                .and()

                // 모든 사용자가 폼 로그인 페이지에 접근할 수 있도록 허용
                .formLogin()
//                .loginPage("/")
                .permitAll()
                .and()

                //모든 사용자가 로그아웃 기능을 사용할 수 있도록 허용
                .logout()
//                .logoutSuccessUrl("/")
                .permitAll();
    }

    /*@Bean
    public BCryptPasswordEncoder encoder() {

        return new BCryptPasswordEncoder();
    }*/
}
