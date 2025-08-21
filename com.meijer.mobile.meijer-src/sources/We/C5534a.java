package We;

import com.google.crypto.tink.shaded.protobuf.AbstractC11430a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.AbstractC11438i;
import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.io.IOException;

/* renamed from: We.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5534a extends AbstractC11452x<C5534a, b> implements S {
    private static final C5534a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile Z<C5534a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private AbstractC11437h keyValue_ = AbstractC11437h.f89182b;
    private C5536c params_;
    private int version_;

    /* renamed from: We.a$b */
    public static final class b extends AbstractC11452x.a<C5534a, b> implements S {
        /* synthetic */ b(C0882a c0882a) {
            this();
        }

        private b() {
            super(C5534a.DEFAULT_INSTANCE);
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

        public b x(AbstractC11437h abstractC11437h) {
            p();
            ((C5534a) this.f89411b).g0(abstractC11437h);
            return this;
        }

        public b y(C5536c c5536c) {
            p();
            ((C5534a) this.f89411b).h0(c5536c);
            return this;
        }
    }

    /* renamed from: We.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0882a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40969a;

        static {
            int[] iArr = new int[AbstractC11452x.f.values().length];
            f40969a = iArr;
            try {
                iArr[AbstractC11452x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40969a[AbstractC11452x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40969a[AbstractC11452x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40969a[AbstractC11452x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40969a[AbstractC11452x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40969a[AbstractC11452x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40969a[AbstractC11452x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C5534a c5534a = new C5534a();
        DEFAULT_INSTANCE = c5534a;
        AbstractC11452x.U(C5534a.class, c5534a);
    }

    public static b d0() {
        return DEFAULT_INSTANCE.v();
    }

    public static C5534a e0(AbstractC11437h abstractC11437h, C11444o c11444o) throws InvalidProtocolBufferException {
        return (C5534a) AbstractC11452x.O(DEFAULT_INSTANCE, abstractC11437h, c11444o);
    }

    public static Z<C5534a> f0() {
        return DEFAULT_INSTANCE.f();
    }

    public AbstractC11437h a0() {
        return this.keyValue_;
    }

    public C5536c b0() {
        C5536c c5536c = this.params_;
        return c5536c == null ? C5536c.Z() : c5536c;
    }

    public int c0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x
    protected final Object z(AbstractC11452x.f fVar, Object obj, Object obj2) {
        Z bVar;
        C0882a c0882a = null;
        switch (C0882a.f40969a[fVar.ordinal()]) {
            case 1:
                return new C5534a();
            case 2:
                return new b(c0882a);
            case 3:
                return AbstractC11452x.M(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<C5534a> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C5534a.class) {
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

    private C5534a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(AbstractC11437h abstractC11437h) {
        abstractC11437h.getClass();
        this.keyValue_ = abstractC11437h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(C5536c c5536c) {
        c5536c.getClass();
        this.params_ = c5536c;
        this.bitField0_ |= 1;
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
