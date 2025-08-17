package bg;

import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* renamed from: bg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6249a extends AbstractC11536w<C6249a, b> implements Q {
    private static final C6249a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile Y<C6249a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: bg.a$b */
    public static final class b extends AbstractC11536w.a<C6249a, b> implements Q {
        /* synthetic */ b(C1186a c1186a) {
            this();
        }

        private b() {
            super(C6249a.DEFAULT_INSTANCE);
        }

        public b G(String str) {
            x();
            ((C6249a) this.f90736b).h0(str);
            return this;
        }

        public b H(String str) {
            x();
            ((C6249a) this.f90736b).i0(str);
            return this;
        }

        public b I(String str) {
            x();
            ((C6249a) this.f90736b).j0(str);
            return this;
        }
    }

    /* renamed from: bg.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C1186a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60214a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60214a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60214a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60214a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60214a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60214a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60214a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60214a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        C6249a c6249a = new C6249a();
        DEFAULT_INSTANCE = c6249a;
        AbstractC11536w.W(C6249a.class, c6249a);
    }

    public static C6249a d0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        C1186a c1186a = null;
        switch (C1186a.f60214a[fVar.ordinal()]) {
            case 1:
                return new C6249a();
            case 2:
                return new b(c1186a);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<C6249a> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (C6249a.class) {
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

    public boolean e0() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean f0() {
        return (this.bitField0_ & 2) != 0;
    }

    private C6249a() {
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
