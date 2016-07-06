package com.test.quentin.resttest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Quentin on 06/07/16.
 */
public interface GithubService {

    public static final String ENDPOINT = "https://api.github.com";

    @GET("/users/{user}/repos")
    Call<List<Repo>>  listRepos(@Path("user") String user);

    @GET("/search/repositories")
    Call<List<Repo>> searchRepos(@Query("q") String query);
}
