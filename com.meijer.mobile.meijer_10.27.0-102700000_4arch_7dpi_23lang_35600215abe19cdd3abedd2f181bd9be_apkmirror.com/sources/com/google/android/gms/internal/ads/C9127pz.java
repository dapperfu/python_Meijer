package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.pz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9127pz implements PC, InterfaceC9827wb {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f77676a;

    /* renamed from: b, reason: collision with root package name */
    private final C9367sC f77677b;

    /* renamed from: c, reason: collision with root package name */
    private final YC f77678c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f77679d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f77680e = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.PC
    public final synchronized void zzs() {
        if (this.f77676a.f72029e != 1) {
            a();
        }
    }

    private final void a() {
        if (this.f77679d.compareAndSet(false, true)) {
            this.f77677b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        if (this.f77676a.f72029e == 1 && c9720vb.f79090j) {
            a();
        }
        if (c9720vb.f79090j && this.f77680e.compareAndSet(false, true)) {
            this.f77678c.zza();
        }
    }

    public C9127pz(Z50 z50, C9367sC c9367sC, YC yc2) {
        this.f77676a = z50;
        this.f77677b = c9367sC;
        this.f77678c = yc2;
    }
}
