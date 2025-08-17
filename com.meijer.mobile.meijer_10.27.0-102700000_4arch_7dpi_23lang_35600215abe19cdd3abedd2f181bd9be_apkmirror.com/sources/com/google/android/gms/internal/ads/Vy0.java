package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Vy0 implements InterfaceC7976fA0 {

    /* renamed from: a, reason: collision with root package name */
    private final OA0 f70952a;

    /* renamed from: b, reason: collision with root package name */
    private final Ty0 f70953b;

    /* renamed from: c, reason: collision with root package name */
    private FA0 f70954c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7976fA0 f70955d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70956e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70957f;

    public final void b(FA0 fa0) {
        if (fa0 == this.f70954c) {
            this.f70955d = null;
            this.f70954c = null;
            this.f70956e = true;
        }
    }

    public final void e() {
        this.f70957f = true;
        this.f70952a.b();
    }

    public final void f() {
        this.f70957f = false;
        this.f70952a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final C7488ag zzc() {
        InterfaceC7976fA0 interfaceC7976fA0 = this.f70955d;
        return interfaceC7976fA0 != null ? interfaceC7976fA0.zzc() : this.f70952a.zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.FA0 r0 = r4.f70954c
            if (r0 == 0) goto L71
            boolean r0 = r0.a()
            if (r0 != 0) goto L71
            if (r5 == 0) goto L15
            com.google.android.gms.internal.ads.FA0 r0 = r4.f70954c
            int r0 = r0.k()
            r1 = 2
            if (r0 != r1) goto L71
        L15:
            com.google.android.gms.internal.ads.FA0 r0 = r4.f70954c
            boolean r0 = r0.o()
            if (r0 != 0) goto L28
            if (r5 != 0) goto L71
            com.google.android.gms.internal.ads.FA0 r5 = r4.f70954c
            boolean r5 = r5.d()
            if (r5 == 0) goto L28
            goto L71
        L28:
            com.google.android.gms.internal.ads.fA0 r5 = r4.f70955d
            r5.getClass()
            long r0 = r5.zza()
            boolean r2 = r4.f70956e
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.OA0 r2 = r4.f70952a
            long r2 = r2.zza()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L45
            com.google.android.gms.internal.ads.OA0 r5 = r4.f70952a
            r5.c()
            goto L7d
        L45:
            r2 = 0
            r4.f70956e = r2
            boolean r2 = r4.f70957f
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.OA0 r2 = r4.f70952a
            r2.b()
        L51:
            com.google.android.gms.internal.ads.OA0 r2 = r4.f70952a
            r2.a(r0)
            com.google.android.gms.internal.ads.ag r5 = r5.zzc()
            com.google.android.gms.internal.ads.OA0 r0 = r4.f70952a
            com.google.android.gms.internal.ads.ag r0 = r0.zzc()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L7d
            com.google.android.gms.internal.ads.OA0 r0 = r4.f70952a
            r0.r(r5)
            com.google.android.gms.internal.ads.Ty0 r0 = r4.f70953b
            r0.b(r5)
            goto L7d
        L71:
            r5 = 1
            r4.f70956e = r5
            boolean r5 = r4.f70957f
            if (r5 == 0) goto L7d
            com.google.android.gms.internal.ads.OA0 r5 = r4.f70952a
            r5.b()
        L7d:
            long r0 = r4.zza()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Vy0.a(boolean):long");
    }

    public final void d(long j10) {
        this.f70952a.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final void r(C7488ag c7488ag) {
        InterfaceC7976fA0 interfaceC7976fA0 = this.f70955d;
        if (interfaceC7976fA0 != null) {
            interfaceC7976fA0.r(c7488ag);
            c7488ag = this.f70955d.zzc();
        }
        this.f70952a.r(c7488ag);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final long zza() {
        if (this.f70956e) {
            return this.f70952a.zza();
        }
        InterfaceC7976fA0 interfaceC7976fA0 = this.f70955d;
        interfaceC7976fA0.getClass();
        return interfaceC7976fA0.zza();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final boolean zzj() {
        if (this.f70956e) {
            return false;
        }
        InterfaceC7976fA0 interfaceC7976fA0 = this.f70955d;
        interfaceC7976fA0.getClass();
        return interfaceC7976fA0.zzj();
    }

    public Vy0(Ty0 ty0, HC hc2) {
        this.f70953b = ty0;
        this.f70952a = new OA0(hc2);
    }

    public final void c(FA0 fa0) throws zzib {
        InterfaceC7976fA0 interfaceC7976fA0;
        InterfaceC7976fA0 interfaceC7976fA0Zzl = fa0.zzl();
        if (interfaceC7976fA0Zzl != null && interfaceC7976fA0Zzl != (interfaceC7976fA0 = this.f70955d)) {
            if (interfaceC7976fA0 == null) {
                this.f70955d = interfaceC7976fA0Zzl;
                this.f70954c = fa0;
                interfaceC7976fA0Zzl.r(this.f70952a.zzc());
                return;
            }
            throw zzib.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }
}
