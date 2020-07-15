package com.fy.springmiraclenacosadmin;

import com.alibaba.nacos.common.utils.HttpMethod;
import de.codecentric.boot.admin.server.config.AdminServerProperties;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SpringBootApplication
@EnableAdminServer // 作为AdminServer启动
@EnableDiscoveryClient // 开启服务发现
public class SpringMiracleNacosAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMiracleNacosAdminApplication.class, args);
    }


    @Profile("gds")
    @Configuration()
    public static class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {

        private final String adminContextPath;

        public SecurityPermitAllConfig(AdminServerProperties adminServerProperties) {
            this.adminContextPath = adminServerProperties.getContextPath();
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests().anyRequest().permitAll().and().csrf()
                    .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).ignoringRequestMatchers(
                    new AntPathRequestMatcher(this.adminContextPath + "/instances", HttpMethod.POST.toString()),
                    new AntPathRequestMatcher(this.adminContextPath + "/instances/*",
                            HttpMethod.DELETE.toString()),
                    new AntPathRequestMatcher(this.adminContextPath + "/actuator/**"));
        }
    }

    @Profile("dev")
    @Configuration()
    public static class SecuritySecureConfig extends WebSecurityConfigurerAdapter {

        private final String adminContextPath;

        public SecuritySecureConfig(AdminServerProperties adminServerProperties) {
            this.adminContextPath = adminServerProperties.getContextPath();
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // @formatter:off
            SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
            successHandler.setTargetUrlParameter("redirectTo");
            successHandler.setDefaultTargetUrl(this.adminContextPath + "/");

            http.authorizeRequests()
                    .antMatchers(this.adminContextPath + "/assets/**").permitAll()
                    .antMatchers(this.adminContextPath + "/login").permitAll()
                    .anyRequest().authenticated()
                    .and()
                    .formLogin().loginPage(this.adminContextPath + "/login").successHandler(successHandler).and()
                    .logout().logoutUrl(this.adminContextPath + "/logout").and()
                    .httpBasic().and()
                    .csrf()
                    .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                    .ignoringRequestMatchers(
                            new AntPathRequestMatcher(this.adminContextPath + "/instances", HttpMethod.POST.toString()),
                            new AntPathRequestMatcher(this.adminContextPath + "/instances/*", HttpMethod.DELETE.toString()),
                            new AntPathRequestMatcher(this.adminContextPath + "/actuator/**")
                    );
            // @formatter:on
        }
    }
}
