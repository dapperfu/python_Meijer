package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9248r6 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC9450t0 f77932a;

    /* renamed from: b, reason: collision with root package name */
    private X0 f77933b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC9035p6 f77936e;

    /* renamed from: c, reason: collision with root package name */
    private int f77934c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f77935d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f77937f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f77938g = -1;

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f77934c = j10 == 0 ? 0 : 4;
        InterfaceC9035p6 interfaceC9035p6 = this.f77936e;
        if (interfaceC9035p6 != null) {
            interfaceC9035p6.a(j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        if (r1 != 65534) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.google.android.gms.internal.ads.InterfaceC9236r0 r19, com.google.android.gms.internal.ads.N0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9248r6.b(com.google.android.gms.internal.ads.r0, com.google.android.gms.internal.ads.N0):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f77932a = interfaceC9450t0;
        this.f77933b = interfaceC9450t0.a(0, 1);
        interfaceC9450t0.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        return C9569u6.c(interfaceC9236r0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
