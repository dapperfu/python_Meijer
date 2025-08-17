package bg;

import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.C11538y;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* loaded from: classes7.dex */
public final class n extends AbstractC11536w<n, b> implements Q {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Y<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    public static final class b extends AbstractC11536w.a<n, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    public enum c implements C11538y.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);


        /* renamed from: d, reason: collision with root package name */
        private static final C11538y.d<c> f60265d = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f60267a;

        class a implements C11538y.d<c> {
            a() {
            }

            @Override // com.google.protobuf.C11538y.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i10) {
                return c.b(i10);
            }
        }

        private static final class b implements C11538y.e {

            /* renamed from: a, reason: collision with root package name */
            static final C11538y.e f60268a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C11538y.e
            public boolean a(int i10) {
                if (c.b(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return SOURCE_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return FL_LEGACY_V1;
        }

        public static C11538y.e e() {
            return b.f60268a;
        }

        @Override // com.google.protobuf.C11538y.c
        public final int g() {
            return this.f60267a;
        }

        c(int i10) {
            this.f60267a = i10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60262a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60262a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60262a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60262a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60262a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60262a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60262a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60262a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        AbstractC11536w.W(n.class, nVar);
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f60262a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.e()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<n> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (n.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC11536w.b(DEFAULT_INSTANCE);
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

    private n() {
    }
}
