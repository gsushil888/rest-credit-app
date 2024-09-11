package com.workspace.insurance_workflow_project;

public class ExternalData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("credit_score")
	private double credit_score;

	@org.kie.api.definition.type.Label("additional_info")
	private String additional_info;

	public ExternalData() {
	}

	public double getCredit_score() {
		return this.credit_score;
	}

	public void setCredit_score(double credit_score) {
		this.credit_score = credit_score;
	}

	public java.lang.String getAdditional_info() {
		return this.additional_info;
	}

	public void setAdditional_info(java.lang.String additional_info) {
		this.additional_info = additional_info;
	}

	@Override
	public String toString() {
		return "{ credit_score=" + credit_score + ", additional_info=" + additional_info + "}";
	}

	public ExternalData(double credit_score, java.lang.String additional_info) {
		this.credit_score = credit_score;
		this.additional_info = additional_info;
	}
}
