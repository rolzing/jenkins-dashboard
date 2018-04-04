package com.digitalonus.pipelinegenerator.dto;

import com.digitalonus.pipelinegenerator.commons.GsonSingleton;

public class ProviderDTO {
	private String value;
	private String viewValue;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getViewValue() {
		return viewValue;
	}

	public void setViewValue(String viewValue) {
		this.viewValue = viewValue;
	}

	@Override
	public String toString() {
		return new GsonSingleton().getInstance().toJson(this);
	}
}
