package O8;

import B9.ResponseModel;
import G9.j;
import G9.n;
import N8.a;
import P8.RemoteConfig;
import com.medallia.digital.mobilesdk.l3;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import q9.C16485a;
import r9.C16735a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0012¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0010H\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\u0006\u0010\u000b\u001a\u00020\nH\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%¨\u0006&"}, d2 = {"LO8/i;", "LQ8/c;", "LB9/c;", "LP8/a;", "Lr9/a;", "randomProvider", "Lq9/a;", "clientIdProvider", "<init>", "(Lr9/a;Lq9/a;)V", "Lorg/json/JSONObject;", "remoteConfigJson", "e", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "g", "(Lorg/json/JSONObject;)LP8/a;", "", "url", "h", "(Ljava/lang/String;)Ljava/lang/String;", "jsonResponse", "LI9/a;", "b", "(Lorg/json/JSONObject;)LI9/a;", "logLevel", "c", "(Ljava/lang/String;)LI9/a;", "", "LN8/a;", "", "d", "(Lorg/json/JSONObject;)Ljava/util/Map;", "responseModel", "f", "(LB9/c;)LP8/a;", "a", "Lr9/a;", "Lq9/a;", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class i implements Q8.c<ResponseModel, RemoteConfig> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16735a randomProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16485a clientIdProvider;

    private String h(String url) {
        if (url != null) {
            String host = new URL(url).getHost();
            Intrinsics.g(host);
            if (StringsKt.G(host, ".emarsys.net", false, 2, null) || StringsKt.G(host, ".emarsys.com", false, 2, null)) {
                return url.toString();
            }
        }
        return null;
    }

    public i(C16735a randomProvider, C16485a clientIdProvider) {
        Intrinsics.j(randomProvider, "randomProvider");
        Intrinsics.j(clientIdProvider, "clientIdProvider");
        this.randomProvider = randomProvider;
        this.clientIdProvider = clientIdProvider;
    }

    private I9.a b(JSONObject jsonResponse) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jsonResponse.optJSONObject("luckyLogger");
        String strOptString = jsonResponse.optString("logLevel");
        if (jSONObjectOptJSONObject != null) {
            double d10 = jSONObjectOptJSONObject.getDouble("threshold");
            if (this.randomProvider.a(1.0d) <= d10 && d10 > 0.0d) {
                strOptString = jSONObjectOptJSONObject.getString("logLevel");
            }
        }
        Intrinsics.g(strOptString);
        return c(strOptString);
    }

    private I9.a c(String logLevel) {
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.i(ENGLISH, "ENGLISH");
        String lowerCase = logLevel.toLowerCase(ENGLISH);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1077545552:
                if (lowerCase.equals("metric")) {
                    return I9.a.f13735g;
                }
                return null;
            case 3237038:
                if (lowerCase.equals("info")) {
                    return I9.a.f13732d;
                }
                return null;
            case 3641990:
                if (lowerCase.equals("warn")) {
                    return I9.a.f13733e;
                }
                return null;
            case 95458899:
                if (lowerCase.equals("debug")) {
                    return I9.a.f13731c;
                }
                return null;
            case 96784904:
                if (lowerCase.equals("error")) {
                    return I9.a.f13734f;
                }
                return null;
            case 110620997:
                if (lowerCase.equals("trace")) {
                    return I9.a.f13730b;
                }
                return null;
            default:
                return null;
        }
    }

    private Map<N8.a, Boolean> d(JSONObject remoteConfigJson) {
        Iterator<String> itKeys;
        Sequence<String> sequenceH;
        JSONObject jSONObjectOptJSONObject = remoteConfigJson.optJSONObject("features");
        if (jSONObjectOptJSONObject == null || (itKeys = jSONObjectOptJSONObject.keys()) == null || (sequenceH = SequencesKt.h(itKeys)) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : sequenceH) {
            a.Companion companion = N8.a.INSTANCE;
            Intrinsics.g(str);
            linkedHashMap.put(companion.a(n.b(str)), Boolean.valueOf(jSONObjectOptJSONObject.getBoolean(str)));
        }
        return j.a(linkedHashMap);
    }

    private JSONObject e(JSONObject remoteConfigJson) {
        JSONObject jSONObjectOptJSONObject = remoteConfigJson.optJSONObject("overrides");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optJSONObject(this.clientIdProvider.d());
        }
        return null;
    }

    private RemoteConfig g(JSONObject remoteConfigJson) throws JSONException {
        RemoteConfig remoteConfig = new RemoteConfig(null, null, null, null, null, null, null, null, null, 511, null);
        if (remoteConfigJson.has("serviceUrls")) {
            JSONObject jSONObject = remoteConfigJson.getJSONObject("serviceUrls");
            Intrinsics.g(jSONObject);
            String strH = h(G9.i.d(jSONObject, "eventService"));
            String strH2 = h(G9.i.d(jSONObject, "clientService"));
            String strH3 = h(G9.i.d(jSONObject, "deepLinkService"));
            String strH4 = h(G9.i.d(jSONObject, "inboxService"));
            String strH5 = h(G9.i.d(jSONObject, "messageInboxService"));
            remoteConfig = RemoteConfig.b(remoteConfig, strH, strH2, h(G9.i.d(jSONObject, "predictService")), h(G9.i.d(jSONObject, "mobileEngageV2Service")), strH3, strH4, strH5, null, null, 384, null);
        }
        return RemoteConfig.b(RemoteConfig.b(remoteConfig, null, null, null, null, null, null, null, b(remoteConfigJson), null, 383, null), null, null, null, null, null, null, null, null, d(remoteConfigJson), l3.f92484c, null);
    }

    @Override // Q8.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public RemoteConfig a(ResponseModel responseModel) throws Exception {
        Intrinsics.j(responseModel, "responseModel");
        RemoteConfig remoteConfig = new RemoteConfig(null, null, null, null, null, null, null, null, null, 511, null);
        try {
            if (responseModel.getBody() == null) {
                throw new IllegalArgumentException("Remote Config response body should not be null!");
            }
            String body = responseModel.getBody();
            Intrinsics.g(body);
            JSONObject jSONObject = new JSONObject(body);
            JSONObject jSONObjectE = e(jSONObject);
            if (jSONObjectE != null) {
                JSONObject jSONObjectC = G9.h.c(jSONObject.optJSONObject("serviceUrls"), jSONObjectE.optJSONObject("serviceUrls"));
                JSONObject jSONObjectC2 = G9.h.c(jSONObject.optJSONObject("luckyLogger"), jSONObjectE.optJSONObject("luckyLogger"));
                JSONObject jSONObjectC3 = G9.h.c(jSONObject.optJSONObject("features"), jSONObjectE.optJSONObject("features"));
                jSONObject = G9.h.c(jSONObject, jSONObjectE);
                jSONObject.put("serviceUrls", jSONObjectC);
                jSONObject.put("luckyLogger", jSONObjectC2);
                jSONObject.put("features", jSONObjectC3);
            }
            return g(jSONObject);
        } catch (Exception e10) {
            if (!(e10 instanceof JSONException) && !(e10 instanceof IllegalArgumentException)) {
                throw e10;
            }
            I9.e.INSTANCE.c(new J9.b(e10, null, 2, null));
            return remoteConfig;
        }
    }
}
