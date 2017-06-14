package zhong.googleplay.ui

import android.support.v4.app.Fragment
import android.util.SparseArray
import zhong.googleplay.ui.fragment.AppFragment
import zhong.googleplay.ui.fragment.GameFragment
import zhong.googleplay.ui.fragment.HomeFragment

/**
 * Created by zhong on 2017/6/14.
 */
class FragmentFactory {
    companion object {
        val HOME=0
        val APP=1
        val GAME=2
        val SUBJECT=3
        val CATEGORY=4
        val RECOMMEND=5
        val RANK=6

        /**
         * 放framgnet的
         */
        @JvmField
        var holder: SparseArray<Fragment> = SparseArray()

        fun getFragment(position: Int): Fragment {
            //从缓存取
            var fragment = holder.get(position)
            if(fragment !=null){
                //如果有就直接返回
                return fragment
            }
            //如果没有就创建
            when(position){
                HOME->fragment = HomeFragment()
                APP->fragment=AppFragment()
                GAME->fragment= GameFragment()

                else->fragment= HomeFragment()
            }
            //存入缓存区
            holder.put(position,fragment)

            return fragment
        }
    }
}