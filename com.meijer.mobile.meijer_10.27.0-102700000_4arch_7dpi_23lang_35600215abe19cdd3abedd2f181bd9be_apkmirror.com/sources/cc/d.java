package cc;

import com.google.maps.android.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f61685c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f61686d = 2500;

    /* renamed from: a, reason: collision with root package name */
    public Zb.f<String> f61687a = new Zb.c("proximity.datamasks", f61686d);

    /* renamed from: b, reason: collision with root package name */
    private Map<String, byte[]> f61688b = new LinkedHashMap();

    public static d a() {
        if (f61685c == null) {
            f61685c = new d();
        }
        return f61685c;
    }

    public final byte[] b(String str) {
        byte[] bArr = this.f61688b.get(str);
        if (bArr != null) {
            return bArr;
        }
        String strB = this.f61687a.b(c.a(str), String.class);
        if (strB == null || strB.contentEquals(BuildConfig.TRAVIS)) {
            return bArr;
        }
        byte[] bArrB = Sb.a.b(strB);
        this.f61688b.put(str, bArrB);
        return bArrB;
    }

    private d() {
    }
}
