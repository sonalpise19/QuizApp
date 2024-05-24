package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class AnswerChoicesItem(

	@field:SerializedName("score")
	val score: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
