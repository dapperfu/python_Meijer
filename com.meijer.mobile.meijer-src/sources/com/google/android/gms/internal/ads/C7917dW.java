package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7917dW implements Nc.g {

    /* renamed from: a, reason: collision with root package name */
    private final XB f74261a;

    /* renamed from: b, reason: collision with root package name */
    private final C9492sC f74262b;

    /* renamed from: c, reason: collision with root package name */
    private final C8538jG f74263c;

    /* renamed from: d, reason: collision with root package name */
    private final C7686bG f74264d;

    /* renamed from: e, reason: collision with root package name */
    private final C6870Fx f74265e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicBoolean f74266f = new AtomicBoolean(false);

    @Override // Nc.g
    public final synchronized void zza(View view) {
        if (this.f74266f.compareAndSet(false, true)) {
            this.f74265e.zzr();
            this.f74264d.R0(view);
        }
    }

    @Override // Nc.g
    public final void zzb() {
        if (this.f74266f.get()) {
            this.f74261a.v();
        }
    }

    @Override // Nc.g
    public final void zzc() {
        if (this.f74266f.get()) {
            this.f74262b.zza();
            this.f74263c.zza();
        }
    }

    C7917dW(XB xb2, C9492sC c9492sC, C8538jG c8538jG, C7686bG c7686bG, C6870Fx c6870Fx) {
        this.f74261a = xb2;
        this.f74262b = c9492sC;
        this.f74263c = c8538jG;
        this.f74264d = c7686bG;
        this.f74265e = c6870Fx;
    }
}
