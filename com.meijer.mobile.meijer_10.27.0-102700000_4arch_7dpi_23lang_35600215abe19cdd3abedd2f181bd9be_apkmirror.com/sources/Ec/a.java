package Ec;

import Mc.W0;
import com.google.maps.android.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f7754a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7755b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7756c;

    /* renamed from: d, reason: collision with root package name */
    private final a f7757d;

    public a(int i10, String str, String str2, a aVar) {
        this.f7754a = i10;
        this.f7755b = str;
        this.f7756c = str2;
        this.f7757d = aVar;
    }

    public a(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public int a() {
        return this.f7754a;
    }

    public String b() {
        return this.f7756c;
    }

    public String c() {
        return this.f7755b;
    }

    public final W0 d() {
        W0 w02;
        a aVar = this.f7757d;
        if (aVar == null) {
            w02 = null;
        } else {
            w02 = new W0(aVar.f7754a, aVar.f7755b, aVar.f7756c, null, null);
        }
        return new W0(this.f7754a, this.f7755b, this.f7756c, w02, null);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f7754a);
        jSONObject.put("Message", this.f7755b);
        jSONObject.put("Domain", this.f7756c);
        a aVar = this.f7757d;
        if (aVar == null) {
            jSONObject.put("Cause", BuildConfig.TRAVIS);
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
