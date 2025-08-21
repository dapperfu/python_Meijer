package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7198Pm implements Qc.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbrw f70253a;

    C7198Pm(zzbrw zzbrwVar) {
        this.f70253a = zzbrwVar;
    }

    @Override // Qc.p
    public final void K1() {
    }

    @Override // Qc.p
    public final void I2() {
        Sc.p.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.f70253a;
        zzbrwVar.f81420b.s(zzbrwVar);
    }

    @Override // Qc.p
    public final void Z3(int i10) {
        Sc.p.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.f70253a;
        zzbrwVar.f81420b.r(zzbrwVar);
    }

    @Override // Qc.p
    public final void c2() {
        Sc.p.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // Qc.p
    public final void m6() {
        Sc.p.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // Qc.p
    public final void o7() {
        Sc.p.b("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
