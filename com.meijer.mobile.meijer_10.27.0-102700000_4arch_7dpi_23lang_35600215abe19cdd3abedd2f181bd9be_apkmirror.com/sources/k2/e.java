package k2;

import android.util.Base64;
import java.util.List;
import o2.i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f141170a;

    /* renamed from: b, reason: collision with root package name */
    private final String f141171b;

    /* renamed from: c, reason: collision with root package name */
    private final String f141172c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f141173d;

    /* renamed from: e, reason: collision with root package name */
    private final int f141174e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f141175f;

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f141173d;
    }

    public int c() {
        return this.f141174e;
    }

    String d() {
        return this.f141175f;
    }

    public String e() {
        return this.f141170a;
    }

    public String f() {
        return this.f141171b;
    }

    public String g() {
        return this.f141172c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f141170a + ", mProviderPackage: " + this.f141171b + ", mQuery: " + this.f141172c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f141173d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f141173d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f141174e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f141170a = (String) i.g(str);
        this.f141171b = (String) i.g(str2);
        this.f141172c = (String) i.g(str3);
        this.f141173d = (List) i.g(list);
        this.f141175f = a(str, str2, str3);
    }
}
