package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8710kv0 {
    C8710kv0() {
    }

    public static final boolean a(Object obj) {
        return !((C8603jv0) obj).f();
    }

    public static final Object b(Object obj, Object obj2) {
        C8603jv0 c8603jv0B = (C8603jv0) obj;
        C8603jv0 c8603jv0 = (C8603jv0) obj2;
        if (!c8603jv0.isEmpty()) {
            if (!c8603jv0B.f()) {
                c8603jv0B = c8603jv0B.b();
            }
            c8603jv0B.d(c8603jv0);
        }
        return c8603jv0B;
    }
}
