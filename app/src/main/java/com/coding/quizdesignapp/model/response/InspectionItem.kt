package com.coding.quizdesignapp.model.response

import com.google.gson.annotations.SerializedName

data class InspectionItem(

	@field:SerializedName("area")
	val area: AreaItem? = null,

	@field:SerializedName("inspectionType")
	val inspectionType: InspectionTypeItem? = null,

	@field:SerializedName("survey")
	val survey: SurveyItem? = null,

	@field:SerializedName("id")
	val id: Int? = null
)
