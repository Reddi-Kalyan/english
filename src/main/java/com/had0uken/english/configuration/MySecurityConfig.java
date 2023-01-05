package com.had0uken.english.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

import javax.sql.DataSource;


@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("ADMIN","USER")
                .antMatchers("/testStart").hasAnyRole("ADMIN","USER")
                .antMatchers("/addNewQuestions").hasRole("ADMIN")
                .antMatchers("/admin**").hasRole("ADMIN")
                .antMatchers("/listOfUsers").hasRole("ADMIN")
                .and().formLogin().permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       /* UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("user").password("user").roles("USER"))
                .withUser(userBuilder.username("admin").password("admin").roles("ADMIN"));*/

        auth.jdbcAuthentication().dataSource(dataSource);

    }
}
