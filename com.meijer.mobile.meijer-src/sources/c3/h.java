package c3;

import android.os.Bundle;
import d3.P;

/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f61238d = P.y0(0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f61239e = P.y0(1);

    /* renamed from: f, reason: collision with root package name */
    private static final String f61240f = P.y0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f61241a;

    /* renamed from: b, reason: collision with root package name */
    public int f61242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f61243c;

    public static h a(Bundle bundle) {
        return new h(bundle.getInt(f61238d), bundle.getInt(f61239e), bundle.getInt(f61240f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f61238d, this.f61241a);
        bundle.putInt(f61239e, this.f61242b);
        bundle.putInt(f61240f, this.f61243c);
        return bundle;
    }

    public h(int i10, int i11, int i12) {
        this.f61241a = i10;
        this.f61242b = i11;
        this.f61243c = i12;
    }
}
