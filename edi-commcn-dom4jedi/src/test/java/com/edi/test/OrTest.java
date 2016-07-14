package com.edi.test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

import com.edi.commcn.edi.bean.eid.RequestOrder;
import com.edi.dom4j.OrderToEdiOrder;
import com.edi.manage.pojo.EdiUser;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class OrTest
{

	private EdiUser ediUser;

	private SAXReader reader = new SAXReader();

	private XmlMapper Mapper = new XmlMapper();

	@Before
	public void setUp() throws Exception
	{
		ediUser = new EdiUser();
	}

	@Test
	public void test() throws Exception
	{
		Document document = reader.read(new File("F:\\1.xml"));
		Node list = document.selectSingleNode("//OrderNo");

		System.out.println(list.getText());

	}

	long starTime;

	RequestOrder requestorder = new RequestOrder();

	@Test
	public void RequestOrderToXml_Test_1() throws Exception
	{
		RequestOrder requestorder = new RequestOrder();

		Document document = reader.read(new File("F:\\2.xml"));
		starTime = System.nanoTime();
		Field[] fields = RequestOrder.class.getFields();

		Map<String, Field> fieldNameMap = new HashMap<String, Field>();
		for (Field c : fields)
			fieldNameMap.put(c.getName(), c);

		Element element = document.getRootElement();
		Element requestorders = element.element("requestorders").element("requestorders");
		List<Element> listElements = requestorders.elements();
		for (Element e : listElements)
		{
			int i = e.nodeCount();
			if (e.nodeCount() == 1)
			{
				Field fieldName = fieldNameMap.get(e.getName());
				if (fieldName != null)
				{

				}
			}
		}
		System.out.println("时间" + ((System.nanoTime() - starTime) / 100000));

		String outClass = Mapper.writeValueAsString(requestorder);
		System.out.println(outClass);

	}

	@Test
	public void RequestOrderToXml_Test_2() throws Exception
	{
		Document EdiUserDocument = reader.read(new File("F:\\2.xml"));// 配置表数据

		Document orderDocument = reader.read(new File("F:\\1.xml"));// 下单数据

		starTime = System.nanoTime();
		Element Edi = DocumentHelper.createDocument().addElement("RequestOrder");// 发送Edi数据

		Element requestorders = EdiUserDocument.getRootElement().element("requestorders")
				.element("requestorders");// 获取订单配置数据

		Out(orderDocument, Edi, requestorders);
		System.out.println("时间" + ((System.nanoTime() - starTime) / 1000000));

	}

	private void Out(Document orderDocument, Element Edi, Element requestorders)
	{
		List<Element> listElements = requestorders.elements();
		for (Element e : listElements)
		{
			if (e.nodeCount() != 1)// 是否有下级节点
			{
				continue;
			}
			String TestValuse = e.getTextTrim();
			if (TestValuse == null || TestValuse == "")
			{
				continue;
			}
			if (TestValuse.contains("default_"))
			{
				Edi.addElement(e.getName()).addText(TestValuse.replace("default_", ""));
				continue;
			}

			String text = "";
			List<Element> nodesList = orderDocument.selectNodes(TestValuse);
			if (nodesList.size() > 1)
			{
				for (Element et : nodesList)
				{
					System.out.println(et.getName());
					text = text + "," + et.getText();
				}
				text = text.substring(1, text.length());
			}
			else
			{
				text = nodesList.get(0).getText();
			}

			Edi.addElement(e.getName()).addText(text.trim());

		}
	}

	@Test
	public void Test_4() throws Exception
	{
		Document orderDocument = reader.read(new File("F:\\1.xml"));// 下单数据
		List<Element> nodesList = orderDocument.selectNodes("//CodAMT");
		for (Element element : nodesList)
		{
			System.out.println(element.getName());

			System.out.println(element.getText());
		}
	}

	@Test
	public void Test_5() throws Exception
	{
		Document orderDocument = reader.read(new File("F:\\1.xml"));// 下单数据
		treeWalk(orderDocument.getRootElement());

	}

	public void treeWalk(Element ele)
	{
		System.out.println(ele.getName());
		System.out.println(ele.getUniquePath());
		for (int i = 0; i < ele.nodeCount(); i++)
		{
			Node node = ele.node(i);// 第i个结点
			if (node instanceof Element)
			{

				treeWalk((Element) node);
			}
		}
	}

	@Test
	public void Test_2() throws Exception
	{
		for (int i = 0; i < 100; i++)
		{
			starTime = System.nanoTime();
			RequestOrderToXml_Test_2();
			System.out.println("时间" + ((System.nanoTime() - starTime) / 1000000));
		}
	}

	@Test
	public void Test_3() throws Exception
	{

		MyTestPojo myTestPojo = new MyTestPojo();
		myTestPojo.setAge("18");
		myTestPojo.setName("WW");
		String pojoString = Mapper.writeValueAsString(myTestPojo); // 序列化
		// myTestPojo = Mapper.readValue(pojoString, MyTestPojo.class);// 反序列化
		System.out.println(myTestPojo.getAge());
		System.out.println(pojoString);
	}

	@Test
	public void Test_6() throws Exception
	{
		Document EdiUserDocument = reader.read(new File("F:\\2.xml"));// 配置表数据

		Document orderDocument = reader.read(new File("F:\\1.xml"));// 下单数据

		String EdiXML = OrderToEdiOrder.outEdiOrder(orderDocument.asXML(), EdiUserDocument.asXML());
		System.out.println(EdiXML);
	}

}
