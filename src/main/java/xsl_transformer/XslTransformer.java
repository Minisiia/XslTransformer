package xsl_transformer;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XslTransformer {

    public static void xslTransform(String taskFolder, String xslFile, String sourceXmlFile, String transformedFile) {
        String path = "src/main/resources/";
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            // установка используемого XSL-преобразования
            Transformer transformer = tf.newTransformer(new StreamSource(path + taskFolder + "/" + xslFile));
            // установка исходного XML-документа и конечного XML-файла
            transformer.transform(new StreamSource(path + taskFolder + "/" + sourceXmlFile),
                    new StreamResult(path + taskFolder + "/" + transformedFile));
            System.out.println("Transform complete");
        } catch (
                TransformerException e) {
            System.err.println("Impossible transform file: " + e);
        }
    }
}
