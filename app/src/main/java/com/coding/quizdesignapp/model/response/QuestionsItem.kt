package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class QuestionsItem(

	@field:SerializedName("answerChoices")
	val answerChoices: List<AnswerChoicesItem?>? = null,

	@field:SerializedName("selectedAnswerChoiceId")
	val selectedAnswerChoiceId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
