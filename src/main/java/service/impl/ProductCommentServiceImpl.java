package service.impl;

import dao.ProductCommentDao;
import entity.Product;
import org.springframework.stereotype.Service;
import service.ProductCommentService;
import util.PageResult;
import util.PageUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("productCommentService")
public class ProductCommentServiceImpl implements ProductCommentService {
    @Resource(name = "productCommentDao")
    private ProductCommentDao productCommentDao;

    public PageResult getComments(PageUtil pageUtil) {
        List<Map<String,Object>> comments=productCommentDao.getComment(pageUtil);
        int total=productCommentDao.getCommentCount(pageUtil);
        return new PageResult(comments,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    public PageResult getSreachPage(PageUtil pageUtil){
        List<Map<String,Object>> search=productCommentDao.search(pageUtil);
        int total=productCommentDao.getTotalSearch(pageUtil);
        return new PageResult(search,total,pageUtil.getLimit(),pageUtil.getPage());
    }

    public PageResult getHighCommentPage(PageUtil pageUtil) {
        List<Map<String,Object>> search=productCommentDao.getHighComment(pageUtil);
        int total=productCommentDao.getHighCommentCount(pageUtil);
        return new PageResult(search,total,pageUtil.getLimit(),pageUtil.getPage());
    }
    public PageResult getLowCommentPage(PageUtil pageUtil) {
        List<Map<String,Object>> search=productCommentDao.getLowComment(pageUtil);
        int total=productCommentDao.getLowCommentCount(pageUtil);
        return new PageResult(search,total,pageUtil.getLimit(),pageUtil.getPage());
    }

}
