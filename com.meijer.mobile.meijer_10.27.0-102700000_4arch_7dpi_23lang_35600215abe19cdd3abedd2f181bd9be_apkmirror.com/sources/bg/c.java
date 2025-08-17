package bg;

import bg.C6249a;
import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.Q;
import com.google.protobuf.Y;
import com.google.protobuf.r0;
import java.util.Map;

/* loaded from: classes7.dex */
public final class c extends AbstractC11536w<c, b> implements Q {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile Y<c> PARSER;
    private C6249a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private J<String, String> customAttributes_ = J.d();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    public static final class b extends AbstractC11536w.a<c, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        public boolean G() {
            return ((c) this.f90736b).j0();
        }

        public b H(Map<String, String> map) {
            x();
            ((c) this.f90736b).h0().putAll(map);
            return this;
        }

        public b I(C6249a.b bVar) {
            x();
            ((c) this.f90736b).o0(bVar.build());
            return this;
        }

        public b J(String str) {
            x();
            ((c) this.f90736b).p0(str);
            return this;
        }

        public b K(d dVar) {
            x();
            ((c) this.f90736b).q0(dVar);
            return this;
        }

        public b L(String str) {
            x();
            ((c) this.f90736b).r0(str);
            return this;
        }
    }

    /* renamed from: bg.c$c, reason: collision with other inner class name */
    private static final class C1188c {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, String> f60217a;

        static {
            r0.b bVar = r0.b.f90631k;
            f60217a = I.d(bVar, "", bVar, "");
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60216a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60216a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60216a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60216a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60216a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60216a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60216a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60216a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        AbstractC11536w.W(c.class, cVar);
    }

    public static c g0() {
        return DEFAULT_INSTANCE;
    }

    private J<String, String> m0() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b n0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f60216a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.e(), "customAttributes_", C1188c.f60217a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<c> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (c.class) {
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

    public C6249a f0() {
        C6249a c6249a = this.androidAppInfo_;
        return c6249a == null ? C6249a.d0() : c6249a;
    }

    public boolean i0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean j0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean k0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean l0() {
        return (this.bitField0_ & 1) != 0;
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> h0() {
        return m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(C6249a c6249a) {
        c6249a.getClass();
        this.androidAppInfo_ = c6249a;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(d dVar) {
        this.applicationProcessState_ = dVar.g();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }
}
