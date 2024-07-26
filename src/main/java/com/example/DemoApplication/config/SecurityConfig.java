//package com.example.DemoApplication.config;
//
//import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
//import org.keycloak.adapters.springsecurity.authentication.KeycloakAuthenticationProvider;
//import org.keycloak.adapters.springsecurity.client.KeycloakClientRequestFactory;
//import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.ObjectPostProcessor;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@KeycloakConfiguration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .requestMatchers("/api/global-configs/**").hasRole("user")
//                .anyRequest().authenticated()
//                .and()
//                .oauth2ResourceServer().jwt(); // Ensure JWT support for Keycloak
//        return http.build();
//    }
//
//    @Bean
//    public KeycloakRestTemplate keycloakRestTemplate(KeycloakClientRequestFactory keycloakClientRequestFactory) {
//        return new KeycloakRestTemplate(keycloakClientRequestFactory);
//    }
//
//    @Bean
//    public KeycloakAuthenticationProvider keycloakAuthenticationProvider() {
//        return new KeycloakAuthenticationProvider();
//    }
//
//    @Bean
//    public AuthenticationManagerBuilder authenticationManagerBuilder(KeycloakAuthenticationProvider keycloakAuthenticationProvider) {
//        AuthenticationManagerBuilder authenticationManagerBuilder = new AuthenticationManagerBuilder((ObjectPostProcessor<Object>) null);
//        authenticationManagerBuilder.authenticationProvider(keycloakAuthenticationProvider);
//        return authenticationManagerBuilder;
//    }
//}



package com.example.DemoApplication.config;


//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.security.oauth2.jwt.Jwt;
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//
//@RequiredArgsConstructor
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    public static final String ADMIN = "admin";
//    public static final String USER = "user";
//    private final Converter<Jwt, ? extends AbstractAuthenticationToken> jwtConverter;
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((authz) ->
//                authz.requestMatchers(HttpMethod.GET, "/api/hello").permitAll()
//                        .requestMatchers(HttpMethod.GET, "/api/admin/**").hasRole(ADMIN)
//                        .requestMatchers(HttpMethod.GET, "/api/user/**").hasRole(USER)
//                        .requestMatchers(HttpMethod.GET, "/api/admin-and-user/**").hasAnyRole(ADMIN, USER)
//                        .anyRequest().authenticated());
//
//        http.sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
//        http.oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtConverter)));
//
//        return http.build();
//    }
//}





import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.authentication.AbstractAuthenticationToken;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public static final String ADMIN = "admin";
    public static final String USER = "user";
    private final Converter<Jwt, ? extends AbstractAuthenticationToken> jwtConverter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((authz) ->
                authz.requestMatchers(HttpMethod.GET, "/api/hello").permitAll()
                        .requestMatchers(HttpMethod.GET, "/api/admin/**").hasRole(ADMIN)
                        .requestMatchers(HttpMethod.GET, "/api/user/**").hasRole(USER)
                        .requestMatchers(HttpMethod.GET, "/api/admin-and-user/**").hasAnyRole(ADMIN, USER)
                        .anyRequest().authenticated());

        http.sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtConverter)));

        return http.build();
    }

    @Bean
    public JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withJwkSetUri("http://localhost:8080/realms/realmA/protocol/openid-connect/certs").build();
    }
}














