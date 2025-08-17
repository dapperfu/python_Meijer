package c3;

import android.os.Bundle;
import d3.P;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f61439d = P.y0(0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f61440e = P.y0(1);

    /* renamed from: f, reason: collision with root package name */
    private static final String f61441f = P.y0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f61442a;

    /* renamed from: b, reason: collision with root package name */
    public int f61443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61444c;

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f61439d), bundle.getInt(f61440e), bundle.getInt(f61441f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f61439d, this.f61442a);
        bundle.putInt(f61440e, this.f61443b);
        bundle.putInt(f61441f, this.f61444c);
        return bundle;
    }

    public h(int i10, int i11, int i12) {
        this.f61442a = i10;
        this.f61443b = i11;
        this.f61444c = i12;
    }
}
