package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import com.launchdarkly.sdk.json.SerializationException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import og.InterfaceC16126b;

@InterfaceC16126b(LDValueTypeAdapter.class)
/* loaded from: classes8.dex */
public abstract class LDValue implements com.launchdarkly.sdk.json.c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements f<LDValue, T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f91839a;

        a(d dVar) {
            this.f91839a = dVar;
        }

        @Override // com.launchdarkly.sdk.f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T apply(LDValue lDValue) {
            return (T) this.f91839a.a(lDValue);
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final d<Boolean> f91842a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final d<Integer> f91843b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final d<Long> f91844c = new C1309c();

        /* renamed from: d, reason: collision with root package name */
        public static final d<Float> f91845d = new d();

        /* renamed from: e, reason: collision with root package name */
        public static final d<Double> f91846e = new e();

        /* renamed from: f, reason: collision with root package name */
        public static final d<String> f91847f = new f();

        static class a extends d<Boolean> {
            a() {
            }

            @Override // com.launchdarkly.sdk.LDValue.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Boolean a(LDValue lDValue) {
                return Boolean.valueOf(lDValue.a());
            }
        }

        static class b extends d<Integer> {
            b() {
            }

            @Override // com.launchdarkly.sdk.LDValue.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer a(LDValue lDValue) {
                return Integer.valueOf(lDValue.i());
            }
        }

        /* renamed from: com.launchdarkly.sdk.LDValue$c$c, reason: collision with other inner class name */
        static class C1309c extends d<Long> {
            C1309c() {
            }

            @Override // com.launchdarkly.sdk.LDValue.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Long a(LDValue lDValue) {
                return Long.valueOf(lDValue.n());
            }
        }

        static class d extends d<Float> {
            d() {
            }

            @Override // com.launchdarkly.sdk.LDValue.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Float a(LDValue lDValue) {
                return Float.valueOf(lDValue.e());
            }
        }

        static class e extends d<Double> {
            e() {
            }

            @Override // com.launchdarkly.sdk.LDValue.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Double a(LDValue lDValue) {
                return Double.valueOf(lDValue.d());
            }
        }

        static class f extends d<String> {
            f() {
            }

            @Override // com.launchdarkly.sdk.LDValue.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public String a(LDValue lDValue) {
                return lDValue.x();
            }
        }
    }

    public static abstract class d<T> {
        public abstract T a(LDValue lDValue);
    }

    static boolean j(double d10) {
        return d10 == ((double) ((int) d10));
    }

    public static LDValue q(int i10) {
        return LDValueNumber.C(i10);
    }

    public static LDValue r(long j10) {
        return LDValueNumber.C(j10);
    }

    abstract void B(JsonWriter jsonWriter) throws IOException;

    public boolean a() {
        return false;
    }

    public double d() {
        return 0.0d;
    }

    public float e() {
        return 0.0f;
    }

    public abstract i h();

    public int i() {
        return 0;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public long n() {
        return 0L;
    }

    public int w() {
        return 0;
    }

    public String x() {
        return null;
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91841a;

        static {
            int[] iArr = new int[i.values().length];
            f91841a = iArr;
            try {
                iArr[i.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91841a[i.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91841a[i.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91841a[i.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91841a[i.ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91841a[i.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static com.launchdarkly.sdk.a b() {
        return new com.launchdarkly.sdk.a();
    }

    public static j c() {
        return new j();
    }

    public static LDValue o(LDValue lDValue) {
        return lDValue == null ? u() : lDValue;
    }

    public static LDValue s(String str) {
        return str == null ? u() : LDValueString.C(str);
    }

    public static LDValue u() {
        return LDValueNull.INSTANCE;
    }

    public static LDValue v(String str) {
        try {
            return o((LDValue) com.launchdarkly.sdk.json.d.a(str, LDValue.class));
        } catch (SerializationException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof LDValue) {
            if (obj == this) {
                return true;
            }
            LDValue lDValue = (LDValue) obj;
            if (h() == lDValue.h()) {
                int i10 = b.f91841a[h().ordinal()];
                if (i10 == 1) {
                    return lDValue.k();
                }
                if (i10 == 2) {
                    return d() == lDValue.d();
                }
                if (i10 == 4) {
                    return x().equals(lDValue.x());
                }
                if (i10 == 5) {
                    if (w() != lDValue.w()) {
                        return false;
                    }
                    for (int i11 = 0; i11 < w(); i11++) {
                        if (!f(i11).equals(lDValue.f(i11))) {
                            return false;
                        }
                    }
                    return true;
                }
                if (i10 != 6 || w() != lDValue.w()) {
                    return false;
                }
                for (String str : m()) {
                    if (!g(str).equals(lDValue.g(str))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = b.f91841a[h().ordinal()];
        if (i10 == 2) {
            return i();
        }
        if (i10 == 3) {
            return a() ? 1 : 0;
        }
        if (i10 == 4) {
            return x().hashCode();
        }
        int iHashCode = 0;
        if (i10 == 5) {
            Iterator<LDValue> it = z().iterator();
            while (it.hasNext()) {
                iHashCode = (iHashCode * 31) + it.next().hashCode();
            }
            return iHashCode;
        }
        if (i10 != 6) {
            return 0;
        }
        for (String str : m()) {
            iHashCode = (((iHashCode * 31) + str.hashCode()) * 31) + g(str).hashCode();
        }
        return iHashCode;
    }

    public Iterable<String> m() {
        return Collections.EMPTY_LIST;
    }

    public Iterable<LDValue> z() {
        return Collections.EMPTY_LIST;
    }

    public static LDValue p(double d10) {
        return LDValueNumber.C(d10);
    }

    public static LDValue t(boolean z10) {
        return LDValueBool.C(z10);
    }

    public <T> Iterable<T> A(d<T> dVar) {
        return g.d(z(), new a(dVar));
    }

    public LDValue f(int i10) {
        return u();
    }

    public LDValue g(String str) {
        return u();
    }

    public String toString() {
        return y();
    }

    public String y() {
        return com.launchdarkly.sdk.json.d.d(this);
    }
}
