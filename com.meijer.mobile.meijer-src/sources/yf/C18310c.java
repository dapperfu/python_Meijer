package yf;

import android.text.TextUtils;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import qf.C16665z;
import vf.C17668a;
import vf.C17669b;
import vf.C17670c;

/* renamed from: yf.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C18310c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f171382a;

    /* renamed from: b, reason: collision with root package name */
    private final C17669b f171383b;

    /* renamed from: c, reason: collision with root package name */
    private final nf.g f171384c;

    public C18310c(String str, C17669b c17669b) {
        this(str, c17669b, nf.g.f());
    }

    C18310c(String str, C17669b c17669b, nf.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f171384c = gVar;
        this.f171383b = c17669b;
        this.f171382a = str;
    }

    private C17668a b(C17668a c17668a, k kVar) {
        c(c17668a, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f171415a);
        c(c17668a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(c17668a, "X-CRASHLYTICS-API-CLIENT-VERSION", C16665z.n());
        c(c17668a, "Accept", "application/json");
        c(c17668a, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f171416b);
        c(c17668a, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f171417c);
        c(c17668a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f171418d);
        c(c17668a, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f171419e.a().c());
        return c17668a;
    }

    private void c(C17668a c17668a, String str, String str2) {
        if (str2 != null) {
            c17668a.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f171384c.l("Failed to parse settings JSON from " + this.f171382a, e10);
            this.f171384c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f171422h);
        map.put("display_version", kVar.f171421g);
        map.put("source", Integer.toString(kVar.f171423i));
        String str = kVar.f171420f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    protected C17668a d(Map<String, String> map) {
        return this.f171383b.a(this.f171382a, map).d(HttpHeaders.USER_AGENT, "Crashlytics Android SDK/" + C16665z.n()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    @Override // yf.l
    public JSONObject a(k kVar, boolean z10) {
        rf.i.d();
        if (z10) {
            try {
                Map<String, String> mapF = f(kVar);
                C17668a c17668aB = b(d(mapF), kVar);
                this.f171384c.b("Requesting settings from " + this.f171382a);
                this.f171384c.i("Settings query params were: " + mapF);
                return g(c17668aB.c());
            } catch (IOException e10) {
                this.f171384c.e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    JSONObject g(C17670c c17670c) {
        int iB = c17670c.b();
        this.f171384c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(c17670c.a());
        }
        this.f171384c.d("Settings request failed; (status: " + iB + ") from " + this.f171382a);
        return null;
    }
}
