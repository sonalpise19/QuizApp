package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class InspectionTypeItem(

	@field:SerializedName("access")
	val access: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
