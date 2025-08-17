package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9132q1 implements InterfaceC8064g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f77690a;

    private C9132q1(String str) {
        this.f77690a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8064g1
    public final int zza() {
        return 1852994675;
    }

    public static C9132q1 a(GQ gq2) {
        return new C9132q1(gq2.b(gq2.r(), StandardCharsets.UTF_8));
    }
}
