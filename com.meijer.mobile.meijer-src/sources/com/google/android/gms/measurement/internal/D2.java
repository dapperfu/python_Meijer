package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f85797a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85798b;

    /* renamed from: c, reason: collision with root package name */
    private String f85799c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f85800d;

    public final String a() {
        if (!this.f85798b) {
            this.f85798b = true;
            E2 e22 = this.f85800d;
            this.f85799c = e22.n().getString(this.f85797a, null);
        }
        return this.f85799c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f85800d.n().edit();
        editorEdit.putString(this.f85797a, str);
        editorEdit.apply();
        this.f85799c = str;
    }

    public D2(E2 e22, String str, String str2) {
        Objects.requireNonNull(e22);
        this.f85800d = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f85797a = str;
    }
}
