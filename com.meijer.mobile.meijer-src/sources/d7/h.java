package d7;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
public class h implements X6.e {

    /* renamed from: b, reason: collision with root package name */
    private final i f128215b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f128216c;

    /* renamed from: d, reason: collision with root package name */
    private final String f128217d;

    /* renamed from: e, reason: collision with root package name */
    private String f128218e;

    /* renamed from: f, reason: collision with root package name */
    private URL f128219f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f128220g;

    /* renamed from: h, reason: collision with root package name */
    private int f128221h;

    public h(URL url) {
        this(url, i.f128223b);
    }

    public h(String str) {
        this(str, i.f128223b);
    }

    private byte[] b() {
        if (this.f128220g == null) {
            this.f128220g = a().getBytes(X6.e.f41646a);
        }
        return this.f128220g;
    }

    private String d() {
        if (TextUtils.isEmpty(this.f128218e)) {
            String string = this.f128217d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) r7.k.d(this.f128216c)).toString();
            }
            this.f128218e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f128218e;
    }

    private URL e() throws MalformedURLException {
        if (this.f128219f == null) {
            this.f128219f = new URL(d());
        }
        return this.f128219f;
    }

    public String a() {
        String str = this.f128217d;
        return str != null ? str : ((URL) r7.k.d(this.f128216c)).toString();
    }

    public Map<String, String> c() {
        return this.f128215b.a();
    }

    @Override // X6.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (a().equals(hVar.a()) && this.f128215b.equals(hVar.f128215b)) {
                return true;
            }
        }
        return false;
    }

    @Override // X6.e
    public int hashCode() {
        if (this.f128221h == 0) {
            int iHashCode = a().hashCode();
            this.f128221h = iHashCode;
            this.f128221h = (iHashCode * 31) + this.f128215b.hashCode();
        }
        return this.f128221h;
    }

    public h(URL url, i iVar) {
        this.f128216c = (URL) r7.k.d(url);
        this.f128217d = null;
        this.f128215b = (i) r7.k.d(iVar);
    }

    public URL f() throws MalformedURLException {
        return e();
    }

    public String toString() {
        return a();
    }

    @Override // X6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b());
    }

    public h(String str, i iVar) {
        this.f128216c = null;
        this.f128217d = r7.k.b(str);
        this.f128215b = (i) r7.k.d(iVar);
    }
}
