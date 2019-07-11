/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class Schedule_A1E9A3B9D64CDEB0C2CAE43934343665 extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public Schedule_A1E9A3B9D64CDEB0C2CAE43934343665(IContainer parent, String name) {
		super(parent, name, "A1E9A3B9D64CDEB0C2CAE43934343665");
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), null, 1,
				"\u9875\u9762\u6807\u9898\u9A8C\u8BC1\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), null, 1,
				"\u54CD\u5E94\u4EE3\u7801\u9A8C\u8BC1\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), null, 1,
				"\u54CD\u5E94\u5927\u5C0F\u9A8C\u8BC1\u5931\u8D25"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "\u5185\u5BB9\u9A8C\u8BC1\u70B9\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "\u8FDE\u63A5\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "\u8BA4\u8BC1\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("\u5DF2\u8FBE\u5230\u6570\u636E\u96C6\u672B\u5C3E"), 1,
				"\u5DF2\u8FBE\u5230\u6570\u636E\u96C6\u672B\u5C3E"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTReferenceEvent(), null, 1, "\u62BD\u53D6\u5F15\u7528\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "\u66FF\u6362\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "\u8D85\u65F6"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1,
				"\u5B9A\u5236\u9A8C\u8BC1\u70B9\u5931\u8D25"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("\u5B9A\u5236\u4EE3\u7801\u62A5\u544A\u4E86\u672A\u5904\u7406\u7684\u5F02\u5E38"),
				1, "\u5B9A\u5236\u4EE3\u7801\u62A5\u544A\u4E86\u672A\u5904\u7406\u7684\u5F02\u5E38"));

		this.addUserGroup(new UserGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "\u7528\u6237\u7EC4 1", "A1E9A3B9D67BDDF2C2CAE43934343665");

			setNumUsers(100.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "\u7F3A\u7701\u573A\u666F", "A1E9A3B9D67CA144C2CAE43934343665") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.Test_A1E9A3B90EF11A70C2CAE43934343665(this, "A1E9A3B9E6764A60C2CAE43934343665") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}