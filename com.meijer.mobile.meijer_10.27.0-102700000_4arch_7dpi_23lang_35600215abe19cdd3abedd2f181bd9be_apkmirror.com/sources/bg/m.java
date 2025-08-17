package bg;

import com.google.protobuf.AbstractC11515a;
import com.google.protobuf.AbstractC11536w;
import com.google.protobuf.C11538y;
import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.Q;
import com.google.protobuf.Y;
import com.google.protobuf.r0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class m extends AbstractC11536w<m, b> implements Q {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Y<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private J<String, Long> counters_ = J.d();
    private J<String, String> customAttributes_ = J.d();
    private String name_ = "";
    private C11538y.i<m> subtraces_ = AbstractC11536w.G();
    private C11538y.i<k> perfSessions_ = AbstractC11536w.G();

    public static final class b extends AbstractC11536w.a<m, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(m.DEFAULT_INSTANCE);
        }

        public b G(Iterable<? extends k> iterable) {
            x();
            ((m) this.f90736b).j0(iterable);
            return this;
        }

        public b H(Iterable<? extends m> iterable) {
            x();
            ((m) this.f90736b).k0(iterable);
            return this;
        }

        public b I(k kVar) {
            x();
            ((m) this.f90736b).l0(kVar);
            return this;
        }

        public b J(m mVar) {
            x();
            ((m) this.f90736b).m0(mVar);
            return this;
        }

        public b K(Map<String, Long> map) {
            x();
            ((m) this.f90736b).v0().putAll(map);
            return this;
        }

        public b L(Map<String, String> map) {
            x();
            ((m) this.f90736b).w0().putAll(map);
            return this;
        }

        public b M(String str, long j10) {
            str.getClass();
            x();
            ((m) this.f90736b).v0().put(str, Long.valueOf(j10));
            return this;
        }

        public b N(String str, String str2) {
            str.getClass();
            str2.getClass();
            x();
            ((m) this.f90736b).w0().put(str, str2);
            return this;
        }

        public b O(long j10) {
            x();
            ((m) this.f90736b).G0(j10);
            return this;
        }

        public b P(long j10) {
            x();
            ((m) this.f90736b).H0(j10);
            return this;
        }

        public b Q(String str) {
            x();
            ((m) this.f90736b).I0(str);
            return this;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, Long> f60260a = I.d(r0.b.f90631k, "", r0.b.f90625e, 0L);
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, String> f60261a;

        static {
            r0.b bVar = r0.b.f90631k;
            f60261a = I.d(bVar, "", bVar, "");
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60259a;

        static {
            int[] iArr = new int[AbstractC11536w.f.values().length];
            f60259a = iArr;
            try {
                iArr[AbstractC11536w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60259a[AbstractC11536w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60259a[AbstractC11536w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60259a[AbstractC11536w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60259a[AbstractC11536w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60259a[AbstractC11536w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60259a[AbstractC11536w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        AbstractC11536w.W(m.class, mVar);
    }

    private J<String, Long> B0() {
        return this.counters_;
    }

    private J<String, String> C0() {
        return this.customAttributes_;
    }

    private J<String, Long> D0() {
        if (!this.counters_.j()) {
            this.counters_ = this.counters_.q();
        }
        return this.counters_;
    }

    private J<String, String> E0() {
        if (!this.customAttributes_.j()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b F0() {
        return DEFAULT_INSTANCE.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    private void o0() {
        C11538y.i<k> iVar = this.perfSessions_;
        if (iVar.j()) {
            return;
        }
        this.perfSessions_ = AbstractC11536w.R(iVar);
    }

    private void p0() {
        C11538y.i<m> iVar = this.subtraces_;
        if (iVar.j()) {
            return;
        }
        this.subtraces_ = AbstractC11536w.R(iVar);
    }

    public static m t0() {
        return DEFAULT_INSTANCE;
    }

    public boolean A0() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC11536w
    protected final Object E(AbstractC11536w.f fVar, Object obj, Object obj2) {
        Y bVar;
        a aVar = null;
        switch (a.f60259a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC11536w.T(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f60260a, "subtraces_", m.class, "customAttributes_", d.f60261a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<m> y10 = PARSER;
                if (y10 != null) {
                    return y10;
                }
                synchronized (m.class) {
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

    public long u0() {
        return this.durationUs_;
    }

    public String x0() {
        return this.name_;
    }

    public List<k> y0() {
        return this.perfSessions_;
    }

    public List<m> z0() {
        return this.subtraces_;
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(Iterable<? extends k> iterable) {
        o0();
        AbstractC11515a.p(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(Iterable<? extends m> iterable) {
        p0();
        AbstractC11515a.p(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(k kVar) {
        kVar.getClass();
        o0();
        this.perfSessions_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(m mVar) {
        mVar.getClass();
        p0();
        this.subtraces_.add(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> v0() {
        return D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> w0() {
        return E0();
    }

    public boolean n0(String str) {
        str.getClass();
        return C0().containsKey(str);
    }

    public int q0() {
        return B0().size();
    }

    public Map<String, Long> r0() {
        return Collections.unmodifiableMap(B0());
    }

    public Map<String, String> s0() {
        return Collections.unmodifiableMap(C0());
    }
}
