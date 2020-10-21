package Lesson26;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Task14 {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootEl = doc.createElement("class");
        doc.appendChild(rootEl);

        Element student = doc.createElement("student");
        rootEl.appendChild(student);

        Attr attr1 = doc.createAttribute("rollno");
        attr1.setValue("393");
        student.setAttributeNode(attr1);

        Element fn = doc.createElement("firstname");
        fn.appendChild(doc.createTextNode("dinkar"));
        student.appendChild(fn);

        Element ln = doc.createElement("lastname");
        ln.appendChild(doc.createTextNode("kad"));
        student.appendChild(ln);

        Element nn = doc.createElement("nickname");
        nn.appendChild(doc.createTextNode("dinkar"));
        student.appendChild(nn);

        Element mr = doc.createElement("marks");
        mr.appendChild(doc.createTextNode("85"));
        student.appendChild(mr);

        Element student2=doc.createElement("student");
        rootEl.appendChild(student2);

        Attr attr2=doc.createAttribute("rollno");
        attr2.setValue("493");
        student2.setAttributeNode(attr2);

        Element fn2= doc.createElement("firstname");
        fn2.appendChild(doc.createTextNode("Vaneet"));
        student2.appendChild(fn2);

        Element ln2=doc.createElement("lastname");
        ln2.appendChild(doc.createTextNode("Gupta"));
        student2.appendChild(ln2);

        Element nn2=doc.createElement("nickname");
        nn2.appendChild(doc.createTextNode("vinni"));
        student2.appendChild(nn2);

        Element mr2=doc.createElement("marks");
        mr2.appendChild(doc.createTextNode("95"));
        student2.appendChild(mr2);

        Element student3=doc.createElement("student");
        rootEl.appendChild(student3);

        Attr attr3=doc.createAttribute("rollno");
        attr3.setValue("593");
        student3.setAttributeNode(attr3);

        Element fn3=doc.createElement("firstname");
        fn3.appendChild(doc.createTextNode("jasvir"));
        student3.appendChild(fn3);

        Element ln3=doc.createElement("lastname");
        ln3.appendChild(doc.createTextNode("singn"));
        student3.appendChild(ln3);

        Element nn3=doc.createElement("nickname");
        nn3.appendChild(doc.createTextNode("jazz"));
        student3.appendChild(nn3);

        Element mr3=doc.createElement("marks");
        mr3.appendChild(doc.createTextNode("90"));
        student3.appendChild(mr3);

        TransformerFactory trFactory = TransformerFactory.newInstance();
        Transformer trans = trFactory.newTransformer();
        DOMSource srce = new DOMSource(doc);
        StreamResult streamResult = new StreamResult(new File("newstudents.xml"));
        trans.transform(srce, streamResult);

        StreamResult resultToConsole = new StreamResult(System.out);
        trans.transform(srce, resultToConsole);

    }
}
