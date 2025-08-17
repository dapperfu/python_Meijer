package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class D5 {

    /* renamed from: a, reason: collision with root package name */
    private final C5 f81676a;

    private D5(EnumC10513r6 enumC10513r6, Object obj, EnumC10513r6 enumC10513r62, Object obj2) {
        this.f81676a = new C5(enumC10513r6, "", enumC10513r62, "");
    }

    public static D5 a(EnumC10513r6 enumC10513r6, Object obj, EnumC10513r6 enumC10513r62, Object obj2) {
        return new D5(enumC10513r6, "", enumC10513r62, "");
    }

    final C5 e() {
        return this.f81676a;
    }

    static void b(K4 k42, C5 c52, Object obj, Object obj2) throws IOException {
        U4.f(k42, c52.f81668a, 1, obj);
        U4.f(k42, c52.f81670c, 2, obj2);
    }

    static int c(C5 c52, Object obj, Object obj2) {
        return U4.h(c52.f81668a, 1, obj) + U4.h(c52.f81670c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C5 c52 = this.f81676a;
        int iG = K4.G(i10 << 3);
        int iC = c(c52, obj, obj2);
        return iG + K4.G(iC) + iC;
    }
}
