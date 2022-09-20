package com.fq.domain;/**
 * @aythor fangqian
 * @date 2022/9/20/020 16:56
 */

import com.fq.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 *@ClassName Student
 *@Description TODO
 *@Author Administrator
 *@Date 2022/9/20/020 16:56
 *@Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Excel(row = "1",column = "1",excelid = "姓名")
    private String name;

    @Excel(row = "1",column = "2",dic_class = "Dictionary",excelid = "性别")
    private String gender;//性别 字典值 0 女 1 男

    @Excel(row = "1",column = "3",dataType = "Integer",excelid = "年龄")
    private Integer age;

    @Excel(row = "1",column = "4",excelid = "入学日期",dataType = "yyyy-mmm-dd")
    private Date entranceDate;

    @Excel(row = "1",column = "5",excelid = "年级")
    private String grade;

    @Excel(row = "1",column = "6",excelid = "课程")
    private String course;
}
