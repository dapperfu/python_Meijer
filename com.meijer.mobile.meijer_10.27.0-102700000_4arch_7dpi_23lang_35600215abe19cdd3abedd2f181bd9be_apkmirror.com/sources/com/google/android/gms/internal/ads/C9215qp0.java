package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9215qp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f77843a;

    /* renamed from: d, reason: collision with root package name */
    private C9321rp0 f77846d;

    /* renamed from: b, reason: collision with root package name */
    private Map f77844b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List f77845c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private Bo0 f77847e = Bo0.f65582b;

    public final C9215qp0 a(Object obj, Ck0 ck0, C8472js0 c8472js0) throws GeneralSecurityException {
        e(obj, ck0, c8472js0, false);
        return this;
    }

    public final C9215qp0 b(Object obj, Ck0 ck0, C8472js0 c8472js0) throws GeneralSecurityException {
        e(obj, ck0, c8472js0, true);
        return this;
    }

    private final C9215qp0 e(Object obj, Ck0 ck0, C8472js0 c8472js0, boolean z10) throws GeneralSecurityException {
        byte[] bArrC;
        if (this.f77844b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (c8472js0.k0() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = c8472js0.f0().ordinal();
        if (iOrdinal == 1) {
            bArrC = Yo0.b(c8472js0.b0()).c();
        } else if (iOrdinal == 2) {
            bArrC = Yo0.a(c8472js0.b0()).c();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrC = Yo0.a(c8472js0.b0()).c();
        } else {
            bArrC = C9953xk0.f79843a;
        }
        C9321rp0 c9321rp0 = new C9321rp0(obj, Et0.b(bArrC), c8472js0.k0(), c8472js0.f0(), c8472js0.b0(), c8472js0.c0().g0(), ck0, null);
        Map map = this.f77844b;
        List list = this.f77845c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c9321rp0);
        List list2 = (List) map.put(c9321rp0.f78069b, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(c9321rp0);
            map.put(c9321rp0.f78069b, Collections.unmodifiableList(arrayList2));
        }
        list.add(c9321rp0);
        if (!z10) {
            return this;
        }
        if (this.f77846d != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.f77846d = c9321rp0;
        return this;
    }

    public final C9215qp0 c(Bo0 bo0) {
        if (this.f77844b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f77847e = bo0;
        return this;
    }

    public final C9535tp0 d() throws GeneralSecurityException {
        Map map = this.f77844b;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        C9535tp0 c9535tp0 = new C9535tp0(map, this.f77845c, this.f77846d, this.f77847e, this.f77843a, null);
        this.f77844b = null;
        return c9535tp0;
    }

    /* synthetic */ C9215qp0(Class cls, C9428sp0 c9428sp0) {
        this.f77843a = cls;
    }
}
