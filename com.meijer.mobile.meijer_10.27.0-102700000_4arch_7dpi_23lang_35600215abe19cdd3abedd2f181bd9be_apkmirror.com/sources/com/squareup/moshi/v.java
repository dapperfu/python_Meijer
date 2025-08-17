package com.squareup.moshi;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final h.e f126448a = new c();

    /* renamed from: b, reason: collision with root package name */
    static final com.squareup.moshi.h<Boolean> f126449b = new d();

    /* renamed from: c, reason: collision with root package name */
    static final com.squareup.moshi.h<Byte> f126450c = new e();

    /* renamed from: d, reason: collision with root package name */
    static final com.squareup.moshi.h<Character> f126451d = new f();

    /* renamed from: e, reason: collision with root package name */
    static final com.squareup.moshi.h<Double> f126452e = new g();

    /* renamed from: f, reason: collision with root package name */
    static final com.squareup.moshi.h<Float> f126453f = new h();

    /* renamed from: g, reason: collision with root package name */
    static final com.squareup.moshi.h<Integer> f126454g = new i();

    /* renamed from: h, reason: collision with root package name */
    static final com.squareup.moshi.h<Long> f126455h = new j();

    /* renamed from: i, reason: collision with root package name */
    static final com.squareup.moshi.h<Short> f126456i = new k();

    /* renamed from: j, reason: collision with root package name */
    static final com.squareup.moshi.h<String> f126457j = new a();

    class a extends com.squareup.moshi.h<String> {
        public String toString() {
            return "JsonAdapter(String)";
        }

        a() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String fromJson(com.squareup.moshi.k kVar) throws IOException {
            return kVar.nextString();
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, String str) throws IOException {
            qVar.R(str);
        }
    }

    class d extends com.squareup.moshi.h<Boolean> {
        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        d() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean fromJson(com.squareup.moshi.k kVar) throws IOException {
            return Boolean.valueOf(kVar.nextBoolean());
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Boolean bool) throws IOException {
            qVar.T(bool.booleanValue());
        }
    }

    class e extends com.squareup.moshi.h<Byte> {
        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte fromJson(com.squareup.moshi.k kVar) throws IOException {
            return Byte.valueOf((byte) v.a(kVar, "a byte", -128, l3.f92484c));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }

        e() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Byte b10) throws IOException {
            qVar.K(b10.intValue() & l3.f92484c);
        }
    }

    class f extends com.squareup.moshi.h<Character> {
        public String toString() {
            return "JsonAdapter(Character)";
        }

        f() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Character fromJson(com.squareup.moshi.k kVar) throws IOException {
            String strNextString = kVar.nextString();
            if (strNextString.length() <= 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + strNextString + '\"', kVar.getPath()));
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Character ch2) throws IOException {
            qVar.R(ch2.toString());
        }
    }

    class g extends com.squareup.moshi.h<Double> {
        public String toString() {
            return "JsonAdapter(Double)";
        }

        g() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double fromJson(com.squareup.moshi.k kVar) throws IOException {
            return Double.valueOf(kVar.nextDouble());
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Double d10) throws IOException {
            qVar.J(d10.doubleValue());
        }
    }

    class h extends com.squareup.moshi.h<Float> {
        public String toString() {
            return "JsonAdapter(Float)";
        }

        h() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float fromJson(com.squareup.moshi.k kVar) throws IOException {
            float fNextDouble = (float) kVar.nextDouble();
            if (!kVar.h() && Float.isInfinite(fNextDouble)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + fNextDouble + " at path " + kVar.getPath());
            }
            return Float.valueOf(fNextDouble);
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Float f10) throws IOException {
            f10.getClass();
            qVar.O(f10);
        }
    }

    class i extends com.squareup.moshi.h<Integer> {
        public String toString() {
            return "JsonAdapter(Integer)";
        }

        i() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer fromJson(com.squareup.moshi.k kVar) throws IOException {
            return Integer.valueOf(kVar.nextInt());
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Integer num) throws IOException {
            qVar.K(num.intValue());
        }
    }

    class j extends com.squareup.moshi.h<Long> {
        public String toString() {
            return "JsonAdapter(Long)";
        }

        j() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long fromJson(com.squareup.moshi.k kVar) throws IOException {
            return Long.valueOf(kVar.nextLong());
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Long l10) throws IOException {
            qVar.K(l10.longValue());
        }
    }

    class k extends com.squareup.moshi.h<Short> {
        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Short fromJson(com.squareup.moshi.k kVar) throws IOException {
            return Short.valueOf((short) v.a(kVar, "a short", -32768, 32767));
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }

        k() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Short sh2) throws IOException {
            qVar.K(sh2.intValue());
        }
    }

    static final class l<T extends Enum<T>> extends com.squareup.moshi.h<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f126459a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f126460b;

        /* renamed from: c, reason: collision with root package name */
        private final T[] f126461c;

        /* renamed from: d, reason: collision with root package name */
        private final k.b f126462d;

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(com.squareup.moshi.k kVar) throws IOException {
            int iA = kVar.A(this.f126462d);
            if (iA != -1) {
                return this.f126461c[iA];
            }
            String path = kVar.getPath();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f126460b) + " but was " + kVar.nextString() + " at path " + path);
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, T t10) throws IOException {
            qVar.R(this.f126460b[t10.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f126459a.getName() + ")";
        }

        l(Class<T> cls) {
            this.f126459a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f126461c = enumConstants;
                this.f126460b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f126461c;
                    if (i10 < tArr.length) {
                        String strName = tArr[i10].name();
                        this.f126460b[i10] = gu.c.n(strName, cls.getField(strName));
                        i10++;
                    } else {
                        this.f126462d = k.b.a(this.f126460b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }
    }

    static final class m extends com.squareup.moshi.h<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final t f126463a;

        /* renamed from: b, reason: collision with root package name */
        private final com.squareup.moshi.h<List> f126464b;

        /* renamed from: c, reason: collision with root package name */
        private final com.squareup.moshi.h<Map> f126465c;

        /* renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.h<String> f126466d;

        /* renamed from: e, reason: collision with root package name */
        private final com.squareup.moshi.h<Double> f126467e;

        /* renamed from: f, reason: collision with root package name */
        private final com.squareup.moshi.h<Boolean> f126468f;

        private Class<?> a(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(com.squareup.moshi.k kVar) throws IOException {
            switch (b.f126458a[kVar.l().ordinal()]) {
                case 1:
                    return this.f126464b.fromJson(kVar);
                case 2:
                    return this.f126465c.fromJson(kVar);
                case 3:
                    return this.f126466d.fromJson(kVar);
                case 4:
                    return this.f126467e.fromJson(kVar);
                case 5:
                    return this.f126468f.fromJson(kVar);
                case 6:
                    return kVar.i();
                default:
                    throw new IllegalStateException("Expected a value but was " + kVar.l() + " at path " + kVar.getPath());
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }

        m(t tVar) {
            this.f126463a = tVar;
            this.f126464b = tVar.c(List.class);
            this.f126465c = tVar.c(Map.class);
            this.f126466d = tVar.c(String.class);
            this.f126467e = tVar.c(Double.class);
            this.f126468f = tVar.c(Boolean.class);
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                qVar.b();
                qVar.g();
            } else {
                this.f126463a.e(a(cls), gu.c.f134097a).toJson(qVar, (q) obj);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f126458a;

        static {
            int[] iArr = new int[k.c.values().length];
            f126458a = iArr;
            try {
                iArr[k.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f126458a[k.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f126458a[k.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f126458a[k.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f126458a[k.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f126458a[k.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class c implements h.e {
        c() {
        }

        @Override // com.squareup.moshi.h.e
        public com.squareup.moshi.h<?> a(Type type, Set<? extends Annotation> set, t tVar) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return v.f126449b;
            }
            if (type == Byte.TYPE) {
                return v.f126450c;
            }
            if (type == Character.TYPE) {
                return v.f126451d;
            }
            if (type == Double.TYPE) {
                return v.f126452e;
            }
            if (type == Float.TYPE) {
                return v.f126453f;
            }
            if (type == Integer.TYPE) {
                return v.f126454g;
            }
            if (type == Long.TYPE) {
                return v.f126455h;
            }
            if (type == Short.TYPE) {
                return v.f126456i;
            }
            if (type == Boolean.class) {
                return v.f126449b.nullSafe();
            }
            if (type == Byte.class) {
                return v.f126450c.nullSafe();
            }
            if (type == Character.class) {
                return v.f126451d.nullSafe();
            }
            if (type == Double.class) {
                return v.f126452e.nullSafe();
            }
            if (type == Float.class) {
                return v.f126453f.nullSafe();
            }
            if (type == Integer.class) {
                return v.f126454g.nullSafe();
            }
            if (type == Long.class) {
                return v.f126455h.nullSafe();
            }
            if (type == Short.class) {
                return v.f126456i.nullSafe();
            }
            if (type == String.class) {
                return v.f126457j.nullSafe();
            }
            if (type == Object.class) {
                return new m(tVar).nullSafe();
            }
            Class<?> clsG = x.g(type);
            com.squareup.moshi.h<?> hVarD = gu.c.d(tVar, type, clsG);
            if (hVarD != null) {
                return hVarD;
            }
            if (!clsG.isEnum()) {
                return null;
            }
            return new l(clsG).nullSafe();
        }
    }

    static int a(com.squareup.moshi.k kVar, String str, int i10, int i11) throws IOException {
        int iNextInt = kVar.nextInt();
        if (iNextInt >= i10 && iNextInt <= i11) {
            return iNextInt;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iNextInt), kVar.getPath()));
    }
}
