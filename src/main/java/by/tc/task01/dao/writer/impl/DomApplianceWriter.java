package by.tc.task01.dao.writer.impl;

import by.tc.task01.dao.writer.exception.DOMException;
import by.tc.task01.entity.Appliance;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DomApplianceWriter {

    public void add(Appliance appliance, File db) throws SAXException, DOMException, IOException, ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(db);

        Element allAppliances = document.getDocumentElement();

        Element newAppliance = document.createElement(appliance.getCategory().toLowerCase());

        Map<String, String> params = appliance.getParams();
        for(String param : params.keySet()){
            Element paramElement = document.createElement(param);
            paramElement.appendChild(document.createTextNode(params.get(param)));
            newAppliance.appendChild(paramElement);
        }
        allAppliances.appendChild(newAppliance);

        DOMSource source = new DOMSource(document);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult result = new StreamResult(db);
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);
    }
}
