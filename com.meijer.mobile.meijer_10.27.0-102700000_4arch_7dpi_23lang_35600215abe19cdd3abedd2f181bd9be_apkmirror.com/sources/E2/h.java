package E2;

import E2.g;
import androidx.datastore.preferences.protobuf.AbstractC5941g;
import androidx.datastore.preferences.protobuf.AbstractC5956w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;

/* loaded from: classes.dex */
public final class h extends AbstractC5956w<h, a> implements Q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y<h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC5956w.a<h, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        public a A(AbstractC5941g abstractC5941g) {
            r();
            ((h) this.f54462b).p0(abstractC5941g);
            return this;
        }

        public a C(double d10) {
            r();
            ((h) this.f54462b).q0(d10);
            return this;
        }

        public a D(float f10) {
            r();
            ((h) this.f54462b).r0(f10);
            return this;
        }

        public a E(int i10) {
            r();
            ((h) this.f54462b).s0(i10);
            return this;
        }

        public a F(long j10) {
            r();
            ((h) this.f54462b).t0(j10);
            return this;
        }

        public a G(String str) {
            r();
            ((h) this.f54462b).u0(str);
            return this;
        }

        public a H(g.a aVar) {
            r();
            ((h) this.f54462b).v0(aVar.build());
            return this;
        }

        public a z(boolean z10) {
            r();
            ((h) this.f54462b).o0(z10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* renamed from: a, reason: collision with root package name */
        private final int f7600a;

        b(int i10) {
            this.f7600a = i10;
        }

        public static b b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC5956w.Q(h.class, hVar);
    }

    public static h f0() {
        return DEFAULT_INSTANCE;
    }

    public static a n0() {
        return DEFAULT_INSTANCE.w();
    }

    public boolean d0() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC5941g e0() {
        return this.valueCase_ == 8 ? (AbstractC5941g) this.value_ : AbstractC5941g.f54232b;
    }

    public double g0() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float h0() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int i0() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long j0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String k0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g l0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.Y();
    }

    public b m0() {
        return b.b(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5956w
    protected final Object z(AbstractC5956w.f fVar, Object obj, Object obj2) {
        Y bVar;
        e eVar = null;
        switch (e.f7588a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC5956w.M(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
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
                            bVar = new AbstractC5956w.b(DEFAULT_INSTANCE);
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

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(AbstractC5941g abstractC5941g) {
        abstractC5941g.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC5941g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }
}
