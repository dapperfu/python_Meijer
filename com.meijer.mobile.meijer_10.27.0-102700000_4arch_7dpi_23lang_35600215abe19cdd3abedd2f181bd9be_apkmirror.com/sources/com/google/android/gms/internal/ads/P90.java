package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class P90 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K80 f69286a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f69287b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R90 f69288c;

    P90(R90 r90, K80 k80, W80 w80) {
        this.f69286a = k80;
        this.f69287b = w80;
        this.f69288c = r90;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        this.f69286a.r0(false);
        W80 w80 = this.f69287b;
        if (w80 != null) {
            w80.a(this.f69286a);
            w80.h();
        } else {
            this.f69288c.f69797f.b(this.f69286a.zzm());
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f69286a.r0(((Qc.t) obj) == Qc.t.SUCCESS);
        W80 w80 = this.f69287b;
        if (w80 == null) {
            this.f69288c.f69797f.b(this.f69286a.zzm());
        } else {
            w80.a(this.f69286a);
            w80.h();
        }
    }
}
