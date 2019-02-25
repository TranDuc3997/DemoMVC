package model;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {
	public static ListStudent getData() {
		ListStudent list = new ListStudent();
		try {
			File fXmlFile = new File("data.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("Student");

			for (int i = 0; i < nList.getLength(); i++) {

				Node node = nList.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) node;
					
					Student student = new Student();
					student.setMSSV(eElement.getElementsByTagName("ID").item(0).getTextContent());
					student.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
					student.setBirthday(eElement.getElementsByTagName("birthday").item(0).getTextContent());
					student.setSchool(eElement.getElementsByTagName("school").item(0).getTextContent());
					list.getList().add(student);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
