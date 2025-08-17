package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes6.dex */
public final class Q3 {

    /* renamed from: a, reason: collision with root package name */
    private final Z.n0 f81967a;

    public final String a(Uri uri, String str, String str2, String str3) {
        Z.n0 n0Var = uri != null ? (Z.n0) this.f81967a.get(uri.toString()) : null;
        if (n0Var == null) {
            return null;
        }
        return (String) n0Var.get("".concat(str3));
    }

    Q3(Z.n0 n0Var) {
        this.f81967a = n0Var;
    }
}
