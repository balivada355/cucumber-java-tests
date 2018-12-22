package resources.utils;

public class BaseUtils {
	private TestContext  tc = null;
	
	public BaseUtils() {
	  setTc(new TestContext());
	 
	}
	public TestContext getTc() {
		return tc;
	}
	public void setTc(TestContext tc) {
		this.tc = tc;
	}


}
