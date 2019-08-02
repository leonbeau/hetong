package dao;

import java.util.List;
import java.util.Map;

public interface ProductDao {
   List<Map<String,Object>> getProduct(Map map);
   int getProductCount(Map map);
   List<Map<String,Object>> getSortMark(Map map);
   int getSortMarkCount(Map param);
   List<Map<String,Object>> getSortPrice(Map map);
   int getSortPriceCount(Map map);
   List<Map<String,Object>> getOrder(Map map);
   int getOrderCount(Map map);
}
