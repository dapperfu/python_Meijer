package dg;

import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.Y;
import dg.c;

/* loaded from: classes8.dex */
public final class i extends AbstractC11661w<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Y<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    public static final class b extends AbstractC11661w.a<i, b> implements j {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        @Override // dg.j
        public boolean i() {
            return ((i) this.f91575b).i();
        }

        @Override // dg.j
        public boolean j() {
            return ((i) this.f91575b).j();
        }

        @Override // dg.j
        public h k() {
            return ((i) this.f91575b).k();
        }

        @Override // dg.j
        public boolean m() {
            return ((i) this.f91575b).m();
        }

        @Override // dg.j
        public m n() {
            return ((i) this.f91575b).n();
        }

        @Override // dg.j
        public g o() {
            return ((i) this.f91575b).o();
        }

        public b G(c.b bVar) {
            x();
            ((i) this.f91575b).h0(bVar.build());
            return this;
        }

        public b H(g gVar) {
            x();
            ((i) this.f91575b).i0(gVar);
            return this;
        }

        public b I(h hVar) {
            x();
            ((i) this.f91575b).j0(hVar);
            return this;
        }

        public b J(m mVar) {
            x();
            ((i) this.f91575b).k0(mVar);
            return this;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128486a;

        static {
            int[] iArr = new int[AbstractC11661w.f.values().length];
            f128486a = iArr;
            try {
                iArr[AbstractC11661w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128486a[AbstractC11661w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128486a[AbstractC11661w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128486a[AbstractC11661w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128486a[AbstractC11661w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128486a[AbstractC11661w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128486a[AbstractC11661w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        AbstractC11661w.W(i.class, iVar);
    }

    public static b g0() {
        return DEFAULT_INSTANCE.B();
    }

    @Override // com.google.protobuf.AbstractC11661w
    protected final Object E(AbstractC11661w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f128486a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11661w.T(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<i> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (i.class) {
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

    public c e0() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.g0() : cVar;
    }

    public boolean f0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // dg.j
    public boolean i() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // dg.j
    public boolean j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // dg.j
    public h k() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.r0() : hVar;
    }

    @Override // dg.j
    public boolean m() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // dg.j
    public m n() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.t0() : mVar;
    }

    @Override // dg.j
    public g o() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.k0() : gVar;
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }
}
