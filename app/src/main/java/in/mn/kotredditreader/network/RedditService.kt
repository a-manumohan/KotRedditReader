package `in`.mn.kotredditreader.network

import `in`.mn.kotredditreader.model.Reddit
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by manuMohan on 16/02/2016.
 */
interface RedditService {
    @GET("/search/.json")
    fun search(
            @Query("q") query: String,
            @Query("limit") limit: Int,
            @Query("after") after: String,
            @Query("before") before: String
    ): Observable<Reddit> ;
}