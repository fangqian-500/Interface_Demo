package com.fq.annotation;

import java.lang.annotation.*;

/**
 * @aythor fangqian
 * @date 2022/9/20/020 16:36
 */

@Target({ElementType.FIELD,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Excel {

    //行
    public String row() default "";

    //列
    public String column() default "";

    //字典
    public String dic_class() default "";

    //标识符
    public String excelid() default "";

    //数据类型
    public String dataType() default "";

    //日期格式
    public String dateFormat() default "yyyy-mm-dd";

    //导出的Excel文件名
    public String excelName() default "";

    //TODO 纵向合并单元格
}
