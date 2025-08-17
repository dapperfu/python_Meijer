package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Q {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f81193b = a();

    /* renamed from: c, reason: collision with root package name */
    static final Q f81194c = new Q(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<Object, Object> f81195a;

    Q() {
        this.f81195a = new HashMap();
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
        this.f81195a = Collections.EMPTY_MAP;
    }
}
