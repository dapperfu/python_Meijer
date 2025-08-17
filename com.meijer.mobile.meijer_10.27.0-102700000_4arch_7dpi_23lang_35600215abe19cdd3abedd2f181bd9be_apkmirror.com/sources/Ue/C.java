package Ue;

import Ue.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11305a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11313i;
import com.google.crypto.tink.shaded.protobuf.AbstractC11327x;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.C11329z;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes7.dex */
public final class C extends AbstractC11327x<C, b> implements S {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Z<C> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C11329z.i<c> key_ = AbstractC11327x.A();
    private int primaryKeyId_;

    public static final class b extends AbstractC11327x.a<C, b> implements S {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.AbstractC11305a.AbstractC1279a
        protected /* bridge */ /* synthetic */ AbstractC11305a.AbstractC1279a j(AbstractC11305a abstractC11305a) {
            return super.j((AbstractC11327x) abstractC11305a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11305a.AbstractC1279a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q.a M2(Q q10) {
            return super.M2(q10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q build() {
            return super.build();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a
        public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q e() {
            return super.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q h() {
            return super.h();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.Q.a
        public /* bridge */ /* synthetic */ Q.a l2(AbstractC11313i abstractC11313i, C11319o c11319o) throws IOException {
            return super.l2(abstractC11313i, c11319o);
        }

        public b x(c cVar) {
            p();
            ((C) this.f88571b).a0(cVar);
            return this;
        }

        public b y(int i10) {
            p();
            ((C) this.f88571b).j0(i10);
            return this;
        }
    }

    public static final class c extends AbstractC11327x<c, a> implements S {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Z<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int bitField0_;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class a extends AbstractC11327x.a<c, a> implements S {
            /* synthetic */ a(a aVar) {
                this();
            }

            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.AbstractC11305a.AbstractC1279a
            protected /* bridge */ /* synthetic */ AbstractC11305a.AbstractC1279a j(AbstractC11305a abstractC11305a) {
                return super.j((AbstractC11327x) abstractC11305a);
            }

            public a A(z zVar) {
                p();
                ((c) this.f88571b).l0(zVar);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11305a.AbstractC1279a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q.a M2(Q q10) {
                return super.M2(q10);
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q build() {
                return super.build();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a
            public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.S
            public /* bridge */ /* synthetic */ Q e() {
                return super.e();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q h() {
                return super.h();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x.a, com.google.crypto.tink.shaded.protobuf.Q.a
            public /* bridge */ /* synthetic */ Q.a l2(AbstractC11313i abstractC11313i, C11319o c11319o) throws IOException {
                return super.l2(abstractC11313i, c11319o);
            }

            public a x(y.b bVar) {
                p();
                ((c) this.f88571b).i0(bVar.build());
                return this;
            }

            public a y(int i10) {
                p();
                ((c) this.f88571b).j0(i10);
                return this;
            }

            public a z(I i10) {
                p();
                ((c) this.f88571b).k0(i10);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC11327x.U(c.class, cVar);
        }

        public static a h0() {
            return DEFAULT_INSTANCE.v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(int i10) {
            this.keyId_ = i10;
        }

        public y c0() {
            y yVar = this.keyData_;
            return yVar == null ? y.b0() : yVar;
        }

        public int d0() {
            return this.keyId_;
        }

        public I e0() {
            I iA = I.a(this.outputPrefixType_);
            return iA == null ? I.UNRECOGNIZED : iA;
        }

        public z f0() {
            z zVarA = z.a(this.status_);
            return zVarA == null ? z.UNRECOGNIZED : zVarA;
        }

        public boolean g0() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x
        protected final Object z(AbstractC11327x.f fVar, Object obj, Object obj2) {
            Z bVar;
            a aVar = null;
            switch (a.f35922a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC11327x.M(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
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
                                bVar = new AbstractC11327x.b(DEFAULT_INSTANCE);
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
        public void i0(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(I i10) {
            this.outputPrefixType_ = i10.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l0(z zVar) {
            this.status_ = zVar.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a b() {
            return super.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ Q.a d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x, com.google.crypto.tink.shaded.protobuf.S
        public /* bridge */ /* synthetic */ Q e() {
            return super.e();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35922a;

        static {
            int[] iArr = new int[AbstractC11327x.f.values().length];
            f35922a = iArr;
            try {
                iArr[AbstractC11327x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35922a[AbstractC11327x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35922a[AbstractC11327x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35922a[AbstractC11327x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35922a[AbstractC11327x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35922a[AbstractC11327x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35922a[AbstractC11327x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C c10 = new C();
        DEFAULT_INSTANCE = c10;
        AbstractC11327x.U(C.class, c10);
    }

    private void b0() {
        C11329z.i<c> iVar = this.key_;
        if (iVar.j()) {
            return;
        }
        this.key_ = AbstractC11327x.K(iVar);
    }

    public static b g0() {
        return DEFAULT_INSTANCE.v();
    }

    public static C h0(InputStream inputStream, C11319o c11319o) throws IOException {
        return (C) AbstractC11327x.P(DEFAULT_INSTANCE, inputStream, c11319o);
    }

    public static C i0(byte[] bArr, C11319o c11319o) throws InvalidProtocolBufferException {
        return (C) AbstractC11327x.Q(DEFAULT_INSTANCE, bArr, c11319o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i10) {
        this.primaryKeyId_ = i10;
    }

    public c c0(int i10) {
        return this.key_.get(i10);
    }

    public int d0() {
        return this.key_.size();
    }

    public List<c> e0() {
        return this.key_;
    }

    public int f0() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x
    protected final Object z(AbstractC11327x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f35922a[fVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11327x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<C> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC11327x.b(DEFAULT_INSTANCE);
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

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(c cVar) {
        cVar.getClass();
        b0();
        this.key_.add(cVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ Q.a b() {
        return super.b();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x, com.google.crypto.tink.shaded.protobuf.Q
    public /* bridge */ /* synthetic */ Q.a d() {
        return super.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x, com.google.crypto.tink.shaded.protobuf.S
    public /* bridge */ /* synthetic */ Q e() {
        return super.e();
    }
}
