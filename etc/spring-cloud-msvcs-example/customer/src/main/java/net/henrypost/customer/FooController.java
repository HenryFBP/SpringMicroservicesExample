package net.henrypost.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

@Slf4j
@RestController
@RequestMapping("api/v1/foo/")
public class FooController {
    @GetMapping("/")
    public byte[] getSomeShitIDK() {
        return "lol its fucking bytes... FEFF = byte order mark :)".getBytes(StandardCharsets.UTF_16);
    }
}
