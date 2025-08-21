package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class H60 {
    public static void b(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    public static void c(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    public static void d(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList<>(list));
        }
    }

    public static void e(Bundle bundle, String str, int i10, boolean z10) {
        if (z10) {
            bundle.putInt(str, i10);
        }
    }

    public static void f(Bundle bundle, String str, String str2, boolean z10) {
        if (!z10 || str2 == null) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static void g(Bundle bundle, String str, boolean z10, boolean z11) {
        if (z11) {
            bundle.putBoolean(str, z10);
        }
    }

    public static Bundle a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return new Bundle();
        }
        return bundle2;
    }
}
