package na;

import android.os.Looper;
import android.webkit.JavascriptInterface;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import na.s;
import org.json.JSONException;
import org.json.JSONObject;
import ta.C17210a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JY\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0012¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001a\u0010\u0015J#\u0010\u001d\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u00100\u001a\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lna/g;", "", "Ln9/b;", "concurrentHandlerHolder", "Lna/s;", "jsCommandFactory", "<init>", "(Ln9/b;Lna/s;)V", "", "jsonString", "property", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lorg/json/JSONObject;", "json", "jsBridgeEventAction", "", "j", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "close", "(Ljava/lang/String;)V", "triggerAppEvent", "triggerMEEvent", "buttonClicked", "openExternalLink", "copyToClipboard", PreferencesHelper.PREF_ID, "resultPayload", "o", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "error", "l", "(Ljava/lang/String;Ljava/lang/String;)V", "payload", "m", "(Lorg/json/JSONObject;)V", "a", "Ln9/b;", "b", "Lna/s;", "Lta/a;", "c", "Lta/a;", "i", "()Lta/a;", "p", "(Lta/a;)V", "iamWebView", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s jsCommandFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C17210a iamWebView;

    public g(n9.b concurrentHandlerHolder, s jsCommandFactory) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(jsCommandFactory, "jsCommandFactory");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.jsCommandFactory = jsCommandFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject g(g gVar, String property, JSONObject json) {
        Intrinsics.j(property, "property");
        Intrinsics.j(json, "json");
        gVar.jsCommandFactory.m(s.a.f152157b).invoke(property, json);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject h(g gVar, String property, JSONObject json) {
        Intrinsics.j(property, "property");
        Intrinsics.j(json, "json");
        gVar.jsCommandFactory.m(s.a.f152161f).invoke(property, json);
        return null;
    }

    private void j(String jsonString, String property, Function2<? super String, ? super JSONObject, ? extends JSONObject> jsBridgeEventAction) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(jsonString);
            String string = jSONObject.getString(PreferencesHelper.PREF_ID);
            if (!jSONObject.has(property)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
                String str = String.format("Missing %s!", Arrays.copyOf(new Object[]{property}, 1));
                Intrinsics.i(str, "format(...)");
                l(string, str);
                return;
            }
            String string2 = jSONObject.getString(property);
            try {
                Intrinsics.g(string2);
                o(string, jsBridgeEventAction.invoke(string2, jSONObject));
            } catch (Exception e10) {
                l(string, e10.getMessage());
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject k(g gVar, String property, JSONObject json) {
        Intrinsics.j(property, "property");
        Intrinsics.j(json, "json");
        if (!json.optBoolean("keepInAppOpen", false)) {
            gVar.jsCommandFactory.m(s.a.f152158c).invoke(null, new JSONObject());
        }
        gVar.jsCommandFactory.m(s.a.f152160e).invoke(property, json);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject q(g gVar, String property, JSONObject json) {
        Intrinsics.j(property, "property");
        Intrinsics.j(json, "json");
        gVar.jsCommandFactory.m(s.a.f152156a).invoke(property, json);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject r(g gVar, String property, JSONObject json) {
        Intrinsics.j(property, "property");
        Intrinsics.j(json, "json");
        gVar.jsCommandFactory.m(s.a.f152159d).invoke(property, json);
        return null;
    }

    @JavascriptInterface
    public void buttonClicked(String jsonString) throws JSONException {
        Intrinsics.j(jsonString, "jsonString");
        j(jsonString, "buttonId", new Function2() { // from class: na.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.g(this.f152122a, (String) obj, (JSONObject) obj2);
            }
        });
    }

    @JavascriptInterface
    public void close(String jsonString) {
        Intrinsics.j(jsonString, "jsonString");
        this.jsCommandFactory.m(s.a.f152158c).invoke(null, new JSONObject());
    }

    @JavascriptInterface
    public void copyToClipboard(String jsonString) throws JSONException {
        Intrinsics.j(jsonString, "jsonString");
        j(jsonString, "text", new Function2() { // from class: na.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.h(this.f152120a, (String) obj, (JSONObject) obj2);
            }
        });
    }

    /* renamed from: i, reason: from getter */
    public C17210a getIamWebView() {
        return this.iamWebView;
    }

    public void l(String id2, String error) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PreferencesHelper.PREF_ID, id2).put("success", false).put("error", error);
            Intrinsics.i(jSONObjectPut, "put(...)");
            m(jSONObjectPut);
        } catch (JSONException unused) {
        }
    }

    public void m(final JSONObject payload) {
        Intrinsics.j(payload, "payload");
        if (!payload.has(PreferencesHelper.PREF_ID)) {
            throw new IllegalArgumentException("Payload must have an id!");
        }
        if (!Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
            this.concurrentHandlerHolder.h(new Runnable() { // from class: na.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.n(this.f152125a, payload);
                }
            });
            return;
        }
        C17210a iamWebView = getIamWebView();
        if (iamWebView != null) {
            iamWebView.d(payload);
        }
    }

    public void o(String id2, JSONObject resultPayload) {
        try {
            m(I9.h.c(new JSONObject().put(PreferencesHelper.PREF_ID, id2).put("success", true), resultPayload));
        } catch (JSONException unused) {
        }
    }

    @JavascriptInterface
    public void openExternalLink(String jsonString) throws JSONException {
        Intrinsics.j(jsonString, "jsonString");
        j(jsonString, "url", new Function2() { // from class: na.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.k(this.f152121a, (String) obj, (JSONObject) obj2);
            }
        });
    }

    public void p(C17210a c17210a) {
        this.iamWebView = c17210a;
    }

    @JavascriptInterface
    public void triggerAppEvent(String jsonString) throws JSONException {
        Intrinsics.j(jsonString, "jsonString");
        j(jsonString, "name", new Function2() { // from class: na.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.q(this.f152124a, (String) obj, (JSONObject) obj2);
            }
        });
    }

    @JavascriptInterface
    public void triggerMEEvent(String jsonString) throws JSONException {
        Intrinsics.j(jsonString, "jsonString");
        j(jsonString, "name", new Function2() { // from class: na.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.r(this.f152123a, (String) obj, (JSONObject) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(g gVar, JSONObject jSONObject) {
        C17210a iamWebView = gVar.getIamWebView();
        if (iamWebView != null) {
            iamWebView.d(jSONObject);
        }
    }
}
