package com.coding.quizdesignapp.view

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.coding.quizdesignapp.model.repo.InsepectionRepo
import com.coding.quizdesignapp.model.response.ResponseItem
import com.coding.quizdesignapp.model.response.TestData
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class InsepectionViewModel @Inject constructor(private val insepectionRepo: InsepectionRepo) : ViewModel() {

    private val _insepctionData=MutableLiveData<ResponseItem>()
    val insepectionItem:LiveData<ResponseItem> =_insepctionData

    private val _testData=MutableLiveData<TestData>()
    val testItem:LiveData<TestData> =_testData


    fun fetchInsepctionData(){
        viewModelScope.launch {
            try {
                val insepectionData=insepectionRepo.getInsepctionData()
                _insepctionData.value=insepectionData
                Log.d("sonalpiseViewa","insepectionData$insepectionData")
            }
            catch (e:Exception){
                Log.d("sonalpiseView","insepectionData$e")
            }
        }
    }


    fun fetchTestData(){
        viewModelScope.launch {
            try {
                val testdata=insepectionRepo.getTestData()
                _testData.value=testdata
                Log.d("sonalpiseViewa","insepectionData$testdata")
            }
            catch (e:Exception){
                Log.d("sonalpiseView","insepectionData$e")
            }
        }
    }




}