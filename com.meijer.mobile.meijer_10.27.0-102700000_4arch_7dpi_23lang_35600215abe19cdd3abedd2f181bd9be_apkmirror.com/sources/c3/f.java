package c3;

import android.os.Bundle;
import d3.C13466a;
import d3.P;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f61435c = P.y0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f61436d = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f61437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61438b;

    public static f a(Bundle bundle) {
        return new f((String) C13466a.e(bundle.getString(f61435c)), bundle.getInt(f61436d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f61435c, this.f61437a);
        bundle.putInt(f61436d, this.f61438b);
        return bundle;
    }

    public f(String str, int i10) {
        this.f61437a = str;
        this.f61438b = i10;
    }
}
