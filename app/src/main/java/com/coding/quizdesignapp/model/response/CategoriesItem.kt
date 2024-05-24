package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class CategoriesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("questions")
	val questions: List<QuestionsItem?>? = null,

	@field:SerializedName("id")
	val id: Int? = null
)


