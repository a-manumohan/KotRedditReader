package `in`.mn.kotredditreader.model

/**
 * Created by manuMohan on 16/02/2016.
 */
data class Reddit(val kind: String,
                  val data: Data) {
    data class Data(val feeds: Collection<Feed>)
}