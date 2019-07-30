package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingController {
    @RequestMapping("/")
    Greeter greet() {
        return new Greeter("Hello World!");
    }
}
