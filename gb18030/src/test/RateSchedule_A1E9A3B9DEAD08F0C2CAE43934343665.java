/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.IPacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KSyncPoint;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.PacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.RateGenerator;
import com.ibm.rational.test.lt.kernel.action.impl.RateRunner;
import com.ibm.rational.test.lt.kernel.action.impl.RateUserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class RateSchedule_A1E9A3B9DEAD08F0C2CAE43934343665
		extends com.ibm.rational.test.lt.kernel.action.impl.RateSchedule {

	public RateSchedule_A1E9A3B9DEAD08F0C2CAE43934343665(IContainer parent, String name) {
		super(parent, name, "A1E9A3B9DEAD08F0C2CAE43934343665");
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

		this.addUserGroup(new RateRunnerGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class RateRunnerGroup_1 extends RateUserGroup {

		public RateRunnerGroup_1(IContainer parent) {
			super(parent, "\u6BD4\u7387\u8FD0\u884C\u5668\u7EC4 1", "A1E9A3B9DEB10090C2CAE43934343665");

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return createScenario(parent);
		}

		private IContainer createScenario(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1E9A3B9DEB10090C2CAE43934343665") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					PacedLoop rategenLoop = createRateGenerator(this);
					this.add(rategenLoop);
					rategenLoop.addVarsToInit(null);
					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

		private RateGenerator createRateGenerator(IContainer parent) {
			RateGenerator rateGenerator = new RateRunner(parent, "\u6BD4\u7387\u8FD0\u884C\u5668\u7EC4 1",
					"A1E9A3B9DEB10090C2CAE43934343665", -1, 0, 0, 0, 1, true, false, 1, 1000, IPacedLoop.CONSTANT,
					false, true) {

				public void executeLoop() {
					this.add(new KSyncPoint(this, this.getName() + "SyncPoint", "A1E9A3B9DEB10090C2CAE43934343665",
							300000, true, 0, 0, 60000));
					this.add(new IterationDelay(this, "RateRunner PacedLoop Iteration Delay", //$NON-NLS-1$
							"A1E9A3B9DEB10090C2CAE43934343665"));

					this.add(new test.Test_A1E9A3B90EF11A70C2CAE43934343665(this, "A1E9A3B9F49714D0C2CAE43934343665") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					super.executeLoop();
				}

			};
			return rateGenerator;
		}

	}

}