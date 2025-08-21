package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
final class I implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final P f89115b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final P f89116a;

    class a implements P {
        @Override // com.google.crypto.tink.shaded.protobuf.P
        public boolean b(Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public O a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        a() {
        }
    }

    private static class c implements P {

        /* renamed from: a, reason: collision with root package name */
        private P[] f89118a;

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public O a(Class<?> cls) {
            for (P p10 : this.f89118a) {
                if (p10.b(cls)) {
                    return p10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public boolean b(Class<?> cls) {
            for (P p10 : this.f89118a) {
                if (p10.b(cls)) {
                    return true;
                }
            }
            return false;
        }

        c(P... pArr) {
            this.f89118a = pArr;
        }
    }

    public I() {
        this(c());
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89117a;

        static {
            int[] iArr = new int[a0.values().length];
            f89117a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private I(P p10) {
        this.f89116a = (P) C11454z.b(p10, "messageInfoFactory");
    }

    private static boolean b(O o10) {
        return b.f89117a[o10.c().ordinal()] != 1;
    }

    private static P c() {
        return new c(C11451w.c(), d());
    }

    private static P d() {
        if (b0.f89158d) {
            return f89115b;
        }
        try {
            return (P) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f89115b;
        }
    }

    private static boolean f(Class<?> cls) {
        return b0.f89158d || AbstractC11452x.class.isAssignableFrom(cls);
    }

    private static <T> f0<T> e(Class<T> cls, O o10) {
        AbstractC11445p<?> abstractC11445pB = null;
        if (f(cls)) {
            W wB = Y.b();
            E eB = G.b();
            l0<?, ?> l0VarL = h0.L();
            if (b(o10)) {
                abstractC11445pB = r.b();
            }
            return U.S(cls, o10, wB, eB, l0VarL, abstractC11445pB, N.b());
        }
        W wA = Y.a();
        AbstractC11445p<?> abstractC11445pA = null;
        E eA = G.a();
        l0<?, ?> l0VarK = h0.K();
        if (b(o10)) {
            abstractC11445pA = r.a();
        }
        return U.S(cls, o10, wA, eA, l0VarK, abstractC11445pA, N.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.H(cls);
        O oA = this.f89116a.a(cls);
        if (oA.a()) {
            if (f(cls)) {
                return V.m(h0.L(), r.b(), oA.b());
            }
            return V.m(h0.K(), r.a(), oA.b());
        }
        return e(cls, oA);
    }
}
