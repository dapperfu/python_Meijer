package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final O f54389b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final O f54390a;

    class a implements O {
        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        a() {
        }
    }

    private static class c implements O {

        /* renamed from: a, reason: collision with root package name */
        private O[] f54392a;

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class<?> cls) {
            for (O o10 : this.f54392a) {
                if (o10.b(cls)) {
                    return o10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class<?> cls) {
            for (O o10 : this.f54392a) {
                if (o10.b(cls)) {
                    return true;
                }
            }
            return false;
        }

        c(O... oArr) {
            this.f54392a = oArr;
        }
    }

    public H() {
        this(c());
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54391a;

        static {
            int[] iArr = new int[a0.values().length];
            f54391a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private H(O o10) {
        this.f54390a = (O) C6100y.b(o10, "messageInfoFactory");
    }

    private static boolean b(N n10) {
        return b.f54391a[n10.c().ordinal()] != 1;
    }

    private static O c() {
        return new c(C6097v.c(), d());
    }

    private static O d() {
        if (b0.f54439d) {
            return f54389b;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f54389b;
        }
    }

    private static boolean f(Class<?> cls) {
        return b0.f54439d || AbstractC6098w.class.isAssignableFrom(cls);
    }

    private static <T> f0<T> e(Class<T> cls, N n10) {
        AbstractC6091o<?> abstractC6091oB = null;
        if (f(cls)) {
            V vB = X.b();
            D dB = F.b();
            l0<?, ?> l0VarL = h0.L();
            if (b(n10)) {
                abstractC6091oB = C6093q.b();
            }
            return T.O(cls, n10, vB, dB, l0VarL, abstractC6091oB, M.b());
        }
        V vA = X.a();
        AbstractC6091o<?> abstractC6091oA = null;
        D dA = F.a();
        l0<?, ?> l0VarK = h0.K();
        if (b(n10)) {
            abstractC6091oA = C6093q.a();
        }
        return T.O(cls, n10, vA, dA, l0VarK, abstractC6091oA, M.a());
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.H(cls);
        N nA = this.f54390a.a(cls);
        if (nA.a()) {
            if (f(cls)) {
                return U.l(h0.L(), C6093q.b(), nA.b());
            }
            return U.l(h0.K(), C6093q.a(), nA.b());
        }
        return e(cls, nA);
    }
}
