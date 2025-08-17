package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC11327x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C11319o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C11319o f88421b;

    /* renamed from: c, reason: collision with root package name */
    static final C11319o f88422c = new C11319o(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC11327x.e<?, ?>> f88423a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f88424a;

        /* renamed from: b, reason: collision with root package name */
        private final int f88425b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f88424a == aVar.f88424a && this.f88425b == aVar.f88425b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f88424a) * 65535) + this.f88425b;
        }

        a(Object obj, int i10) {
            this.f88424a = obj;
            this.f88425b = i10;
        }
    }

    C11319o() {
        this.f88423a = new HashMap();
    }

    public static C11319o b() {
        C11319o c11319oA;
        if (b0.f88318d) {
            return f88422c;
        }
        C11319o c11319o = f88421b;
        if (c11319o != null) {
            return c11319o;
        }
        synchronized (C11319o.class) {
            try {
                c11319oA = f88421b;
                if (c11319oA == null) {
                    c11319oA = C11318n.a();
                    f88421b = c11319oA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11319oA;
    }

    public <ContainingType extends Q> AbstractC11327x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC11327x.e) this.f88423a.get(new a(containingtype, i10));
    }

    C11319o(boolean z10) {
        this.f88423a = Collections.EMPTY_MAP;
    }
}
