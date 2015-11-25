
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class xmldomtesting
{

    public static void main(String[] args) throws Exception
    {

        DocumentBuilderFactory dbf =
                        DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(
                                        new File("new.xml")
                                    );
        NodeList nl = doc.getChildNodes();
        ArrayList<Node> nodeSet = new ArrayList<>();
        nodeSet.add(nl.item(0));
        while (nodeSet.size() > 0)
        {
            Node n = nodeSet.remove(0);
            if (n.hasChildNodes())
            {
                NodeList temp = n.getChildNodes();

                for (int j = 0; j < temp.getLength(); j++)
                {
                    nodeSet.add(temp.item(j));
                }

                String content = n.getTextContent();
                String name = n.getNodeName();
                System.out.println("---------------------");
                System.out.println("name : " + name);
                System.out.println("content : " + content);
                System.out.print("Attributes : ");
                NamedNodeMap nnm = n.getAttributes();
                if (nnm != null)
                {
                    for (int i = 0; i < nnm.getLength(); i++)
                    {
                        System.out.print(nnm.item(i).getNodeName());
                        System.out.println("="+nnm.item(i).getTextContent());
                      }
                    System.out.println("------------------\n\n\n" );
                } else
                {
                    System.out.println(" No Attributes");
                }
            }
        }
        
    }
}