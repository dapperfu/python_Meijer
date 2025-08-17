package com.google.gson;

import com.google.gson.internal.A;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.F;
import com.google.gson.internal.H;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes7.dex */
public final class Gson {

    /* renamed from: A, reason: collision with root package name */
    static final e f89378A = e.f89424d;

    /* renamed from: B, reason: collision with root package name */
    static final String f89379B = null;

    /* renamed from: C, reason: collision with root package name */
    static final d f89380C = c.f89416a;

    /* renamed from: D, reason: collision with root package name */
    static final u f89381D = t.f89713a;

    /* renamed from: E, reason: collision with root package name */
    static final u f89382E = t.f89714b;

    /* renamed from: z, reason: collision with root package name */
    static final s f89383z = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, TypeAdapter<?>>> f89384a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<com.google.gson.reflect.a<?>, TypeAdapter<?>> f89385b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.v f89386c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f89387d;

    /* renamed from: e, reason: collision with root package name */
    final List<v> f89388e;

    /* renamed from: f, reason: collision with root package name */
    final Excluder f89389f;

    /* renamed from: g, reason: collision with root package name */
    final d f89390g;

    /* renamed from: h, reason: collision with root package name */
    final Map<Type, g<?>> f89391h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f89392i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f89393j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f89394k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f89395l;

    /* renamed from: m, reason: collision with root package name */
    final e f89396m;

    /* renamed from: n, reason: collision with root package name */
    final s f89397n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f89398o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f89399p;

    /* renamed from: q, reason: collision with root package name */
    final String f89400q;

    /* renamed from: r, reason: collision with root package name */
    final int f89401r;

    /* renamed from: s, reason: collision with root package name */
    final int f89402s;

    /* renamed from: t, reason: collision with root package name */
    final q f89403t;

    /* renamed from: u, reason: collision with root package name */
    final List<v> f89404u;

    /* renamed from: v, reason: collision with root package name */
    final List<v> f89405v;

    /* renamed from: w, reason: collision with root package name */
    final u f89406w;

    /* renamed from: x, reason: collision with root package name */
    final u f89407x;

    /* renamed from: y, reason: collision with root package name */
    final List<r> f89408y;

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private TypeAdapter<T> f89413a = null;

        private TypeAdapter<T> b() {
            TypeAdapter<T> typeAdapter = this.f89413a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public void c(TypeAdapter<T> typeAdapter) {
            if (this.f89413a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f89413a = typeAdapter;
        }

        FutureTypeAdapter() {
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter<T> a() {
            return b();
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            return b().read(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            b().write(jsonWriter, t10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        Excluder excluder = Excluder.f89477g;
        d dVar = f89380C;
        Map map = Collections.EMPTY_MAP;
        e eVar = f89378A;
        s sVar = f89383z;
        q qVar = q.f89697a;
        String str = f89379B;
        List list = Collections.EMPTY_LIST;
        this(excluder, dVar, map, false, false, false, true, eVar, sVar, false, true, qVar, str, 2, 2, list, list, list, f89381D, f89382E, list);
    }

    private static void a(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLong read(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) typeAdapter.read(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                typeAdapter.write(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.read(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    typeAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
    }

    private TypeAdapter<Number> e(boolean z10) {
        return z10 ? TypeAdapters.f89628v : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                Gson.d(dDoubleValue);
                jsonWriter.value(dDoubleValue);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }
        };
    }

    private TypeAdapter<Number> f(boolean z10) {
        return z10 ? TypeAdapters.f89627u : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                float fFloatValue = number.floatValue();
                Gson.d(fFloatValue);
                if (!(number instanceof Float)) {
                    number = Float.valueOf(fFloatValue);
                }
                jsonWriter.value(number);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }
        };
    }

    private static TypeAdapter<Number> t(q qVar) {
        return qVar == q.f89697a ? TypeAdapters.f89626t : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.toString());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Long.valueOf(jsonReader.nextLong());
            }
        };
    }

    public void B(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            D(obj, obj.getClass(), appendable);
        } else {
            A(l.f89694a, appendable);
        }
    }

    public k E(Object obj) {
        return obj == null ? l.f89694a : F(obj, obj.getClass());
    }

    public k F(Object obj, Type type) throws JsonIOException {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        C(obj, type, bVar);
        return bVar.a();
    }

    public <T> T g(k kVar, com.google.gson.reflect.a<T> aVar) throws JsonSyntaxException {
        if (kVar == null) {
            return null;
        }
        return (T) j(new com.google.gson.internal.bind.a(kVar), aVar);
    }

