package home.inside.member.vo;

import java.sql.Date;

public class MemberInfoVo {
	private String email;
	private String nickname;
	private String name;
	private String gender;
	private Date storedate;
	
	private int warnCount;
	private int point;
	private Date loginTime;

	private String phone1;
	private String phone2;
	private String addrNum;
	private String addr;
	private String addrSub;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getStoredate() {
		return storedate;
	}
	public void setStoredate(Date storedate) {
		this.storedate = storedate;
	}
	public int getWarnCount() {
		return warnCount;
	}
	public void setWarnCount(int warnCount) {
		this.warnCount = warnCount;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getAddrNum() {
		return addrNum;
	}
	public void setAddrNum(String addrNum) {
		this.addrNum = addrNum;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddrSub() {
		return addrSub;
	}
	public void setAddrSub(String addrSub) {
		this.addrSub = addrSub;
	}
	@Override
	public String toString() {
		return "MemberInfoVo [email=" + email + ", nickname=" + nickname + ", name=" + name + ", gender=" + gender
				+ ", storedate=" + storedate + ", warnCount=" + warnCount + ", point=" + point + ", loginTime="
				+ loginTime + ", phone1=" + phone1 + ", phone2=" + phone2 + ", addrNum=" + addrNum + ", addr=" + addr
				+ ", addrSub=" + addrSub + "]";
	}
	
	
	
}
