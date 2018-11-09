@RestController
//asks spring MVC to look for web routes, every http endpoint in this class will write
//it's result directly into HTTP response instead of a view
//if this was AppController, default behavior is to write to a view
public class HelloWorld {
    // '/' endpoint is mapped to home method
    @RequestMapping("/")
    public String home(){
        "Hello, World!"
    }
}

