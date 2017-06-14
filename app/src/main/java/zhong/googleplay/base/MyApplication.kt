package zhong.googleplay.base

import android.app.Application
import android.content.Context

/**
 * Created by zhong on 2017/6/14.
 */
class MyApplication: Application() {

    companion object {
        @JvmField
        var context: Context?=null

        fun getContext(): Context? {
            return context
        }

    }

    override fun onCreate() {
        super.onCreate()
        MyApplication.context=this.applicationContext
    }


}