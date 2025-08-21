package I7;

import A7.ServerDataUpdate;
import Y7.EndPointInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m8.p;
import m8.q;
import m8.s;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import z7.LocalServerData;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"LI7/a;", "", "Lm8/s;", "v3configParser", "LI7/f;", "v4configParser", "<init>", "(Lm8/s;LI7/f;)V", "Lm8/q;", "oldServerConfig", "", "json", "a", "(Lm8/q;Ljava/lang/String;)Lm8/q;", "jsonBody", "Lz7/f;", "serverData", "LY7/a;", "endPointInfo", "LA7/c;", "b", "(Ljava/lang/String;Lz7/f;LY7/a;)LA7/c;", "Lm8/s;", "LI7/f;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s v3configParser;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f v4configParser;

    public a(s v3configParser, f v4configParser) {
        Intrinsics.j(v3configParser, "v3configParser");
        Intrinsics.j(v4configParser, "v4configParser");
        this.v3configParser = v3configParser;
        this.v4configParser = v4configParser;
    }

    private final q a(q oldServerConfig, String json) throws Exception {
        q.b bVarJ;
        Object objNextValue = new JSONTokener(json).nextValue();
        Intrinsics.h(objNextValue, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) objNextValue;
        JSONObject jSONObject2 = jSONObject.getJSONObject("dynamicConfig");
        if (!jSONObject2.has("bp3Config")) {
            z8.f.a("dtxCommunication", "config v3 parsing: BPv3 config missing");
            return null;
        }
        boolean z10 = jSONObject.has("revision") && jSONObject.has("appConfig") && jSONObject.has("environmentConfig");
        Long lB = b.b(jSONObject, "revision");
        if (!z10 || lB == null || lB.longValue() <= oldServerConfig.A()) {
            bVarJ = oldServerConfig.J(true);
        } else {
            bVarJ = q.q();
            bVarJ.E(lB.longValue());
            p.b bVarJ2 = p.j();
            this.v3configParser.c(bVarJ, bVarJ2, jSONObject.getJSONObject("environmentConfig").getJSONObject("bp3Config"));
            this.v3configParser.b(bVarJ, bVarJ2, jSONObject.getJSONObject("appConfig").getJSONObject("bp3Config"));
            bVarJ.x(bVarJ2.j());
        }
        this.v3configParser.d(bVarJ, jSONObject2.getJSONObject("bp3Config"));
        return bVarJ.p();
    }

    public final ServerDataUpdate b(String jsonBody, LocalServerData serverData, EndPointInfo endPointInfo) throws JSONException {
        Intrinsics.j(jsonBody, "jsonBody");
        Intrinsics.j(serverData, "serverData");
        Intrinsics.j(endPointInfo, "endPointInfo");
        ParsedResponse parsedResponseD = this.v4configParser.d(serverData.getConfig().getRevision(), endPointInfo.getApplicationId(), jsonBody);
        if (parsedResponseD == null) {
            return null;
        }
        try {
            return new ServerDataUpdate(parsedResponseD.getState(), parsedResponseD.getConfiguration(), a(serverData.getConfigV3(), jsonBody));
        } catch (Exception e10) {
            z8.f.b("dtxCommunication", "config v3 parsing: invalid JSON", e10);
            return null;
        }
    }
}
