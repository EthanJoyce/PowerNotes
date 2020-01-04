package xyz.ethanjoyce.powernotes.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.*

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        //"Hello world from section: $it"*
        val c = Calendar.getInstance()
        c.add(Calendar.DAY_OF_MONTH, it - 1 - SectionsPagerAdapter.sliderLength / 2)
        SimpleDateFormat.getDateInstance().format(c.time)
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}