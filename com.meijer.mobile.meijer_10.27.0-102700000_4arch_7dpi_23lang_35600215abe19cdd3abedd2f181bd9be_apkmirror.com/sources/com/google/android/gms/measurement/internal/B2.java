package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class B2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f84890a;

    /* renamed from: b, reason: collision with root package name */
    private final long f84891b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f84892c;

    /* renamed from: d, reason: collision with root package name */
    private long f84893d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f84894e;

    public final long a() {
        if (!this.f84892c) {
            this.f84892c = true;
            E2 e22 = this.f84894e;
            this.f84893d = e22.n().getLong(this.f84890a, this.f84891b);
        }
        return this.f84893d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f84894e.n().edit();
        editorEdit.putLong(this.f84890a, j10);
        editorEdit.apply();
        this.f84893d = j10;
    }

    public B2(E2 e22, String str, long j10) {
        Objects.requireNonNull(e22);
        this.f84894e = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f84890a = str;
        this.f84891b = j10;
    }
}
