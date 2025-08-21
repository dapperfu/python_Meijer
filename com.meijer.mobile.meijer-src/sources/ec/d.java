package ec;

import bc.C6349c;
import bc.InterfaceC6352f;
import com.google.maps.android.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f130067c = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f130068d = 2500;

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6352f<String> f130069a = new C6349c("proximity.datamasks", f130068d);

    /* renamed from: b, reason: collision with root package name */
    private Map<String, byte[]> f130070b = new LinkedHashMap();

    public static d a() {
        if (f130067c == null) {
            f130067c = new d();
        }
        return f130067c;
    }

    public final byte[] b(String str) {
        byte[] bArr = this.f130070b.get(str);
        if (bArr != null) {
            return bArr;
        }
        String strB = this.f130069a.b(c.a(str), String.class);
        if (strB == null || strB.contentEquals(BuildConfig.TRAVIS)) {
            return bArr;
        }
        byte[] bArrB = Ub.a.b(strB);
        this.f130070b.put(str, bArrB);
        return bArrB;
    }

    private d() {
    }
}
