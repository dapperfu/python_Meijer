package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class W3 {

    /* renamed from: a, reason: collision with root package name */
    public int f71832a;

    /* renamed from: b, reason: collision with root package name */
    public long f71833b;

    /* renamed from: c, reason: collision with root package name */
    public int f71834c;

    /* renamed from: d, reason: collision with root package name */
    public int f71835d;

    /* renamed from: e, reason: collision with root package name */
    public int f71836e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f71837f = new int[com.medallia.digital.mobilesdk.l3.f93323c];

    /* renamed from: g, reason: collision with root package name */
    private final GQ f71838g = new GQ(com.medallia.digital.mobilesdk.l3.f93323c);

    public final void a() {
        this.f71832a = 0;
        this.f71833b = 0L;
        this.f71834c = 0;
        this.f71835d = 0;
        this.f71836e = 0;
    }

    W3() {
    }

    public final boolean b(InterfaceC9361r0 interfaceC9361r0, boolean z10) throws IOException {
        a();
        this.f71838g.i(27);
        if (C9682u0.c(interfaceC9361r0, this.f71838g.n(), 0, 27, z10) && this.f71838g.K() == 1332176723) {
            if (this.f71838g.C() != 0) {
                if (z10) {
                    return false;
                }
                throw zzbc.c("unsupported bit stream revision");
            }
            this.f71832a = this.f71838g.C();
            this.f71833b = this.f71838g.H();
            this.f71838g.I();
            this.f71838g.I();
            this.f71838g.I();
            int iC = this.f71838g.C();
            this.f71834c = iC;
            this.f71835d = iC + 27;
            this.f71838g.i(iC);
            if (C9682u0.c(interfaceC9361r0, this.f71838g.n(), 0, this.f71834c, z10)) {
                for (int i10 = 0; i10 < this.f71834c; i10++) {
                    this.f71837f[i10] = this.f71838g.C();
                    this.f71836e += this.f71837f[i10];
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9.zzf() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r9.zzc(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.google.android.gms.internal.ads.InterfaceC9361r0 r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.zzf()
            long r2 = r9.zze()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.gms.internal.ads.C8211gC.d(r0)
            com.google.android.gms.internal.ads.GQ r0 = r8.f71838g
            r3 = 4
            r0.i(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r4 = r9.zzf()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L2c
            goto L52
        L2c:
            com.google.android.gms.internal.ads.GQ r4 = r8.f71838g
            byte[] r4 = r4.n()
            boolean r4 = com.google.android.gms.internal.ads.C9682u0.c(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L52
            com.google.android.gms.internal.ads.GQ r0 = r8.f71838g
            r0.l(r1)
            com.google.android.gms.internal.ads.GQ r0 = r8.f71838g
            long r4 = r0.K()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            r9.zzj()
            return r2
        L4e:
            r9.e(r2)
            goto L1a
        L52:
            if (r0 == 0) goto L5c
            long r3 = r9.zzf()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5c:
            int r3 = r9.zzc(r2)
            r4 = -1
            if (r3 != r4) goto L52
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W3.c(com.google.android.gms.internal.ads.r0, long):boolean");
    }
}
