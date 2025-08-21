package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10958p0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C10958p0 f84109b;

    /* renamed from: c, reason: collision with root package name */
    static final C10958p0 f84110c = new C10958p0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f84111a;

    C10958p0() {
        this.f84111a = new HashMap();
    }

    C10958p0(boolean z10) {
        this.f84111a = Collections.EMPTY_MAP;
    }

    public static C10958p0 a() {
        C10958p0 c10958p0;
        C10958p0 c10958p02 = f84109b;
        if (c10958p02 != null) {
            return c10958p02;
        }
        synchronized (C10958p0.class) {
            try {
                c10958p0 = f84109b;
                if (c10958p0 == null) {
                    c10958p0 = f84110c;
                    f84109b = c10958p0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10958p0;
    }

    public final A0 b(InterfaceC10815g1 interfaceC10815g1, int i10) {
        return (A0) this.f84111a.get(new C10942o0(interfaceC10815g1, i10));
    }
}
