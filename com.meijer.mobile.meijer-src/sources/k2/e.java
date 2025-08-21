package k2;

import android.util.Base64;
import java.util.List;
import o2.i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f141363a;

    /* renamed from: b, reason: collision with root package name */
    private final String f141364b;

    /* renamed from: c, reason: collision with root package name */
    private final String f141365c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f141366d;

    /* renamed from: e, reason: collision with root package name */
    private final int f141367e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f141368f;

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f141366d;
    }

    public int c() {
        return this.f141367e;
    }

    String d() {
        return this.f141368f;
    }

    public String e() {
        return this.f141363a;
    }

    public String f() {
        return this.f141364b;
    }

    public String g() {
        return this.f141365c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f141363a + ", mProviderPackage: " + this.f141364b + ", mQuery: " + this.f141365c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f141366d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f141366d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f141367e);
        return sb2.toString();
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f141363a = (String) i.g(str);
        this.f141364b = (String) i.g(str2);
        this.f141365c = (String) i.g(str3);
        this.f141366d = (List) i.g(list);
        this.f141368f = a(str, str2, str3);
    }
}
