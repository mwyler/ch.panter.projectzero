package ch.panter.jmock.gettingstarted;

public class MdpJunitDemoImpl implements IMdpJunitDemo {

	@Override
	public String capitalize(String s) {
		return s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
	}

	@Override
	public boolean isEmpty(String s) {
		return s.equals("");
	}

	@Override
	public String join(String... strings) {
		StringBuilder bld = new StringBuilder();
		for (int i = 0; i < strings.length; i++) {
			String string = strings[i];
			bld.append(string);
		}
		
		return bld.toString();
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		if (s == null){
			throw new NullPointerException("Can not reverse null!");
		}
		
		String v[] = new String[s.length()];
		for (int i = s.length()-1, a = 0; i>=0; i--, a++){
			v[a]=s.substring(i,i+1);
		}
		
		return join(v);
	}

}
