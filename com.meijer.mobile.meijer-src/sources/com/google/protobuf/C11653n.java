package com.google.protobuf;

import com.google.protobuf.AbstractC11661w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C11653n {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f91418b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C11653n f91419c;

    /* renamed from: d, reason: collision with root package name */
    static final C11653n f91420d = new C11653n(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC11661w.e<?, ?>> f91421a;

    /* renamed from: com.google.protobuf.n$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f91422a;

        /* renamed from: b, reason: collision with root package name */
        private final int f91423b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f91422a == aVar.f91422a && this.f91423b == aVar.f91423b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f91422a) * 65535) + this.f91423b;
        }

        a(Object obj, int i10) {
            this.f91422a = obj;
            this.f91423b = i10;
        }
    }

    C11653n() {
        this.f91421a = new HashMap();
    }

    public static C11653n b() {
        C11653n c11653nA;
        if (!f91418b) {
            return f91420d;
        }
        C11653n c11653n = f91419c;
        if (c11653n != null) {
            return c11653n;
        }
        synchronized (C11653n.class) {
            try {
                c11653nA = f91419c;
                if (c11653nA == null) {
                    c11653nA = C11652m.a();
                    f91419c = c11653nA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11653nA;
    }

    public <ContainingType extends P> AbstractC11661w.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC11661w.e) this.f91421a.get(new a(containingtype, i10));
    }

    C11653n(boolean z10) {
        this.f91421a = Collections.EMPTY_MAP;
    }
}
