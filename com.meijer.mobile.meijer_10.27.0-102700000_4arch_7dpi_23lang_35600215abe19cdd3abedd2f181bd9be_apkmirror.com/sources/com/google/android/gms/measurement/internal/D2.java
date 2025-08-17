package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f84957a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f84958b;

    /* renamed from: c, reason: collision with root package name */
    private String f84959c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f84960d;

    public final String a() {
        if (!this.f84958b) {
            this.f84958b = true;
            E2 e22 = this.f84960d;
            this.f84959c = e22.n().getString(this.f84957a, null);
        }
        return this.f84959c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f84960d.n().edit();
        editorEdit.putString(this.f84957a, str);
        editorEdit.apply();
        this.f84959c = str;
    }

    public D2(E2 e22, String str, String str2) {
        Objects.requireNonNull(e22);
        this.f84960d = e22;
        com.google.android.gms.common.internal.r.f(str);
        this.f84957a = str;
    }
}
