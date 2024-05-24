package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class ResponseItem(

	@field:SerializedName("inspection")
	val inspection: InspectionItem? = null
)