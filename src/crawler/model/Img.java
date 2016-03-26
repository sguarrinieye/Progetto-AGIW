package crawler.model;

public class Img {
	private String keyword;
	private String url;
	private String title;
	private String description;
	
	public Img(String keyword, String url, String title, String description) {
		this.keyword = keyword;
		this.url = url;
		this.title = title;
		this.description = description;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
		
	public boolean equals(Img doc){
		if(keyword.equals(doc.getKeyword()) && url.equals(doc.getUrl()) && title.equals(doc.getTitle()))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Doc [keyword=" + keyword + ", url=" + url + ", title=" + title + ", description=" + description
				+ "]";
	}
}
