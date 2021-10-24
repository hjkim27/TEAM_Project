package home.inside.member.utils;

public class ChangePwCommand {
	private String nickname;
	private String password;
	private String newPassword;
	private String newPasswordCheck;
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getNewPasswordCheck() {
		return newPasswordCheck;
	}
	public void setNewPasswordCheck(String newPasswordCheck) {
		this.newPasswordCheck = newPasswordCheck;
	}
	
	// 비밀번호와 새비밀번호가 동일하지 않음 확인
	public boolean passwordEqualToPasswordCheck() {
		if(password.equals(newPassword)) {
			return false;
		} else {
			return true;
		}
	}
	
	// 새비밀번호와 확인이 일치하는지 확인
	public boolean newPasswordEqualToCheck() {
		if(newPassword.equals(newPasswordCheck)) {
			return true;
		} else {
			return false; 
		}
	}
}
