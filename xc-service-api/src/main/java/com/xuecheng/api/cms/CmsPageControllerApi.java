package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @Title: xcEduCode01
 * @Description:
 * @Author: xiaobai
 * @Date: 2018/11/25 22:33
 * @Version: 1.0
 */
public interface CmsPageControllerApi {
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
