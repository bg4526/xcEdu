package com.xuecheng.framework.domain.cms.response;

import com.xuecheng.framework.domain.cms.CmsPageParam;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * @Title: xcEduCode01
 * @Description: 页面信息
 * @Author: xiaobai
 * @Date: 2018/11/25 22:11
 * @Version: 1.0
 */
@Data
@ToString
@Document(collection = "cms_page")
public class CmsPage {

    private String siteId;
    //页面ID
    @Id
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //访问地址
    private String pageWebPath;
    //参数
    private String pageParameter;
    //物理路径
    private String pagePhysicalPath;
    //类型（静态/动态）
    private String pageType;
    //页面模版
    private String pageTemplate;
    //页面静态化内容
    private String pageHtml;
    //状态
    private String pageStatus;
    //创建时间
    private Date pageCreateTime;
    //模版id
    private String templateId;
    //参数列表，暂不用
    private List<CmsPageParam> pageParams;
    //模版文件Id
    //    private String templateFileId;
    //静态文件Id
    private String htmlFileId;
    //数据Url
    private String dataUrl;
}
