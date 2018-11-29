package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @Title: xcEduCode01
 * @Description:
 * @Author: xiaobai
 * @Date: 2018/11/25 22:23
 * @Version: 1.0
 */
@Data
public class QueryPageRequest extends RequestData{
    /** 站点.*/
    private String siteId;
    /** 页面ID.*/
    private String pageId;
    /** 页面名称.*/
    private String pageName;
    /** 别名.*/
    private String pageAliase;
    /** 模板id.*/
    private String templateId;

}
