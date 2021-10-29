package home.inside.member.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import home.inside.member.service.IRegistService;

public class RegistCommandValidator implements Validator {
	private static final String emailRegExp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[_A-Za-z0-9-]+(\\.[_A-Za-z0-9]+)*(\\.[_A-Za-z]{2,})$";
	private Pattern pattern;
	private IRegistService regSer;

	public RegistCommandValidator() {
		pattern = Pattern.compile(emailRegExp);
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RegistCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RegistCommand regCmd = (RegistCommand) target;
		if(regCmd.getAgree() == null || regCmd.getAgree().trim().isEmpty()) {
			errors.rejectValue("agree", "bad");
		}
		if (regCmd.getEmail() == null || regCmd.getEmail().trim().isEmpty()) {
			errors.rejectValue("email", "required");
		}else {
			Matcher matcher = pattern.matcher(regCmd.getEmail());
			if(!matcher.matches()) {
				errors.rejectValue("email", "bad");
			}
		}
		if (regCmd.getNickname() == null || regCmd.getNickname().trim().isEmpty()) {
			errors.rejectValue("nickname", "required");
		} else {
			if (regCmd.getNickname().length() < 3) {
				errors.rejectValue("nickname", "bad");
			}
		}
		ValidationUtils.rejectIfEmpty(errors, "password", "required");
		ValidationUtils.rejectIfEmpty(errors, "passwordCheck", "required");
		if (!regCmd.passwordEqualsToCheck()) {
			errors.rejectValue("password", "notmatch");
		}
		ValidationUtils.rejectIfEmpty(errors, "name", "required");
		ValidationUtils.rejectIfEmpty(errors, "phone1", "required");
		ValidationUtils.rejectIfEmpty(errors, "phone2", "required");
		if (regCmd.getPhone2().length() < 7) {
			errors.reject("bad");
		}
	}

}
