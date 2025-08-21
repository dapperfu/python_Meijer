package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.pz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9252pz implements PC, InterfaceC9952wb {

    /* renamed from: a, reason: collision with root package name */
    private final Z50 f78516a;

    /* renamed from: b, reason: collision with root package name */
    private final C9492sC f78517b;

    /* renamed from: c, reason: collision with root package name */
    private final YC f78518c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f78519d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f78520e = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.PC
    public final synchronized void zzs() {
        if (this.f78516a.f72869e != 1) {
            a();
        }
    }

    private final void a() {
        if (this.f78519d.compareAndSet(false, true)) {
            this.f78517b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        if (this.f78516a.f72869e == 1 && c9845vb.f79930j) {
            a();
        }
        if (c9845vb.f79930j && this.f78520e.compareAndSet(false, true)) {
            this.f78518c.zza();
        }
    }

    public C9252pz(Z50 z50, C9492sC c9492sC, YC yc2) {
        this.f78516a = z50;
        this.f78517b = c9492sC;
        this.f78518c = yc2;
    }
}
