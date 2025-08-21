package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9257q1 implements InterfaceC8189g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f78530a;

    private C9257q1(String str) {
        this.f78530a = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8189g1
    public final int zza() {
        return 1852994675;
    }

    public static C9257q1 a(GQ gq2) {
        return new C9257q1(gq2.b(gq2.r(), StandardCharsets.UTF_8));
    }
}
