package Ue;

import com.google.crypto.tink.shaded.protobuf.AbstractC11305a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.AbstractC11313i;
import com.google.crypto.tink.shaded.protobuf.AbstractC11327x;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.C11329z;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class y extends AbstractC11327x<y, b> implements S {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile Z<y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC11312h value_ = AbstractC11312h.f88342b;

    public static final class b extends AbstractC11327x.a<y, b> implements S {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(y.DEFAULT_INSTANCE);
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
            ((y) this.f88571b).g0(cVar);
            return this;
        }

        public b y(String str) {
            p();
            ((y) this.f88571b).h0(str);
            return this;
        }

        public b z(AbstractC11312h abstractC11312h) {
            p();
            ((y) this.f88571b).i0(abstractC11312h);
            return this;
        }
    }

    public enum c implements C11329z.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);


        /* renamed from: h, reason: collision with root package name */
        private static final C11329z.d<c> f35984h = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f35986a;

        class a implements C11329z.d<c> {
            a() {
            }

            @Override // com.google.crypto.tink.shaded.protobuf.C11329z.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C11329z.c
        public final int g() {
            if (this != UNRECOGNIZED) {
                return this.f35986a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        c(int i10) {
            this.f35986a = i10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35977a;

        static {
            int[] iArr = new int[AbstractC11327x.f.values().length];
            f35977a = iArr;
            try {
                iArr[AbstractC11327x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35977a[AbstractC11327x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35977a[AbstractC11327x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35977a[AbstractC11327x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35977a[AbstractC11327x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35977a[AbstractC11327x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35977a[AbstractC11327x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        AbstractC11327x.U(y.class, yVar);
    }

    public static y b0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return DEFAULT_INSTANCE.v();
    }

    public c c0() {
        c cVarA = c.a(this.keyMaterialType_);
        return cVarA == null ? c.UNRECOGNIZED : cVarA;
    }

    public String d0() {
        return this.typeUrl_;
    }

    public AbstractC11312h e0() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x
    protected final Object z(AbstractC11327x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f35977a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11327x.M(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<y> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (y.class) {
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

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(c cVar) {
        this.keyMaterialType_ = cVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(AbstractC11312h abstractC11312h) {
        abstractC11312h.getClass();
        this.value_ = abstractC11312h;
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
