package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Q {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f82033b = a();

    /* renamed from: c, reason: collision with root package name */
    static final Q f82034c = new Q(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Object, Object> f82035a;

    Q() {
        this.f82035a = new HashMap();
    }

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Q b() {
        return P.b();
    }

    private Q(boolean z10) {
        this.f82035a = Collections.EMPTY_MAP;
    }
}
