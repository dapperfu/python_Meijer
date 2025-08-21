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

/* renamed from: We.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5546m extends AbstractC11452x<C5546m, b> implements S {
    private static final C5546m DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile Z<C5546m> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    /* renamed from: We.m$b */
    public static final class b extends AbstractC11452x.a<C5546m, b> implements S {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C5546m.DEFAULT_INSTANCE);
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
            ((C5546m) this.f89411b).d0(i10);
            return this;
        }
    }

    /* renamed from: We.m$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40981a;

        static {
            int[] iArr = new int[AbstractC11452x.f.values().length];
            f40981a = iArr;
            try {
                iArr[AbstractC11452x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40981a[AbstractC11452x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40981a[AbstractC11452x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40981a[AbstractC11452x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40981a[AbstractC11452x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40981a[AbstractC11452x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40981a[AbstractC11452x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C5546m c5546m = new C5546m();
        DEFAULT_INSTANCE = c5546m;
        AbstractC11452x.U(C5546m.class, c5546m);
    }

    public static b b0() {
        return DEFAULT_INSTANCE.v();
    }

    public static C5546m c0(AbstractC11437h abstractC11437h, C11444o c11444o) throws InvalidProtocolBufferException {
        return (C5546m) AbstractC11452x.O(DEFAULT_INSTANCE, abstractC11437h, c11444o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(int i10) {
        this.keySize_ = i10;
    }

    public int Z() {
        return this.keySize_;
    }

    public int a0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11452x
    protected final Object z(AbstractC11452x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f40981a[fVar.ordinal()]) {
            case 1:
                return new C5546m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11452x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<C5546m> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C5546m.class) {
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

    private C5546m() {
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
