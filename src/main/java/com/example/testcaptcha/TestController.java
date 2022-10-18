package com.example.testcaptcha;

import com.google.code.kaptcha.Producer;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.validation.Valid;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Producer producer;

    @GetMapping(value = "/captcha.jpg", produces = MediaType.IMAGE_JPEG_VALUE)
    public @ResponseBody byte[] getCaptcha(){
        String code = producer.createText();
        BufferedImage image = producer.createImage(code);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "jpg", baos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        byte[] bytes = baos.toByteArray();
        return bytes;
    }

    @PostMapping("/post")
    public void testPost(@Valid @RequestBody TestDTO testDTO){
        System.out.println("TestController.testPost");
        System.out.println("testDTO = " + testDTO);
    }
}
