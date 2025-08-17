package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7073Pm implements Oc.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbrw f69413a;

    C7073Pm(zzbrw zzbrwVar) {
        this.f69413a = zzbrwVar;
    }

    @Override // Oc.p
    public final void A1() {
    }

    @Override // Oc.p
    public final void F2() {
        Qc.p.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.f69413a;
        zzbrwVar.f80580b.s(zzbrwVar);
    }

    @Override // Oc.p
    public final void N3(int i10) {
        Qc.p.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.f69413a;
        zzbrwVar.f80580b.q(zzbrwVar);
    }

    @Override // Oc.p
    public final void W5() {
        Qc.p.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // Oc.p
    public final void b2() {
        Qc.p.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // Oc.p
    public final void d7() {
        Qc.p.b("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
