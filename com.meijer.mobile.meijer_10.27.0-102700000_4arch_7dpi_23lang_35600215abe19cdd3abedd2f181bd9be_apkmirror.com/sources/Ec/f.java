package Ec;

import Mc.W0;
import Mc.h2;
import com.google.maps.android.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final h2 f7785a;

    /* renamed from: b, reason: collision with root package name */
    private final a f7786b;

    public static f e(h2 h2Var) {
        if (h2Var != null) {
            return new f(h2Var);
        }
        return null;
    }

    public String a() {
        return this.f7785a.f19273f;
    }

    public String b() {
        return this.f7785a.f19275h;
    }

    public String c() {
        return this.f7785a.f19274g;
    }

    public String d() {
        return this.f7785a.f19272e;
    }

    public final JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.f7785a.f19268a);
        jSONObject.put("Latency", this.f7785a.f19269b);
        String strD = d();
        if (strD == null) {
            jSONObject.put("Ad Source Name", BuildConfig.TRAVIS);
        } else {
            jSONObject.put("Ad Source Name", strD);
        }
        String strA = a();
        if (strA == null) {
            jSONObject.put("Ad Source ID", BuildConfig.TRAVIS);
        } else {
            jSONObject.put("Ad Source ID", strA);
        }
        String strC = c();
        if (strC == null) {
            jSONObject.put("Ad Source Instance Name", BuildConfig.TRAVIS);
        } else {
            jSONObject.put("Ad Source Instance Name", strC);
        }
        String strB = b();
        if (strB == null) {
            jSONObject.put("Ad Source Instance ID", BuildConfig.TRAVIS);
        } else {
            jSONObject.put("Ad Source Instance ID", strB);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f7785a.f19271d.keySet()) {
            jSONObject2.put(str, this.f7785a.f19271d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        a aVar = this.f7786b;
        if (aVar == null) {
            jSONObject.put("Ad Error", BuildConfig.TRAVIS);
            return jSONObject;
        }
        jSONObject.put("Ad Error", aVar.e());
        return jSONObject;
    }

    private f(h2 h2Var) {
        a aVarB;
        this.f7785a = h2Var;
        W0 w02 = h2Var.f19270c;
        if (w02 == null) {
            aVarB = null;
        } else {
            aVarB = w02.B();
        }
        this.f7786b = aVarB;
    }

    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
