package by.tc.task01.dao.parser.impl;


import by.tc.task01.dao.parser.exception.ParserException;
import by.tc.task01.entity.criteria.SearchCriteria.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class SaxApplianceParser {

        private static List<Map<String,String>> appliances;
        public List<Map<String,String>> parse(File db) throws SAXException, ParserException, IOException, ParserConfigurationException {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            appliances = new ArrayList();

            SaxHandler handler = new SaxHandler();

            parser.parse(db,handler);
            return appliances;
        }

        private static class SaxHandler extends DefaultHandler {
            String currentParameter;
            String currentApplianceCategory;
            Map<String,String> oneAppliance;
            boolean inAppliance = false;

            public boolean isCategory(String qName){
                return  qName.equals(AllAppliances.OVEN.toString().toLowerCase())||
                        qName.equals(AllAppliances.LAPTOP.toString().toLowerCase())||
                        qName.equals(AllAppliances.REFRIGERATOR.toString().toLowerCase())||
                        qName.equals(AllAppliances.VACUUMCLEANER.toString().toLowerCase())||
                        qName.equals(AllAppliances.TABLEPC.toString().toLowerCase())||
                        qName.equals(AllAppliances.SPEAKERS.toString().toLowerCase());
            }

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
                if(isCategory(qName)){
                    oneAppliance = new HashMap<>();
                    oneAppliance.put("CATEGORY",qName);
                    inAppliance = true;
                    currentApplianceCategory = qName;
                }else{
                    currentParameter = qName;
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException{
                if(qName.equals(currentApplianceCategory)){
                    inAppliance = false;
                    appliances.add(oneAppliance);
                }
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                if (inAppliance) {
                    String valueOfParameter = new String(ch, start, length);
                    valueOfParameter = valueOfParameter.replace("\n", "").trim();
                    if (!valueOfParameter.isEmpty()) {
                        oneAppliance.put(currentParameter.toUpperCase(), valueOfParameter);
                    }
                }
            }
        }

}
