/**
 * @项目名称: retrofit-demo
 * @文件名称: Repo.java
 * @Date: 2016年5月5日
 * @Copyright: 2016-2016 www.neunn.com All rights reserved. 注意：本内容仅限于东网科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.neunn.retrofit.demo;

/**
 * FIXME 此处填写类的描述信息
 * 
 * @author Frank
 * @date 2016年5月5日
 * @since 1.0
 */

public class Repo {
    private int id;

    private String name;

    private String fullName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * FIXME 删除本行替换为方法的描述信息
     * 
     * @author Frank
     * @date 2016年5月5日
     * @return
     * @since 1.0
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.id + "-" + this.name + "-" + this.fullName;
    }
}
