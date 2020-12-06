package com.episen.ing3.tpmra.model;

import java.time.OffsetDateTime;
import java.util.Objects;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class DocumentSummary   {
	
	@Id
	protected String documentId = null;

	protected OffsetDateTime created = null;

	protected OffsetDateTime updated = null;

	protected String title = null;

	public DocumentSummary documentId(String documentId) {
		this.documentId = documentId;
		return this;
	}

	public DocumentSummary(String documentId, OffsetDateTime created, OffsetDateTime updated, String title) {
		super();
		this.documentId = documentId;
		this.created = created;
		this.updated = updated;
		this.title = title;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public DocumentSummary created(OffsetDateTime created) {
		this.created = created;
		return this;
	}

	public OffsetDateTime getCreated() {
		return created;
	}

	public void setCreated(OffsetDateTime created) {
		this.created = created;
	}

	public DocumentSummary updated(OffsetDateTime updated) {
		this.updated = updated;
		return this;
	}
	
	public OffsetDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(OffsetDateTime updated) {
		this.updated = updated;
	}

	public DocumentSummary title(String title) {
		this.title = title;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DocumentSummary documentSummary = (DocumentSummary) o;
		return Objects.equals(this.documentId, documentSummary.documentId) &&
				Objects.equals(this.created, documentSummary.created) &&
				Objects.equals(this.updated, documentSummary.updated) &&
				Objects.equals(this.title, documentSummary.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(documentId, created, updated, title);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DocumentSummary {\n");

		sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
		sb.append("    created: ").append(toIndentedString(created)).append("\n");
		sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
