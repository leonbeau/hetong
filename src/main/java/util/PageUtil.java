package util;

import java.util.LinkedHashMap;
import java.util.Map;

public class PageUtil extends LinkedHashMap<String,Object> {
    private int page;
    private int limit;

    public PageUtil(Map<String,Object> map){
        this.putAll(map);
        this.page=Integer.parseInt(map.get("page").toString());
        this.limit=Integer.parseInt(map.get("limit").toString());
        this.put("start",(page-1)*limit);
        this.put("page",page);
        this.put("limit",limit);

    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
