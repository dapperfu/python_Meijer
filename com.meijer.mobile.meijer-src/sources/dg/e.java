package dg;

import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* loaded from: classes8.dex */
public final class e extends AbstractC11661w<e, b> implements Q {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile Y<e> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    public static final class b extends AbstractC11661w.a<e, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        public b G(long j10) {
            x();
            ((e) this.f91575b).e0(j10);
            return this;
        }

        public b H(long j10) {
            x();
            ((e) this.f91575b).f0(j10);
            return this;
        }

        public b I(long j10) {
            x();
            ((e) this.f91575b).g0(j10);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128461a;

        static {
            int[] iArr = new int[AbstractC11661w.f.values().length];
            f128461a = iArr;
            try {
                iArr[AbstractC11661w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128461a[AbstractC11661w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128461a[AbstractC11661w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128461a[AbstractC11661w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128461a[AbstractC11661w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128461a[AbstractC11661w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128461a[AbstractC11661w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC11661w.W(e.class, eVar);
    }

    public static b d0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(long j10) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(long j10) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(long j10) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j10;
    }

    @Override // com.google.protobuf.AbstractC11661w
    protected final Object E(AbstractC11661w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f128461a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11661w.T(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<e> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (e.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC11661w.b(DEFAULT_INSTANCE);
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

    private e() {
    }
}
