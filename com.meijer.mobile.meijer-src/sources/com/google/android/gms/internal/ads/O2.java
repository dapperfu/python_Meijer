package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes6.dex */
final class O2 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f69830a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f69831b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final V2 f69832c = new V2();

    /* renamed from: d, reason: collision with root package name */
    private P2 f69833d;

    /* renamed from: e, reason: collision with root package name */
    private int f69834e;

    /* renamed from: f, reason: collision with root package name */
    private int f69835f;

    /* renamed from: g, reason: collision with root package name */
    private long f69836g;

    public final void a(P2 p22) {
        this.f69833d = p22;
    }

    public final void b() {
        this.f69834e = 0;
        this.f69831b.clear();
        this.f69832c.e();
    }

    private final long d(InterfaceC9361r0 interfaceC9361r0, int i10) throws IOException {
        interfaceC9361r0.zzi(this.f69830a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (this.f69830a[i11] & 255);
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[LOOP:0: B:3:0x0005->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.google.android.gms.internal.ads.InterfaceC9361r0 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.O2.c(com.google.android.gms.internal.ads.r0):boolean");
    }
}
