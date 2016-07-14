package com.edi.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class OrderToEdiOrder
{

	/**
	 *  将下单数据  转换 成EDI 数据
	 * @param order 订单数据
	 * @param User	用户配置数据
	 * @return
	 * @throws Exception 
	 */
	public static String outEdiOrder(String order, String User) throws Exception
	{

		Long startLong = System.currentTimeMillis();

		Document ediUserDocument = DocumentHelper.parseText(User);// 用户配置数据
		Element ediUserRoot = ediUserDocument.getRootElement();
		Element requestorders = ediUserRoot.element("requestorders").element("requestorders");// 获取订单配置数据

		Document orderDocument = DocumentHelper.parseText(order);// 订单数据

		Element Edi = DocumentHelper.createDocument().addElement("RequestOrder");// 发送Edi数据

		Edi.addElement("logisticProviderID").addText(
				ediUserRoot.element("clientflag").getTextTrim());

		// 生成一级数据
		Out(orderDocument, Edi, requestorders);

		// 生成发件人数据
		Element ediSender = Edi.addElement("sender");
		Element userSender = requestorders.element("sender");
		Out(orderDocument, ediSender, userSender);

		// 生成收件人数据
		Element ediReceiver = Edi.addElement("receiver");
		Element userReceiver = requestorders.element("receiver");
		Out(orderDocument, ediReceiver, userReceiver);

		System.out.println("时间：" + (System.currentTimeMillis() - startLong));
		return Edi.asXML();
	}

	/**
	 * 根据 用户配置节点 自动从数据源 查找数据 生成 EDI 数据节点
	 * 
	 * @param orderDocument   数据源
	 * @param Edi			EDI 数据节点
	 * @param requestorders	用户配置节点
	 */
	private static void Out(Document orderDocument, Element Edi, Element requestorders)
	{
		List<Element> listElements = requestorders.elements();
		for (Element e : listElements)
		{
			// 是否有下级节点
			if (e.nodeCount() != 1) continue;

			String TestValuse = e.getTextTrim();
			if (TestValuse == null || TestValuse == "") continue;

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
					text = text + "," + et.getText();
				text = text.substring(1, text.length());
			}
			else text = nodesList.get(0).getText();

			Edi.addElement(e.getName()).addText(text.trim());
		}
	}

}
