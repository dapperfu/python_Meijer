package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Wz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7446Wz implements Qc.p {

    /* renamed from: a, reason: collision with root package name */
    private final IC f72057a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f72058b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f72059c = new AtomicBoolean(false);

    @Override // Qc.p
    public final void K1() {
    }

    @Override // Qc.p
    public final void m6() {
    }

    @Override // Qc.p
    public final void o7() {
    }

    private final void b() {
        if (this.f72059c.get()) {
            return;
        }
        this.f72059c.set(true);
        this.f72057a.zza();
    }

    @Override // Qc.p
    public final void I2() {
        this.f72057a.zzc();
    }

    @Override // Qc.p
    public final void Z3(int i10) {
        this.f72058b.set(true);
        b();
    }

    public final boolean a() {
        return this.f72058b.get();
    }

    public C7446Wz(IC ic2) {
        this.f72057a = ic2;
    }

    @Override // Qc.p
    public final void c2() {
        b();
    }
}
