package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class B2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f85730a;

    /* renamed from: b, reason: collision with root package name */
    private final long f85731b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f85732c;

    /* renamed from: d, reason: collision with root package name */
    private long f85733d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f85734e;

    public final long a() {
        if (!this.f85732c) {
            this.f85732c = true;
            E2 e22 = this.f85734e;
            this.f85733d = e22.n().getLong(this.f85730a, this.f85731b);
        }
        return this.f85733d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f85734e.n().edit();
        editorEdit.putLong(this.f85730a, j10);
        editorEdit.apply();
        this.f85733d = j10;
    }

    public B2(E2 e22, String str, long j10) {
        Objects.requireNonNull(e22);
        this.f85734e = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f85730a = str;
        this.f85731b = j10;
    }
}
