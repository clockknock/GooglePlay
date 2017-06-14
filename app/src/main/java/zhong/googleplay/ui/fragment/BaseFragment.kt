package zhong.googleplay.ui.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by zhong on 2017/6/14.
 */
abstract class BaseFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     val view=initView()
        return view
    }

    abstract fun initView(): View
}