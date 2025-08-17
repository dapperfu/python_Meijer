package com.google.protobuf;

import com.google.protobuf.AbstractC11536w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C11528n {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f90579b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C11528n f90580c;

    /* renamed from: d, reason: collision with root package name */
    static final C11528n f90581d = new C11528n(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC11536w.e<?, ?>> f90582a;

    /* renamed from: com.google.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f90583a;

        /* renamed from: b, reason: collision with root package name */
        private final int f90584b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f90583a == aVar.f90583a && this.f90584b == aVar.f90584b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f90583a) * 65535) + this.f90584b;
        }

        a(Object obj, int i10) {
            this.f90583a = obj;
            this.f90584b = i10;
        }
    }

    C11528n() {
        this.f90582a = new HashMap();
    }

    public static C11528n b() {
        C11528n c11528nA;
        if (!f90579b) {
            return f90581d;
        }
        C11528n c11528n = f90580c;
        if (c11528n != null) {
            return c11528n;
        }
        synchronized (C11528n.class) {
            try {
                c11528nA = f90580c;
                if (c11528nA == null) {
                    c11528nA = C11527m.a();
                    f90580c = c11528nA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11528nA;
    }

    public <ContainingType extends P> AbstractC11536w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC11536w.e) this.f90582a.get(new a(containingtype, i10));
    }

    C11528n(boolean z10) {
        this.f90582a = Collections.EMPTY_MAP;
    }
}
