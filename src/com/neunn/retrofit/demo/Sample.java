/**
 * @项目名称: retrofit-demo
 * @文件名称: Sample.java
 * @Date: 2016年4月29日
 * @Copyright: 2016-2016 www.neunn.com All rights reserved. 注意：本内容仅限于东网科技有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
package com.neunn.retrofit.demo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * FIXME 此处填写类的描述信息
 * 
 * @author Frank
 * @date 2016年4月29日
 * @since 1.0
 */
public class Sample {
    public static void main(String[] args) {
        try {
            Retrofit retrofit = new Retrofit.Builder().baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create()).build();

            GitHubService service = retrofit.create(GitHubService.class);
            Call<List<Repo>> repos = service.listRepos("heartarea");
            repos.enqueue(new Callback<List<Repo>>() {

                @Override
                public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                    List<Repo> repos = response.body();
                    for (Repo repo : repos) {
                        System.out.println(repo); 
                    }
                }

                @Override
                public void onFailure(Call<List<Repo>> call, Throwable t) {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
