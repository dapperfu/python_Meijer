package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9462t6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f78488a;

    /* renamed from: b, reason: collision with root package name */
    public final long f78489b;

    private C9462t6(int i10, long j10) {
        this.f78488a = i10;
        this.f78489b = j10;
    }

    public static C9462t6 a(InterfaceC9236r0 interfaceC9236r0, GQ gq2) throws IOException {
        interfaceC9236r0.g(gq2.n(), 0, 8);
        gq2.l(0);
        return new C9462t6(gq2.w(), gq2.I());
    }
}
