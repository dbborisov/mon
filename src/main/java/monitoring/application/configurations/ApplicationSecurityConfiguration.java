package monitoring.application.configurations;//package quiz.demo.configurations;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.csrf.CsrfTokenRepository;
//import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
//
////@Configuration
////@EnableWebSecurity/
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class ApplicationSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf()
//                .csrfTokenRepository(csrfTokenRepository())
//                .and()
//                .authorizeRequests()
//                .antMatchers("/js/**", "/css/**","/img/**").permitAll()
//                .antMatchers("/", "/register", "/login").anonymous()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/home")
//                .and()
//                .logout()
//                .logoutSuccessUrl("/");
//        http
//                .csrf()
//                .csrfTokenRepository(csrfTokenRepository())
//                .and()
//                .authorizeRequests()
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/", "/login", "/register","/about","/account_reset","*/css/**","/img/**","/js/**").anonymous()
//                .antMatchers("/admin/**").hasAuthority("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/home")
//                .and()
//                .logout();
//
//    }
//
//
//
//    private CsrfTokenRepository csrfTokenRepository() {
//        HttpSessionCsrfTokenRepository repository =
//                new HttpSessionCsrfTokenRepository();
//        repository.setSessionAttributeName("_csrf");
//        return repository;
//    }
//}