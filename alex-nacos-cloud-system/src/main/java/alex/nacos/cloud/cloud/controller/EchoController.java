package alex.nacos.cloud.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/sys")
class EchoController {
    @Value("${name}")
    private String name;

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo() {
        return name;
    }
}
