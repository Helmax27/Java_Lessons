package Lesson26;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task16 {
    public static void main(String[] args) throws XMLStreamException, FileNotFoundException {
        String inFile = "cars.xml";
        XMLStreamReader xmlr = XMLInputFactory.newInstance().createXMLStreamReader(inFile, new FileInputStream(inFile));
        while (xmlr.hasNext()) {
            xmlr.next();
            if (xmlr.isStartElement()) {
                System.out.println(xmlr.getLocalName()+ " " + xmlr.getAttributeValue(0));
            } else if (xmlr.isEndElement()) {
                System.out.println(xmlr.getLocalName());
            } else if (xmlr.hasText() && xmlr.getText().trim().length() > 0) {
                System.out.println("  " + xmlr.getText());
            }
        }
    }
}
