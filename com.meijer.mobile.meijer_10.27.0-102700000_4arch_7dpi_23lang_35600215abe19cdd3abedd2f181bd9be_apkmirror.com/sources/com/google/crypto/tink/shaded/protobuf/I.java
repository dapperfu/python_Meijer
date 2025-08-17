package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
final class I implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final P f88275b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final P f88276a;

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
        private P[] f88278a;

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public O a(Class<?> cls) {
            for (P p10 : this.f88278a) {
                if (p10.b(cls)) {
                    return p10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public boolean b(Class<?> cls) {
            for (P p10 : this.f88278a) {
                if (p10.b(cls)) {
                    return true;
                }
            }
            return false;
        }

        c(P... pArr) {
            this.f88278a = pArr;
        }
    }

    public I() {
        this(c());
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88277a;

        static {
            int[] iArr = new int[a0.values().length];
            f88277a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private I(P p10) {
        this.f88276a = (P) C11329z.b(p10, "messageInfoFactory");
    }

    private static boolean b(O o10) {
        return b.f88277a[o10.c().ordinal()] != 1;
    }

    private static P c() {
        return new c(C11326w.c(), d());
    }

    private static P d() {
        if (b0.f88318d) {
            return f88275b;
        }
        try {
            return (P) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f88275b;
        }
    }

    private static boolean f(Class<?> cls) {
        return b0.f88318d || AbstractC11327x.class.isAssignableFrom(cls);
    }

    private static <T> f0<T> e(Class<T> cls, O o10) {
        AbstractC11320p<?> abstractC11320pB = null;
        if (f(cls)) {
            W wB = Y.b();
            E eB = G.b();
            l0<?, ?> l0VarL = h0.L();
            if (b(o10)) {
                abstractC11320pB = r.b();
            }
            return U.S(cls, o10, wB, eB, l0VarL, abstractC11320pB, N.b());
        }
        W wA = Y.a();
        AbstractC11320p<?> abstractC11320pA = null;
        E eA = G.a();
        l0<?, ?> l0VarK = h0.K();
        if (b(o10)) {
            abstractC11320pA = r.a();
        }
        return U.S(cls, o10, wA, eA, l0VarK, abstractC11320pA, N.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.H(cls);
        O oA = this.f88276a.a(cls);
        if (oA.a()) {
            if (f(cls)) {
                return V.m(h0.L(), r.b(), oA.b());
            }
            return V.m(h0.K(), r.a(), oA.b());
        }
        return e(cls, oA);
    }
}
