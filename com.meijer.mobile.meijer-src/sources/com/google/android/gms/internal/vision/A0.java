package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class A0 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile A0 f85097b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile A0 f85098c;

    /* renamed from: d, reason: collision with root package name */
    private static final A0 f85099d = new A0(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, O0.d<?, ?>> f85100a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f85101a;

        /* renamed from: b, reason: collision with root package name */
        private final int f85102b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f85101a == aVar.f85101a && this.f85102b == aVar.f85102b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f85101a) * 65535) + this.f85102b;
        }

        a(Object obj, int i10) {
            this.f85101a = obj;
            this.f85102b = i10;
        }
    }

    A0() {
        this.f85100a = new HashMap();
    }

    public static A0 b() {
        A0 a02;
        A0 a03 = f85097b;
        if (a03 != null) {
            return a03;
        }
        synchronized (A0.class) {
            try {
                a02 = f85097b;
                if (a02 == null) {
                    a02 = f85099d;
                    f85097b = a02;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a02;
    }

    public static A0 c() {
        A0 a02 = f85098c;
        if (a02 != null) {
            return a02;
        }
        synchronized (A0.class) {
            try {
                A0 a03 = f85098c;
                if (a03 != null) {
                    return a03;
                }
                A0 a0B = L0.b(A0.class);
                f85098c = a0B;
                return a0B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <ContainingType extends InterfaceC11208w1> O0.d<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (O0.d) this.f85100a.get(new a(containingtype, i10));
    }

    private A0(boolean z10) {
        this.f85100a = Collections.EMPTY_MAP;
    }
}
