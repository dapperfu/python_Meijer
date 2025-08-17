package Ue;

import com.google.crypto.tink.shaded.protobuf.AbstractC11305a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.AbstractC11313i;
import com.google.crypto.tink.shaded.protobuf.AbstractC11327x;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.io.IOException;

/* renamed from: Ue.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5284a extends AbstractC11327x<C5284a, b> implements S {
    private static final C5284a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Z<C5284a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC11312h keyValue_ = AbstractC11312h.f88342b;
    private C5286c params_;
    private int version_;

    /* renamed from: Ue.a$b */
    public static final class b extends AbstractC11327x.a<C5284a, b> implements S {
        /* synthetic */ b(C0789a c0789a) {
            this();
        }

        private b() {
            super(C5284a.DEFAULT_INSTANCE);
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

        public b x(AbstractC11312h abstractC11312h) {
            p();
            ((C5284a) this.f88571b).g0(abstractC11312h);
            return this;
        }

        public b y(C5286c c5286c) {
            p();
            ((C5284a) this.f88571b).h0(c5286c);
            return this;
        }
    }

    /* renamed from: Ue.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0789a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35944a;

        static {
            int[] iArr = new int[AbstractC11327x.f.values().length];
            f35944a = iArr;
            try {
                iArr[AbstractC11327x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35944a[AbstractC11327x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35944a[AbstractC11327x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35944a[AbstractC11327x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35944a[AbstractC11327x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35944a[AbstractC11327x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35944a[AbstractC11327x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C5284a c5284a = new C5284a();
        DEFAULT_INSTANCE = c5284a;
        AbstractC11327x.U(C5284a.class, c5284a);
    }

    public static b d0() {
        return DEFAULT_INSTANCE.v();
    }

    public static C5284a e0(AbstractC11312h abstractC11312h, C11319o c11319o) throws InvalidProtocolBufferException {
        return (C5284a) AbstractC11327x.O(DEFAULT_INSTANCE, abstractC11312h, c11319o);
    }

    public static Z<C5284a> f0() {
        return DEFAULT_INSTANCE.f();
    }

    public AbstractC11312h a0() {
        return this.keyValue_;
    }

    public C5286c b0() {
        C5286c c5286c = this.params_;
        return c5286c == null ? C5286c.Z() : c5286c;
    }

    public int c0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x
    protected final Object z(AbstractC11327x.f fVar, Object obj, Object obj2) {
        Z bVar;
        C0789a c0789a = null;
        switch (C0789a.f35944a[fVar.ordinal()]) {
            case 1:
                return new C5284a();
            case 2:
                return new b(c0789a);
            case 3:
                return AbstractC11327x.M(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<C5284a> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C5284a.class) {
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

    private C5284a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(AbstractC11312h abstractC11312h) {
        abstractC11312h.getClass();
        this.keyValue_ = abstractC11312h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(C5286c c5286c) {
        c5286c.getClass();
        this.params_ = c5286c;
        this.bitField0_ |= 1;
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
