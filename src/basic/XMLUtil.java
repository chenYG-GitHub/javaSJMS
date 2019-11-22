package basic;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean(String name){
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File("src//basic//config.xml"));
			NodeList nl = doc.getElementsByTagName(name);
			Node claNode = nl.item(0).getFirstChild();
			String cName = claNode.getNodeValue();
			Class<?> c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
