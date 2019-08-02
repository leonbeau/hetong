package service;

import util.PageResult;
import util.PageUtil;

public interface ProductCommentService {
    PageResult getComments(PageUtil pageUtil);

    PageResult getSreachPage(PageUtil pageUtil);

    PageResult getHighCommentPage(PageUtil pageUtil);
    PageResult getLowCommentPage(PageUtil pageUtil);
}
