package com.example.appsinvotask

import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class ViewPager: PagerAdapter() {
    val ITEM_COUNT=3

    //       fun Viewpager(contet:Context){
//           this
//       }
    var imagerarry = arrayOf(R.drawable.baseline_person_24,R.drawable.baseline_person_24,R.drawable.baseline_person_24)

    override fun getCount(): Int {
        return  imagerarry.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return  view == `object`

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //  var   view:View= LayoutInflater(container.context()).inflate()
        return super.instantiateItem(container, position)
    }

}