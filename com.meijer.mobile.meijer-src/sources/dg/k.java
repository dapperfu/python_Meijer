package dg;

import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.C11663y;
import com.google.protobuf.InterfaceC11664z;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* loaded from: classes8.dex */
public final class k extends AbstractC11661w<k, c> implements Q {
    private static final k DEFAULT_INSTANCE;
    private static volatile Y<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC11664z<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private C11663y.g sessionVerbosity_ = AbstractC11661w.F();

    public static final class c extends AbstractC11661w.a<k, c> implements Q {
        /* synthetic */ c(a aVar) {
            this();
        }

        private c() {
            super(k.DEFAULT_INSTANCE);
        }

        public c G(l lVar) {
            x();
            ((k) this.f91575b).c0(lVar);
            return this;
        }

        public c H(String str) {
            x();
            ((k) this.f91575b).h0(str);
            return this;
        }
    }

    class a implements InterfaceC11664z<Integer, l> {
        a() {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128487a;

        static {
            int[] iArr = new int[AbstractC11661w.f.values().length];
            f128487a = iArr;
            try {
                iArr[AbstractC11661w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128487a[AbstractC11661w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128487a[AbstractC11661w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128487a[AbstractC11661w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128487a[AbstractC11661w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128487a[AbstractC11661w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128487a[AbstractC11661w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC11661w.W(k.class, kVar);
    }

    private void d0() {
        C11663y.g gVar = this.sessionVerbosity_;
        if (gVar.j()) {
            return;
        }
        this.sessionVerbosity_ = AbstractC11661w.Q(gVar);
    }

    public static c g0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11661w
    protected final Object E(AbstractC11661w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (b.f128487a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(aVar);
            case 3:
                return AbstractC11661w.T(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.e()});
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
        this.sessionVerbosity_.b2(lVar.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
