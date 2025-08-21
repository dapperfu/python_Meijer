package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7995eB {

    /* renamed from: d, reason: collision with root package name */
    private static final String f74620d = Integer.toString(0, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f74621e = Integer.toString(1, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f74622f = Integer.toString(2, 36);

    /* renamed from: a, reason: collision with root package name */
    public final int f74623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74625c;

    public C7995eB(int i10, int i11, int i12) {
        this.f74623a = i10;
        this.f74624b = i11;
        this.f74625c = i12;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f74620d, this.f74623a);
        bundle.putInt(f74621e, this.f74624b);
        bundle.putInt(f74622f, this.f74625c);
        return bundle;
    }
}
