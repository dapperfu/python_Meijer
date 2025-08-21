package We;

import com.google.crypto.tink.shaded.protobuf.AbstractC11430a;
import com.google.crypto.tink.shaded.protobuf.AbstractC11438i;
import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.io.IOException;

/* renamed from: We.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5540g extends AbstractC11452x<C5540g, b> implements S {
    private static final C5540g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Z<C5540g> PARSER;
    private int bitField0_;
    private int keySize_;
    private C5541h params_;

    /* renamed from: We.g$b */
    public static final class b extends AbstractC11452x.a<C5540g, b> implements S {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C5540g.DEFAULT_INSTANCE);
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

        public b x(int i10) {
            p();
            ((C5540g) this.f89411b).e0(i10);
            return this;
        }

        public b y(C5541h c5541h) {
            p();
            ((C5540g) this.f89411b).f0(c5541h);
            return this;
        }
    }

    /* renamed from: We.g$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40975a;

        static {
            int[] iArr = new int[AbstractC11452x.f.values().length];
            f40975a = iArr;
            try {
                iArr[AbstractC11452x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40975a[AbstractC11452x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40975a[AbstractC11452x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40975a[AbstractC11452x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40975a[AbstractC11452x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40975a[AbstractC11452x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40975a[AbstractC11452x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C5540g c5540g = new C5540g();
        DEFAULT_INSTANCE = c5540g;
        AbstractC11452x.U(C5540g.class, c5540g);
    }

    public static C5540g a0() {
        return DEFAULT_INSTANCE;
    }

    public static b d0() {
        return DEFAULT_INSTANCE.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10) {
        this.keySize_ = i10;
    }

    public int b0() {
        return this.keySize_;
    }

    public C5541h c0() {
        C5541h c5541h = this.params_;
        return c5541h == null ? C5541h.Z() : c5541h;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x
    protected final Object z(AbstractC11452x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f40975a[fVar.ordinal()]) {
            case 1:
                return new C5540g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11452x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<C5540g> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C5540g.class) {
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

    private C5540g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C5541h c5541h) {
        c5541h.getClass();
        this.params_ = c5541h;
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
