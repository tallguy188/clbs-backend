package com.clbs.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.clbs.filter.ErrorFilter;
import com.clbs.filter.PostFilter;
import com.clbs.filter.PreFilter;
import com.clbs.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class DefaultServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(DefaultServerApplication.class, args);
  }

  @Bean
  public PreFilter preFilter() {
    return new PreFilter();
  }

  @Bean
  public PostFilter postFilter() {
    return new PostFilter();
  }

  @Bean
  public ErrorFilter errorFilter() {
    return new ErrorFilter();
  }

  @Bean
  public RouteFilter routeFilter() {
    return new RouteFilter();
  }
}
