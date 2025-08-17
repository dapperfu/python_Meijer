package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class BO extends AbstractBinderC6935Lj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f65528a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f65529b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f65530c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K80 f65531d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7145Rq f65532e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ EO f65533f;

    BO(EO eo2, Object obj, String str, long j10, K80 k80, C7145Rq c7145Rq) {
        this.f65528a = obj;
        this.f65529b = str;
        this.f65530c = j10;
        this.f65531d = k80;
        this.f65532e = c7145Rq;
        this.f65533f = eo2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6968Mj
    public final void a(String str) {
        synchronized (this.f65528a) {
            this.f65533f.v(this.f65529b, false, str, (int) (Lc.v.c().c() - this.f65530c));
            this.f65533f.f66448l.b(this.f65529b, "error");
            this.f65533f.f66451o.a(this.f65529b, "error");
            Z80 z80 = this.f65533f.f66452p;
            K80 k80 = this.f65531d;
            k80.p(str);
            k80.r0(false);
            z80.b(k80.zzm());
            this.f65532e.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6968Mj
    public final void zzf() {
        synchronized (this.f65528a) {
            this.f65533f.v(this.f65529b, true, "", (int) (Lc.v.c().c() - this.f65530c));
            this.f65533f.f66448l.d(this.f65529b);
            this.f65533f.f66451o.L(this.f65529b);
            Z80 z80 = this.f65533f.f66452p;
            K80 k80 = this.f65531d;
            k80.r0(true);
            z80.b(k80.zzm());
            this.f65532e.b(Boolean.TRUE);
        }
    }
}
