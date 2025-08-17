package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Wz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7321Wz implements Oc.p {

    /* renamed from: a, reason: collision with root package name */
    private final IC f71217a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f71218b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f71219c = new AtomicBoolean(false);

    @Override // Oc.p
    public final void A1() {
    }

    @Override // Oc.p
    public final void W5() {
    }

    @Override // Oc.p
    public final void d7() {
    }

    private final void b() {
        if (this.f71219c.get()) {
            return;
        }
        this.f71219c.set(true);
        this.f71217a.zza();
    }

    @Override // Oc.p
    public final void F2() {
        this.f71217a.zzc();
    }

    @Override // Oc.p
    public final void N3(int i10) {
        this.f71218b.set(true);
        b();
    }

    public final boolean a() {
        return this.f71218b.get();
    }

    public C7321Wz(IC ic2) {
        this.f71217a = ic2;
    }

    @Override // Oc.p
    public final void b2() {
        b();
    }
}
