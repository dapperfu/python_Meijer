package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.tF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9606tF0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f79367a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f79368b;

    public final C9606tF0 a(int i10) {
        C8211gC.f(!this.f79368b);
        this.f79367a.append(i10, true);
        return this;
    }

    public final C9608tG0 b() {
        C8211gC.f(!this.f79368b);
        this.f79368b = true;
        return new C9608tG0(this.f79367a, null);
    }
}