    public <T> T n(String str, com.google.gson.reflect.a<T> aVar) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) l(new StringReader(str), aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.c(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.google.gson.TypeAdapter<T> q(com.google.gson.reflect.a<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.a<?>, com.google.gson.TypeAdapter<?>> r0 = r6.f89385b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.a<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.f89384a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.a<?>, com.google.gson.TypeAdapter<?>>> r1 = r6.f89384a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List<com.google.gson.v> r3 = r6.f89388e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.v r4 = (com.google.gson.v) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.c(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.a<?>, com.google.gson.TypeAdapter<?>>> r2 = r6.f89384a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.a<?>, com.google.gson.TypeAdapter<?>> r7 = r6.f89385b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.13.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.a<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.f89384a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.q(com.google.gson.reflect.a):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter<T> s(v vVar, com.google.gson.reflect.a<T> aVar) {
        Objects.requireNonNull(vVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.f89387d.d(aVar, vVar)) {
            vVar = this.f89387d;
        }
        boolean z10 = false;
        for (v vVar2 : this.f89388e) {
            if (z10) {
                TypeAdapter<T> typeAdapterCreate = vVar2.create(this, aVar);
                if (typeAdapterCreate != null) {
                    return typeAdapterCreate;
                }
            } else if (vVar2 == vVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return q(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public String toString() {
        return "{serializeNulls:" + this.f89392i + ",factories:" + this.f89388e + ",instanceCreators:" + this.f89386c + "}";
    }

    public JsonReader u(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        s sVar = this.f89397n;
        if (sVar == null) {
            sVar = s.LEGACY_STRICT;
        }
        jsonReader.setStrictness(sVar);
        return jsonReader;
    }

    public JsonWriter v(Writer writer) throws IOException {
        if (this.f89394k) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f89396m);
        jsonWriter.setHtmlSafe(this.f89395l);
        s sVar = this.f89397n;
        if (sVar == null) {
            sVar = s.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(sVar);
        jsonWriter.setSerializeNulls(this.f89392i);
        return jsonWriter;
    }

    public String w(k kVar) throws JsonIOException {
        StringWriter stringWriter = new StringWriter();
        A(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String x(Object obj) {
        return obj == null ? w(l.f89694a) : y(obj, obj.getClass());
    }

    public String y(Object obj, Type type) throws JsonIOException {
        StringWriter stringWriter = new StringWriter();
        D(obj, type, stringWriter);
        return stringWriter.toString();
    }

    static void d(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public void A(k kVar, Appendable appendable) throws JsonIOException {
        try {
            z(kVar, v(H.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void C(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter typeAdapterQ = q(com.google.gson.reflect.a.b(type));
        s strictness = jsonWriter.getStrictness();
        s sVar = this.f89397n;
        if (sVar != null) {
            jsonWriter.setStrictness(sVar);
        } else if (jsonWriter.getStrictness() == s.LEGACY_STRICT) {
            jsonWriter.setStrictness(s.LENIENT);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f89395l);
        jsonWriter.setSerializeNulls(this.f89392i);
        try {
            try {
                try {
                    typeAdapterQ.write(jsonWriter, obj);
                } catch (AssertionError e10) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public void D(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            C(obj, type, v(H.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public <T> T h(k kVar, Class<T> cls) throws JsonSyntaxException {
        return (T) g(kVar, com.google.gson.reflect.a.a(cls));
    }

    public <T> T i(k kVar, Type type) throws JsonSyntaxException {
        return (T) g(kVar, com.google.gson.reflect.a.b(type));
    }

    public <T> T j(JsonReader jsonReader, com.google.gson.reflect.a<T> aVar) throws JsonSyntaxException, JsonIOException {
        boolean z10;
        s strictness = jsonReader.getStrictness();
        s sVar = this.f89397n;
        if (sVar != null) {
            jsonReader.setStrictness(sVar);
        } else if (jsonReader.getStrictness() == s.LEGACY_STRICT) {
            jsonReader.setStrictness(s.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z10 = false;
                        try {
                            TypeAdapter<T> typeAdapterQ = q(aVar);
                            T t10 = typeAdapterQ.read(jsonReader);
                            Class clsB = F.b(aVar.c());
                            if (t10 != null && !clsB.isInstance(t10)) {
                                throw new ClassCastException("Type adapter '" + typeAdapterQ + "' returned wrong type; requested " + aVar.c() + " but got instance of " + t10.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return t10;
                        } catch (EOFException e10) {
                            e = e10;
                            if (z10) {
                                jsonReader.setStrictness(strictness);
                                return null;
                            }
                            throw new JsonSyntaxException(e);
                        }
                    } catch (EOFException e11) {
                        e = e11;
                        z10 = true;
                    }
                } catch (IOException e12) {
                    throw new JsonSyntaxException(e12);
                }
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e13.getMessage(), e13);
            } catch (IllegalStateException e14) {
                throw new JsonSyntaxException(e14);
            }
        } finally {
            jsonReader.setStrictness(strictness);
        }
    }

    public <T> T k(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
        return (T) j(jsonReader, com.google.gson.reflect.a.b(type));
    }

    public <T> T l(Reader reader, com.google.gson.reflect.a<T> aVar) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderU = u(reader);
        T t10 = (T) j(jsonReaderU, aVar);
        a(t10, jsonReaderU);
        return t10;
    }

    public <T> T m(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        return (T) l(reader, com.google.gson.reflect.a.a(cls));
    }

    public <T> T o(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) n(str, com.google.gson.reflect.a.a(cls));
    }

    public <T> T p(String str, Type type) throws JsonSyntaxException {
        return (T) n(str, com.google.gson.reflect.a.b(type));
    }

    public <T> TypeAdapter<T> r(Class<T> cls) {
        return q(com.google.gson.reflect.a.a(cls));
    }

    public void z(k kVar, JsonWriter jsonWriter) throws JsonIOException {
        s strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f89395l);
        jsonWriter.setSerializeNulls(this.f89392i);
        s sVar = this.f89397n;
        if (sVar != null) {
            jsonWriter.setStrictness(sVar);
        } else if (jsonWriter.getStrictness() == s.LEGACY_STRICT) {
            jsonWriter.setStrictness(s.LENIENT);
        }
        try {
            try {
                H.b(kVar, jsonWriter);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    Gson(Excluder excluder, d dVar, Map<Type, g<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, e eVar, s sVar, boolean z14, boolean z15, q qVar, String str, int i10, int i11, List<v> list, List<v> list2, List<v> list3, u uVar, u uVar2, List<r> list4) {
        this.f89384a = new ThreadLocal<>();
        this.f89385b = new ConcurrentHashMap();
        this.f89389f = excluder;
        this.f89390g = dVar;
        this.f89391h = map;
        com.google.gson.internal.v vVar = new com.google.gson.internal.v(map, z15, list4);
        this.f89386c = vVar;
        this.f89392i = z10;
        this.f89393j = z11;
        this.f89394k = z12;
        this.f89395l = z13;
        this.f89396m = eVar;
        this.f89397n = sVar;
        this.f89398o = z14;
        this.f89399p = z15;
        this.f89403t = qVar;
        this.f89400q = str;
        this.f89401r = i10;
        this.f89402s = i11;
        this.f89404u = list;
        this.f89405v = list2;
        this.f89406w = uVar;
        this.f89407x = uVar2;
        this.f89408y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f89605W);
        arrayList.add(ObjectTypeAdapter.a(uVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f89585C);
        arrayList.add(TypeAdapters.f89619m);
        arrayList.add(TypeAdapters.f89613g);
        arrayList.add(TypeAdapters.f89615i);
        arrayList.add(TypeAdapters.f89617k);
        TypeAdapter<Number> typeAdapterT = t(qVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapterT));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z14)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z14)));
        arrayList.add(NumberTypeAdapter.a(uVar2));
        arrayList.add(TypeAdapters.f89621o);
        arrayList.add(TypeAdapters.f89623q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(typeAdapterT)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(typeAdapterT)));
        arrayList.add(TypeAdapters.f89625s);
        arrayList.add(TypeAdapters.f89630x);
        arrayList.add(TypeAdapters.f89587E);
        arrayList.add(TypeAdapters.f89589G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f89632z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f89583A));
        arrayList.add(TypeAdapters.b(A.class, TypeAdapters.f89584B));
        arrayList.add(TypeAdapters.f89591I);
        arrayList.add(TypeAdapters.f89593K);
        arrayList.add(TypeAdapters.f89597O);
        arrayList.add(TypeAdapters.f89599Q);
        arrayList.add(TypeAdapters.f89603U);
        arrayList.add(TypeAdapters.f89595M);
        arrayList.add(TypeAdapters.f89610d);
        arrayList.add(DefaultDateTypeAdapter.f89511c);
        arrayList.add(TypeAdapters.f89601S);
        if (com.google.gson.internal.sql.a.f89676a) {
            arrayList.add(com.google.gson.internal.sql.a.f89680e);
            arrayList.add(com.google.gson.internal.sql.a.f89679d);
            arrayList.add(com.google.gson.internal.sql.a.f89681f);
        }
        arrayList.add(ArrayTypeAdapter.f89505c);
        arrayList.add(TypeAdapters.f89608b);
        arrayList.add(new CollectionTypeAdapterFactory(vVar));
        arrayList.add(new MapTypeAdapterFactory(vVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(vVar);
        this.f89387d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f89606X);
        arrayList.add(new ReflectiveTypeAdapterFactory(vVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f89388e = Collections.unmodifiableList(arrayList);
    }
}
