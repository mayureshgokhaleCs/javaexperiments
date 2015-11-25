


import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.*;


public class XmlFileReader extends Prompter {

    public static void main(String[] args) throws Exception {
        System.out.println("Reading Xml File using SAX API");
        System.out.println(Step1);
        System.out.println(Step2);
        SAXParserFactory spf = SAXParserFactory.newInstance();
        System.out.println(Step3);
        SAXParser sp = spf.newSAXParser();
        System.out.println(Step4);
        String xmlFilePath
                = "test.xml";
        System.out.println(Step5);
        System.out.println(Step6);
        FileInputStream fis = new FileInputStream(xmlFilePath);
        System.out.println(Step7);
        System.out.println(Step8);
        System.out.println(Step9);
        Handler h = new Handler();
        System.out.println(Step10);
        sp.parse(fis, h);
    }

}
class Handler extends DefaultHandler {

    
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        super.endElement(uri, localName, qName);
        System.out.println("End Element " + qName);
    }


    public void startElement(String uri, String localName,
            String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attribute Name = "
                    + attributes.getQName(i));
            System.out.println("Attribute Value = "
                    + attributes.getValue(i));
        }
    }
    public void characters(char[] ch,
            int start,
            int length) throws SAXException {
        String s = new String(ch, start, length);
        System.out.println("Text Content:" + s);
    }


    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("End Document");
    }

  
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("Start Document");
    }

}

 class Prompter  {

    public static String Step1
            = "referring imported package "
            + "javax.xml.parsers for SAXParserFactory ";
    public static String Step2
            = "Creating instance of SAXParserFactory";
    public static String Step3
            = "Creating instance of SAXParser";
    public static String Step4
            = "Creating String that stores path to xml file";
    public static String Step5
            = "Refering imported package java.io "
            + "for FileInputStream";
    public static String Step6
            = "Creating instance of FileInputStream "
            + "for reading the xml file";
    public static String Step7
            = "Referring package org.xml.sax.handler"
            + " for DefaultHandler";
    public static String Step8
            = "Creating 'Handler' a subclass of "
            + "DefaultHandler for"
            + " handling Parsing events";
    public static String Step9
            = "Handler overrides startDocument, "
            + "endDocument, startElement, endElement";
    public static String Step10
            = "Invoke parse method on parser object"
            + "\npass FileInputStream and Handler "
            + "instance as parameters";
}

