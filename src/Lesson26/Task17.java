package Lesson26;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Task17 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("C:\\Users\\helen\\IdeaProjects\\TestOlena\\cars.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();
        System.out.println("Root element" + doc.getDocumentElement().getNodeName());
        NodeList nodeList1 = doc.getElementsByTagName("supercars");
        System.out.println("===========================");
        visitChildNodes(nodeList1);
        NodeList nodeList2 = doc.getElementsByTagName("regularcars");
        System.out.println("===========================");
        visitChildNodes(nodeList2);
    }

    private static void visitChildNodes(NodeList nList) {
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Node Name= " + node.getNodeName() + "; Value = " + node.getTextContent());
                if (node.hasAttributes()) {
                    NamedNodeMap nodeMap = node.getAttributes();
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node tempNode = nodeMap.item(j);
                        System.out.println("Attr name : " + tempNode.getNodeName() + "; Value = " + tempNode.getNodeValue());
                    }
                    if (node.hasChildNodes()) {
                        visitChildNodes(node.getChildNodes());
                    }
                }
            }
        }
    }
}
