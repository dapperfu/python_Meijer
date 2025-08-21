package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9587t6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79328a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79329b;

    private C9587t6(int i10, long j10) {
        this.f79328a = i10;
        this.f79329b = j10;
    }

    public static C9587t6 a(InterfaceC9361r0 interfaceC9361r0, GQ gq2) throws IOException {
        interfaceC9361r0.g(gq2.n(), 0, 8);
        gq2.l(0);
        return new C9587t6(gq2.w(), gq2.I());
    }
}
