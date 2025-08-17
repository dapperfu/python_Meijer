package bg;

import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.C11538y;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* loaded from: classes7.dex */
public final class g extends AbstractC11536w<g, b> implements Q {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile Y<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private C11538y.i<e> cpuMetricReadings_ = AbstractC11536w.G();
    private C11538y.i<bg.b> androidMemoryReadings_ = AbstractC11536w.G();

    public static final class b extends AbstractC11536w.a<g, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        public b G(bg.b bVar) {
            x();
            ((g) this.f90736b).e0(bVar);
            return this;
        }

        public b H(e eVar) {
            x();
            ((g) this.f90736b).f0(eVar);
            return this;
        }

        public b I(f fVar) {
            x();
            ((g) this.f90736b).p0(fVar);
            return this;
        }

        public b J(String str) {
            x();
            ((g) this.f90736b).q0(str);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60228a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60228a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60228a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60228a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60228a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60228a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60228a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60228a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC11536w.W(g.class, gVar);
    }

    private void g0() {
        C11538y.i<bg.b> iVar = this.androidMemoryReadings_;
        if (iVar.j()) {
            return;
        }
        this.androidMemoryReadings_ = AbstractC11536w.R(iVar);
    }

    private void h0() {
        C11538y.i<e> iVar = this.cpuMetricReadings_;
        if (iVar.j()) {
            return;
        }
        this.cpuMetricReadings_ = AbstractC11536w.R(iVar);
    }

    public static g k0() {
        return DEFAULT_INSTANCE;
    }

    public static b o0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f60228a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", bg.b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<g> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (g.class) {
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

    public int i0() {
        return this.androidMemoryReadings_.size();
    }

    public int j0() {
        return this.cpuMetricReadings_.size();
    }

    public f l0() {
        f fVar = this.gaugeMetadata_;
        return fVar == null ? f.d0() : fVar;
    }

    public boolean m0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean n0() {
        return (this.bitField0_ & 1) != 0;
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(bg.b bVar) {
        bVar.getClass();
        g0();
        this.androidMemoryReadings_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(e eVar) {
        eVar.getClass();
        h0();
        this.cpuMetricReadings_.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }
}
