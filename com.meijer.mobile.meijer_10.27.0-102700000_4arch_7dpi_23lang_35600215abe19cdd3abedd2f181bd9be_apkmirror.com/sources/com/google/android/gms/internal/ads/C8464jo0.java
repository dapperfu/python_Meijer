package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.jo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8464jo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f75520a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f75521b;

    /* synthetic */ C8464jo0(Map map, Map map2, C8358io0 c8358io0) {
        this.f75520a = map;
        this.f75521b = map2;
    }

    public static C8252ho0 a() {
        return new C8252ho0(null);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.f75521b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r32) throws GeneralSecurityException {
        Object obj = this.f75520a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }
}
