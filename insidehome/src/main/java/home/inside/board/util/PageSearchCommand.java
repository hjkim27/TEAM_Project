package home.inside.board.util;

public class PageSearchCommand {
	private String boardCode;
	private Integer currentPage;
	private int startNum;
	private int endNum;
	private int count;
	private int pageSize;
	private int number;
	private String type;
	private String word;
	
	public PageSearchCommand() {
		if(currentPage==null) {
			currentPage = 1;
		}
	}
	
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public int getStartNum() {
		return pageSize*(currentPage-1)+1;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getEndNum() {
		return pageSize*currentPage;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "PageSearchCommand [boardCode=" + boardCode + ", currentPage=" + currentPage + ", startNum=" + startNum
				+ ", endNum=" + endNum + ", count=" + count + ", pageSize=" + pageSize + ", number=" + number
				+ ", type=" + type + ", word=" + word + "]";
	}

	
}
