package Vc;

import com.google.android.gms.internal.ads.C7266Vf;
import com.google.android.gms.internal.ads.C9302rg;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class Y extends Xc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f37195a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5364a f37196b;

    Y(C5364a c5364a, String str) {
        this.f37195a = str;
        this.f37196b = c5364a;
    }

    @Override // Xc.b
    public final void a(String str) {
        Qc.p.g("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        String strConcat = ((Boolean) C9302rg.f78049a.e()).booleanValue() ? ",\"as\":".concat(this.f37196b.f37212k.a().toString()) : "";
        String str2 = this.f37195a;
        Locale locale = Locale.getDefault();
        C7266Vf c7266Vf = C9302rg.f78051c;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) c7266Vf.e()).booleanValue() ? ((Long) C9302rg.f78054f.e()).longValue() : 0L), strConcat);
        if (((Boolean) c7266Vf.e()).booleanValue()) {
            try {
                this.f37196b.f37209h.execute(new Runnable() { // from class: Vc.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37191a.f37196b.f37203b.evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e10) {
                Lc.v.s().w(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.f37196b.f37203b.evaluateJavascript(str3, null);
        }
        if (((Boolean) C9302rg.f78049a.e()).booleanValue() && ((Boolean) C9302rg.f78050b.e()).booleanValue()) {
            this.f37196b.f37213l.c();
        }
    }

    @Override // Xc.b
    public final void b(Xc.a aVar) throws JSONException {
        String strConcat;
        final String str;
        long jLongValue;
        String strB = aVar.b();
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f37195a);
            jSONObject.put("signal", strB);
            if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
                jLongValue = ((Long) C9302rg.f78054f.e()).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("sdk_ttl_ms", jLongValue);
            if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
                jSONObject.put("as", this.f37196b.f37212k.a());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) C9302rg.f78049a.e()).booleanValue()) {
                strConcat = ",\"as\":".concat(this.f37196b.f37212k.a().toString());
            } else {
                strConcat = "";
            }
            String str2 = this.f37195a;
            Locale locale = Locale.getDefault();
            String strB2 = aVar.b();
            if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
                jLongValue2 = ((Long) C9302rg.f78054f.e()).longValue();
            }
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, strB2, Long.valueOf(jLongValue2), strConcat);
        }
        if (((Boolean) C9302rg.f78051c.e()).booleanValue()) {
            try {
                this.f37196b.f37209h.execute(new Runnable() { // from class: Vc.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37193a.f37196b.f37203b.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e10) {
                Lc.v.s().w(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.f37196b.f37203b.evaluateJavascript(str, null);
        }
        if (((Boolean) C9302rg.f78049a.e()).booleanValue() && ((Boolean) C9302rg.f78050b.e()).booleanValue()) {
            this.f37196b.f37213l.c();
        }
    }
}
