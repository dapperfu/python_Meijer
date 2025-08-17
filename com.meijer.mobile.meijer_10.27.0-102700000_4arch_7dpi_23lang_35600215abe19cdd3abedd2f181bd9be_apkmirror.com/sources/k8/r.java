package k8;

import com.dynatrace.android.agent.comm.InvalidConfigurationException;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import io.constructor.data.local.PreferencesHelper;
import java.text.ParseException;
import java.util.Map;
import k8.o;
import k8.p;
import k8.q;
import k8.t;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes4.dex */
public class r implements s {

    /* renamed from: b, reason: collision with root package name */
    private static final q f141754b = new q.b().r().C(q.c.ERROR).p();

    /* renamed from: c, reason: collision with root package name */
    private static final q f141755c = new q.b().E(-1).p();

    /* renamed from: a, reason: collision with root package name */
    private final String f141756a;

    private int g(JSONObject jSONObject, String str, int i10, int i11, int i12) {
        return h(jSONObject, str, i10, i11, i12, i12);
    }

    private JSONObject j(q qVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("replayConfig", n(qVar));
        jSONObject.put("gen3Enabled", qVar.E());
        return jSONObject;
    }

    private JSONObject k(q qVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("serverId", qVar.x());
        return jSONObject;
    }

    private JSONObject l(q qVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxBeaconSizeKb", qVar.r());
        jSONObject.put("selfmonitoring", qVar.F());
        t tVarY = qVar.y();
        jSONObject.put("maxSessionDurationMins", tVarY.d());
        jSONObject.put("sessionTimeoutSec", tVarY.c());
        jSONObject.put("sendIntervalSec", qVar.w());
        jSONObject.put("maxCachedCrashesCount", qVar.s());
        jSONObject.put("rageTapConfig", m(qVar));
        jSONObject.put("replayConfig", o(qVar));
        return jSONObject;
    }

    @Override // k8.s
    public void a(q.b bVar, p.b bVar2, JSONObject jSONObject) throws JSONException {
        r rVar;
        JSONObject jSONObject2;
        r rVar2;
        if (jSONObject.has("maxBeaconSizeKb")) {
            rVar = this;
            jSONObject2 = jSONObject;
            bVar.t(f(jSONObject, "maxBeaconSizeKb", 10, a.e.API_PRIORITY_OTHER, BinsView.TOTE_WIDTH_DP));
        } else {
            rVar = this;
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("selfmonitoring")) {
            bVar.y(s(jSONObject2, "selfmonitoring", true));
        }
        bVar.B(r(jSONObject2));
        if (jSONObject2.has("sendIntervalSec")) {
            bVar.z(rVar.f(jSONObject2, "sendIntervalSec", 10, BinsView.TOTE_HEIGHT_DP, BinsView.TOTE_HEIGHT_DP));
        }
        if (jSONObject2.has("maxCachedCrashesCount")) {
            rVar2 = this;
            bVar.u(rVar2.f(jSONObject2, "maxCachedCrashesCount", 0, 100, 0));
        } else {
            rVar2 = this;
        }
        if (jSONObject2.has("rageTapConfig")) {
            bVar.w(q(jSONObject2.getJSONObject("rageTapConfig")));
        }
        if (jSONObject2.has("replayConfig")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("replayConfig");
            if (jSONObject3.has("protocolVersion")) {
                bVar2.p(rVar2.f(jSONObject3, "protocolVersion", 1, 32767, 1));
            }
            if (jSONObject3.has("selfmonitoring")) {
                bVar2.r(f(jSONObject3, "selfmonitoring", 0, a.e.API_PRIORITY_OTHER, 0));
            }
            if (jSONObject3.has("pixelCopy")) {
                bVar2.o(s(jSONObject3, "pixelCopy", false));
            }
            if (jSONObject3.has("colorMasking")) {
                bVar2.l(s(jSONObject3, "colorMasking", false));
            }
        }
    }

    @Override // k8.s
    public q b(Map<String, String> map, EnumC15115a enumC15115a) {
        q.b bVar = new q.b();
        bVar.q(x8.f.o(map, "cp", 0, 1, 1, true));
        bVar.z(x8.f.n(map, "si", 60, 540, BinsView.TOTE_HEIGHT_DP));
        bVar.A(x8.f.n(map, PreferencesHelper.PREF_ID, 0, a.e.API_PRIORITY_OTHER, 1));
        bVar.t(x8.f.n(map, "bl", 1, a.e.API_PRIORITY_OTHER, enumC15115a == EnumC15115a.APP_MON ? 30 : BinsView.TOTE_WIDTH_DP));
        bVar.B(t.a().d(x8.f.n(map, "st", 0, a.e.API_PRIORITY_OTHER, 600)).c());
        bVar.F(x8.f.o(map, "tc", 1, 100, 100, true));
        bVar.v(x8.f.o(map, "mp", 0, a.e.API_PRIORITY_OTHER, 1, true));
        bVar.y(x8.f.o(map, "sm", 0, 1, 1, true) == 1);
        return bVar.p();
    }

