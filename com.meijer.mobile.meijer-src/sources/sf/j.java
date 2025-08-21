package sf;

import org.json.JSONException;
import org.json.JSONObject;
import tf.AbstractC17251F;

/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Df.a f160372a = new Ff.d().j(C17070a.f160323a).i();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    static j a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j10) {
        return new C17071b(str, str2, i(str3), str4, j10);
    }

    private static String i(String str) {
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public AbstractC17251F.e.d.AbstractC2568e h() {
        return AbstractC17251F.e.d.AbstractC2568e.a().d(AbstractC17251F.e.d.AbstractC2568e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
