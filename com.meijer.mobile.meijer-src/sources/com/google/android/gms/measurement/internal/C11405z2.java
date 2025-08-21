package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11405z2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f86900a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f86901b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f86902c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f86903d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f86904e;

    public final boolean a() {
        if (!this.f86902c) {
            this.f86902c = true;
            E2 e22 = this.f86904e;
            this.f86903d = e22.n().getBoolean(this.f86900a, this.f86901b);
        }
        return this.f86903d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f86904e.n().edit();
        editorEdit.putBoolean(this.f86900a, z10);
        editorEdit.apply();
        this.f86903d = z10;
    }

    public C11405z2(E2 e22, String str, boolean z10) {
        Objects.requireNonNull(e22);
        this.f86904e = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f86900a = str;
        this.f86901b = z10;
    }
}
