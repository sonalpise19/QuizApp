package com.coding.quizdesignapp.view

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.coding.quizdesignapp.model.response.InspectionTypeItem
import com.coding.quizdesignapp.model.response.ResponseItem
import com.coding.quizdesignapp.model.response.TestData

@Composable
fun InsepectionScreen(viewModel: InsepectionViewModel) {

    val insepectionItem by viewModel.insepectionItem.observeAsState(null)

    LaunchedEffect(Unit) {

        viewModel.fetchInsepctionData()

    }


    Column {
        if (insepectionItem == null) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of credit cards
            InsepectionItem(insepectionItem!!)
        }
    }


}

@Composable
fun InsepectionItem(insepectionItem: ResponseItem) {

    Log.d("sonalpise", "insepectionData$insepectionItem")

}


@Composable
fun TestScreen(viewModel: InsepectionViewModel) {

    val insepectionItem by viewModel.testItem.observeAsState(null)

      LaunchedEffect(Unit) {
          viewModel.fetchTestData()
      }
    Column {
        if (insepectionItem == null) {
            // Show loading indicator or placeholder
            Text(text = "Loading...")
        } else {
            // Display the list of credit cards
            TestItem(insepectionItem!!)
        }
    }
}

@Composable
fun TestItem(insepectionItem: TestData) {
    Log.d("sonalpise", "insepectionData$insepectionItem")
}
