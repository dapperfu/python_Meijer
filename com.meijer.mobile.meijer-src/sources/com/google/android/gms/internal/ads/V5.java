package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class V5 implements InterfaceC9255q0 {

    /* renamed from: e, reason: collision with root package name */
    private boolean f71626e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f71627f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f71628g;

    /* renamed from: h, reason: collision with root package name */
    private long f71629h;

    /* renamed from: i, reason: collision with root package name */
    private S5 f71630i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC9575t0 f71631j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f71632k;

    /* renamed from: a, reason: collision with root package name */
    private final C8982nU f71622a = new C8982nU(0);

    /* renamed from: c, reason: collision with root package name */
    private final GQ f71624c = new GQ(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f71623b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final T5 f71625d = new T5();

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f71631j = interfaceC9575t0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.nU r5 = r4.f71622a
            long r0 = r5.f()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.i(r7)
        L24:
            com.google.android.gms.internal.ads.S5 r5 = r4.f71630i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.d(r7)
        L2c:
            android.util.SparseArray r5 = r4.f71623b
            int r5 = r5.size()
            if (r6 >= r5) goto L42
            android.util.SparseArray r5 = r4.f71623b
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.U5 r5 = (com.google.android.gms.internal.ads.U5) r5
            r5.b()
            int r6 = r6 + 1
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V5.a(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9361r0 r13, com.google.android.gms.internal.ads.N0 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.V5.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        byte[] bArr = new byte[14];
        C8080f0 c8080f0 = (C8080f0) interfaceC9361r0;
        c8080f0.c(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c8080f0.h(bArr[13] & 7, false);
        c8080f0.c(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
