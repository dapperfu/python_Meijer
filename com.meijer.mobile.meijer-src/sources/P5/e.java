package P5;

import P5.JSONDefinition;
import R5.t;
import com.adobe.marketing.mobile.AbstractC6579m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LP5/e;", "", "<init>", "()V", "LQ5/e;", "a", "()LQ5/e;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"LP5/e$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonCondition", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "LP5/e;", "a", "(Lorg/json/JSONObject;Lcom/adobe/marketing/mobile/m;)LP5/e;", "", "KEY_DEFINITION", "Ljava/lang/String;", "KEY_TYPE", "LOG_TAG", "TYPE_VALUE_GROUP", "TYPE_VALUE_HISTORICAL", "TYPE_VALUE_MATCHER", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: P5.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ e a(JSONObject jsonCondition, AbstractC6579m extensionApi) {
            Intrinsics.j(extensionApi, "extensionApi");
            if (jsonCondition == null) {
                return null;
            }
            try {
                String string = jsonCondition.getString("type");
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != 98629247) {
                        if (iHashCode != 840862002) {
                            if (iHashCode == 1950555338 && string.equals("historical")) {
                                JSONDefinition.Companion companion = JSONDefinition.INSTANCE;
                                JSONObject jSONObject = jsonCondition.getJSONObject("definition");
                                Intrinsics.i(jSONObject, "jsonCondition.getJSONObj…                        )");
                                return new d(companion.b(jSONObject, extensionApi), extensionApi);
                            }
                        } else if (string.equals("matcher")) {
                            JSONDefinition.Companion companion2 = JSONDefinition.INSTANCE;
                            JSONObject jSONObject2 = jsonCondition.getJSONObject("definition");
                            Intrinsics.i(jSONObject2, "jsonCondition.getJSONObj…                        )");
                            return new k(companion2.b(jSONObject2, extensionApi));
                        }
                    } else if (string.equals("group")) {
                        JSONDefinition.Companion companion3 = JSONDefinition.INSTANCE;
                        JSONObject jSONObject3 = jsonCondition.getJSONObject("definition");
                        Intrinsics.i(jSONObject3, "jsonCondition.getJSONObj…                        )");
                        return new a(companion3.b(jSONObject3, extensionApi));
                    }
                }
                t.b("LaunchRulesEngine", "JSONCondition", "Unsupported condition type - " + string, new Object[0]);
                return null;
            } catch (Exception e10) {
                t.b("LaunchRulesEngine", "JSONCondition", "Failed to parse [rule.condition] JSON, the error is: " + e10.getMessage(), new Object[0]);
                return null;
            }
        }
    }

    public abstract /* synthetic */ Q5.e a();
}
