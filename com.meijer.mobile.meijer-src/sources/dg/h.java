package dg;

import com.google.protobuf.AbstractC11640a;
import com.google.protobuf.AbstractC11661w;
import com.google.protobuf.C11663y;
import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.Q;
import com.google.protobuf.Y;
import com.google.protobuf.r0;
import java.util.List;

/* loaded from: classes8.dex */
public final class h extends AbstractC11661w<h, b> implements Q {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Y<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private J<String, String> customAttributes_ = J.d();
    private String url_ = "";
    private String responseContentType_ = "";
    private C11663y.i<k> perfSessions_ = AbstractC11661w.G();

    public static final class b extends AbstractC11661w.a<h, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(h.DEFAULT_INSTANCE);
        }

        public long I() {
            return ((h) this.f91575b).A0();
        }

        public boolean J() {
            return ((h) this.f91575b).C0();
        }

        public boolean K() {
            return ((h) this.f91575b).E0();
        }

        public boolean L() {
            return ((h) this.f91575b).I0();
        }

        public b G(Iterable<? extends k> iterable) {
            x();
            ((h) this.f91575b).n0(iterable);
            return this;
        }

        public b H() {
            x();
            ((h) this.f91575b).o0();
            return this;
        }

        public b M(long j10) {
            x();
            ((h) this.f91575b).L0(j10);
            return this;
        }

        public b N(d dVar) {
            x();
            ((h) this.f91575b).M0(dVar);
            return this;
        }

        public b O(int i10) {
            x();
            ((h) this.f91575b).N0(i10);
            return this;
        }

        public b P(e eVar) {
            x();
            ((h) this.f91575b).O0(eVar);
            return this;
        }

        public b Q(long j10) {
            x();
            ((h) this.f91575b).P0(j10);
            return this;
        }

        public b R(String str) {
            x();
            ((h) this.f91575b).Q0(str);
            return this;
        }

        public b S(long j10) {
            x();
            ((h) this.f91575b).R0(j10);
            return this;
        }

        public b U(long j10) {
            x();
            ((h) this.f91575b).S0(j10);
            return this;
        }

        public b V(long j10) {
            x();
            ((h) this.f91575b).T0(j10);
            return this;
        }

        public b W(long j10) {
            x();
            ((h) this.f91575b).V0(j10);
            return this;
        }

        public b X(String str) {
            x();
            ((h) this.f91575b).W0(str);
            return this;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, String> f128465a;

        static {
            r0.b bVar = r0.b.f91470k;
            f128465a = I.d(bVar, "", bVar, "");
        }
    }

    public enum d implements C11663y.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);


        /* renamed from: l, reason: collision with root package name */
        private static final C11663y.d<d> f128476l = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f128478a;

        class a implements C11663y.d<d> {
            a() {
            }

            @Override // com.google.protobuf.C11663y.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i10) {
                return d.b(i10);
            }
        }

        private static final class b implements C11663y.e {

            /* renamed from: a, reason: collision with root package name */
            static final C11663y.e f128479a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C11663y.e
            public boolean a(int i10) {
                if (d.b(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        public static C11663y.e e() {
            return b.f128479a;
        }

        @Override // com.google.protobuf.C11663y.c
        public final int g() {
            return this.f128478a;
        }

        d(int i10) {
            this.f128478a = i10;
        }

        public static d b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }
    }

    public enum e implements C11663y.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);


        /* renamed from: d, reason: collision with root package name */
        private static final C11663y.d<e> f128482d = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f128484a;

        class a implements C11663y.d<e> {
            a() {
            }

            @Override // com.google.protobuf.C11663y.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e a(int i10) {
                return e.b(i10);
            }
        }

        private static final class b implements C11663y.e {

            /* renamed from: a, reason: collision with root package name */
            static final C11663y.e f128485a = new b();

            private b() {
            }

            @Override // com.google.protobuf.C11663y.e
            public boolean a(int i10) {
                if (e.b(i10) != null) {
                    return true;
                }
                return false;
            }
        }

        public static e b(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static C11663y.e e() {
            return b.f128485a;
        }

        @Override // com.google.protobuf.C11663y.c
        public final int g() {
            return this.f128484a;
        }

        e(int i10) {
            this.f128484a = i10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f128464a;

        static {
            int[] iArr = new int[AbstractC11661w.f.values().length];
            f128464a = iArr;
            try {
                iArr[AbstractC11661w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128464a[AbstractC11661w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128464a[AbstractC11661w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128464a[AbstractC11661w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f128464a[AbstractC11661w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128464a[AbstractC11661w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128464a[AbstractC11661w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC11661w.W(h.class, hVar);
    }

    public static b K0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(long j10) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V0(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = r0().w0();
    }

    private void p0() {
        C11663y.i<k> iVar = this.perfSessions_;
        if (iVar.j()) {
            return;
        }
        this.perfSessions_ = AbstractC11661w.R(iVar);
    }

    public static h r0() {
        return DEFAULT_INSTANCE;
    }

    public long A0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String B0() {
        return this.url_;
    }

    public boolean C0() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean D0() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC11661w
    protected final Object E(AbstractC11661w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f128464a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11661w.T(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.e(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.e(), "customAttributes_", c.f128465a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<h> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (h.class) {
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

    public boolean E0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean F0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean G0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean H0() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean I0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean J0() {
        return (this.bitField0_ & 512) != 0;
    }

    public long q0() {
        return this.clientStartTimeUs_;
    }

    public d s0() {
        d dVarB = d.b(this.httpMethod_);
        return dVarB == null ? d.HTTP_METHOD_UNKNOWN : dVarB;
    }

    public int t0() {
        return this.httpResponseCode_;
    }

    public List<k> u0() {
        return this.perfSessions_;
    }

    public long v0() {
        return this.requestPayloadBytes_;
    }

    public String w0() {
        return this.responseContentType_;
    }

    public long x0() {
        return this.responsePayloadBytes_;
    }

    public long y0() {
        return this.timeToRequestCompletedUs_;
    }

    public long z0() {
        return this.timeToResponseCompletedUs_;
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(d dVar) {
        this.httpMethod_ = dVar.g();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(e eVar) {
        this.networkClientErrorReason_ = eVar.g();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(Iterable<? extends k> iterable) {
        p0();
        AbstractC11640a.p(iterable, this.perfSessions_);
    }
}
