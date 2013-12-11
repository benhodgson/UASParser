package cz.mallat.uasparser;

import java.io.IOException;

import org.junit.Test;

import cz.mallat.uasparser.CachingOnlineUpdateUASparser;
import cz.mallat.uasparser.OnlineUpdateUASparser;
import cz.mallat.uasparser.UASparser;
import cz.mallat.uasparser.UserAgentInfo;

/**
 * No real JUnit tests
 * 
 * @author oli
 *
 */
public class TestParsers {

	@Test
	public void runUAParser() throws IOException {
		UASparser p = new UASparser("src/main/resources/data.txt");
		UserAgentInfo uai = p.parse("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.0.12) Gecko/2009070611 Firefox/3.0.12");
		System.out.println("type:" + uai.getTyp());
		System.out.println("ua_name:" + uai.getUaName());
		System.out.println("ua_family:" + uai.getUaFamily());
		System.out.println("ua_producer:" + uai.getUaCompany());
		System.out.println("os_name:" + uai.getOsName());
		System.out.println("os_family:" + uai.getOsFamily());
		System.out.println("os_producer:" + uai.getOsCompany());
		
		System.out.println("\n\n");
		
//		uai = p.parse("Mozilla/5.0 (compatible; 80bot/0.71; http://www.80legs.com/spider.html;) Gecko/2008032620");
		uai = p.parse("Mozilla/5.0 (compatible; 008/0.83; http://www.80legs.com/webcrawler.html) Gecko/2008032620");
		System.out.println("type:" + uai.getTyp());
		System.out.println("ua_name:" + uai.getUaName());
		System.out.println("ua_family:" + uai.getUaFamily());
		System.out.println("ua_producer:" + uai.getUaCompany());
		System.out.println("os_name:" + uai.getOsName());
		System.out.println("os_family:" + uai.getOsFamily());
		System.out.println("os_producer:" + uai.getOsCompany());
		
		
	}

	@Test
	public void runOnlineUAParser() throws IOException {
		UASparser p = new OnlineUpdateUASparser();
		UserAgentInfo uai = p.parse("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.0.12) Gecko/2009070611 Firefox/3.0.12");
		System.out.println("type:" + uai.getTyp());
		System.out.println("ua_name:" + uai.getUaName());
		System.out.println("ua_family:" + uai.getUaFamily());
		System.out.println("ua_producer:" + uai.getUaCompany());
		System.out.println("os_name:" + uai.getOsName());
		System.out.println("os_family:" + uai.getOsFamily());
		System.out.println("os_producer:" + uai.getOsCompany());
	}

	@Test
	public void runCachedOnlineUAParser() throws IOException {
		UASparser p = new CachingOnlineUpdateUASparser();
		UserAgentInfo uai = p.parse("Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.0.12) Gecko/2009070611 Firefox/3.0.12");
		System.out.println("type:" + uai.getTyp());
		System.out.println("ua_name:" + uai.getUaName());
		System.out.println("ua_family:" + uai.getUaFamily());
		System.out.println("ua_producer:" + uai.getUaCompany());
		System.out.println("os_name:" + uai.getOsName());
		System.out.println("os_family:" + uai.getOsFamily());
		System.out.println("os_producer:" + uai.getOsCompany());
	}

}
