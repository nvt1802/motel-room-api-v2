package tainv13.app.common;

public class PageCommon {
	private int page;
	private int pageSize;
	private String sortBy;
	private Boolean asc;

	public PageCommon() {
		super();
	}

	public PageCommon(int page, int pageSize) {
		super();
		this.page = page;
		this.pageSize = pageSize;
	}

	public PageCommon(int page, int pageSize, String sortBy, Boolean asc) {
		super();
		this.page = page;
		this.pageSize = pageSize;
		this.sortBy = sortBy;
		this.asc = asc;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Boolean getAsc() {
		return asc;
	}

	public void setAsc(Boolean asc) {
		this.asc = asc;
	}
}
