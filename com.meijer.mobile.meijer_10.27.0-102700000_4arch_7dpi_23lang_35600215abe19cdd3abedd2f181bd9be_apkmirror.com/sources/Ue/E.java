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

/* loaded from: classes7.dex */
public final class E extends AbstractC11327x<E, b> implements S {
    private static final E DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Z<E> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private F params_;
    private int version_;

    public static final class b extends AbstractC11327x.a<E, b> implements S {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(E.DEFAULT_INSTANCE);
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

        public b x(F f10) {
            p();
            ((E) this.f88571b).e0(f10);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35924a;

        static {
            int[] iArr = new int[AbstractC11327x.f.values().length];
            f35924a = iArr;
            try {
                iArr[AbstractC11327x.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35924a[AbstractC11327x.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35924a[AbstractC11327x.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35924a[AbstractC11327x.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35924a[AbstractC11327x.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35924a[AbstractC11327x.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35924a[AbstractC11327x.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        E e10 = new E();
        DEFAULT_INSTANCE = e10;
        AbstractC11327x.U(E.class, e10);
    }

    public static b b0() {
        return DEFAULT_INSTANCE.v();
    }

    public static E c0(AbstractC11312h abstractC11312h, C11319o c11319o) throws InvalidProtocolBufferException {
        return (E) AbstractC11327x.O(DEFAULT_INSTANCE, abstractC11312h, c11319o);
    }

    public static Z<E> d0() {
        return DEFAULT_INSTANCE.f();
    }

    public F Z() {
        F f10 = this.params_;
        return f10 == null ? F.Z() : f10;
    }

    public int a0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC11327x
    protected final Object z(AbstractC11327x.f fVar, Object obj, Object obj2) {
        Z bVar;
        a aVar = null;
        switch (a.f35924a[fVar.ordinal()]) {
            case 1:
                return new E();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11327x.M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Z<E> z10 = PARSER;
                if (z10 != null) {
                    return z10;
                }
                synchronized (E.class) {
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

    private E() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(F f10) {
        f10.getClass();
        this.params_ = f10;
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
