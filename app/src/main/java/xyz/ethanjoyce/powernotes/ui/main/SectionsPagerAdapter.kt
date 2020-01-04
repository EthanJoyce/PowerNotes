package xyz.ethanjoyce.powernotes.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentStatePagerAdapter(fm) {

    companion object {
        const val sliderLength = 10000
    }

    override fun getItem(position: Int): Fragment {
        return ExerciseListFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? = "Tab"

    override fun getCount(): Int = sliderLength

    override fun getItemPosition(`object`: Any): Int = POSITION_NONE
}