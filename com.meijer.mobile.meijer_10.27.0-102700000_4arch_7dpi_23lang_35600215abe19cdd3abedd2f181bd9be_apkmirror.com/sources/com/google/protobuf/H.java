package com.google.protobuf;

/* loaded from: classes7.dex */
final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final O f90438b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final O f90439a;

    class a implements O {
        @Override // com.google.protobuf.O
        public boolean b(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.O
        public N a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        a() {
        }
    }

    private static class c implements O {

        /* renamed from: a, reason: collision with root package name */
        private O[] f90441a;

        @Override // com.google.protobuf.O
        public N a(Class<?> cls) {
            for (O o10 : this.f90441a) {
                if (o10.b(cls)) {
                    return o10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.O
        public boolean b(Class<?> cls) {
            for (O o10 : this.f90441a) {
                if (o10.b(cls)) {
                    return true;
                }
            }
            return false;
        }

        c(O... oArr) {
            this.f90441a = oArr;
        }
    }

    public H() {
        this(c());
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90440a;

        static {
            int[] iArr = new int[a0.values().length];
            f90440a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private H(O o10) {
        this.f90439a = (O) C11538y.b(o10, "messageInfoFactory");
    }

    private static boolean b(N n10) {
        return b.f90440a[n10.c().ordinal()] != 1;
    }

    private static O c() {
        return new c(C11535v.c(), d());
    }

    private static O d() {
        try {
            return (O) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f90438b;
        }
    }

    private static <T> f0<T> e(Class<T> cls, N n10) {
        return AbstractC11536w.class.isAssignableFrom(cls) ? b(n10) ? T.O(cls, n10, X.b(), F.b(), h0.L(), C11531q.b(), M.b()) : T.O(cls, n10, X.b(), F.b(), h0.L(), null, M.b()) : b(n10) ? T.O(cls, n10, X.a(), F.a(), h0.K(), C11531q.a(), M.a()) : T.O(cls, n10, X.a(), F.a(), h0.K(), null, M.a());
    }

    @Override // com.google.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.H(cls);
        N nA = this.f90439a.a(cls);
        if (nA.a()) {
            if (AbstractC11536w.class.isAssignableFrom(cls)) {
                return U.l(h0.L(), C11531q.b(), nA.b());
            }
            return U.l(h0.K(), C11531q.a(), nA.b());
        }
        return e(cls, nA);
    }
}
