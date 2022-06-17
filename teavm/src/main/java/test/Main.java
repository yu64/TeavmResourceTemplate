package test;

import org.teavm.jso.browser.Window;
import org.teavm.jso.dom.html.HTMLBodyElement;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class Main {

	public static void main(String[] args) throws Exception
	{
		HTMLDocument doc = Window.current().getDocument();
		
		HTMLElement h1 = doc.createElement("h1");
		h1.withText("TeaVMを使用しています");
		
		HTMLBodyElement body = doc.getBody();
		body.insertBefore(h1, null);
	}



}
