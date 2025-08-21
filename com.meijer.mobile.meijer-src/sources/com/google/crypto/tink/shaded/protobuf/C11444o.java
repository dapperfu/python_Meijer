package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C11444o {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C11444o f89261b;

    /* renamed from: c, reason: collision with root package name */
    static final C11444o f89262c = new C11444o(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC11452x.e<?, ?>> f89263a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f89264a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89265b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f89264a == aVar.f89264a && this.f89265b == aVar.f89265b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f89264a) * 65535) + this.f89265b;
        }

        a(Object obj, int i10) {
            this.f89264a = obj;
            this.f89265b = i10;
        }
    }

    C11444o() {
        this.f89263a = new HashMap();
    }

    public static C11444o b() {
        C11444o c11444oA;
        if (b0.f89158d) {
            return f89262c;
        }
        C11444o c11444o = f89261b;
        if (c11444o != null) {
            return c11444o;
        }
        synchronized (C11444o.class) {
            try {
                c11444oA = f89261b;
                if (c11444oA == null) {
                    c11444oA = C11443n.a();
                    f89261b = c11444oA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c11444oA;
    }

    public <ContainingType extends Q> AbstractC11452x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (AbstractC11452x.e) this.f89263a.get(new a(containingtype, i10));
    }

    C11444o(boolean z10) {
        this.f89263a = Collections.EMPTY_MAP;
    }
}