    @Override // k8.s
    public void c(q.b bVar, p.b bVar2, JSONObject jSONObject) throws JSONException, ParseException {
        JSONObject jSONObject2;
        r rVar;
        if (jSONObject.has("applicationId")) {
            if (!this.f141756a.equals(jSONObject.getString("applicationId"))) {
                throw new ParseException("No application id", 0);
            }
        }
        if (jSONObject.has("capture")) {
            jSONObject2 = jSONObject;
            bVar.q(g(jSONObject2, "capture", 0, 1, 1));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("trafficControlPercentage")) {
            rVar = this;
            bVar.F(rVar.g(jSONObject2, "trafficControlPercentage", 1, 100, 100));
        } else {
            rVar = this;
        }
        if (jSONObject2.has("gen3Enabled")) {
            bVar.s(s(jSONObject2, "gen3Enabled", false));
        }
        if (jSONObject2.has("replayConfig")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("replayConfig");
            if (jSONObject3.has("capture")) {
                bVar2.k(s(jSONObject3, "capture", false));
            }
            if (jSONObject3.has("crashesEnabled")) {
                bVar2.m(s(jSONObject3, "crashesEnabled", false));
                bVar2.n(true);
            }
            if (jSONObject3.has("trafficControlPercentage")) {
                bVar2.s(rVar.h(jSONObject3, "trafficControlPercentage", 0, 100, 0, 100));
            }
            if (jSONObject3.has("imageRetentionTimeInMinutes")) {
                bVar2.q(f(jSONObject3, "imageRetentionTimeInMinutes", 0, a.e.API_PRIORITY_OTHER, 0));
            }
        }
    }

    @Override // k8.s
    public q d(q qVar, String str) throws JSONException, InvalidConfigurationException, ClassCastException {
        q.b bVarJ;
        JSONObject jSONObject = (JSONObject) new JSONTokener(str).nextValue();
        if (!jSONObject.has("dynamicConfig")) {
            throw new InvalidConfigurationException("The configuration is missing the dynamicConfig block");
        }
        if (jSONObject.has("timestamp") && jSONObject.has("appConfig") && jSONObject.has("mobileAgentConfig")) {
            bVarJ = q.q();
            try {
                long j10 = jSONObject.getLong("timestamp");
                if (j10 <= qVar.A()) {
                    return qVar;
                }
                bVarJ.E(j10);
                p.b bVarJ2 = p.j();
                a(bVarJ, bVarJ2, jSONObject.getJSONObject("mobileAgentConfig"));
                try {
                    c(bVarJ, bVarJ2, jSONObject.getJSONObject("appConfig"));
                    bVarJ.x(bVarJ2.j());
                } catch (ParseException unused) {
                    return f141754b;
                }
            } catch (JSONException unused2) {
                x8.f.a("dtxCommunication", "parsing v3 config: timestamp must be of type long");
                return f141754b;
            }
        } else {
            bVarJ = qVar.J(true);
        }
        try {
            e(bVarJ, jSONObject.getJSONObject("dynamicConfig"));
            return bVarJ.p();
        } catch (ParseException unused3) {
            return f141754b;
        }
    }

    @Override // k8.s
    public void e(q.b bVar, JSONObject jSONObject) throws JSONException, ParseException {
        JSONObject jSONObject2;
        if (jSONObject.has("status") && jSONObject.getString("status").compareToIgnoreCase("ERROR") == 0) {
            throw new ParseException("Error status detected", 0);
        }
        bVar.C(q.c.OK);
        if (jSONObject.has("multiplicity")) {
            jSONObject2 = jSONObject;
            bVar.v(g(jSONObject2, "multiplicity", 0, a.e.API_PRIORITY_OTHER, 1));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("serverId")) {
            bVar.A(g(jSONObject2, "serverId", 0, a.e.API_PRIORITY_OTHER, 1));
        }
        if (jSONObject2.has("switchServer")) {
            bVar.D(s(jSONObject2, "switchServer", false));
        }
    }

