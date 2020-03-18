//package monitoring.application.configurations;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfig {
//
//	@Autowired
//	DataSource dataSource;
//
//	@Bean
//	public PersistentTokenRepository persistentTokenRepository() {
//		JdbcTokenRepositoryImpl db = new JdbcTokenRepositoryImpl();
//		db.setDataSource(dataSource);
//		return db;
//	}
//
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth, UserDetailsService userDetailsService,
//                                PasswordEncoder encoder) throws Exception {
//		auth.userDetailsService(userDetailsService).passwordEncoder(encoder);
//	}
//
//	@Configuration
//	@Order(1)
//	public static class RestWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
//
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http
//				.antMatcher("/api/**")
//					.authorizeRequests()
//					.anyRequest()
//						.permitAll()
//				.and()
//					.httpBasic()
//				.and()
//					.csrf()
//						.disable()
//					.logout()
//						.logoutUrl(RestUserController.ROOT_MAPPING + "/logout")
//						.logoutSuccessUrl(RestUserController.ROOT_MAPPING + "/logoutDummy")
//						.deleteCookies("JSESSIONID")
//						.invalidateHttpSession(true);
//		}
//	}
//
//	@Configuration
//	public static class WebWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//		@Autowired
//        PersistentTokenRepository persistentTokenRepository;
//
//		@Override
//		protected void configure(HttpSecurity http) throws Exception {
//			http
//				.formLogin()
//					.loginPage("/user/login")
//					.failureUrl("/user/login-error")
//					.defaultSuccessUrl("/", true)
//				.and()
//					.rememberMe()
//					.tokenRepository(persistentTokenRepository)
//				.and()
//					.csrf()
//						.disable()
//					.logout()
//						.logoutSuccessUrl("/")
//						.deleteCookies("JSESSIONID")
//						.invalidateHttpSession(true);
//		}
//	}
//
//}