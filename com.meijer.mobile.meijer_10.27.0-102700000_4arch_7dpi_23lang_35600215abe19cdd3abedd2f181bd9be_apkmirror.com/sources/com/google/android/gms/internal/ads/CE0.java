package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
final class CE0 implements SF0 {

    /* renamed from: a, reason: collision with root package name */
    public final SF0 f65743a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f65744b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DE0 f65745c;

    public CE0(DE0 de0, SF0 sf0) {
        this.f65745c = de0;
        this.f65743a = sf0;
    }

    public final void c() {
        this.f65744b = false;
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final int a(long j10) {
        if (this.f65745c.h()) {
            return -3;
        }
        return this.f65743a.a(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // com.google.android.gms.internal.ads.SF0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.Zz0 r13, com.google.android.gms.internal.ads.By0 r14, int r15) {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.DE0 r0 = r12.f65745c
            boolean r1 = r0.h()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r12.f65744b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r14.c(r3)
            return r4
        L14:
            long r0 = r0.zzb()
            com.google.android.gms.internal.ads.SF0 r5 = r12.f65743a
            int r15 = r5.b(r13, r14, r15)
            r5 = -5
            r6 = -9223372036854775808
            if (r15 != r5) goto L4e
            com.google.android.gms.internal.ads.C r14 = r13.f72318a
            r14.getClass()
            int r15 = r14.f65644G
            r0 = 0
            if (r15 != 0) goto L32
            int r15 = r14.f65645H
            if (r15 == 0) goto L4d
            r15 = r0
        L32:
            com.google.android.gms.internal.ads.DE0 r1 = r12.f65745c
            long r1 = r1.f66197e
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            int r0 = r14.f65645H
        L3d:
            com.google.android.gms.internal.ads.uH0 r14 = r14.b()
            r14.g(r15)
            r14.h(r0)
            com.google.android.gms.internal.ads.C r14 = r14.H()
            r13.f72318a = r14
        L4d:
            return r5
        L4e:
            com.google.android.gms.internal.ads.DE0 r13 = r12.f65745c
            long r8 = r13.f66197e
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 == 0) goto L72
            if (r15 != r4) goto L5e
            long r10 = r14.f65633f
            int r13 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r13 >= 0) goto L68
        L5e:
            if (r15 != r2) goto L72
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L72
            boolean r13 = r14.f65632e
            if (r13 != 0) goto L72
        L68:
            r14.b()
            r14.c(r3)
            r13 = 1
            r12.f65744b = r13
            return r4
        L72:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CE0.b(com.google.android.gms.internal.ads.Zz0, com.google.android.gms.internal.ads.By0, int):int");
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final void zzd() throws IOException {
        this.f65743a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.SF0
    public final boolean zze() {
        return !this.f65745c.h() && this.f65743a.zze();
    }
}
