package tutorial.chura.web.add;

public class AddPage {

	public String arg1;
	public String arg2;
	public String result;

	public Class<?> doCalculate() {
		result = arg1 + arg2;
		return null;
	}

	public Class<?> initialize() {
		return null;
	}

	public Class<?> prerender() {
		return null;
	}

}
