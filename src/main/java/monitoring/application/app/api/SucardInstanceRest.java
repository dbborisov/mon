package monitoring.application.app.api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import monitoring.application.service.SucardInstanceService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import javax.annotation.PostConstruct;
import java.net.URI;

@RestController
@Slf4j
public class SucardInstanceRest {



    private Gson gson;
    private final SucardInstanceService sucardInstanceService;

    public SucardInstanceRest(SucardInstanceService sucardInstanceService) {
        this.sucardInstanceService = sucardInstanceService;
    }


    @PostConstruct
    private void init() {
        gson = new GsonBuilder()
//                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .create();
    }

    @GetMapping(value = "/api/sci",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getPosts() {
        String s = gson.toJson(this.sucardInstanceService.findAll());
        log.info(s);
        return s;
    }

    @GetMapping(value = "/api/sci/{username}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getInstanceById(@PathVariable String username) {
        String s = gson.toJson(this.sucardInstanceService.finByUsername(username));
        log.info(s);
        return s;
    }

//    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> addPost(@RequestBody String body) {
//        log.info("Body received: {}", body);
//        Post post = gson.fromJson(body, Post.class);
//        log.info("Post deserialized: {}", post);
//        Post created = postService.addPost(post);
//        URI uri = MvcUriComponentsBuilder
//                .fromMethodName(SimplePostController.class,"addPost", post)
//                .pathSegment("{id}").buildAndExpand(created.getId()).toUri();
//        return ResponseEntity.created(uri).body(gson.toJson(created));
//    }




}
