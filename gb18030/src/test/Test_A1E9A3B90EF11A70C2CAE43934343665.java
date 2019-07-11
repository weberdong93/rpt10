/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Web UI Test
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.core.impl.MetaString;
import com.ibm.rational.test.lt.execution.core.impl.ZipEntryProxy;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Test_A1E9A3B90EF11A70C2CAE43934343665 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(82);
	private DataVar[] vars = new DataVar[18];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Test_A1E9A3B90EF11A70C2CAE43934343665(IContainer container, String invocationId) {
		super(container, "gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2", invocationId, "A1E9A3B90EF11A70C2CAE43934343665");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("\u9875\u9762\u6807\u9898\u9A8C\u8BC1\u5931\u8D25"), 1, "\u9875\u9762\u6807\u9898\u9A8C\u8BC1\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("\u54CD\u5E94\u4EE3\u7801\u9A8C\u8BC1\u5931\u8D25"), 1, "\u54CD\u5E94\u4EE3\u7801\u9A8C\u8BC1\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("\u54CD\u5E94\u5927\u5C0F\u9A8C\u8BC1\u5931\u8D25"), 1, "\u54CD\u5E94\u5927\u5C0F\u9A8C\u8BC1\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("\u5185\u5BB9\u9A8C\u8BC1\u70B9\u5931\u8D25"), 1, "\u5185\u5BB9\u9A8C\u8BC1\u70B9\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("\u8FDE\u63A5\u5931\u8D25"), 1, "\u8FDE\u63A5\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("\u8BA4\u8BC1\u5931\u8D25"), 1, "\u8BA4\u8BC1\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("\u5DF2\u8FBE\u5230\u6570\u636E\u96C6\u672B\u5C3E"), 1, "\u5DF2\u8FBE\u5230\u6570\u636E\u96C6\u672B\u5C3E"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("\u62BD\u53D6\u5F15\u7528\u5931\u8D25"), 1, "\u62BD\u53D6\u5F15\u7528\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("\u66FF\u6362\u5931\u8D25"), 1, "\u66FF\u6362\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("\u8D85\u65F6"), 1, "\u8D85\u65F6"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("\u5B9A\u5236\u9A8C\u8BC1\u70B9\u5931\u8D25"), 1, "\u5B9A\u5236\u9A8C\u8BC1\u70B9\u5931\u8D25"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("\u5B9A\u5236\u6838\u5FC3\u62A5\u544A\u8B66\u62A5"), 0, "\u5B9A\u5236\u6838\u5FC3\u62A5\u544A\u8B66\u62A5"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("\u5B9A\u5236\u4EE3\u7801\u62A5\u544A\u4E86\u672A\u5904\u7406\u7684\u5F02\u5E38"), 1, "\u5B9A\u5236\u4EE3\u7801\u62A5\u544A\u4E86\u672A\u5904\u7406\u7684\u5F02\u5E38"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(confCon_6(this));
	this.add(confCon_7(this));
	this.add(confCon_8(this));
	this.add(confCon_9(this));
	this.add(page_1(this));
	this.add(page_2(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Test_A1E9A3B90EF11A70C2CAE43934343665 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E9A3B90F4F6710C2CAE43934343665");	
			vars[0] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host", "iecvlist.microsoft.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_1", "r20swj13mr.microsoft.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_2", "cn.bing.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_3", "login.microsoftonline.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_4", "p8.qhimg.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_5", "s.cn.bing.net", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_6", "login.live.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_7", "www2.bing.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_8", "www.bing.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[9] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[10] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[11] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_3_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[12] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_4_Port", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[13] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_5_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[14] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_6_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[15] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_7_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[16] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[17] = new DataVar("gbtest\u901A\u20AC\u3400\u1820\uA007\u0F10\u0628\u0629\u32A3\u90C2_Host_8_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[8].getValue()== null?"www.bing.com": (String)vars[8].getValue()),  // host name
					Integer.parseInt((String)(vars[17].getValue()== null?"443": (String)vars[17].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[2].getValue()== null?"cn.bing.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[16].getValue()== null?"443": (String)vars[16].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_3(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[7].getValue()== null?"www2.bing.com": (String)vars[7].getValue()),  // host name
					Integer.parseInt((String)(vars[15].getValue()== null?"443": (String)vars[15].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_4(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_4",
					(String)(vars[6].getValue()== null?"login.live.com": (String)vars[6].getValue()),  // host name
					Integer.parseInt((String)(vars[14].getValue()== null?"443": (String)vars[14].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_5(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[5].getValue()== null?"s.cn.bing.net": (String)vars[5].getValue()),  // host name
					Integer.parseInt((String)(vars[13].getValue()== null?"443": (String)vars[13].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_6(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_6",
					(String)(vars[4].getValue()== null?"p8.qhimg.com": (String)vars[4].getValue()),  // host name
					Integer.parseInt((String)(vars[12].getValue()== null?"80": (String)vars[12].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_7(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_7",
					(String)(vars[3].getValue()== null?"login.microsoftonline.com": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[11].getValue()== null?"443": (String)vars[11].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_8(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_8",
					(String)(vars[1].getValue()== null?"r20swj13mr.microsoft.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[10].getValue()== null?"443": (String)vars[10].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_9(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_9",
					(String)(vars[0].getValue()== null?"iecvlist.microsoft.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[9].getValue()== null?"443": (String)vars[9].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1E9A3B910039BE7C2CAE43934343665");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "\u5FAE\u8F6F Bing \u641C\u7D22 - \u56FD\u5185\u7248", "A1E9A3B910039BE7C2CAE43934343665") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(20, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E9A3B90FFFA440C2CAE43934343665", true, false,
						"Config_1", "www.bing.com:443/favicon.ico",	"/favicon.ico", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_2(this, false, "A1E9A3B9101946C0C2CAE43934343665", true, false,
						"Config_1", "www.bing.com:443/favicon.ico",	"/favicon.ico", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_3(this, false, "A1E9A3B9101AF470C2CAE43934343665", true, false,
						"Config_1", "www.bing.com:443/search",	"/search", true, false), 3203, 100, "A1E9A3B9101946CEC2CAE43934343665", 3);
				httpParallel.addRequest(3, request_4(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/search",	"/search", true, false), 131, 100, "A1E9A3B9101B69A0C2CAE43934343665", 3);
				httpParallel.addRequest(3, request_5(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, true,
						"Config_2", "cn.bing.com:443/?scope=web",	"/?scope=web", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_6(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/2U/vY/ic/e19fde95/ce98ce99.png",	"/rs/2U/vY/ic/e19fde95/ce98ce99.png", true, false), 110, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_7(this, false, "A1E9A3B910230AC0C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/5m/1o4/cj,nj/2213d9b6/b50738ca.js",	"/rs/5m/1o4/cj,nj/2213d9b6/b50738ca.js", true, false), 108, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_8(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/th?id=OHR.IndiaLitSpace_ZH-CN5941074986_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp",	"/th?id=OHR.IndiaLitSpace_ZH-CN5941074986_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp", true, false), 184, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_9(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&Type=Event.CPT&DATA={\"pp\":{\"S\":\"L\",\"FC\":-1,\"BC\":-1,\"SE\":-1,\"TC\":-1,\"H\":647,\"BP\":891,\"CT\":1302,\"IL\":2},\"ad\":[-1,-1,967,513,967,513,1]}&P=SERP&DA=HK2",	"/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&Type=Event.CPT&DATA={\"pp\":{\"S\":\"L\",\"FC\":-1,\"BC\":-1,\"SE\":-1,\"TC\":-1,\"H\":647,\"BP\":891,\"CT\":1302,\"IL\":2},\"ad\":[-1,-1,967,513,967,513,1]}&P=SERP&DA=HK2", true, false), 1375, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_10(this, false, "A1E9A3B910230AC0C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/lsp.aspx?",	"/fd/ls/lsp.aspx?", true, false), 1386, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(3, request_11(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rb/5m/cj,nj/c44ec255/9a358300.js?bu=EsAf4h-FH4of6gSYH5of7h-cH6MfrB_aH9gfyR-2HsMdxh25Hg",	"/rb/5m/cj,nj/c44ec255/9a358300.js?bu=EsAf4h-FH4of6gSYH5of7h-cH6MfrB_aH9gfyR-2HsMdxh25Hg", true, false), 1390, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_12(this, false, "A1E9A3B910230AC0C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/2U/lk/cj,nj/9db917e6/0d24f4f4.js",	"/rs/2U/lk/cj,nj/9db917e6/0d24f4f4.js", true, false), 1556, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(3, request_13(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/notifications/render?bnptrigger=%7B%22PartnerId%22%3A%22HomePage%22%2C%22IID%22%3A%22SERP.2000%22%2C%22Attributes%22%3A%7B%22RawRequestURL%22%3A%22%2F%3Fscope%3Dweb%22%7D%7D&IG=8A2BF0B210ED4930B98D0A30F5709DA4&IID=SERP.2000",	"/notifications/render?bnptrigger=%7B%22PartnerId%22%3A%22HomePage%22%2C%22IID%22%3A%22SERP.2000%22%2C%22Attributes%22%3A%7B%22RawRequestURL%22%3A%22%2F%3Fscope%3Dweb%22%7D%7D&IG=8A2BF0B210ED4930B98D0A30F5709DA4&IID=SERP.2000", true, false), 1574, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_14(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/2U/hi/cj,nj/30d323db/3c6a060a.js",	"/rs/2U/hi/cj,nj/30d323db/3c6a060a.js", true, false), 1577, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_15(this, false, "A1E9A3B910230AC0C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/HPImageArchive.aspx?format=js&idx=0&n=1&nc=1562835059233&pid=hp&scope=web",	"/HPImageArchive.aspx?format=js&idx=0&n=1&nc=1562835059233&pid=hp&scope=web", true, false), 1984, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_16(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/th?id=OHR.NightofNights_ZH-CN5872572560_1920x1080.jpg&amp;rf=LaDigue_1920x1080.jpg&amp;pid=hp",	"/th?id=OHR.NightofNights_ZH-CN5872572560_1920x1080.jpg&amp;rf=LaDigue_1920x1080.jpg&amp;pid=hp", true, false), 1986, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(3, request_17(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&Type=Event.PPT&DATA={\"S\":71,\"E\":1984,\"T\":0,\"I\":0,\"N\":{\"H\":{\"S\":1921,\"E\":1922,\"T\":1}},\"M\":{}}&P=SERP&DA=HK2",	"/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&Type=Event.PPT&DATA={\"S\":71,\"E\":1984,\"T\":0,\"I\":0,\"N\":{\"H\":{\"S\":1921,\"E\":1922,\"T\":1}},\"M\":{}}&P=SERP&DA=HK2", true, false), 2054, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(6, request_18(this, false, "A1E9A3B91039C710C2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/rb/G/cj,nj/8164143f/712357a2.js?bu=HDjVAdgB2wEtLS0t3gHDAS0tLS0tLZIBoQGkAboBLS29AS0tLegBpwE",	"/rb/G/cj,nj/8164143f/712357a2.js?bu=HDjVAdgB2wEtLS0t3gHDAS0tLS0tLZIBoQGkAboBLS29AS0tLegBpwE", true, false), 2008, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(7, request_19(this, false, "A1E9A3B9103B74C0C2CAE43934343665", true, false,
						"Config_3", "www2.bing.com:443/ipv6test/test",	"/ipv6test/test", true, false), 2097, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(8, request_20(this, false, "A1E9A3B9103BE9FFC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/ipv6test/test?FORM=MONITR",	"/ipv6test/test?FORM=MONITR", true, false), 2015, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_21(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=&cp=0&css=1&cvid=8A2BF0B210ED4930B98D0A30F5709DA4",	"/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=&cp=0&css=1&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", true, false), 2970, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_22(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=i&cp=0&cvid=8A2BF0B210ED4930B98D0A30F5709DA4",	"/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=i&cp=0&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", true, false), 3233, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(8, request_23(this, false, "A1E9A3B9103BE9FFC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=ib&cp=0&cvid=8A2BF0B210ED4930B98D0A30F5709DA4",	"/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=ib&cp=0&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", true, false), 3321, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_24(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=ibm&cp=0&cvid=8A2BF0B210ED4930B98D0A30F5709DA4",	"/AS/Suggestions?pt=page.home&scope=web&mkt=zh-cn&ds=mobileweb&qry=ibm&cp=0&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", true, false), 3430, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(8, request_25(this, false, "A1E9A3B9103BE9FFC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&TYPE=Event.ClientInst&DATA=%5B%7B%22T%22%3A%22CI.Init%22%2C%22FID%22%3A%22CI%22%2C%22Name%22%3A%22Base%22%2C%22TS%22%3A1562835058801%7D%2C%7B%22Time%22%3A1802%2C%22T%22%3A%22CI.Latency%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22W3C_ImageStart%22%2C%22TS%22%3A1562835058801%7D%2C%7B%22RTT%22%3A%221692%22%2C%22T%22%3A%22CI.Init%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22ClientPerf%22%2C%22TS%22%3A1562835058823%7D%2C%7B%22w%22%3A%221440%22%2C%22h%22%3A%22900%22%2C%22dpr%22%3A%221%22%2C%22T%22%3A%22CI.Init%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22ClientScreen%22%2C%22TS%22%3A1562835058824%7D%2C%7B%22Time%22%3A1539%2C%22T%22%3A%22CI.Latency%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22sBoxTime%22%2C%22TS%22%3A1562835058824%7D%5D",	"/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&TYPE=Event.ClientInst&DATA=%5B%7B%22T%22%3A%22CI.Init%22%2C%22FID%22%3A%22CI%22%2C%22Name%22%3A%22Base%22%2C%22TS%22%3A1562835058801%7D%2C%7B%22Time%22%3A1802%2C%22T%22%3A%22CI.Latency%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22W3C_ImageStart%22%2C%22TS%22%3A1562835058801%7D%2C%7B%22RTT%22%3A%221692%22%2C%22T%22%3A%22CI.Init%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22ClientPerf%22%2C%22TS%22%3A1562835058823%7D%2C%7B%22w%22%3A%221440%22%2C%22h%22%3A%22900%22%2C%22dpr%22%3A%221%22%2C%22T%22%3A%22CI.Init%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22ClientScreen%22%2C%22TS%22%3A1562835058824%7D%2C%7B%22Time%22%3A1539%2C%22T%22%3A%22CI.Latency%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22sBoxTime%22%2C%22TS%22%3A1562835058824%7D%5D", true, false), 3690, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(9, request_26(this, false, "A1E9A3B9103FBA97C2CAE43934343665", true, false,
						"Config_4", "login.live.com:443/login.srf?wa=wsignin1.0&rpsnv=11&ct=1562835057&rver=6.0.5286.0&wp=MBI_SSL&wreply=https:%2F%2fcn.bing.com%2Fsecure%2FPassport.aspx%3Fpopup%3D1%26ssl%3D1&lc=2052&id=264960&checkda=1",	"/login.srf?wa=wsignin1.0&rpsnv=11&ct=1562835057&rver=6.0.5286.0&wp=MBI_SSL&wreply=https:%2F%2fcn.bing.com%2Fsecure%2FPassport.aspx%3Fpopup%3D1%26ssl%3D1&lc=2052&id=264960&checkda=1", true, false), 2166, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(8, request_27(this, false, "A1E9A3B9103BE9FFC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/GLinkPing.aspx?IG=8A2BF0B210ED4930B98D0A30F5709DA4&ID=SERP,5092.1",	"/fd/ls/GLinkPing.aspx?IG=8A2BF0B210ED4930B98D0A30F5709DA4&ID=SERP,5092.1", true, false), 3985, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(8, request_28(this, false, "A1E9A3B9103BE9FFC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&TYPE=Event.ClientInst&DATA=%5B%7B%22T%22%3A%22CI.show%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22EmptySbClick%22%2C%22TS%22%3A1562835061232%7D%5D",	"/fd/ls/l?IG=8A2BF0B210ED4930B98D0A30F5709DA4&TYPE=Event.ClientInst&DATA=%5B%7B%22T%22%3A%22CI.show%22%2C%22FID%22%3A%22HP%22%2C%22Name%22%3A%22EmptySbClick%22%2C%22TS%22%3A1562835061232%7D%5D", true, false), 4313, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_29(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/lsp.aspx",	"/fd/ls/lsp.aspx", true, false), 4347, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(10, request_30(this, false, "A1E9A3B910436412C2CAE43934343665", false, false,
						"Config_5", "s.cn.bing.net:443/th?id=A5dd4312fdbba3da97be3b57098badc79&w=39&h=39&c=7&rs=1&qlt=90&p=0&cdv=1&pid=RS",	"/th?id=A5dd4312fdbba3da97be3b57098badc79&w=39&h=39&c=7&rs=1&qlt=90&p=0&cdv=1&pid=RS", true, false), 4133, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_31(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/secure/Passport.aspx?popup=1&ssl=1",	"/secure/Passport.aspx?popup=1&ssl=1", true, false), 4961, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_32(this, false, "A1E9A3B910230AC0C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4",	"/?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", true, false), 4993, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(11, request_33(this, false, "A1E9A3B910447583C2CAE43934343665", false, false,
						"Config_5", "s.cn.bing.net:443/th?id=AMMS_8e4f4cb3d28dca4db81bea3d053063cd&w=39&h=39&c=7&rs=1&qlt=90&p=0&cdv=1&pid=RS",	"/th?id=AMMS_8e4f4cb3d28dca4db81bea3d053063cd&w=39&h=39&c=7&rs=1&qlt=90&p=0&cdv=1&pid=RS", true, false), 4133, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(3, request_34(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4",	"/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", true, false), 5116, 100, "A1E9A3B9101DDAA3C2CAE43934343665", 2);
				httpParallel.addRequest(3, request_35(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/5m/Qa/ic/ead77415/3938fd08.png",	"/rs/5m/Qa/ic/ead77415/3938fd08.png", true, false), 614, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(12, request_36(this, false, "A1E9A3B91048E260C2CAE43934343665", true, false,
						"Config_6", "p8.qhimg.com/t0160c17cb243d71af2.jpg?&w=96&h=54&rs=2&qlt=50",	"/t0160c17cb243d71af2.jpg?&w=96&h=54&rs=2&qlt=50", true, false), 380, 100, "A1E9A3B910484608C2CAE43934343665", 3);
				httpParallel.addRequest(3, request_37(this, false, "A1E9A3B9101C7B13C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/l?IG=6DB4DC28BEA04D21B351808FAA3F4631&Type=Event.CPT&DATA={\"pp\":{\"S\":\"L\",\"FC\":53,\"BC\":473,\"SE\":-1,\"TC\":-1,\"H\":565,\"BP\":1397,\"CT\":1411,\"IL\":10},\"ad\":[197,192,967,513,1089,3453,0]}&P=SERP&DA=HK2",	"/fd/ls/l?IG=6DB4DC28BEA04D21B351808FAA3F4631&Type=Event.CPT&DATA={\"pp\":{\"S\":\"L\",\"FC\":53,\"BC\":473,\"SE\":-1,\"TC\":-1,\"H\":565,\"BP\":1397,\"CT\":1411,\"IL\":10},\"ad\":[197,192,967,513,1089,3453,0]}&P=SERP&DA=HK2", true, false), 1458, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_38(this, false, "A1E9A3B910230AC0C2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/fd/ls/lsp.aspx?",	"/fd/ls/lsp.aspx?", true, false), 1462, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(10, request_39(this, false, "A1E9A3B910436412C2CAE43934343665", true, false,
						"Config_5", "s.cn.bing.net:443/th?id=OSA.xZT2Z7FL17rXpg&w=80&h=80&c=8&rs=1&pid=SatAns",	"/th?id=OSA.xZT2Z7FL17rXpg&w=80&h=80&c=8&rs=1&pid=SatAns", true, false), 1526, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(11, request_40(this, false, "A1E9A3B910447583C2CAE43934343665", true, false,
						"Config_5", "s.cn.bing.net:443/th?id=OSA.SebjEpVFvp32HA&w=100&h=43&c=6&pid=SatAns",	"/th?id=OSA.SebjEpVFvp32HA&w=100&h=43&c=6&pid=SatAns", true, false), 1530, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(4, request_41(this, false, "A1E9A3B910230AC0C2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/rs/5m/1bj/cj,nj/d5712f1a/e58e5083.js",	"/rs/5m/1bj/cj,nj/d5712f1a/e58e5083.js", true, false), 1625, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(8, request_42(this, false, "A1E9A3B9103BE9FFC2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/rs/5m/1bl/cj,nj/76f99305/3957e8df.js",	"/rs/5m/1bl/cj,nj/76f99305/3957e8df.js", true, false), 1626, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_43(this, false, "A1E9A3B91023F52DC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/5m/YB/cj,nj/8bf5c256/db475c97.js",	"/rs/5m/YB/cj,nj/8bf5c256/db475c97.js", true, false), 1631, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(13, request_44(this, false, "A1E9A3B91050AA71C2CAE43934343665", false, false,
						"Config_5", "s.cn.bing.net:443/th?id=OJ.IkDDOdOwp1505Q&w=75&h=75&pid=MSNJVFeeds",	"/th?id=OJ.IkDDOdOwp1505Q&w=75&h=75&pid=MSNJVFeeds", true, false), 1567, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(14, request_45(this, false, "A1E9A3B91050F8DDC2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/rs/5m/1bh/cj,nj/b559b0ca/c6f6e566.js",	"/rs/5m/1bh/cj,nj/b559b0ca/c6f6e566.js", true, false), 1709, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(15, request_46(this, false, "A1E9A3B910516DC3C2CAE43934343665", false, false,
						"Config_5", "s.cn.bing.net:443/th?id=OJ.9cDqf0j7Q4jC4A&w=75&h=75&pid=MSNJVFeeds",	"/th?id=OJ.9cDqf0j7Q4jC4A&w=75&h=75&pid=MSNJVFeeds", true, false), 1535, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(16, request_47(this, false, "A1E9A3B910520A00C2CAE43934343665", false, false,
						"Config_5", "s.cn.bing.net:443/th?id=OJ.o4HsYSRm2eYwBA&w=75&h=75&pid=MSNJVFeeds",	"/th?id=OJ.o4HsYSRm2eYwBA&w=75&h=75&pid=MSNJVFeeds", true, false), 1558, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(5, request_48(this, false, "A1E9A3B91023F52DC2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/rs/6n/Iq/cj,nj/1c2f626c/c9969752.js",	"/rs/6n/Iq/cj,nj/1c2f626c/c9969752.js", true, false), 2239, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(3, request_49(this, false, "A1E9A3B9101C7B13C2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/rs/6n/Iu/cj,nj/16be2a34/6323ce42.js",	"/rs/6n/Iu/cj,nj/16be2a34/6323ce42.js", true, false), 2240, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(17, request_50(this, false, "A1E9A3B91052F46BC2CAE43934343665", false, false,
						"Config_2", "cn.bing.com:443/rs/5m/1bn/cj,nj/a39998e4/6798a322.js",	"/rs/5m/1bn/cj,nj/a39998e4/6798a322.js", true, false), 1738, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(15, request_51(this, false, "A1E9A3B910516DC3C2CAE43934343665", true, false,
						"Config_5", "s.cn.bing.net:443/th?id=ODL.f83b9a759f87071932ad013c1f0a8f92&w=197&h=98&c=7&rs=1&qlt=80&pid=RichNav",	"/th?id=ODL.f83b9a759f87071932ad013c1f0a8f92&w=197&h=98&c=7&rs=1&qlt=80&pid=RichNav", true, false), 2597, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(16, request_52(this, false, "A1E9A3B910520A00C2CAE43934343665", true, false,
						"Config_5", "s.cn.bing.net:443/th?id=ODL.488d99f70a8e13c90c5cab2aaeed99c2&w=197&h=98&c=7&rs=1&qlt=80&pid=RichNav",	"/th?id=ODL.488d99f70a8e13c90c5cab2aaeed99c2&w=197&h=98&c=7&rs=1&qlt=80&pid=RichNav", true, false), 2598, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(13, request_53(this, false, "A1E9A3B91050AA71C2CAE43934343665", true, false,
						"Config_5", "s.cn.bing.net:443/th?id=ODL.1cb54e2af90dd141db9e8c28a2418f23&w=197&h=98&c=7&rs=1&qlt=80&pid=RichNav",	"/th?id=ODL.1cb54e2af90dd141db9e8c28a2418f23&w=197&h=98&c=7&rs=1&qlt=80&pid=RichNav", true, false), 2599, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(18, request_54(this, false, "A1E9A3B91054A247C2CAE43934343665", true, false,
						"Config_6", "p8.qhimg.com/t0160c17cb243d71af2.jpg?&w=96&h=54&rs=2&qlt=100",	"/t0160c17cb243d71af2.jpg?&w=96&h=54&rs=2&qlt=100", true, false), 200, 100, "A1E9A3B91052F479C2CAE43934343665", 3);
				httpParallel.addRequest(19, request_55(this, false, "A1E9A3B910551764C2CAE43934343665", true, false,
						"Config_7", "login.microsoftonline.com:443/common/oauth2/authorize?client_id=9ea1ad79-fdb6-4f9a-8bc3-2b70f96e34c7&response_type=id_token&nonce=d9cb017b-b9dc-480c-9e8a-dd064fcacdee&redirect_uri=https%3a%2f%2fcn.bing.com%2forgid%2fidtoken%2fnosignin&scope=openid&response_mode=form_post&msafed=0&prompt=none",	"/common/oauth2/authorize?client_id=9ea1ad79-fdb6-4f9a-8bc3-2b70f96e34c7&response_type=id_token&nonce=d9cb017b-b9dc-480c-9e8a-dd064fcacdee&redirect_uri=https%3a%2f%2fcn.bing.com%2forgid%2fidtoken%2fnosignin&scope=openid&response_mode=form_post&msafed=0&prompt=none", true, false), 2472, 100, "A1E9A3B91044EAC3C2CAE43934343665", 2);
				httpParallel.addRequest(17, request_56(this, false, "A1E9A3B91052F46BC2CAE43934343665", true, false,
						"Config_2", "cn.bing.com:443/orgid/idtoken/nosignin",	"/orgid/idtoken/nosignin", true, false), 148, 100, "A1E9A3B910551772C2CAE43934343665", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9100E7157C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("UA-CPU", "AMD64", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "www.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 08 Jul 2019 18:51:48 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[8], false, "Host_58", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9100F0D90C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9101946CEC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("UA-CPU", "AMD64", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "www.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 08 Jul 2019 18:51:48 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[8], false, "Host_57", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9101946D1C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9101B69A0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "www.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Location_1", dcVars[0], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[8], false, "Host_56", null, 0, false);
	subContainer_3.addSubInstruction(sub_2);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9101B69A3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9101C7B21C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Location_1", dcVars[1], ".*", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_3 = new SubRule("req_uri", 0, 7, false, (IDCCoreVar)dcVars[0], false, ". Bing . - ._url_10", null, 0, false);
	subContainer_4.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_55", null, 0, false);
	subContainer_4.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9101C7B24C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9101DDAA3C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[2], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[3], ":url\\((.*?)\\)", 9, 9, 0, 0, false, "url(", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[4], "&Type=(.*?)&", 2, 2, 0, 0, false, "Type_5", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[5], "\"ID=(.*?)\"", 1, 1, 0, 0, false, "ID_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[6], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"form\"[^>]*>", 1, 1, 0, 0, false, "value", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[7], "\\?gologin=(.*?)&", 1, 1, 0, 0, false, "gologin", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[8], " src=\"(.*?)\"", 2, 2, 0, 0, false, "src_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[9], "&Type=(.*?)&", 5, 1, 0, 0, false, "Type_4", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[10], "\\?scope=(.*?)\"", 1, 1, 0, 0, false, "scope_8", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[11], " src=\"(.*?)\"", 3, 1, 0, 0, false, "src", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[12], "\\?bu=(.*?)'", 1, 1, 0, 0, false, "bu_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[13], "\\?wa=(.*?)\\\\", 1, 1, 0, 0, false, "wa_2", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[14], "\\\\u0026rpsnv=(.*?)\\\\", 1, 1, 0, 0, false, "u0026rpsnv", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[15], "\\\\u0026ct=(.*?)\\\\", 1, 1, 0, 0, false, "u0026ct", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[16], "\\\\u0026rver=(.*?)\\\\", 1, 1, 0, 0, false, "u0026rver", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[17], "\\\\u0026wp=(.*?)\\\\", 1, 1, 0, 0, false, "u0026wp", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[18], "\\\\u0026wreply=(.*?)\\\\", 1, 1, 0, 0, false, "u0026wreply", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[19], "\\\\u0026lc=(.*?)\\\\", 1, 1, 0, 0, false, "u0026lc", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[20], "\\\\u0026id=(.*?)\"", 1, 1, 0, 0, false, "u0026id", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[21], " \\{url:'\\\\(.*?)'", 1, 1, 0, 0, false, "{url", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[22], "\\?bu=(.*?)'", 2, 1, 0, 0, false, "bu_4", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[23], "&checkda=(.*?)\"", 1, 1, 0, 0, false, "checkda_2", null, 0, false);
	IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_5 = new SubRule("req_uri", 0, 11, false, (IDCCoreVar)dcVars[1], false, ". Bing . - ._url_9", null, 0, false);
	subContainer_5.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_54", null, 0, false);
	subContainer_5.addSubInstruction(sub_6);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9101DDAA6C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910210EF0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_7 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_49", null, 0, false);
	subContainer_6.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("req_uri", 0, 34, false, (IDCCoreVar)dcVars[8], false, ". Bing . - ._url_8", null, 0, false);
	subContainer_6.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_53", null, 0, false);
	subContainer_6.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910210EF3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910230ACEC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "application/javascript, */*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_10 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_48", null, 0, false);
	subContainer_7.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_uri", 0, 37, false, (IDCCoreVar)dcVars[11], false, ". Bing . - ._url_7", null, 0, false);
	subContainer_7.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_52", null, 0, false);
	subContainer_7.addSubInstruction(sub_12);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910230AD1C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910241C39C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_47", null, 0, false);
	subContainer_8.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_uri", 0, 86, false, (IDCCoreVar)dcVars[3], false, ". Bing . - ._url_6", null, 0, false);
	subContainer_8.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_51", null, 0, false);
	subContainer_8.addSubInstruction(sub_15);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910241C3CC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9102C80A3C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_16 = new SubRule("req_uri", 50, 9, true, (IDCCoreVar)dcVars[4], false, "Type", null, 0, false);
	subContainer_9.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_46", null, 0, false);
	subContainer_9.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_50", null, 0, false);
	subContainer_9.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9102CA7B0C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9102D1CE1C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/xml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "361", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_45", null, 0, false);
	subContainer_10.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_49", null, 0, false);
	subContainer_10.addSubInstruction(sub_20);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9102D1CE4C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("<ClientInstRequest><Events><E><T>Event.ClientInst</T><IG>8A2");
strBuf_1.append("BF0B210ED4930B98D0A30F5709DA4</IG><TS>1562835058626</TS><D><");
strBuf_1.append("![CDATA[{id:4308,P:\"7:1ax,5:1ax,15:20l,14:1tu,13:1tu,12:1tu,");
strBuf_1.append("11:1b0,4:1ax,3:1ax,2:1ax,17:20p,16:20l,24:1f1,8:1ax,10:1cq,9");
strBuf_1.append(":1b0\",S:\"nav:0\",v:1.1,T:\"CI.Perf\",FID:\"CI\",Name:\"PerfV2\"}]]>");
strBuf_1.append("</D></E></Events><STS>1562835058626</STS></ClientInstRequest");
strBuf_1.append(">");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1E9A3B9102E7C70C2CAE43934343665", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9102ECA90C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "application/javascript, */*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[24], "&TYPE=(.*?)&", 1, 1, 0, 0, false, "TYPE_3", null, 0, false);
	IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_21 = new SubRule("req_uri", 37, 50, true, (IDCCoreVar)dcVars[22], false, "bu", null, 0, false);
	subContainer_11.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_44", null, 0, false);
	subContainer_11.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_48", null, 0, false);
	subContainer_11.addSubInstruction(sub_23);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9102ECA93C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9102F3FC2C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "application/javascript, */*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[25], "\"pid=(.*?)\"", 1, 1, 0, 0, false, "pid_12", null, 0, false);
	IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_24 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_43", null, 0, false);
	subContainer_12.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_47", null, 0, false);
	subContainer_12.addSubInstruction(sub_25);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910313B91C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910324D00C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_26 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_42", null, 0, false);
	subContainer_13.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_46", null, 0, false);
	subContainer_13.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910324D03C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910333761C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "application/javascript, */*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_41", null, 0, false);
	subContainer_14.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_45", null, 0, false);
	subContainer_14.addSubInstruction(sub_29);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B910324D00C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910333764C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103421C0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[26], "&mkt=(.*?)\"", 1, 1, 0, 0, false, "mkt_5", null, 0, false);
	IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_30 = new SubRule("req_uri", 71, 3, true, (IDCCoreVar)dcVars[10], false, "scope", null, 0, false);
	subContainer_15.addSubInstruction(sub_30);
		ISubRule sub_31 = new SubRule("req_uri", 62, 2, true, (IDCCoreVar)dcVars[25], false, "pid", null, 0, false);
	subContainer_15.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_uri", 39, 1, true, (IDCCoreVar)dcVars[7], false, "n", null, 0, false);
	subContainer_15.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_40", null, 0, false);
	subContainer_15.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_44", null, 0, false);
	subContainer_15.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9102F3FC2C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B910324D00C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103421C3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910349716C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_35 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_39", null, 0, false);
	subContainer_16.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_uri", 0, 94, false, (IDCCoreVar)dcVars[21], false, ". Bing . - ._url_5", null, 0, false);
	subContainer_16.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_43", null, 0, false);
	subContainer_16.addSubInstruction(sub_37);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103421C0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910349719C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910392AD0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698254407;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059;ipv6=hit=1562838659250;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_38 = new SubRule("req_uri", 50, 9, true, (IDCCoreVar)dcVars[9], false, "Type", null, 0, false);
	subContainer_17.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_38", null, 0, false);
	subContainer_17.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_42", null, 0, false);
	subContainer_17.addSubInstruction(sub_40);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103421C0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910392AD3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91039C71EC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "application/javascript, */*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_41 = new SubRule("req_uri", 36, 55, true, (IDCCoreVar)dcVars[12], false, "bu", null, 0, false);
	subContainer_18.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_37", null, 0, false);
	subContainer_18.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_41", null, 0, false);
	subContainer_18.addSubInstruction(sub_43);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103421C0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91039C721C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103B74CEC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "application/javascript, */*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "www2.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698254407;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_44 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_36", null, 0, false);
	subContainer_19.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[7], false, "Host_40", null, 0, false);
	subContainer_19.addSubInstruction(sub_45);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103421C0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101C7B21C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103B74D1C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103BEA0DC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698254407;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059;ipv6=hit=1562838659250;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_46 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_35", null, 0, false);
	subContainer_20.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_39", null, 0, false);
	subContainer_20.addSubInstruction(sub_47);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103B74CEC2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103BEA10C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103C5F23C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Autosuggest-ContentWidth", "546", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_hdr_Set-Cookie_2", dcVars[27], "=mkt=(.*?)&", 1, 1, 0, 0, false, "Set-Cookie", null, 0, false);
	IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_48 = new SubRule("req_uri", 43, 5, true, (IDCCoreVar)dcVars[26], false, "mkt", null, 0, false);
	subContainer_21.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_uri", 35, 3, true, (IDCCoreVar)dcVars[10], false, "scope", null, 0, false);
	subContainer_21.addSubInstruction(sub_49);
		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_34", null, 0, false);
	subContainer_21.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_38", null, 0, false);
	subContainer_21.addSubInstruction(sub_51);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101B69A0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103421C0C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103BEA0DC2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103C5F26C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103CFB63C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Autosuggest-ContentWidth", "546", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_hdr_Set-Cookie_2", dcVars[28], "=mkt=(.*?)&", 1, 1, 0, 0, false, "Set-Cookie_2", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[29], ";cvid=(.*?)&", 1, 1, 0, 0, false, "cvid_6", null, 0, false);
	IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_52 = new SubRule("req_uri", 43, 5, true, (IDCCoreVar)dcVars[27], false, "mkt", null, 0, false);
	subContainer_22.addSubInstruction(sub_52);
		ISubRule sub_53 = new SubRule("req_uri", 35, 3, true, (IDCCoreVar)dcVars[10], false, "scope", null, 0, false);
	subContainer_22.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_33", null, 0, false);
	subContainer_22.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_37", null, 0, false);
	subContainer_22.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103C5F23C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103CFB66C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103D70ABC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Autosuggest-ContentWidth", "546", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Set-Cookie_2", dcVars[30], "=mkt=(.*?)&", 1, 1, 0, 0, false, "Set-Cookie_3", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[31], ";cvid=(.*?)&", 1, 1, 0, 0, false, "cvid_7", null, 0, false);
	IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_56 = new SubRule("req_uri", 79, 32, true, (IDCCoreVar)dcVars[29], false, "cvid", null, 0, false);
	subContainer_23.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_uri", 43, 5, true, (IDCCoreVar)dcVars[28], false, "mkt", null, 0, false);
	subContainer_23.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_uri", 35, 3, true, (IDCCoreVar)dcVars[10], false, "scope", null, 0, false);
	subContainer_23.addSubInstruction(sub_58);
		ISubRule sub_59 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_32", null, 0, false);
	subContainer_23.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_36", null, 0, false);
	subContainer_23.addSubInstruction(sub_60);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103CFB63C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103CFB63C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103D70AEC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103DE5D7C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Autosuggest-ContentWidth", "546", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[32], ";pq=(.*?)&", 1, 1, 0, 0, false, "pq_2", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[33], ";cvid=(.*?)&", 1, 1, 0, 0, false, "cvid_8", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[34], "\\?id=(.*?)&", 1, 1, 0, 0, false, "id_13", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[35], ";w=(.*?)&", 1, 1, 0, 0, false, "w_12", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[36], ";h=(.*?)&", 1, 1, 0, 0, false, "h_12", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[37], ";c=(.*?)&", 1, 1, 0, 0, false, "c_8", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[38], ";rs=(.*?)&", 1, 1, 0, 0, false, "rs_8", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[39], ";qlt=(.*?)&", 1, 1, 0, 0, false, "qlt_7", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[40], ";p=(.*?)&", 1, 1, 0, 0, false, "p_3", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[41], ";cdv=(.*?)&", 1, 1, 0, 0, false, "cdv_3", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[42], ";pid=(.*?)\"", 1, 1, 0, 0, false, "pid_13", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_content", dcVars[43], "\\?id=(.*?)&", 2, 1, 0, 0, false, "id_12", null, 0, false);
	IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_61 = new SubRule("req_uri", 80, 32, true, (IDCCoreVar)dcVars[31], false, "cvid", null, 0, false);
	subContainer_24.addSubInstruction(sub_61);
		ISubRule sub_62 = new SubRule("req_uri", 43, 5, true, (IDCCoreVar)dcVars[30], false, "mkt", null, 0, false);
	subContainer_24.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_uri", 35, 3, true, (IDCCoreVar)dcVars[10], false, "scope", null, 0, false);
	subContainer_24.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_31", null, 0, false);
	subContainer_24.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_35", null, 0, false);
	subContainer_24.addSubInstruction(sub_65);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103D70ABC2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103D70ABC2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103DE5DAC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103E33FFC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_66 = new SubRule("req_uri", 50, 16, true, (IDCCoreVar)dcVars[24], false, "TYPE", null, 0, false);
	subContainer_25.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_30", null, 0, false);
	subContainer_25.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_34", null, 0, false);
	subContainer_25.addSubInstruction(sub_68);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9102ECA90C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103E3402C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9103FE19CC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "login.live.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_hdr_Location_1", dcVars[44], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_3", null, 0, false);
	IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_69 = new SubRule("req_uri", 179, 1, true, (IDCCoreVar)dcVars[23], false, "checkda", null, 0, false);
	subContainer_26.addSubInstruction(sub_69);
		ISubRule sub_70 = new SubRule("req_uri", 164, 6, true, (IDCCoreVar)dcVars[20], false, "id", null, 0, false);
	subContainer_26.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_uri", 156, 4, true, (IDCCoreVar)dcVars[19], false, "lc", null, 0, false);
	subContainer_26.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_uri", 82, 70, false, (IDCCoreVar)dcVars[18], false, "wreply", null, 0, false);
	subContainer_26.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_uri", 67, 7, true, (IDCCoreVar)dcVars[17], false, "wp", null, 0, false);
	subContainer_26.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_uri", 53, 10, true, (IDCCoreVar)dcVars[16], false, "rver", null, 0, false);
	subContainer_26.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_uri", 37, 10, true, (IDCCoreVar)dcVars[15], false, "ct", null, 0, false);
	subContainer_26.addSubInstruction(sub_75);
		ISubRule sub_76 = new SubRule("req_uri", 31, 2, true, (IDCCoreVar)dcVars[14], false, "rpsnv", null, 0, false);
	subContainer_26.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_uri", 14, 10, true, (IDCCoreVar)dcVars[13], false, "wa", null, 0, false);
	subContainer_26.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_29", null, 0, false);
	subContainer_26.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[6], false, "Host_33", null, 0, false);
	subContainer_26.addSubInstruction(sub_79);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9103FE19FC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91040A4E0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_80 = new SubRule("req_uri", 61, 11, false, (IDCCoreVar)dcVars[5], false, "ID", null, 0, false);
	subContainer_27.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_28", null, 0, false);
	subContainer_27.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_32", null, 0, false);
	subContainer_27.addSubInstruction(sub_82);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91040A4E3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910416830C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_83 = new SubRule("req_uri", 50, 16, true, (IDCCoreVar)dcVars[24], false, "TYPE", null, 0, false);
	subContainer_28.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_27", null, 0, false);
	subContainer_28.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_31", null, 0, false);
	subContainer_28.addSubInstruction(sub_85);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9102ECA90C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910416833C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91041B667C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/xml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "4164", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_86 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_26", null, 0, false);
	subContainer_29.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_30", null, 0, false);
	subContainer_29.addSubInstruction(sub_87);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91041B66AC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
					String requestData_2 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1E9A3B90EF11A70C2CAE43934343665.testdata",
	                                   "A1E9A3B910422B80C2CAE43934343665",
	                                   4164));
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1E9A3B910422B80C2CAE43934343665", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910438B18C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_88 = new SubRule("req_uri", 81, 2, true, (IDCCoreVar)dcVars[42], false, "pid", null, 0, false);
	subContainer_30.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_uri", 75, 1, true, (IDCCoreVar)dcVars[41], false, "cdv", null, 0, false);
	subContainer_30.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_uri", 69, 1, true, (IDCCoreVar)dcVars[40], false, "p", null, 0, false);
	subContainer_30.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_uri", 64, 2, true, (IDCCoreVar)dcVars[39], false, "qlt", null, 0, false);
	subContainer_30.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_uri", 58, 1, true, (IDCCoreVar)dcVars[38], false, "rs", null, 0, false);
	subContainer_30.addSubInstruction(sub_92);
		ISubRule sub_93 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[37], false, "c", null, 0, false);
	subContainer_30.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_uri", 48, 2, true, (IDCCoreVar)dcVars[36], false, "h", null, 0, false);
	subContainer_30.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_uri", 43, 2, true, (IDCCoreVar)dcVars[35], false, "w", null, 0, false);
	subContainer_30.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_uri", 7, 33, true, (IDCCoreVar)dcVars[34], false, "id", null, 0, false);
	subContainer_30.addSubInstruction(sub_96);
		ISubRule sub_97 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_25", null, 0, false);
	subContainer_30.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_29", null, 0, false);
	subContainer_30.addSubInstruction(sub_98);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910438B1BC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91043D974C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_99 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_24", null, 0, false);
	subContainer_31.addSubInstruction(sub_99);
		ISubRule sub_100 = new SubRule("req_uri", 0, 35, false, (IDCCoreVar)dcVars[44], false, ". Bing . - ._url_4", null, 0, false);
	subContainer_31.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_28", null, 0, false);
	subContainer_31.addSubInstruction(sub_101);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103FE19CC2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103FE19CC2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910440040C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910444E67C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_hdr_Location_1", dcVars[45], ".*", 1, 0, 0, 0, false, "Location_4", null, 0, false);
	IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_102 = new SubRule("req_uri", 63, 32, true, (IDCCoreVar)dcVars[33], false, "cvid", null, 0, false);
	subContainer_32.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_uri", 42, 3, true, (IDCCoreVar)dcVars[32], false, "pq", null, 0, false);
	subContainer_32.addSubInstruction(sub_103);
		ISubRule sub_104 = new SubRule("req_uri", 29, 3, true, (IDCCoreVar)dcVars[10], false, "scope", null, 0, false);
	subContainer_32.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_uri", 18, 4, true, (IDCCoreVar)dcVars[6], false, "form", null, 0, false);
	subContainer_32.addSubInstruction(sub_105);
		ISubRule sub_106 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_23", null, 0, false);
	subContainer_32.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_27", null, 0, false);
	subContainer_32.addSubInstruction(sub_107);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91043D974C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910444E6AC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910449C81C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_108 = new SubRule("req_uri", 85, 2, true, (IDCCoreVar)dcVars[42], false, "pid", null, 0, false);
	subContainer_33.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_uri", 79, 1, true, (IDCCoreVar)dcVars[41], false, "cdv", null, 0, false);
	subContainer_33.addSubInstruction(sub_109);
		ISubRule sub_110 = new SubRule("req_uri", 73, 1, true, (IDCCoreVar)dcVars[40], false, "p", null, 0, false);
	subContainer_33.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_uri", 68, 2, true, (IDCCoreVar)dcVars[39], false, "qlt", null, 0, false);
	subContainer_33.addSubInstruction(sub_111);
		ISubRule sub_112 = new SubRule("req_uri", 62, 1, true, (IDCCoreVar)dcVars[38], false, "rs", null, 0, false);
	subContainer_33.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_uri", 57, 1, true, (IDCCoreVar)dcVars[37], false, "c", null, 0, false);
	subContainer_33.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[36], false, "h", null, 0, false);
	subContainer_33.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_uri", 47, 2, true, (IDCCoreVar)dcVars[35], false, "w", null, 0, false);
	subContainer_33.addSubInstruction(sub_115);
		ISubRule sub_116 = new SubRule("req_uri", 7, 37, true, (IDCCoreVar)dcVars[43], false, "id", null, 0, false);
	subContainer_33.addSubInstruction(sub_116);
		ISubRule sub_117 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_22", null, 0, false);
	subContainer_33.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_26", null, 0, false);
	subContainer_33.addSubInstruction(sub_118);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910449C84C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91044EAC3C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/?scope=web", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_13 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_13);

	harvestContainer_13.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[46], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[47], "&Type=(.*?)&", 4, 4, 0, 0, false, "Type_6", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[48], ":url\\((.*?)\\)", 7, 3, 0, 0, false, "url(_2", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[49], "/p8\\.qhimg\\.com(.*?)\\?", 1, 1, 0, 0, false, "p8.qhimg.com", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[50], ";w=(.*?)&", 1, 1, 0, 0, false, "w_13", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[51], ";h=(.*?)&", 2, 1, 0, 0, false, "h_13", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[52], ";rs=(.*?)&", 1, 1, 0, 0, false, "rs_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[53], ";qlt=(.*?)\"", 1, 1, 0, 0, false, "qlt_8", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[54], "/p8\\.qhimg\\.com(.*?)\"", 2, 1, 0, 0, false, "p8.qhimg.com_2", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[55], "\\?id=(.*?)&", 1, 1, 0, 0, false, "id_20", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[56], ";w=(.*?)&", 2, 1, 0, 0, false, "w_16", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[57], ";h=(.*?)&", 3, 1, 0, 0, false, "h_16", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[58], ";c=(.*?)&", 4, 1, 0, 0, false, "c_10", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[59], ";pid=(.*?)\"", 1, 1, 0, 0, false, "pid_16", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[60], "\\?id=(.*?)&", 2, 1, 0, 0, false, "id_14", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[61], ";w=(.*?)&", 3, 1, 0, 0, false, "w_14", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[62], ";h=(.*?)&", 4, 1, 0, 0, false, "h_14", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[63], ";c=(.*?)&", 5, 1, 0, 0, false, "c_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[64], ";rs=(.*?)&", 2, 1, 0, 0, false, "rs_10", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[65], ";qlt=(.*?)&", 2, 1, 0, 0, false, "qlt_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[66], ";pid=(.*?)\"", 2, 1, 0, 0, false, "pid_14", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[67], "\\?id=(.*?)&", 3, 1, 0, 0, false, "id_15", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[68], "\\?id=(.*?)&", 4, 1, 0, 0, false, "id_16", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[69], "\\?id=(.*?)&", 5, 1, 0, 0, false, "id_21", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[70], ";w=(.*?)&", 6, 1, 0, 0, false, "w_17", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[71], ";h=(.*?)&", 7, 1, 0, 0, false, "h_17", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[72], ";c=(.*?)&", 8, 1, 0, 0, false, "c_11", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[73], "\\?id=(.*?)&", 9, 4, 0, 0, false, "id_18", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[74], ";w=(.*?)&", 10, 1, 0, 0, false, "w_15", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[75], ";h=(.*?)&", 11, 1, 0, 0, false, "h_15", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[76], ";pid=(.*?)\"", 9, 1, 0, 0, false, "pid_15", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[77], "\\?id=(.*?)&", 10, 1, 0, 0, false, "id_17", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[78], "\\?id=(.*?)&", 11, 1, 0, 0, false, "id_19", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[79], ";IG=(.*?)&", 1, 1, 0, 0, false, "IG_8", null, 0, false);
	IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_119 = new SubRule("req_hdr_Referer_1", 0, 30, false, (IDCCoreVar)dcVars[2], false, "Referer_21", null, 0, false);
	subContainer_34.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_uri", 0, 101, false, (IDCCoreVar)dcVars[45], false, ". Bing . - ._url_3", null, 0, false);
	subContainer_34.addSubInstruction(sub_120);
		ISubRule sub_121 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_25", null, 0, false);
	subContainer_34.addSubInstruction(sub_121);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B910444E67C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9101DDAA3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B910444E67C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91044EAC6C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910484608C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_122 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_20", null, 0, false);
	subContainer_35.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_uri", 0, 34, false, (IDCCoreVar)dcVars[48], false, ". Bing . - ._url_2", null, 0, false);
	subContainer_35.addSubInstruction(sub_123);
		ISubRule sub_124 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_24", null, 0, false);
	subContainer_35.addSubInstruction(sub_124);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910486D10C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91048E268C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(6);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "p8.qhimg.com", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_125 = new SubRule("req_uri", 0, 47, false, (IDCCoreVar)dcVars[54], false, ". Bing . - ._url", null, 0, false);
	subContainer_36.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[4], false, "Host_23", null, 0, false);
	subContainer_36.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910490950C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910497E83C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_127 = new SubRule("req_uri", 50, 9, true, (IDCCoreVar)dcVars[47], false, "Type", null, 0, false);
	subContainer_37.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_uri", 12, 32, true, (IDCCoreVar)dcVars[79], false, "IG", null, 0, false);
	subContainer_37.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_19", null, 0, false);
	subContainer_37.addSubInstruction(sub_129);
		ISubRule sub_130 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_22", null, 0, false);
	subContainer_37.addSubInstruction(sub_130);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910497E86C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91049CCB7C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/xml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "348", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_131 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_18", null, 0, false);
	subContainer_38.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_21", null, 0, false);
	subContainer_38.addSubInstruction(sub_132);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91049CCBAC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("<ClientInstRequest><Events><E><T>Event.ClientInst</T><IG>6DB");
strBuf_2.append("4DC28BEA04D21B351808FAA3F4631</IG><TS>1562835063911</TS><D><");
strBuf_2.append("![CDATA[{id:7379,P:\"7:3f,5:3f,15:19r,14:my,13:my,12:my,11:6d");
strBuf_2.append(",4:3f,3:3f,2:3f,17:19w,16:19s,24:8w,8:3h,10:l7,9:6d\",S:\"nav:");
strBuf_2.append("0\",v:1.1,T:\"CI.Perf\",FID:\"CI\",Name:\"PerfV2\"}]]></D></E></Eve");
strBuf_2.append("nts><STS>1562835063911</STS></ClientInstRequest>");
String requestData_3 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1E9A3B91049F3CFC2CAE43934343665", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9104CD9E0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_133 = new SubRule("req_uri", 49, 6, true, (IDCCoreVar)dcVars[59], false, "pid", null, 0, false);
	subContainer_39.addSubInstruction(sub_133);
		ISubRule sub_134 = new SubRule("req_uri", 43, 1, true, (IDCCoreVar)dcVars[64], false, "rs", null, 0, false);
	subContainer_39.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_uri", 38, 1, true, (IDCCoreVar)dcVars[72], false, "c", null, 0, false);
	subContainer_39.addSubInstruction(sub_135);
		ISubRule sub_136 = new SubRule("req_uri", 33, 2, true, (IDCCoreVar)dcVars[71], false, "h", null, 0, false);
	subContainer_39.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_uri", 28, 2, true, (IDCCoreVar)dcVars[70], false, "w", null, 0, false);
	subContainer_39.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_uri", 7, 18, true, (IDCCoreVar)dcVars[69], false, "id", null, 0, false);
	subContainer_39.addSubInstruction(sub_138);
		ISubRule sub_139 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_17", null, 0, false);
	subContainer_39.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_20", null, 0, false);
	subContainer_39.addSubInstruction(sub_140);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9104CD9E3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9104E3971C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_141 = new SubRule("req_uri", 45, 6, true, (IDCCoreVar)dcVars[59], false, "pid", null, 0, false);
	subContainer_40.addSubInstruction(sub_141);
		ISubRule sub_142 = new SubRule("req_uri", 39, 1, true, (IDCCoreVar)dcVars[58], false, "c", null, 0, false);
	subContainer_40.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_uri", 34, 2, true, (IDCCoreVar)dcVars[57], false, "h", null, 0, false);
	subContainer_40.addSubInstruction(sub_143);
		ISubRule sub_144 = new SubRule("req_uri", 28, 3, true, (IDCCoreVar)dcVars[56], false, "w", null, 0, false);
	subContainer_40.addSubInstruction(sub_144);
		ISubRule sub_145 = new SubRule("req_uri", 7, 18, true, (IDCCoreVar)dcVars[55], false, "id", null, 0, false);
	subContainer_40.addSubInstruction(sub_145);
		ISubRule sub_146 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_16", null, 0, false);
	subContainer_40.addSubInstruction(sub_146);
		ISubRule sub_147 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_19", null, 0, false);
	subContainer_40.addSubInstruction(sub_147);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9104E3974C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9104F4AE0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_148 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_15", null, 0, false);
	subContainer_41.addSubInstruction(sub_148);
		ISubRule sub_149 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_18", null, 0, false);
	subContainer_41.addSubInstruction(sub_149);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9104F4AE3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9104FE723C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_150 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_14", null, 0, false);
	subContainer_42.addSubInstruction(sub_150);
		ISubRule sub_151 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_17", null, 0, false);
	subContainer_42.addSubInstruction(sub_151);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9104FE726C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910503543C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_152 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_13", null, 0, false);
	subContainer_43.addSubInstruction(sub_152);
		ISubRule sub_153 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_16", null, 0, false);
	subContainer_43.addSubInstruction(sub_153);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910505C50C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91050AA7FC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_154 = new SubRule("req_uri", 39, 10, true, (IDCCoreVar)dcVars[76], false, "pid", null, 0, false);
	subContainer_44.addSubInstruction(sub_154);
		ISubRule sub_155 = new SubRule("req_uri", 32, 2, true, (IDCCoreVar)dcVars[75], false, "h", null, 0, false);
	subContainer_44.addSubInstruction(sub_155);
		ISubRule sub_156 = new SubRule("req_uri", 27, 2, true, (IDCCoreVar)dcVars[74], false, "w", null, 0, false);
	subContainer_44.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_uri", 7, 17, true, (IDCCoreVar)dcVars[78], false, "id", null, 0, false);
	subContainer_44.addSubInstruction(sub_157);
		ISubRule sub_158 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_12", null, 0, false);
	subContainer_44.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_15", null, 0, false);
	subContainer_44.addSubInstruction(sub_159);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91050AA82C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91050F8EBC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_160 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_11", null, 0, false);
	subContainer_45.addSubInstruction(sub_160);
		ISubRule sub_161 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_14", null, 0, false);
	subContainer_45.addSubInstruction(sub_161);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91050F8EEC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910516DD1C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_162 = new SubRule("req_uri", 39, 10, true, (IDCCoreVar)dcVars[76], false, "pid", null, 0, false);
	subContainer_46.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_uri", 32, 2, true, (IDCCoreVar)dcVars[75], false, "h", null, 0, false);
	subContainer_46.addSubInstruction(sub_163);
		ISubRule sub_164 = new SubRule("req_uri", 27, 2, true, (IDCCoreVar)dcVars[74], false, "w", null, 0, false);
	subContainer_46.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_uri", 7, 17, true, (IDCCoreVar)dcVars[73], false, "id", null, 0, false);
	subContainer_46.addSubInstruction(sub_165);
		ISubRule sub_166 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_10", null, 0, false);
	subContainer_46.addSubInstruction(sub_166);
		ISubRule sub_167 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_13", null, 0, false);
	subContainer_46.addSubInstruction(sub_167);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910516DD4C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910520A0EC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_168 = new SubRule("req_uri", 39, 10, true, (IDCCoreVar)dcVars[76], false, "pid", null, 0, false);
	subContainer_47.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_uri", 32, 2, true, (IDCCoreVar)dcVars[75], false, "h", null, 0, false);
	subContainer_47.addSubInstruction(sub_169);
		ISubRule sub_170 = new SubRule("req_uri", 27, 2, true, (IDCCoreVar)dcVars[74], false, "w", null, 0, false);
	subContainer_47.addSubInstruction(sub_170);
		ISubRule sub_171 = new SubRule("req_uri", 7, 17, true, (IDCCoreVar)dcVars[77], false, "id", null, 0, false);
	subContainer_47.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_9", null, 0, false);
	subContainer_47.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_12", null, 0, false);
	subContainer_47.addSubInstruction(sub_173);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910520A11C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91052585CC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_174 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_8", null, 0, false);
	subContainer_48.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_11", null, 0, false);
	subContainer_48.addSubInstruction(sub_175);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91052585FC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91052A66FC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_176 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_7", null, 0, false);
	subContainer_49.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_10", null, 0, false);
	subContainer_49.addSubInstruction(sub_177);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91052CD50C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91052F479C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562657613000;_UR=D=0;SRCHHPGUSR=CW=967&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835059&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_178 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_6", null, 0, false);
	subContainer_50.addSubInstruction(sub_178);
		ISubRule sub_179 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_9", null, 0, false);
	subContainer_50.addSubInstruction(sub_179);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91052F47CC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-javascript; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910536992C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_180 = new SubRule("req_uri", 75, 7, true, (IDCCoreVar)dcVars[66], false, "pid", null, 0, false);
	subContainer_51.addSubInstruction(sub_180);
		ISubRule sub_181 = new SubRule("req_uri", 68, 2, true, (IDCCoreVar)dcVars[65], false, "qlt", null, 0, false);
	subContainer_51.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_uri", 62, 1, true, (IDCCoreVar)dcVars[64], false, "rs", null, 0, false);
	subContainer_51.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_uri", 57, 1, true, (IDCCoreVar)dcVars[63], false, "c", null, 0, false);
	subContainer_51.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[62], false, "h", null, 0, false);
	subContainer_51.addSubInstruction(sub_184);
		ISubRule sub_185 = new SubRule("req_uri", 46, 3, true, (IDCCoreVar)dcVars[61], false, "w", null, 0, false);
	subContainer_51.addSubInstruction(sub_185);
		ISubRule sub_186 = new SubRule("req_uri", 7, 36, true, (IDCCoreVar)dcVars[68], false, "id", null, 0, false);
	subContainer_51.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_5", null, 0, false);
	subContainer_51.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_8", null, 0, false);
	subContainer_51.addSubInstruction(sub_188);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910536995C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91053DEC3C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_189 = new SubRule("req_uri", 75, 7, true, (IDCCoreVar)dcVars[66], false, "pid", null, 0, false);
	subContainer_52.addSubInstruction(sub_189);
		ISubRule sub_190 = new SubRule("req_uri", 68, 2, true, (IDCCoreVar)dcVars[65], false, "qlt", null, 0, false);
	subContainer_52.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_uri", 62, 1, true, (IDCCoreVar)dcVars[64], false, "rs", null, 0, false);
	subContainer_52.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_uri", 57, 1, true, (IDCCoreVar)dcVars[63], false, "c", null, 0, false);
	subContainer_52.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[62], false, "h", null, 0, false);
	subContainer_52.addSubInstruction(sub_193);
		ISubRule sub_194 = new SubRule("req_uri", 46, 3, true, (IDCCoreVar)dcVars[61], false, "w", null, 0, false);
	subContainer_52.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_uri", 7, 36, true, (IDCCoreVar)dcVars[67], false, "id", null, 0, false);
	subContainer_52.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_4", null, 0, false);
	subContainer_52.addSubInstruction(sub_196);
		ISubRule sub_197 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_7", null, 0, false);
	subContainer_52.addSubInstruction(sub_197);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91053DEC6C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910542CE3C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "s.cn.bing.net", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_198 = new SubRule("req_uri", 75, 7, true, (IDCCoreVar)dcVars[66], false, "pid", null, 0, false);
	subContainer_53.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_uri", 68, 2, true, (IDCCoreVar)dcVars[65], false, "qlt", null, 0, false);
	subContainer_53.addSubInstruction(sub_199);
		ISubRule sub_200 = new SubRule("req_uri", 62, 1, true, (IDCCoreVar)dcVars[64], false, "rs", null, 0, false);
	subContainer_53.addSubInstruction(sub_200);
		ISubRule sub_201 = new SubRule("req_uri", 57, 1, true, (IDCCoreVar)dcVars[63], false, "c", null, 0, false);
	subContainer_53.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[62], false, "h", null, 0, false);
	subContainer_53.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_uri", 46, 3, true, (IDCCoreVar)dcVars[61], false, "w", null, 0, false);
	subContainer_53.addSubInstruction(sub_203);
		ISubRule sub_204 = new SubRule("req_uri", 7, 36, true, (IDCCoreVar)dcVars[60], false, "id", null, 0, false);
	subContainer_53.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_3", null, 0, false);
	subContainer_53.addSubInstruction(sub_205);
		ISubRule sub_206 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[5], false, "Host_6", null, 0, false);
	subContainer_53.addSubInstruction(sub_206);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910542CE6C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B91054A24FC2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(6);
					
		headers.add(new RequestHeaderData("Accept", "image/png, image/svg+xml, image/*;q=0.8, */*;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "p8.qhimg.com", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_207 = new SubRule("req_uri", 45, 3, true, (IDCCoreVar)dcVars[53], false, "qlt", null, 0, false);
	subContainer_54.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_uri", 39, 1, true, (IDCCoreVar)dcVars[52], false, "rs", null, 0, false);
	subContainer_54.addSubInstruction(sub_208);
		ISubRule sub_209 = new SubRule("req_uri", 33, 2, true, (IDCCoreVar)dcVars[51], false, "h", null, 0, false);
	subContainer_54.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_uri", 28, 2, true, (IDCCoreVar)dcVars[50], false, "w", null, 0, false);
	subContainer_54.addSubInstruction(sub_210);
		ISubRule sub_211 = new SubRule("req_uri", 0, 24, false, (IDCCoreVar)dcVars[49], false, "/t0160c17cb243d71af2.jpg", null, 0, false);
	subContainer_54.addSubInstruction(sub_211);
		ISubRule sub_212 = new SubRule("req_hdr_Host_1", 0, 12, false, (IDCCoreVar)vars[4], false, "Host_5", null, 0, false);
	subContainer_54.addSubInstruction(sub_212);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91054A252C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/jpeg");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910551772C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://cn.bing.com/search?q=IBM&qs=n&form=QBLH&scope=web&sp=-1&pq=ibm&sc=10-3&sk=&cvid=8A2BF0B210ED4930B98D0A30F5709DA4", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "login.microsoftonline.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "buid=AQABAAEAAADCoMpjJXrxTq9VG9te-7FXaYkuHyymeD1HunEoycqlkJDYSf6zs-xodQ_Fh3J4dzQTMJAfgSXH91Nk4lN1soRuvFbXdJEpKljExG7BSICR2F17sNqBCt8sCZAepE8f7WogAA;fpc=Alz5LEG6WGVKrMcRXiJ7BE4pzHOVAQAAAE86ttQOAAAA", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_14 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_14);

	harvestContainer_14.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[80], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_14.addHarvestInstruction ("resp_content", dcVars[81], "<[[^>].]*?name=\"error\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_2", null, 0, false);
	IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_213 = new SubRule("req_hdr_Referer_1", 0, 120, false, (IDCCoreVar)dcVars[46], false, "Referer_2", null, 0, false);
	subContainer_55.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_hdr_Host_1", 0, 25, false, (IDCCoreVar)vars[3], false, "Host_4", null, 0, false);
	subContainer_55.addSubInstruction(sub_214);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910551775C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910558C70C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(11);
					
		headers.add(new RequestHeaderData("Accept", "text/html, application/xhtml+xml, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://login.microsoftonline.com/common/oauth2/authorize?client_id=9ea1ad79-fdb6-4f9a-8bc3-2b70f96e34c7&response_type=id_token&nonce=d9cb017b-b9dc-480c-9e8a-dd064fcacdee&redirect_uri=https%3a%2f%2fcn.bing.com%2forgid%2fidtoken%2fnosignin&scope=openid&response_mode=form_post&msafed=0&prompt=none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "zh-CN", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "cn.bing.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "573", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_EDGE_V=1;MUID=1AABF7A04CB669A133E2FA2E4DC96857;SRCHD=AF=NOFORM;SRCHUID=V=2&GUID=A1470E3AE9154B32A323184BA2F10B56&dmnchg=1;SRCHUSR=DOB=20190703&T=1562835062000;_UR=D=0;SRCHHPGUSR=CW=984&CH=513&DPR=1&UTC=480&WTS=63698431857;_SS=SID=0CE59906B17A6CE920849490B0056D28&HV=1562835065&bIm=561;ipv6=hit=1562838659250&t=4;MUIDB=1AABF7A04CB669A133E2FA2E4DC96857", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_216 = new SubRule("req_hdr_Referer_1", 0, 296, false, (IDCCoreVar)dcVars[80], false, "Referer", null, 0, false);
	subContainer_57.addSubInstruction(sub_216);
		ISubRule sub_217 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[2], false, "Host_3", null, 0, false);
	subContainer_57.addSubInstruction(sub_217);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B910551772C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B91044EAC3C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9103DE5D7C2CAE43934343665"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B910551772C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B910558C73C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("error=login_required&error_description=AADSTS50058%3A+A+sile");
strBuf_3.append("nt+sign-in+request+was+sent+but+no+user+is+signed+in.+The+co");
strBuf_3.append("okies+used+to+represent+the+user%27s+session+were+not+sent+i");
strBuf_3.append("n+the+request+to+Azure+AD.+This+can+happen+if+the+user+is+us");
strBuf_3.append("ing+Internet+Explorer+or+Edge%2C+and+the+web+app+sending+the");
strBuf_3.append("+silent+sign-in+request+is+in+different+IE+security+zone+tha");
strBuf_3.append("n+the+Azure+AD+endpoint+%28login.microsoftonline.com%29.%0D%");
strBuf_3.append("0ATrace+ID%3A+5cb0772f-6f1a-4701-aa9c-df1a1ca26000%0D%0ACorr");
strBuf_3.append("elation+ID%3A+9cca7fa7-4d0e-46a4-b802-404f85e895df%0D%0ATime");
strBuf_3.append("stamp%3A+2019-07-11+08%3A51%3A05Z");
String requestData_4 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1E9A3B91055B380C2CAE43934343665", postData, requestData_4, "UTF-8", 14, 20);
	postData.addDataChunk(pdc_3);

	IDataSub subContainer_56 = new DataSub();
	pdc_3.addDataSub(subContainer_56);

		ISubRule sub_215 = new SubRule("req_content", 6, 14, true, (IDCCoreVar)dcVars[81], false, "error", null, 0, false);
	subContainer_56.addSubInstruction(sub_215);
	



	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(9996, 1, parent, parent, "A1E9A3B910564FCEC2CAE43934343665");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "v1_urlblockindex", "A1E9A3B910564FCEC2CAE43934343665") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_57(this, true, "A1E9A3B910564FC0C2CAE43934343665", true, true,
						"Config_8", "r20swj13mr.microsoft.com:443/ieblocklist/v1/urlblockindex.bin",	"/ieblocklist/v1/urlblockindex.bin", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_58(this, false, "A1E9A3B910567749C2CAE43934343665", true, false,
						"Config_9", "iecvlist.microsoft.com:443/ie11blocklist/1401746408/versionlistWin7.xml",	"/ie11blocklist/1401746408/versionlistWin7.xml", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B9105676D0C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("UA-CPU", "AMD64", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; Trident/7.0; rv:11.0) like Gecko", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "r20swj13mr.microsoft.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "no-cache", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "optimizelyEndUserId=oeu1562048999126r0.018635828536868126;optimizelySegments=%7B%221708060746%22%3A%22ie%22%2C%221711110398%22%3A%22none%22%2C%221728080266%22%3A%22false%22%2C%221733390029%22%3A%22direct%22%7D;optimizelyBuckets=%7B%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_218 = new SubRule("req_hdr_Host_1", 0, 24, false, (IDCCoreVar)vars[1], false, "Host_2", null, 0, false);
	subContainer_58.addSubInstruction(sub_218);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B9105676D3C2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/octet-stream");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E9A3B910567757C2CAE43934343665", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(6);
					
		headers.add(new RequestHeaderData("Accept", "text/xml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 02 Jul 2019 06:29:58 GMT", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Host", "iecvlist.microsoft.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "Keep-Alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "optimizelyEndUserId=oeu1562048999126r0.018635828536868126;optimizelySegments=%7B%221708060746%22%3A%22ie%22%2C%221711110398%22%3A%22none%22%2C%221728080266%22%3A%22false%22%2C%221733390029%22%3A%22direct%22%7D;optimizelyBuckets=%7B%7D", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_219 = new SubRule("req_hdr_Host_1", 0, 22, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_59.addSubInstruction(sub_219);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E9A3B9105676D0C2CAE43934343665"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E9A3B91056775AC2CAE43934343665",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
