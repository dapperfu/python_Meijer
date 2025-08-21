package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class P90 implements Ij0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ K80 f70126a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W80 f70127b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ R90 f70128c;

    P90(R90 r90, K80 k80, W80 w80) {
        this.f70126a = k80;
        this.f70127b = w80;
        this.f70128c = r90;
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final void zza(Throwable th2) {
        this.f70126a.s0(false);
        W80 w80 = this.f70127b;
        if (w80 != null) {
            w80.a(this.f70126a);
            w80.h();
        } else {
            this.f70128c.f70637f.b(this.f70126a.zzm());
        }
    }

    @Override // com.google.android.gms.internal.ads.Ij0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f70126a.s0(((Sc.t) obj) == Sc.t.SUCCESS);
        W80 w80 = this.f70127b;
        if (w80 == null) {
            this.f70128c.f70637f.b(this.f70126a.zzm());
        } else {
            w80.a(this.f70126a);
            w80.h();
        }
    }
}
