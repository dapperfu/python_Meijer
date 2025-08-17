package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.eB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7870eB {

    /* renamed from: d, reason: collision with root package name */
    private static final String f73780d = Integer.toString(0, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f73781e = Integer.toString(1, 36);

    /* renamed from: f, reason: collision with root package name */
    private static final String f73782f = Integer.toString(2, 36);

    /* renamed from: a, reason: collision with root package name */
    public final int f73783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73784b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73785c;

    public C7870eB(int i10, int i11, int i12) {
        this.f73783a = i10;
        this.f73784b = i11;
        this.f73785c = i12;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f73780d, this.f73783a);
        bundle.putInt(f73781e, this.f73784b);
        bundle.putInt(f73782f, this.f73785c);
        return bundle;
    }
}
