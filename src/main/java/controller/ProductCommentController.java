package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ProductCommentService;
import util.PageResult;
import util.PageUtil;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/comment")
public class ProductCommentController {
    @Resource(name = "productCommentService")
    private ProductCommentService productCommentService;

    @RequestMapping("/get")
    public int get(){
        return 1;
    }

    @RequestMapping("/list")
    public PageResult list(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productCommentService.getComments(pageUtil);
    }
    @RequestMapping("/high")
    public PageResult high(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productCommentService.getHighCommentPage(pageUtil);
    }
    @RequestMapping("/search")
    public PageResult search(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productCommentService.getSreachPage(pageUtil);
    }
}
