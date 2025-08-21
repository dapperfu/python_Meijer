package I7;

import b8.ServerConfigurationV4;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ)\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LI7/f;", "", "<init>", "()V", "Lorg/json/JSONObject;", "tenantConfig", "appConfig", "", "a", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)I", "b", "", "key", "c", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "currentRevision", "appId", "json", "LI7/c;", "d", "(JLjava/lang/String;Ljava/lang/String;)LI7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final a f14375a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"LI7/f$a;", "", "<init>", "()V", "", "KEY_STATUS", "Ljava/lang/String;", "KEY_REVISION", "KEY_ENVIRONMENT_CONFIG", "KEY_APP_CONFIG", "KEY_DYNAMIC_CONFIG", "KEY_MAX_BEACON_SIZE_KIB", "KEY_MAX_EVENT_SIZE_KIB", "KEY_DYNAMIC_CONFIG_STATE", "KEY_APP_CONFIG_APP_ID", "KEY_APP_CONFIG_CAPTURE", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int a(JSONObject tenantConfig, JSONObject appConfig) {
        JSONObject jSONObjectC = c("maxBeaconSizeKib", tenantConfig, appConfig);
        if (jSONObjectC != null) {
            return g.e(jSONObjectC, "maxBeaconSizeKib", 256, 10240, 1024);
        }
        return 1024;
    }

    private final int b(JSONObject tenantConfig, JSONObject appConfig) {
        JSONObject jSONObjectC = c("maxEventSizeKib", tenantConfig, appConfig);
        if (jSONObjectC != null) {
            return g.e(jSONObjectC, "maxEventSizeKib", 128, 1024, 256);
        }
        return 256;
    }

    public final ParsedResponse d(long currentRevision, String appId, String json) throws JSONException {
        Intrinsics.j(appId, "appId");
        Intrinsics.j(json, "json");
        try {
            Object objNextValue = new JSONTokener(json).nextValue();
            Intrinsics.h(objNextValue, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) objNextValue;
            if (!ArraysKt.Y(g.f14376a, b.c(jSONObject, "status"))) {
                z8.f.a("dtxCommunication", "config parsing error: unknown status value");
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dynamicConfig");
            A7.a aVarD = jSONObjectOptJSONObject != null ? g.d(jSONObjectOptJSONObject, "state") : null;
            if (aVarD == null) {
                z8.f.a("dtxCommunication", "config parsing error: unknown agent state");
                return null;
            }
            Long lB = b.b(jSONObject, "revision");
            if (lB != null && lB.longValue() > currentRevision) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("environmentConfig");
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("appConfig");
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null) {
                    if (Intrinsics.e(appId, b.c(jSONObjectOptJSONObject3, "applicationId"))) {
                        return new ParsedResponse(aVarD, new ServerConfigurationV4(lB.longValue(), a(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3), b(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3), jSONObjectOptJSONObject3.optBoolean("capture", true)));
                    }
                    z8.f.a("dtxCommunication", "config parsing error: appId mismatch");
                    return null;
                }
                z8.f.a("dtxCommunication", "config parsing error: invalid config update");
                return null;
            }
            return new ParsedResponse(aVarD, null);
        } catch (Exception e10) {
            z8.f.b("dtxCommunication", "config parsing error: invalid JSON", e10);
            return null;
        }
    }

    private final JSONObject c(String key, JSONObject tenantConfig, JSONObject appConfig) {
        if (appConfig.has(key)) {
            return appConfig;
        }
        if (tenantConfig.has(key)) {
            return tenantConfig;
        }
        return null;
    }
}
