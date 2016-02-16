package `in`.mn.kotredditreader.db

import io.realm.RealmObject

/**
 * Created by manuMohan on 16/02/2016.
 */
class FeedDAO : RealmObject() {
    open val title: String = "";
    open val created: Long = 0;
    open val name: String = "";
    open val thumbnail: String = "";
    open val updated: Long = 0;
}