package We;

import com.google.crypto.tink.shaded.protobuf.AbstractC11430a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11438i;
import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.C11454z;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class D extends AbstractC11452x<D, b> implements S {
    private static final D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Z<D> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C11454z.i<c> keyInfo_ = AbstractC11452x.A();
    private int primaryKeyId_;

    public static final class b extends AbstractC11452x.a<D, b> implements S {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(D.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.AbstractC11430a.AbstractC1288a
        protected /* bridge */ /* synthetic */ AbstractC11430a.AbstractC1288a j(AbstractC11430a abstractC11430a) {
            return super.j((AbstractC11452x) abstractC11430a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11430a.AbstractC1288a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q.a L2(Q q10) {
            return super.L2(q10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a
        public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q e() {
            return super.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q h() {
            return super.h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q.a j2(AbstractC11438i abstractC11438i, C11444o c11444o) throws IOException {
            return super.j2(abstractC11438i, c11444o);
        }

        public b x(c cVar) {
            p();
            ((D) this.f89411b).a0(cVar);
            return this;
        }

        public b y(int i10) {
            p();
            ((D) this.f89411b).d0(i10);
            return this;
        }
    }

    public static final class c extends AbstractC11452x<c, a> implements S {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Z<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        public static final class a extends AbstractC11452x.a<c, a> implements S {
            /* synthetic */ a(a aVar) {
                this();
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.AbstractC11430a.AbstractC1288a
            protected /* bridge */ /* synthetic */ AbstractC11430a.AbstractC1288a j(AbstractC11430a abstractC11430a) {
                return super.j((AbstractC11452x) abstractC11430a);
            }

            public a A(String str) {
                p();
                ((c) this.f89411b).g0(str);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11430a.AbstractC1288a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q.a L2(Q q10) {
                return super.L2(q10);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q build() {
                return super.build();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a
            public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.S
            public /* bridge */ /* synthetic */ Q e() {
                return super.e();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q h() {
                return super.h();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x.a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q.a j2(AbstractC11438i abstractC11438i, C11444o c11444o) throws IOException {
                return super.j2(abstractC11438i, c11444o);
            }

            public a x(int i10) {
                p();
                ((c) this.f89411b).d0(i10);
                return this;
            }

            public a y(I i10) {
                p();
                ((c) this.f89411b).e0(i10);
                return this;
            }

            public a z(z zVar) {
                p();
                ((c) this.f89411b).f0(zVar);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC11452x.U(c.class, cVar);
        }

        public static a c0() {
            return DEFAULT_INSTANCE.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(int i10) {
            this.keyId_ = i10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x
        protected final Object z(AbstractC11452x.f fVar, Object obj, Object obj2) {
            Z bVar;
            a aVar = null;
            switch (a.f40948a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC11452x.M(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Z<c> z10 = PARSER;
                    if (z10 != null) {
                        return z10;
                    }
                    synchronized (c.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC11452x.b(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return bVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(I i10) {
            this.outputPrefixType_ = i10.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(z zVar) {
            this.status_ = zVar.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a b() {
            return super.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q e() {
            return super.e();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40948a;

        static {
            int[] iArr = new int[AbstractC11452x.f.values().length];
            f40948a = iArr;
            try {
                iArr[AbstractC11452x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40948a[AbstractC11452x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40948a[AbstractC11452x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40948a[AbstractC11452x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40948a[AbstractC11452x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40948a[AbstractC11452x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40948a[AbstractC11452x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        D d10 = new D();
        DEFAULT_INSTANCE = d10;
        AbstractC11452x.U(D.class, d10);
    }

    private void b0() {
        C11454z.i<c> iVar = this.keyInfo_;
        if (iVar.j()) {
            return;
        }
        this.keyInfo_ = AbstractC11452x.K(iVar);
    }

    public static b c0() {
        return DEFAULT_INSTANCE.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i10) {
        this.primaryKeyId_ = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x
    protected final Object z(AbstractC11452x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f40948a[fVar.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11452x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<D> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (D.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC11452x.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(c cVar) {
        cVar.getClass();
        b0();
        this.keyInfo_.add(cVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ Q.a b() {
        return super.b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ Q.a d() {
        return super.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x, com.google.crypto.tink.shaded.protobuf.S
    public /* bridge */ /* synthetic */ Q e() {
        return super.e();
    }
}
