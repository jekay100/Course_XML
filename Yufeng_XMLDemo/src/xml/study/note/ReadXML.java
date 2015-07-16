package xml.study.note ;
import java.io.File;
import java.util.Iterator;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ReadXML {
	public static void main(String[] args) {

	}

	// 从文件中读取xml,输入文件名，返回xml文档
	public Document read(String fileName) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File(fileName));
		return document;
	}

	public Element getRootElement(Document doc) {
		return doc.getRootElement();
	}

	public void list(Element root) {
		Iterator it = root.elementIterator("计算机书籍");
		while(it.hasNext()) {
			Attribute attribute = (Attribute)it.next();
			System.out.println(attribute.getName() +":" + attribute.getValue());
		}
	}

}
