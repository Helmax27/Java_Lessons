package Lesson26;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.StringWriter;

public class Task15 {
    public static void main(String[] args) throws XMLStreamException, IOException {

        StringWriter sw = new StringWriter();
        XMLOutputFactory xmlfactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStWriter = xmlfactory.createXMLStreamWriter(sw);

        xmlStWriter.writeStartDocument();
        xmlStWriter.writeStartElement("class");

        xmlStWriter.writeStartElement("student");
        xmlStWriter.writeAttribute("rollno", "393");

        xmlStWriter.writeStartElement("firstname");
        xmlStWriter.writeCharacters("dinkar");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("lastname");
        xmlStWriter.writeCharacters("kad");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("nickname");
        xmlStWriter.writeCharacters("dinkar");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("marks");
        xmlStWriter.writeCharacters("85");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeEndElement();


        xmlStWriter.writeStartElement("student");
        xmlStWriter.writeAttribute("rollno", "493");

        xmlStWriter.writeStartElement("firstname");
        xmlStWriter.writeCharacters("Vaneet");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("lastname");
        xmlStWriter.writeCharacters("Gupta");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("nickname");
        xmlStWriter.writeCharacters("vinni");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("marks");
        xmlStWriter.writeCharacters("95");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeEndElement();


        xmlStWriter.writeStartElement("student");
        xmlStWriter.writeAttribute("rollno", "593");

        xmlStWriter.writeStartElement("firstname");
        xmlStWriter.writeCharacters("jasvir");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("lastname");
        xmlStWriter.writeCharacters("singn");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("nickname");
        xmlStWriter.writeCharacters("jazz");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeStartElement("marks");
        xmlStWriter.writeCharacters("90");
        xmlStWriter.writeEndElement();

        xmlStWriter.writeEndElement();
        xmlStWriter.writeEndDocument();

        xmlStWriter.flush();
        xmlStWriter.close();

        String xmlstring = sw.getBuffer().toString();
        sw.close();
        System.out.println(xmlstring);
    }
}
