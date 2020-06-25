package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {

    private PostRepository postRepository;

    public BlogController(PostRepository postRepository)
    {
        this.postRepository = postRepository;
    }

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap)
    {
        modelMap.put("posts",postRepository.getAllPosts());
        return "home";
    }
}
