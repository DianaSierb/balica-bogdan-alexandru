import java.io.ByteArrayOutputStream;


public class PIM {
	private static final String CONTACT_LIST = null;
	private static final String READ_ONLY = null;

	public static void main(String args[]){
		PIM pim = PIM.GetInstance();
		ContactList cl = (ContactList)pim.openPIMList(PIM.CONTACT_LIST, PIM.READ_ONLY);
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    String[] dataFormats = pim.supportedSerialFormats(PIM.CONTACT_LIST);
	    Enumeration e = cl.items();
	    while (e.hasMoreElements()) {
	            Contact c = (Contact)e.nextElement();
	            pim.toSerialFormat(c, output, "UTF8", dataFormats[0]);
	    }
	    cl.close();
	}

	private void toSerialFormat(Contact c, ByteArrayOutputStream output,
			String string, String string2) {
		
	}

	private ContactList openPIMList(String contactList, String readOnly) {
		return null;
	}

	private String[] supportedSerialFormats(String contactList) {
		return null;
	}

	private static PIM GetInstance() {
		return null;
	}
}