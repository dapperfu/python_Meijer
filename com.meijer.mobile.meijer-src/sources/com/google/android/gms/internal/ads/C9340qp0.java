package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9340qp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f78683a;

    /* renamed from: d, reason: collision with root package name */
    private C9446rp0 f78686d;

    /* renamed from: b, reason: collision with root package name */
    private Map f78684b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final List f78685c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private Bo0 f78687e = Bo0.f66422b;

    public final C9340qp0 a(Object obj, Ck0 ck0, C8597js0 c8597js0) throws GeneralSecurityException {
        e(obj, ck0, c8597js0, false);
        return this;
    }

    public final C9340qp0 b(Object obj, Ck0 ck0, C8597js0 c8597js0) throws GeneralSecurityException {
        e(obj, ck0, c8597js0, true);
        return this;
    }

    private final C9340qp0 e(Object obj, Ck0 ck0, C8597js0 c8597js0, boolean z10) throws GeneralSecurityException {
        byte[] bArrC;
        if (this.f78684b == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (c8597js0.k0() != 3) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = c8597js0.f0().ordinal();
        if (iOrdinal == 1) {
            bArrC = Yo0.b(c8597js0.b0()).c();
        } else if (iOrdinal == 2) {
            bArrC = Yo0.a(c8597js0.b0()).c();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrC = Yo0.a(c8597js0.b0()).c();
        } else {
            bArrC = C10078xk0.f80683a;
        }
        C9446rp0 c9446rp0 = new C9446rp0(obj, Et0.b(bArrC), c8597js0.k0(), c8597js0.f0(), c8597js0.b0(), c8597js0.c0().g0(), ck0, null);
        Map map = this.f78684b;
        List list = this.f78685c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c9446rp0);
        List list2 = (List) map.put(c9446rp0.f78909b, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(c9446rp0);
            map.put(c9446rp0.f78909b, Collections.unmodifiableList(arrayList2));
        }
        list.add(c9446rp0);
        if (!z10) {
            return this;
        }
        if (this.f78686d != null) {
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        this.f78686d = c9446rp0;
        return this;
    }

    public final C9340qp0 c(Bo0 bo0) {
        if (this.f78684b == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.f78687e = bo0;
        return this;
    }

    public final C9660tp0 d() throws GeneralSecurityException {
        Map map = this.f78684b;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        C9660tp0 c9660tp0 = new C9660tp0(map, this.f78685c, this.f78686d, this.f78687e, this.f78683a, null);
        this.f78684b = null;
        return c9660tp0;
    }

    /* synthetic */ C9340qp0(Class cls, C9553sp0 c9553sp0) {
        this.f78683a = cls;
    }
}
