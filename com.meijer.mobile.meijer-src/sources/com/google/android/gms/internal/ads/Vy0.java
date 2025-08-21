package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Vy0 implements InterfaceC8101fA0 {

    /* renamed from: a, reason: collision with root package name */
    private final OA0 f71792a;

    /* renamed from: b, reason: collision with root package name */
    private final Ty0 f71793b;

    /* renamed from: c, reason: collision with root package name */
    private FA0 f71794c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC8101fA0 f71795d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71796e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f71797f;

    public final void b(FA0 fa0) {
        if (fa0 == this.f71794c) {
            this.f71795d = null;
            this.f71794c = null;
            this.f71796e = true;
        }
    }

    public final void e() {
        this.f71797f = true;
        this.f71792a.b();
    }

    public final void f() {
        this.f71797f = false;
        this.f71792a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final C7613ag zzc() {
        InterfaceC8101fA0 interfaceC8101fA0 = this.f71795d;
        return interfaceC8101fA0 != null ? interfaceC8101fA0.zzc() : this.f71792a.zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.FA0 r0 = r4.f71794c
            if (r0 == 0) goto L71
            boolean r0 = r0.a()
            if (r0 != 0) goto L71
            if (r5 == 0) goto L15
            com.google.android.gms.internal.ads.FA0 r0 = r4.f71794c
            int r0 = r0.k()
            r1 = 2
            if (r0 != r1) goto L71
        L15:
            com.google.android.gms.internal.ads.FA0 r0 = r4.f71794c
            boolean r0 = r0.o()
            if (r0 != 0) goto L28
            if (r5 != 0) goto L71
            com.google.android.gms.internal.ads.FA0 r5 = r4.f71794c
            boolean r5 = r5.d()
            if (r5 == 0) goto L28
            goto L71
        L28:
            com.google.android.gms.internal.ads.fA0 r5 = r4.f71795d
            r5.getClass()
            long r0 = r5.zza()
            boolean r2 = r4.f71796e
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.OA0 r2 = r4.f71792a
            long r2 = r2.zza()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L45
            com.google.android.gms.internal.ads.OA0 r5 = r4.f71792a
            r5.c()
            goto L7d
        L45:
            r2 = 0
            r4.f71796e = r2
            boolean r2 = r4.f71797f
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.OA0 r2 = r4.f71792a
            r2.b()
        L51:
            com.google.android.gms.internal.ads.OA0 r2 = r4.f71792a
            r2.a(r0)
            com.google.android.gms.internal.ads.ag r5 = r5.zzc()
            com.google.android.gms.internal.ads.OA0 r0 = r4.f71792a
            com.google.android.gms.internal.ads.ag r0 = r0.zzc()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L7d
            com.google.android.gms.internal.ads.OA0 r0 = r4.f71792a
            r0.r(r5)
            com.google.android.gms.internal.ads.Ty0 r0 = r4.f71793b
            r0.b(r5)
            goto L7d
        L71:
            r5 = 1
            r4.f71796e = r5
            boolean r5 = r4.f71797f
            if (r5 == 0) goto L7d
            com.google.android.gms.internal.ads.OA0 r5 = r4.f71792a
            r5.b()
        L7d:
            long r0 = r4.zza()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vy0.a(boolean):long");
    }

    public final void d(long j10) {
        this.f71792a.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final void r(C7613ag c7613ag) {
        InterfaceC8101fA0 interfaceC8101fA0 = this.f71795d;
        if (interfaceC8101fA0 != null) {
            interfaceC8101fA0.r(c7613ag);
            c7613ag = this.f71795d.zzc();
        }
        this.f71792a.r(c7613ag);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final long zza() {
        if (this.f71796e) {
            return this.f71792a.zza();
        }
        InterfaceC8101fA0 interfaceC8101fA0 = this.f71795d;
        interfaceC8101fA0.getClass();
        return interfaceC8101fA0.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8101fA0
    public final boolean zzj() {
        if (this.f71796e) {
            return false;
        }
        InterfaceC8101fA0 interfaceC8101fA0 = this.f71795d;
        interfaceC8101fA0.getClass();
        return interfaceC8101fA0.zzj();
    }

    public Vy0(Ty0 ty0, HC hc2) {
        this.f71793b = ty0;
        this.f71792a = new OA0(hc2);
    }

    public final void c(FA0 fa0) throws zzib {
        InterfaceC8101fA0 interfaceC8101fA0;
        InterfaceC8101fA0 interfaceC8101fA0Zzl = fa0.zzl();
        if (interfaceC8101fA0Zzl != null && interfaceC8101fA0Zzl != (interfaceC8101fA0 = this.f71795d)) {
            if (interfaceC8101fA0 == null) {
                this.f71795d = interfaceC8101fA0Zzl;
                this.f71794c = fa0;
                interfaceC8101fA0Zzl.r(this.f71792a.zzc());
                return;
            }
            throw zzib.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }
}
