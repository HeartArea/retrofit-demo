/**
 * @项目名称: retrofit-demo
 * @文件名称: GithubService.java
 * @Date: 2016年5月4日
 * @Copyright: 2016-2016 www.neunn.com All rights reserved. 注意：本内容仅限于东网科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.neunn.retrofit.demo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * FIXME 此处填写类的描述信息
 * 
 * @author Frank
 * @date 2016年5月4日
 * @since 1.0
 */
public interface GitHubService {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
