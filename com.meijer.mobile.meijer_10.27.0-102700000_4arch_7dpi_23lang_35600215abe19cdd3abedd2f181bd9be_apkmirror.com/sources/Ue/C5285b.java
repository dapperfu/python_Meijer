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

/* renamed from: Ue.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5285b extends AbstractC11327x<C5285b, C0790b> implements S {
    private static final C5285b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Z<C5285b> PARSER;
    private int bitField0_;
    private int keySize_;
    private C5286c params_;

    /* renamed from: Ue.b$b, reason: collision with other inner class name */
    public static final class C0790b extends AbstractC11327x.a<C5285b, C0790b> implements S {
        /* synthetic */ C0790b(a aVar) {
            this();
        }

        private C0790b() {
            super(C5285b.DEFAULT_INSTANCE);
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

        public C0790b x(int i10) {
            p();
            ((C5285b) this.f88571b).e0(i10);
            return this;
        }

        public C0790b y(C5286c c5286c) {
            p();
            ((C5285b) this.f88571b).f0(c5286c);
            return this;
        }
    }

    /* renamed from: Ue.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35945a;

        static {
            int[] iArr = new int[AbstractC11327x.f.values().length];
            f35945a = iArr;
            try {
                iArr[AbstractC11327x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35945a[AbstractC11327x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35945a[AbstractC11327x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35945a[AbstractC11327x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35945a[AbstractC11327x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35945a[AbstractC11327x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35945a[AbstractC11327x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C5285b c5285b = new C5285b();
        DEFAULT_INSTANCE = c5285b;
        AbstractC11327x.U(C5285b.class, c5285b);
    }

    public static C0790b c0() {
        return DEFAULT_INSTANCE.v();
    }

    public static C5285b d0(AbstractC11312h abstractC11312h, C11319o c11319o) throws InvalidProtocolBufferException {
        return (C5285b) AbstractC11327x.O(DEFAULT_INSTANCE, abstractC11312h, c11319o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int i10) {
        this.keySize_ = i10;
    }

    public int a0() {
        return this.keySize_;
    }

    public C5286c b0() {
        C5286c c5286c = this.params_;
        return c5286c == null ? C5286c.Z() : c5286c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x
    protected final Object z(AbstractC11327x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f35945a[fVar.ordinal()]) {
            case 1:
                return new C5285b();
            case 2:
                return new C0790b(aVar);
            case 3:
                return AbstractC11327x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<C5285b> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (C5285b.class) {
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

    private C5285b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(C5286c c5286c) {
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
