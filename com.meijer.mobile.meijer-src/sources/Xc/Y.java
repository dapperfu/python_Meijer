package Xc;

import com.google.android.gms.internal.ads.C7391Vf;
import com.google.android.gms.internal.ads.C9427rg;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class Y extends Zc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f41907a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5567a f41908b;

    Y(C5567a c5567a, String str) {
        this.f41907a = str;
        this.f41908b = c5567a;
    }

    @Override // Zc.b
    public final void a(String str) {
        Sc.p.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String strConcat = ((Boolean) C9427rg.f78889a.e()).booleanValue() ? ",\"as\":".concat(this.f41908b.f41924k.a().toString()) : "";
        String str2 = this.f41907a;
        Locale locale = Locale.getDefault();
        C7391Vf c7391Vf = C9427rg.f78891c;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) c7391Vf.e()).booleanValue() ? ((Long) C9427rg.f78894f.e()).longValue() : 0L), strConcat);
        if (((Boolean) c7391Vf.e()).booleanValue()) {
            try {
                this.f41908b.f41921h.execute(new Runnable() { // from class: Xc.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41903a.f41908b.f41915b.evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e10) {
                Nc.v.s().w(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.f41908b.f41915b.evaluateJavascript(str3, null);
        }
        if (((Boolean) C9427rg.f78889a.e()).booleanValue() && ((Boolean) C9427rg.f78890b.e()).booleanValue()) {
            this.f41908b.f41925l.c();
        }
    }

    @Override // Zc.b
    public final void b(Zc.a aVar) throws JSONException {
        String strConcat;
        final String str;
        long jLongValue;
        String strB = aVar.b();
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f41907a);
            jSONObject.put("signal", strB);
            if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
                jLongValue = ((Long) C9427rg.f78894f.e()).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("sdk_ttl_ms", jLongValue);
            if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
                jSONObject.put("as", this.f41908b.f41924k.a());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) C9427rg.f78889a.e()).booleanValue()) {
                strConcat = ",\"as\":".concat(this.f41908b.f41924k.a().toString());
            } else {
                strConcat = "";
            }
            String str2 = this.f41907a;
            Locale locale = Locale.getDefault();
            String strB2 = aVar.b();
            if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
                jLongValue2 = ((Long) C9427rg.f78894f.e()).longValue();
            }
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, strB2, Long.valueOf(jLongValue2), strConcat);
        }
        if (((Boolean) C9427rg.f78891c.e()).booleanValue()) {
            try {
                this.f41908b.f41921h.execute(new Runnable() { // from class: Xc.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f41905a.f41908b.f41915b.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e10) {
                Nc.v.s().w(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.f41908b.f41915b.evaluateJavascript(str, null);
        }
        if (((Boolean) C9427rg.f78889a.e()).booleanValue() && ((Boolean) C9427rg.f78890b.e()).booleanValue()) {
            this.f41908b.f41925l.c();
        }
    }
}
