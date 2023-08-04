package telran.text;

public class JoinStringsOnStandart implements JoinStrings {

	@Override
	public String join(String[] strings, String delimiter) {
		
		return String.join(delimiter, strings);
	}

}