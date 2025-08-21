package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class D5 {

    /* renamed from: a, reason: collision with root package name */
    private final C5 f82516a;

    private D5(EnumC10638r6 enumC10638r6, Object obj, EnumC10638r6 enumC10638r62, Object obj2) {
        this.f82516a = new C5(enumC10638r6, "", enumC10638r62, "");
    }

    public static D5 a(EnumC10638r6 enumC10638r6, Object obj, EnumC10638r6 enumC10638r62, Object obj2) {
        return new D5(enumC10638r6, "", enumC10638r62, "");
    }

    final C5 e() {
        return this.f82516a;
    }

    static void b(K4 k42, C5 c52, Object obj, Object obj2) throws IOException {
        U4.f(k42, c52.f82508a, 1, obj);
        U4.f(k42, c52.f82510c, 2, obj2);
    }

    static int c(C5 c52, Object obj, Object obj2) {
        return U4.h(c52.f82508a, 1, obj) + U4.h(c52.f82510c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C5 c52 = this.f82516a;
        int iG = K4.G(i10 << 3);
        int iC = c(c52, obj, obj2);
        return iG + K4.G(iC) + iC;
    }
}
