package Gc;

import Oc.W0;
import com.google.maps.android.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final int f11306a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11307b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11308c;

    /* renamed from: d, reason: collision with root package name */
    private final a f11309d;

    public a(int i10, String str, String str2, a aVar) {
        this.f11306a = i10;
        this.f11307b = str;
        this.f11308c = str2;
        this.f11309d = aVar;
    }

    public a(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }

    public int a() {
        return this.f11306a;
    }

    public String b() {
        return this.f11308c;
    }

    public String c() {
        return this.f11307b;
    }

    public final W0 d() {
        W0 w02;
        a aVar = this.f11309d;
        if (aVar == null) {
            w02 = null;
        } else {
            w02 = new W0(aVar.f11306a, aVar.f11307b, aVar.f11308c, null, null);
        }
        return new W0(this.f11306a, this.f11307b, this.f11308c, w02, null);
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f11306a);
        jSONObject.put("Message", this.f11307b);
        jSONObject.put("Domain", this.f11308c);
        a aVar = this.f11309d;
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
