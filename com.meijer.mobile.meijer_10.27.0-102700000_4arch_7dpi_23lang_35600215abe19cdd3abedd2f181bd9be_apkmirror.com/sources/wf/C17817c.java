package wf;

import android.text.TextUtils;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import of.C16057z;
import org.json.JSONObject;
import tf.C17093a;
import tf.C17094b;
import tf.C17095c;

/* renamed from: wf.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C17817c implements l {

    /* renamed from: a, reason: collision with root package name */
    private final String f166060a;

    /* renamed from: b, reason: collision with root package name */
    private final C17094b f166061b;

    /* renamed from: c, reason: collision with root package name */
    private final lf.g f166062c;

    public C17817c(String str, C17094b c17094b) {
        this(str, c17094b, lf.g.f());
    }

    C17817c(String str, C17094b c17094b, lf.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f166062c = gVar;
        this.f166061b = c17094b;
        this.f166060a = str;
    }

    private C17093a b(C17093a c17093a, k kVar) {
        c(c17093a, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f166093a);
        c(c17093a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(c17093a, "X-CRASHLYTICS-API-CLIENT-VERSION", C16057z.n());
        c(c17093a, "Accept", "application/json");
        c(c17093a, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f166094b);
        c(c17093a, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f166095c);
        c(c17093a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f166096d);
        c(c17093a, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f166097e.a().c());
        return c17093a;
    }

    private void c(C17093a c17093a, String str, String str2) {
        if (str2 != null) {
            c17093a.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f166062c.l("Failed to parse settings JSON from " + this.f166060a, e10);
            this.f166062c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f166100h);
        map.put("display_version", kVar.f166099g);
        map.put("source", Integer.toString(kVar.f166101i));
        String str = kVar.f166098f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    protected C17093a d(Map<String, String> map) {
        return this.f166061b.a(this.f166060a, map).d(HttpHeaders.USER_AGENT, "Crashlytics Android SDK/" + C16057z.n()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    boolean h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }

    @Override // wf.l
    public JSONObject a(k kVar, boolean z10) {
        pf.i.d();
        if (z10) {
            try {
                Map<String, String> mapF = f(kVar);
                C17093a c17093aB = b(d(mapF), kVar);
                this.f166062c.b("Requesting settings from " + this.f166060a);
                this.f166062c.i("Settings query params were: " + mapF);
                return g(c17093aB.c());
            } catch (IOException e10) {
                this.f166062c.e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    JSONObject g(C17095c c17095c) {
        int iB = c17095c.b();
        this.f166062c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(c17095c.a());
        }
        this.f166062c.d("Settings request failed; (status: " + iB + ") from " + this.f166060a);
        return null;
    }
}
