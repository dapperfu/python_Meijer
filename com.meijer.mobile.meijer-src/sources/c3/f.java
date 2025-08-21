package c3;

import android.os.Bundle;
import d3.C13599a;
import d3.P;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f61234c = P.y0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f61235d = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f61236a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61237b;

    public static f a(Bundle bundle) {
        return new f((String) C13599a.e(bundle.getString(f61234c)), bundle.getInt(f61235d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f61234c, this.f61236a);
        bundle.putInt(f61235d, this.f61237b);
        return bundle;
    }

    public f(String str, int i10) {
        this.f61236a = str;
        this.f61237b = i10;
    }
}