    public q i(String str) throws JSONException, InvalidConfigurationException, ClassCastException {
        q qVarD = d(f141755c, str);
        if (qVarD.z() == q.c.OK) {
            return qVarD;
        }
        throw new InvalidConfigurationException("unexpected status code: " + qVarD.z());
    }

    public String p(q qVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mobileAgentConfig", l(qVar));
        jSONObject.put("appConfig", j(qVar));
        jSONObject.put("dynamicConfig", k(qVar));
        jSONObject.put("timestamp", 0L);
        return jSONObject.toString();
    }

    public r(String str) {
        this.f141756a = str;
    }

    private int f(JSONObject jSONObject, String str, int i10, int i11, int i12) {
        if (jSONObject.has(str)) {
            try {
                return Math.max(Math.min(jSONObject.getInt(str), i11), i10);
            } catch (JSONException unused) {
                x8.f.a("dtxCommunication", "parsing v3 config: expected JSON property \"" + str + "\" to be an Integer, but it was not");
            }
        }
        return i12;
    }

    private int h(JSONObject jSONObject, String str, int i10, int i11, int i12, int i13) throws JSONException {
        if (jSONObject.has(str)) {
            try {
                int i14 = jSONObject.getInt(str);
                if (i14 >= i10) {
                    if (i14 > i11) {
                        return i13;
                    }
                    return i14;
                }
            } catch (JSONException unused) {
                x8.f.a("dtxCommunication", "parsing v3 config: expected JSON property \"" + str + "\" to be an Integer, but it was not");
            }
        }
        return i12;
    }

    private JSONObject m(q qVar) throws JSONException {
        o oVarU = qVar.u();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tapDuration", oVarU.d());
        jSONObject.put("dispersionRadius", oVarU.b());
        jSONObject.put("timespanDifference", oVarU.e());
        jSONObject.put("minimumNumberOfTaps", oVarU.c());
        return jSONObject;
    }

    private JSONObject n(q qVar) throws JSONException {
        p pVarV = qVar.v();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("capture", pVarV.p());
        jSONObject.put("imageRetentionTimeInMinutes", pVarV.n());
        if (pVarV.l()) {
            jSONObject.put("trafficControlPercentage", pVarV.o());
            jSONObject.put("crashesEnabled", pVarV.k());
        }
        return jSONObject;
    }

    private JSONObject o(q qVar) throws JSONException {
        p pVarV = qVar.v();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocolVersion", pVarV.m());
        jSONObject.put("pixelCopy", pVarV.r());
        jSONObject.put("colorMasking", pVarV.q());
        return jSONObject;
    }

    private boolean s(JSONObject jSONObject, String str, boolean z10) {
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            x8.f.a("dtxCommunication", "parsing v3 config: expected JSON property \"" + str + "\" to be a Boolean, but it was not");
            return z10;
        }
    }

    o q(JSONObject jSONObject) {
        JSONObject jSONObject2;
        o.b bVarA = o.a();
        if (jSONObject.has("tapDuration")) {
            jSONObject2 = jSONObject;
            bVarA.h(f(jSONObject, "tapDuration", 0, a.e.API_PRIORITY_OTHER, 100));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("dispersionRadius")) {
            bVarA.f(f(jSONObject2, "dispersionRadius", 0, a.e.API_PRIORITY_OTHER, 100));
        }
        if (jSONObject2.has("timespanDifference")) {
            bVarA.i(f(jSONObject2, "timespanDifference", 0, a.e.API_PRIORITY_OTHER, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES));
        }
        if (jSONObject2.has("minimumNumberOfTaps")) {
            bVarA.g(f(jSONObject2, "minimumNumberOfTaps", 3, a.e.API_PRIORITY_OTHER, 3));
        }
        return bVarA.e();
    }

    t r(JSONObject jSONObject) {
        JSONObject jSONObject2;
        t.b bVarA = t.a();
        if (jSONObject.has("maxSessionDurationMins")) {
            jSONObject2 = jSONObject;
            bVarA.e(f(jSONObject, "maxSessionDurationMins", 10, a.e.API_PRIORITY_OTHER, 360));
        } else {
            jSONObject2 = jSONObject;
        }
        if (jSONObject2.has("sessionTimeoutSec")) {
            bVarA.d(f(jSONObject2, "sessionTimeoutSec", 30, a.e.API_PRIORITY_OTHER, 600));
        }
        return bVarA.c();
    }
}
