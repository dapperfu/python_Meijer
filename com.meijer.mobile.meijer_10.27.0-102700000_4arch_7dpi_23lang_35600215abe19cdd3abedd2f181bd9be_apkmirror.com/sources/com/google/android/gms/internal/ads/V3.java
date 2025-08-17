package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class V3 {

    /* renamed from: a, reason: collision with root package name */
    private final W3 f70768a = new W3();

    /* renamed from: b, reason: collision with root package name */
    private final GQ f70769b = new GQ(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f70770c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f70771d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70772e;

    private final int f(int i10) {
        int i11;
        int i12 = 0;
        this.f70771d = 0;
        do {
            int i13 = this.f70771d;
            int i14 = i10 + i13;
            W3 w32 = this.f70768a;
            if (i14 >= w32.f70994c) {
                break;
            }
            this.f70771d = i13 + 1;
            i11 = w32.f70997f[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final GQ a() {
        return this.f70769b;
    }

    public final W3 b() {
        return this.f70768a;
    }

    public final void c() {
        this.f70768a.a();
        this.f70769b.i(0);
        this.f70770c = -1;
        this.f70772e = false;
    }

    public final void d() {
        GQ gq2 = this.f70769b;
        if (gq2.n().length == 65025) {
            return;
        }
        gq2.j(Arrays.copyOf(gq2.n(), Math.max(65025, gq2.u())), this.f70769b.u());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.ads.InterfaceC9236r0 r7) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f70772e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.f70772e = r1
            com.google.android.gms.internal.ads.GQ r0 = r6.f70769b
            r0.i(r1)
        Ld:
            boolean r0 = r6.f70772e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.f70770c
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.W3 r0 = r6.f70768a
            r3 = -1
            boolean r0 = r0.c(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.W3 r0 = r6.f70768a
            boolean r0 = r0.b(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.W3 r0 = r6.f70768a
            int r3 = r0.f70995d
            int r0 = r0.f70992a
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.GQ r0 = r6.f70769b
            int r0 = r0.u()
            if (r0 != 0) goto L42
            int r0 = r6.f(r1)
            int r3 = r3 + r0
            int r0 = r6.f70771d
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = com.google.android.gms.internal.ads.C9557u0.e(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.f70770c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.f(r0)
            int r3 = r6.f70770c
            int r4 = r6.f70771d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.GQ r4 = r6.f70769b
            int r5 = r4.u()
            int r5 = r5 + r0
            r4.f(r5)
            com.google.android.gms.internal.ads.GQ r4 = r6.f70769b
            byte[] r5 = r4.n()
            int r4 = r4.u()
            boolean r4 = com.google.android.gms.internal.ads.C9557u0.d(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.GQ r4 = r6.f70769b
            int r5 = r4.u()
            int r5 = r5 + r0
            r4.k(r5)
            com.google.android.gms.internal.ads.W3 r0 = r6.f70768a
            int r4 = r3 + (-1)
            int[] r0 = r0.f70997f
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = r1
        L8c:
            r6.f70772e = r2
        L8e:
            com.google.android.gms.internal.ads.W3 r0 = r6.f70768a
            int r0 = r0.f70994c
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.f70770c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V3.e(com.google.android.gms.internal.ads.r0):boolean");
    }

    V3() {
    }
}
