package c3;

import android.os.Bundle;
import d3.C13466a;
import d3.P;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final String f61445b = P.y0(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f61446a;

    public static i a(Bundle bundle) {
        return new i((String) C13466a.e(bundle.getString(f61445b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f61445b, this.f61446a);
        return bundle;
    }

    public i(String str) {
        this.f61446a = str;
    }
}
