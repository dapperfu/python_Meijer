package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9225qu0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C9225qu0 f77864b;

    /* renamed from: c, reason: collision with root package name */
    static final C9225qu0 f77865c = new C9225qu0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f77866a;

    C9225qu0() {
        this.f77866a = new HashMap();
    }

    C9225qu0(boolean z10) {
        this.f77866a = Collections.EMPTY_MAP;
    }

    public static C9225qu0 a() {
        int i10 = C10082yv0.f80309d;
        return f77865c;
    }

    public static C9225qu0 b() {
        C9225qu0 c9225qu0 = f77864b;
        if (c9225qu0 != null) {
            return c9225qu0;
        }
        synchronized (C9225qu0.class) {
            try {
                C9225qu0 c9225qu02 = f77864b;
                if (c9225qu02 != null) {
                    return c9225qu02;
                }
                int i10 = C10082yv0.f80309d;
                C9225qu0 c9225qu0B = AbstractC10080yu0.b(C9225qu0.class);
                f77864b = c9225qu0B;
                return c9225qu0B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Eu0 c(InterfaceC9120pv0 interfaceC9120pv0, int i10) {
        return (Eu0) this.f77866a.get(new C9118pu0(interfaceC9120pv0, i10));
    }
}
