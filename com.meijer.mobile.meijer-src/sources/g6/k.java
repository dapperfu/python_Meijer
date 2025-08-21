package g6;

import R5.t;
import com.medallia.digital.mobilesdk.q2;
import io.constructor.BuildConfig;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private boolean f134093a = true;

    /* renamed from: b, reason: collision with root package name */
    private String f134094b = "";

    /* renamed from: d, reason: collision with root package name */
    private String f134096d = "";

    /* renamed from: c, reason: collision with root package name */
    private String f134095c = "";

    public enum a {
        NONE(1),
        ENCODE(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f134100a;

        a(int i10) {
            this.f134100a = i10;
        }
    }

    public k a(String str) {
        if (str != null && str.length() != 0) {
            this.f134094b += q2.f93563c + l.b(str);
        }
        return this;
    }

    public k b(String str, a aVar) {
        if (str != null && str.length() != 0) {
            if (aVar == a.ENCODE) {
                str = l.b(str);
            }
            String str2 = this.f134096d;
            if (str2 != null && str2.length() != 0) {
                this.f134096d += "&" + str;
                return this;
            }
            this.f134096d = str;
        }
        return this;
    }

    public k d(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    public String e() throws URISyntaxException {
        if (i.a(this.f134095c)) {
            t.b("URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s)", this.f134095c, this.f134094b, this.f134096d);
            return null;
        }
        String str = this.f134096d;
        String str2 = String.format("%s://%s%s%s%s", this.f134093a ? BuildConfig.SERVICE_SCHEME : "http", this.f134095c, this.f134094b, str != null && str.length() > 0 ? "?" : "", this.f134096d);
        try {
            new URL(str2).toURI();
            return str2;
        } catch (Exception e10) {
            t.b("MobileCore", "URLBuilder", "Failed to generate the URL for (server:%s,  path:%s, query:%s) (%s)", this.f134095c, this.f134094b, this.f134096d, e10);
            return null;
        }
    }

    public k f(boolean z10) {
        this.f134093a = z10;
        return this;
    }

    public k g(String str) {
        this.f134095c = str;
        return this;
    }

    public k c(String str, String str2) {
        if (!i.a(str) && !i.a(str2)) {
            return b(l.b(str) + "=" + l.b(str2), a.NONE);
        }
        return this;
    }
}
