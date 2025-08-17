package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10833p0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C10833p0 f83269b;

    /* renamed from: c, reason: collision with root package name */
    static final C10833p0 f83270c = new C10833p0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f83271a;

    C10833p0() {
        this.f83271a = new HashMap();
    }

    C10833p0(boolean z10) {
        this.f83271a = Collections.EMPTY_MAP;
    }

    public static C10833p0 a() {
        C10833p0 c10833p0;
        C10833p0 c10833p02 = f83269b;
        if (c10833p02 != null) {
            return c10833p02;
        }
        synchronized (C10833p0.class) {
            try {
                c10833p0 = f83269b;
                if (c10833p0 == null) {
                    c10833p0 = f83270c;
                    f83269b = c10833p0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c10833p0;
    }

    public final A0 b(InterfaceC10690g1 interfaceC10690g1, int i10) {
        return (A0) this.f83271a.get(new C10817o0(interfaceC10690g1, i10));
    }
}
