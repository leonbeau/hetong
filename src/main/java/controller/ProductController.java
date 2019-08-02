package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;
import util.PageResult;
import util.PageUtil;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {


   @Resource(name = "productService")
    private ProductService productService;
   @RequestMapping("/get")
   public int get(){
       return 1;
   }

    @RequestMapping("/list")
    public PageResult list(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productService.getProductPage(pageUtil);
    }
    @RequestMapping("/mark")
    public PageResult mark(@RequestParam Map<String,Object> map){
       PageUtil pageUtil=new PageUtil(map);
       return productService.getSortMarkPage(pageUtil);
    }
    @RequestMapping("/price")
    public PageResult price(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productService.getSortPricePage(pageUtil);
    }
    @RequestMapping("/order")
    public PageResult order(@RequestParam Map<String,Object> map){
        PageUtil pageUtil=new PageUtil(map);
        return productService.getSortOrderPage(pageUtil);
    }
}
