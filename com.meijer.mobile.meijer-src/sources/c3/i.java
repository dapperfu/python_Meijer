package c3;

import android.os.Bundle;
import d3.C13599a;
import d3.P;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final String f61244b = P.y0(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f61245a;

    public static i a(Bundle bundle) {
        return new i((String) C13599a.e(bundle.getString(f61244b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f61244b, this.f61245a);
        return bundle;
    }

    public i(String str) {
        this.f61245a = str;
    }
}
