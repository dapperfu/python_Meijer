package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11280z2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f86060a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86061b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f86062c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f86063d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f86064e;

    public final boolean a() {
        if (!this.f86062c) {
            this.f86062c = true;
            E2 e22 = this.f86064e;
            this.f86063d = e22.n().getBoolean(this.f86060a, this.f86061b);
        }
        return this.f86063d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f86064e.n().edit();
        editorEdit.putBoolean(this.f86060a, z10);
        editorEdit.apply();
        this.f86063d = z10;
    }

    public C11280z2(E2 e22, String str, boolean z10) {
        Objects.requireNonNull(e22);
        this.f86064e = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f86060a = str;
        this.f86061b = z10;
    }
}
