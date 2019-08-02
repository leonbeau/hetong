package service.impl;

import dao.ProductDao;
import entity.Product;
import org.springframework.stereotype.Service;
import service.ProductService;
import util.PageResult;
import util.PageUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource(name = "productDao")
    private ProductDao productDao;

    public PageResult getProductPage(PageUtil pageUtil) {
        List<Map<String,Object>> products=productDao.getProduct(pageUtil);
        int total=productDao.getProductCount(pageUtil);
        return new PageResult(products,total,pageUtil.getPage(),pageUtil.getLimit());
    }
    public PageResult getSortMarkPage(PageUtil pageUtil) {
        List<Map<String,Object>> sorts=productDao.getSortMark(pageUtil);
        int total=productDao.getSortMarkCount(pageUtil);
        return new PageResult(sorts,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    public PageResult getSortPricePage(PageUtil pageUtil) {
        List<Map<String,Object>> sorts=productDao.getSortPrice(pageUtil);
        int total=productDao.getSortPriceCount(pageUtil);
        return new PageResult(sorts,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    public PageResult getSortOrderPage(PageUtil pageUtil) {
        List<Map<String,Object>> sorts=productDao.getOrder(pageUtil);
        int total=productDao.getOrderCount(pageUtil);
        return new PageResult(sorts,total,pageUtil.getLimit(),pageUtil.getPage());
    }

}
