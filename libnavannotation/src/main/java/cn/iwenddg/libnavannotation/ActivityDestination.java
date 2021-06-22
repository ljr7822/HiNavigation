package cn.iwenddg.libnavannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 标记在Activity上面的注解
 *
 * @author iwen大大怪
 * @create 2021/06/22 17:35
 */
@Target(ElementType.TYPE)
public @interface ActivityDestination {
    /**
     * 页面路由的url
     *
     * @return 该页面
     */
    String pageUrl();

    /**
     * 该页面是否需要登录
     *
     * @return 默认为不需要
     */
    boolean needLogin() default false;

    /**
     * 该页面是否为启动页面
     *
     * @return 默认为false
     */
    boolean asStarter() default false;
}
