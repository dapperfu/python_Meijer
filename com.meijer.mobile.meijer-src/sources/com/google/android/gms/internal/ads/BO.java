package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class BO extends AbstractBinderC7060Lj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f66368a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f66369b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f66370c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K80 f66371d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7270Rq f66372e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ EO f66373f;

    BO(EO eo2, Object obj, String str, long j10, K80 k80, C7270Rq c7270Rq) {
        this.f66368a = obj;
        this.f66369b = str;
        this.f66370c = j10;
        this.f66371d = k80;
        this.f66372e = c7270Rq;
        this.f66373f = eo2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7093Mj
    public final void a(String str) {
        synchronized (this.f66368a) {
            this.f66373f.v(this.f66369b, false, str, (int) (Nc.v.c().c() - this.f66370c));
            this.f66373f.f67288l.b(this.f66369b, "error");
            this.f66373f.f67291o.a(this.f66369b, "error");
            Z80 z80 = this.f66373f.f67292p;
            K80 k80 = this.f66371d;
            k80.p(str);
            k80.s0(false);
            z80.b(k80.zzm());
            this.f66372e.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7093Mj
    public final void zzf() {
        synchronized (this.f66368a) {
            this.f66373f.v(this.f66369b, true, "", (int) (Nc.v.c().c() - this.f66370c));
            this.f66373f.f67288l.d(this.f66369b);
            this.f66373f.f67291o.L(this.f66369b);
            Z80 z80 = this.f66373f.f67292p;
            K80 k80 = this.f66371d;
            k80.s0(true);
            z80.b(k80.zzm());
            this.f66372e.b(Boolean.TRUE);
        }
    }
}
