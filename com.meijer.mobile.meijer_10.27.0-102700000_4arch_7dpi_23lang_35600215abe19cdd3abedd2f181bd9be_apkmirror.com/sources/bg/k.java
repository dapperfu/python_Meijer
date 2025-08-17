package bg;

import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.C11538y;
import com.google.protobuf.InterfaceC11539z;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* loaded from: classes7.dex */
public final class k extends AbstractC11536w<k, c> implements Q {
    private static final k DEFAULT_INSTANCE;
    private static volatile Y<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC11539z<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C11538y.g sessionVerbosity_ = AbstractC11536w.F();

    public static final class c extends AbstractC11536w.a<k, c> implements Q {
        /* synthetic */ c(a aVar) {
            this();
        }

        private c() {
            super(k.DEFAULT_INSTANCE);
        }

        public c G(l lVar) {
            x();
            ((k) this.f90736b).c0(lVar);
            return this;
        }

        public c H(String str) {
            x();
            ((k) this.f90736b).h0(str);
            return this;
        }
    }

    class a implements InterfaceC11539z<Integer, l> {
        a() {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60252a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60252a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60252a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60252a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60252a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60252a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60252a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60252a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC11536w.W(k.class, kVar);
    }

    private void d0() {
        C11538y.g gVar = this.sessionVerbosity_;
        if (gVar.j()) {
            return;
        }
        this.sessionVerbosity_ = AbstractC11536w.Q(gVar);
    }

    public static c g0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (b.f60252a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.e()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<k> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (k.class) {
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

    public l e0(int i10) {
        l lVarB = l.b(this.sessionVerbosity_.getInt(i10));
        return lVarB == null ? l.SESSION_VERBOSITY_NONE : lVarB;
    }

    public int f0() {
        return this.sessionVerbosity_.size();
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(l lVar) {
        lVar.getClass();
        d0();
        this.sessionVerbosity_.c2(lVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
