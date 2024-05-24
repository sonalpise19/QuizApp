package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class SurveyItem(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null
)
