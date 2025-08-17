package bg;

import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* loaded from: classes7.dex */
public final class f extends AbstractC11536w<f, b> implements Q {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Y<f> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    public static final class b extends AbstractC11536w.a<f, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }

        public b G(int i10) {
            x();
            ((f) this.f90736b).g0(i10);
            return this;
        }

        public b H(int i10) {
            x();
            ((f) this.f90736b).h0(i10);
            return this;
        }

        public b I(int i10) {
            x();
            ((f) this.f90736b).i0(i10);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60227a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60227a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60227a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60227a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60227a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60227a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60227a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60227a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC11536w.W(f.class, fVar);
    }

    public static f d0() {
        return DEFAULT_INSTANCE;
    }

    public static b f0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(int i10) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i10) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i10;
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f60227a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<f> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (f.class) {
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
        return (this.bitField0_ & 16) != 0;
    }

    private f() {
    }
}
