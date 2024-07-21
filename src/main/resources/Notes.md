In monolithic applications, we need to handle the persistent logics in common way. that means we cannot save 
them service by service. so ex: user service, driver service, everything we need to persist through a common
entity. so that is why we always need to use entity and extend it by another things.


Questions:
1. Do we need entity layer in microservices?
2. In normally we are using the common persist way to do?
3. Who can contact for this?


flow until the controller
0. Incoming Request
   The client sends an HTTP request to the server (e.g., using Postman).

1. Embedded Server
   Spring Boot applications typically run with an embedded server (e.g., Tomcat, Jetty, Undertow). When you start your application, this server starts and listens for incoming HTTP requests.

2. DispatcherServlet
   Spring Boot uses the Spring MVC framework, where the DispatcherServlet is the front controller. This servlet is responsible for handling all incoming HTTP requests and dispatching them to the appropriate handlers.
`
    // In Spring Boot, DispatcherServlet is automatically configured
    @Configuration
    public class WebConfig implements WebMvcConfigurer {
        @Bean
        public DispatcherServlet dispatcherServlet() {
        DispatcherServlet servlet = new DispatcherServlet();
        servlet.setThrowExceptionIfNoHandlerFound(true);
        return servlet;
        }
    }`


3. Filters
   Filters are part of the Servlet specification and can be used to intercept requests before they reach the servlet. Common uses include logging, authentication, and authorization. In Spring Boot, filters can be configured using @Component or through Java configuration.

`
@Component
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {
    // Filter logic
    chain.doFilter(request, response); // Continue to the next filter or target
    }
}
`

4. Interceptors
   Interceptors are specific to Spring MVC and allow pre-processing and post-processing of requests. They can be used to add logic before or after the request hits the controller, such as logging or modifying request/response data.

    `@Component
    public class MyInterceptor implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        // Pre-processing logic
        return true; // Continue to the handler (controller)
        }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // Post-processing logic
    }
   }
   `

5. Controller
   The request finally reaches the controller, where it is handled by a method annotated with @RequestMapping (or other mapping annotations like @GetMapping, @PostMapping, etc.). The controller processes the request, interacts with the service layer if needed, and returns a response.