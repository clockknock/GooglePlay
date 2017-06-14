package zhong.googleplay.ui.fragment

import android.view.View
import android.widget.TextView

/**
 * Created by zhong on 2017/6/14.
 */
class GameFragment : BaseFragment() {
    override fun initView(): View {
        val tv = TextView(context)
        tv.text = this.javaClass.simpleName
        tv.textSize = 30f
        return tv
    }

}