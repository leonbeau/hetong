package service;

import util.PageResult;
import util.PageUtil;

public interface ProductService {
   PageResult getProductPage(PageUtil pageUtil);
   PageResult getSortMarkPage(PageUtil pageUtil);
   PageResult getSortPricePage(PageUtil pageUtil);
   PageResult getSortOrderPage(PageUtil pageUtil);
}
