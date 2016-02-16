package `in`.mn.kotredditreader.model

/**
 * Created by manuMohan on 16/02/2016.
 */
data class Feed(val data: Data) {

    data class Data(val title: String,
                    val created: Long,
                    val name: String,
                    val thumbnail: String)
}
