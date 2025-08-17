package b7;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes4.dex */
public class h implements V6.e {

    /* renamed from: b, reason: collision with root package name */
    private final i f59980b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f59981c;

    /* renamed from: d, reason: collision with root package name */
    private final String f59982d;

    /* renamed from: e, reason: collision with root package name */
    private String f59983e;

    /* renamed from: f, reason: collision with root package name */
    private URL f59984f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f59985g;

    /* renamed from: h, reason: collision with root package name */
    private int f59986h;

    public h(URL url) {
        this(url, i.f59988b);
    }

    public h(String str) {
        this(str, i.f59988b);
    }

    private byte[] b() {
        if (this.f59985g == null) {
            this.f59985g = a().getBytes(V6.e.f36934a);
        }
        return this.f59985g;
    }

    private String d() {
        if (TextUtils.isEmpty(this.f59983e)) {
            String string = this.f59982d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) p7.k.d(this.f59981c)).toString();
            }
            this.f59983e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f59983e;
    }

    private URL e() throws MalformedURLException {
        if (this.f59984f == null) {
            this.f59984f = new URL(d());
        }
        return this.f59984f;
    }

    public String a() {
        String str = this.f59982d;
        return str != null ? str : ((URL) p7.k.d(this.f59981c)).toString();
    }

    public Map<String, String> c() {
        return this.f59980b.a();
    }

    @Override // V6.e
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (a().equals(hVar.a()) && this.f59980b.equals(hVar.f59980b)) {
                return true;
            }
        }
        return false;
    }

    @Override // V6.e
    public int hashCode() {
        if (this.f59986h == 0) {
            int iHashCode = a().hashCode();
            this.f59986h = iHashCode;
            this.f59986h = (iHashCode * 31) + this.f59980b.hashCode();
        }
        return this.f59986h;
    }

    public h(URL url, i iVar) {
        this.f59981c = (URL) p7.k.d(url);
        this.f59982d = null;
        this.f59980b = (i) p7.k.d(iVar);
    }

    public URL f() throws MalformedURLException {
        return e();
    }

    public String toString() {
        return a();
    }

    @Override // V6.e
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(b());
    }

    public h(String str, i iVar) {
        this.f59981c = null;
        this.f59982d = p7.k.b(str);
        this.f59980b = (i) p7.k.d(iVar);
    }
}
