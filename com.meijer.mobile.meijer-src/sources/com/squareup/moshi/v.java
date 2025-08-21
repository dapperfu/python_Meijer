package com.squareup.moshi;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import gu.C14410c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final h.e f127400a = new c();

    /* renamed from: b, reason: collision with root package name */
    static final com.squareup.moshi.h<Boolean> f127401b = new d();

    /* renamed from: c, reason: collision with root package name */
    static final com.squareup.moshi.h<Byte> f127402c = new e();

    /* renamed from: d, reason: collision with root package name */
    static final com.squareup.moshi.h<Character> f127403d = new f();

    /* renamed from: e, reason: collision with root package name */
    static final com.squareup.moshi.h<Double> f127404e = new g();

    /* renamed from: f, reason: collision with root package name */
    static final com.squareup.moshi.h<Float> f127405f = new h();

    /* renamed from: g, reason: collision with root package name */
    static final com.squareup.moshi.h<Integer> f127406g = new i();

    /* renamed from: h, reason: collision with root package name */
    static final com.squareup.moshi.h<Long> f127407h = new j();

    /* renamed from: i, reason: collision with root package name */
    static final com.squareup.moshi.h<Short> f127408i = new k();

    /* renamed from: j, reason: collision with root package name */
    static final com.squareup.moshi.h<String> f127409j = new a();

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
            return Byte.valueOf((byte) v.a(kVar, "a byte", -128, l3.f93323c));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }

        e() {
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, Byte b10) throws IOException {
            qVar.K(b10.intValue() & l3.f93323c);
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
        private final Class<T> f127411a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f127412b;

        /* renamed from: c, reason: collision with root package name */
        private final T[] f127413c;

        /* renamed from: d, reason: collision with root package name */
        private final k.b f127414d;

        @Override // com.squareup.moshi.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T fromJson(com.squareup.moshi.k kVar) throws IOException {
            int iA = kVar.A(this.f127414d);
            if (iA != -1) {
                return this.f127413c[iA];
            }
            String path = kVar.getPath();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f127412b) + " but was " + kVar.nextString() + " at path " + path);
        }

        @Override // com.squareup.moshi.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(q qVar, T t10) throws IOException {
            qVar.R(this.f127412b[t10.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f127411a.getName() + ")";
        }

        l(Class<T> cls) {
            this.f127411a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f127413c = enumConstants;
                this.f127412b = new String[enumConstants.length];
                int i10 = 0;
                while (true) {
                    T[] tArr = this.f127413c;
                    if (i10 < tArr.length) {
                        String strName = tArr[i10].name();
                        this.f127412b[i10] = C14410c.n(strName, cls.getField(strName));
                        i10++;
                    } else {
                        this.f127414d = k.b.a(this.f127412b);
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
        private final t f127415a;

        /* renamed from: b, reason: collision with root package name */
        private final com.squareup.moshi.h<List> f127416b;

        /* renamed from: c, reason: collision with root package name */
        private final com.squareup.moshi.h<Map> f127417c;

        /* renamed from: d, reason: collision with root package name */
        private final com.squareup.moshi.h<String> f127418d;

        /* renamed from: e, reason: collision with root package name */
        private final com.squareup.moshi.h<Double> f127419e;

        /* renamed from: f, reason: collision with root package name */
        private final com.squareup.moshi.h<Boolean> f127420f;

        private Class<?> a(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.h
        public Object fromJson(com.squareup.moshi.k kVar) throws IOException {
            switch (b.f127410a[kVar.l().ordinal()]) {
                case 1:
                    return this.f127416b.fromJson(kVar);
                case 2:
                    return this.f127417c.fromJson(kVar);
                case 3:
                    return this.f127418d.fromJson(kVar);
                case 4:
                    return this.f127419e.fromJson(kVar);
                case 5:
                    return this.f127420f.fromJson(kVar);
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
            this.f127415a = tVar;
            this.f127416b = tVar.c(List.class);
            this.f127417c = tVar.c(Map.class);
            this.f127418d = tVar.c(String.class);
            this.f127419e = tVar.c(Double.class);
            this.f127420f = tVar.c(Boolean.class);
        }

        @Override // com.squareup.moshi.h
        public void toJson(q qVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                qVar.b();
                qVar.g();
            } else {
                this.f127415a.e(a(cls), C14410c.f134470a).toJson(qVar, (q) obj);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f127410a;

        static {
            int[] iArr = new int[k.c.values().length];
            f127410a = iArr;
            try {
                iArr[k.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127410a[k.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127410a[k.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f127410a[k.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f127410a[k.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f127410a[k.c.NULL.ordinal()] = 6;
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
                return v.f127401b;
            }
            if (type == Byte.TYPE) {
                return v.f127402c;
            }
            if (type == Character.TYPE) {
                return v.f127403d;
            }
            if (type == Double.TYPE) {
                return v.f127404e;
            }
            if (type == Float.TYPE) {
                return v.f127405f;
            }
            if (type == Integer.TYPE) {
                return v.f127406g;
            }
            if (type == Long.TYPE) {
                return v.f127407h;
            }
            if (type == Short.TYPE) {
                return v.f127408i;
            }
            if (type == Boolean.class) {
                return v.f127401b.nullSafe();
            }
            if (type == Byte.class) {
                return v.f127402c.nullSafe();
            }
            if (type == Character.class) {
                return v.f127403d.nullSafe();
            }
            if (type == Double.class) {
                return v.f127404e.nullSafe();
            }
            if (type == Float.class) {
                return v.f127405f.nullSafe();
            }
            if (type == Integer.class) {
                return v.f127406g.nullSafe();
            }
            if (type == Long.class) {
                return v.f127407h.nullSafe();
            }
            if (type == Short.class) {
                return v.f127408i.nullSafe();
            }
            if (type == String.class) {
                return v.f127409j.nullSafe();
            }
            if (type == Object.class) {
                return new m(tVar).nullSafe();
            }
            Class<?> clsG = x.g(type);
            com.squareup.moshi.h<?> hVarD = C14410c.d(tVar, type, clsG);
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
