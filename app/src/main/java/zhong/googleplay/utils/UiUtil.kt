package zhong.googleplay.utils

import android.app.Application
import android.content.Context
import zhong.googleplay.base.MyApplication

/**
 * Created by zhong on 2017/6/14.
 */
class UiUtil{
    companion object{
        fun getContext(): Context? =  MyApplication.getContext()

//        fun getStrings(resName:Int):Array<String>?= getContext()?.resources?.getStringArray(resName)
    }
}