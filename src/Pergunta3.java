import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Pergunta3 {
    public static void main(String[] args) throws Exception {
        // Exemplo utilizado para realizar este exercício
        // https://www.tutorialspoint.com/java_xml/java_xpath_parse_document.htm#
        File xmlArquivo = new File("src/dados.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document documento = dBuilder.parse(xmlArquivo);
        documento.getDocumentElement().normalize();

        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile("/valores/row").evaluate(
                documento, XPathConstants.NODESET);

        double menorValorFaturado = 0.0;
        double maiorValorFaturado = 0.0;

        List<Double> valores = new ArrayList<>();
        double total = 0;
        double media;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nNode;
                double valorDia = Double.parseDouble(elemento.getElementsByTagName("valor").item(0).getTextContent());
                if (valorDia != 0.0) {
                    if (menorValorFaturado == 0.0 && maiorValorFaturado == 0.0) {
                        menorValorFaturado = valorDia;
                        maiorValorFaturado = valorDia;
                    } else {
                        if (menorValorFaturado > valorDia) {
                            menorValorFaturado = valorDia;
                        }

                        if (maiorValorFaturado < valorDia) {
                            maiorValorFaturado = valorDia;
                        }
                    }
                    total = total + valorDia;
                    valores.add(valorDia);
                }
            }
        }

        media = total / valores.size();
        int diasSuperiorMedia = 0;
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) > media) {
                diasSuperiorMedia = diasSuperiorMedia + 1;
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês é: " + menorValorFaturado);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês é: " + maiorValorFaturado);
        System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal é: " + diasSuperiorMedia);
    }
}
