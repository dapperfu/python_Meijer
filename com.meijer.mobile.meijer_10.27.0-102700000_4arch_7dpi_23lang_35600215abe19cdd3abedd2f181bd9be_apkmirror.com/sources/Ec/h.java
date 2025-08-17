package Ec;

import com.google.maps.android.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h extends a {

    /* renamed from: e, reason: collision with root package name */
    private final p f7787e;

    public p f() {
        return this.f7787e;
    }

    public h(int i10, String str, String str2, a aVar, p pVar) {
        super(i10, str, str2, aVar);
        this.f7787e = pVar;
    }

    @Override // Ec.a
    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectE = super.e();
        p pVarF = f();
        if (pVarF == null) {
            jSONObjectE.put("Response Info", BuildConfig.TRAVIS);
            return jSONObjectE;
        }
        jSONObjectE.put("Response Info", pVarF.g());
        return jSONObjectE;
    }

    @Override // Ec.a
    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
