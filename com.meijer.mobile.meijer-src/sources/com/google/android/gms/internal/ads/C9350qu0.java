package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9350qu0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C9350qu0 f78704b;

    /* renamed from: c, reason: collision with root package name */
    static final C9350qu0 f78705c = new C9350qu0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f78706a;

    C9350qu0() {
        this.f78706a = new HashMap();
    }

    C9350qu0(boolean z10) {
        this.f78706a = Collections.EMPTY_MAP;
    }

    public static C9350qu0 a() {
        int i10 = C10207yv0.f81149d;
        return f78705c;
    }

    public static C9350qu0 b() {
        C9350qu0 c9350qu0 = f78704b;
        if (c9350qu0 != null) {
            return c9350qu0;
        }
        synchronized (C9350qu0.class) {
            try {
                C9350qu0 c9350qu02 = f78704b;
                if (c9350qu02 != null) {
                    return c9350qu02;
                }
                int i10 = C10207yv0.f81149d;
                C9350qu0 c9350qu0B = AbstractC10205yu0.b(C9350qu0.class);
                f78704b = c9350qu0B;
                return c9350qu0B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Eu0 c(InterfaceC9245pv0 interfaceC9245pv0, int i10) {
        return (Eu0) this.f78706a.get(new C9243pu0(interfaceC9245pv0, i10));
    }
}
