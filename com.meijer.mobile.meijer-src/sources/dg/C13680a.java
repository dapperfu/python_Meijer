package dg;

import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* renamed from: dg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13680a extends AbstractC11661w<C13680a, b> implements Q {
    private static final C13680a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Y<C13680a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: dg.a$b */
    public static final class b extends AbstractC11661w.a<C13680a, b> implements Q {
        /* synthetic */ b(C2019a c2019a) {
            this();
        }

        private b() {
            super(C13680a.DEFAULT_INSTANCE);
        }

        public b G(String str) {
            x();
            ((C13680a) this.f91575b).h0(str);
            return this;
        }

        public b H(String str) {
            x();
            ((C13680a) this.f91575b).i0(str);
            return this;
        }

        public b I(String str) {
            x();
            ((C13680a) this.f91575b).j0(str);
            return this;
        }
    }

    /* renamed from: dg.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2019a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128449a;

        static {
            int[] iArr = new int[AbstractC11661w.f.values().length];
            f128449a = iArr;
            try {
                iArr[AbstractC11661w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128449a[AbstractC11661w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128449a[AbstractC11661w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128449a[AbstractC11661w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128449a[AbstractC11661w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128449a[AbstractC11661w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128449a[AbstractC11661w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C13680a c13680a = new C13680a();
        DEFAULT_INSTANCE = c13680a;
        AbstractC11661w.W(C13680a.class, c13680a);
    }

    public static C13680a d0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11661w
    protected final Object E(AbstractC11661w.f fVar, Object obj, Object obj2) {
        Y bVar;
        C2019a c2019a = null;
        switch (C2019a.f128449a[fVar.ordinal()]) {
            case 1:
                return new C13680a();
            case 2:
                return new b(c2019a);
            case 3:
                return AbstractC11661w.T(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<C13680a> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (C13680a.class) {
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

    public boolean e0() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean f0() {
        return (this.bitField0_ & 2) != 0;
    }

    private C13680a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }
}
