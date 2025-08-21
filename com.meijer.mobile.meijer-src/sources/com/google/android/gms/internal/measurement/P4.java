package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class P4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile P4 f82797b;

    /* renamed from: c, reason: collision with root package name */
    static final P4 f82798c = new P4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f82799a;

    P4() {
        this.f82799a = new HashMap();
    }

    P4(boolean z10) {
        this.f82799a = Collections.EMPTY_MAP;
    }

    public static P4 a() {
        P4 p42 = f82797b;
        if (p42 != null) {
            return p42;
        }
        synchronized (P4.class) {
            try {
                P4 p43 = f82797b;
                if (p43 != null) {
                    return p43;
                }
                int i10 = S5.f82822d;
                P4 p4B = X4.b(P4.class);
                f82797b = p4B;
                return p4B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C10512d5 b(K5 k52, int i10) {
        return (C10512d5) this.f82799a.get(new O4(k52, i10));
    }
}
