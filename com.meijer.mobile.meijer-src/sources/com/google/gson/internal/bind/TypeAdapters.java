package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.A;
import com.google.gson.internal.C;
import com.google.gson.internal.I;
import com.google.gson.k;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import com.google.maps.android.BuildConfig;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes8.dex */
public final class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f90425A;

    /* renamed from: B, reason: collision with root package name */
    public static final TypeAdapter<A> f90426B;

    /* renamed from: C, reason: collision with root package name */
    public static final v f90427C;

    /* renamed from: D, reason: collision with root package name */
    public static final TypeAdapter<StringBuilder> f90428D;

    /* renamed from: E, reason: collision with root package name */
    public static final v f90429E;

    /* renamed from: F, reason: collision with root package name */
    public static final TypeAdapter<StringBuffer> f90430F;

    /* renamed from: G, reason: collision with root package name */
    public static final v f90431G;

    /* renamed from: H, reason: collision with root package name */
    public static final TypeAdapter<URL> f90432H;

    /* renamed from: I, reason: collision with root package name */
    public static final v f90433I;

    /* renamed from: J, reason: collision with root package name */
    public static final TypeAdapter<URI> f90434J;

    /* renamed from: K, reason: collision with root package name */
    public static final v f90435K;

    /* renamed from: L, reason: collision with root package name */
    public static final TypeAdapter<InetAddress> f90436L;

    /* renamed from: M, reason: collision with root package name */
    public static final v f90437M;

    /* renamed from: N, reason: collision with root package name */
    public static final TypeAdapter<UUID> f90438N;

    /* renamed from: O, reason: collision with root package name */
    public static final v f90439O;

    /* renamed from: P, reason: collision with root package name */
    public static final TypeAdapter<Currency> f90440P;

    /* renamed from: Q, reason: collision with root package name */
    public static final v f90441Q;

    /* renamed from: R, reason: collision with root package name */
    public static final TypeAdapter<Calendar> f90442R;

    /* renamed from: S, reason: collision with root package name */
    public static final v f90443S;

    /* renamed from: T, reason: collision with root package name */
    public static final TypeAdapter<Locale> f90444T;

    /* renamed from: U, reason: collision with root package name */
    public static final v f90445U;

    /* renamed from: V, reason: collision with root package name */
    public static final TypeAdapter<k> f90446V;

    /* renamed from: W, reason: collision with root package name */
    public static final v f90447W;

    /* renamed from: X, reason: collision with root package name */
    public static final v f90448X;

    /* renamed from: a, reason: collision with root package name */
    public static final TypeAdapter<Class> f90449a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f90450b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<BitSet> f90451c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f90452d;

    /* renamed from: e, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f90453e;

    /* renamed from: f, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f90454f;

    /* renamed from: g, reason: collision with root package name */
    public static final v f90455g;

    /* renamed from: h, reason: collision with root package name */
    public static final TypeAdapter<Number> f90456h;

    /* renamed from: i, reason: collision with root package name */
    public static final v f90457i;

    /* renamed from: j, reason: collision with root package name */
    public static final TypeAdapter<Number> f90458j;

    /* renamed from: k, reason: collision with root package name */
    public static final v f90459k;

    /* renamed from: l, reason: collision with root package name */
    public static final TypeAdapter<Number> f90460l;

    /* renamed from: m, reason: collision with root package name */
    public static final v f90461m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter<AtomicInteger> f90462n;

    /* renamed from: o, reason: collision with root package name */
    public static final v f90463o;

    /* renamed from: p, reason: collision with root package name */
    public static final TypeAdapter<AtomicBoolean> f90464p;

    /* renamed from: q, reason: collision with root package name */
    public static final v f90465q;

    /* renamed from: r, reason: collision with root package name */
    public static final TypeAdapter<AtomicIntegerArray> f90466r;

    /* renamed from: s, reason: collision with root package name */
    public static final v f90467s;

    /* renamed from: t, reason: collision with root package name */
    public static final TypeAdapter<Number> f90468t;

    /* renamed from: u, reason: collision with root package name */
    public static final TypeAdapter<Number> f90469u;

    /* renamed from: v, reason: collision with root package name */
    public static final TypeAdapter<Number> f90470v;

    /* renamed from: w, reason: collision with root package name */
    public static final TypeAdapter<Character> f90471w;

    /* renamed from: x, reason: collision with root package name */
    public static final v f90472x;

    /* renamed from: y, reason: collision with root package name */
    public static final TypeAdapter<String> f90473y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f90474z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90489a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f90489a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90489a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90489a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        TypeAdapter<Class> typeAdapterNullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Class read(JsonReader jsonReader) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + I.a("java-lang-class-unsupported"));
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + I.a("java-lang-class-unsupported"));
            }
        }.nullSafe();
        f90449a = typeAdapterNullSafe;
        f90450b = b(Class.class, typeAdapterNullSafe);
        TypeAdapter<BitSet> typeAdapterNullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BitSet read(JsonReader jsonReader) throws IOException, NumberFormatException {
                BitSet bitSet = new BitSet();
                jsonReader.beginArray();
                JsonToken jsonTokenPeek = jsonReader.peek();
                int i10 = 0;
                while (jsonTokenPeek != JsonToken.END_ARRAY) {
                    int i11 = a.f90489a[jsonTokenPeek.ordinal()];
                    boolean zNextBoolean = true;
                    if (i11 == 1 || i11 == 2) {
                        int iNextInt = jsonReader.nextInt();
                        if (iNextInt == 0) {
                            zNextBoolean = false;
                        } else if (iNextInt != 1) {
                            throw new JsonSyntaxException("Invalid bitset value " + iNextInt + ", expected 0 or 1; at path " + jsonReader.getPreviousPath());
                        }
                    } else {
                        if (i11 != 3) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
                        }
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                    if (zNextBoolean) {
                        bitSet.set(i10);
                    }
                    i10++;
                    jsonTokenPeek = jsonReader.peek();
                }
                jsonReader.endArray();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
                jsonWriter.beginArray();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        f90451c = typeAdapterNullSafe2;
        f90452d = b(BitSet.class, typeAdapterNullSafe2);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonTokenPeek == JsonToken.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
                return Boolean.valueOf(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        f90453e = typeAdapter;
        f90454f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool == null ? BuildConfig.TRAVIS : bool.toString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Boolean.valueOf(jsonReader.nextString());
            }
        };
        f90455g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.byteValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 255 && iNextInt >= -128) {
                        return Byte.valueOf((byte) iNextInt);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iNextInt + " to byte; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
        };
        f90456h = typeAdapter2;
        f90457i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.shortValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int iNextInt = jsonReader.nextInt();
                    if (iNextInt <= 65535 && iNextInt >= -32768) {
                        return Short.valueOf((short) iNextInt);
                    }
                    throw new JsonSyntaxException("Lossy conversion from " + iNextInt + " to short; at path " + jsonReader.getPreviousPath());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
        };
        f90458j = typeAdapter3;
        f90459k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.intValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
        };
        f90460l = typeAdapter4;
        f90461m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> typeAdapterNullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicInteger read(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe();
        f90462n = typeAdapterNullSafe3;
        f90463o = b(AtomicInteger.class, typeAdapterNullSafe3);
        TypeAdapter<AtomicBoolean> typeAdapterNullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicBoolean read(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe();
        f90464p = typeAdapterNullSafe4;
        f90465q = b(AtomicBoolean.class, typeAdapterNullSafe4);
        TypeAdapter<AtomicIntegerArray> typeAdapterNullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    jsonWriter.value(atomicIntegerArray.get(i10));
                }
                jsonWriter.endArray();
            }
        }.nullSafe();
        f90466r = typeAdapterNullSafe5;
        f90467s = b(AtomicIntegerArray.class, typeAdapterNullSafe5);
        f90468t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.longValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
        };
        f90469u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                jsonWriter.value(number);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Float.valueOf((float) jsonReader.nextDouble());
            }
        };
        f90470v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number.doubleValue());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return Double.valueOf(jsonReader.nextDouble());
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Character ch2) throws IOException {
                jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.length() == 1) {
                    return Character.valueOf(strNextString.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + strNextString + "; at " + jsonReader.getPreviousPath());
            }
        };
        f90471w = typeAdapter5;
        f90472x = c(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String read(JsonReader jsonReader) throws IOException {
                JsonToken jsonTokenPeek = jsonReader.peek();
                if (jsonTokenPeek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                if (jsonTokenPeek == JsonToken.BOOLEAN) {
                    return Boolean.toString(jsonReader.nextBoolean());
                }
                return jsonReader.nextString();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        f90473y = typeAdapter6;
        f90474z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BigDecimal read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return C.b(strNextString);
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as BigDecimal; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        f90425A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BigInteger read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return C.c(strNextString);
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as BigInteger; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        f90426B = new TypeAdapter<A>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public A read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new A(jsonReader.nextString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, A a10) throws IOException {
                jsonWriter.value(a10);
            }
        };
        f90427C = b(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
                jsonWriter.value(sb2 == null ? null : sb2.toString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuilder(jsonReader.nextString());
            }
        };
        f90428D = typeAdapter7;
        f90429E = b(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return new StringBuffer(jsonReader.nextString());
            }
        };
        f90430F = typeAdapter8;
        f90431G = b(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, URL url) throws IOException {
                jsonWriter.value(url == null ? null : url.toExternalForm());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                if (strNextString.equals(BuildConfig.TRAVIS)) {
                    return null;
                }
                return new URL(strNextString);
            }
        };
        f90432H = typeAdapter9;
        f90433I = b(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, URI uri) throws IOException {
                jsonWriter.value(uri == null ? null : uri.toASCIIString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String strNextString = jsonReader.nextString();
                    if (strNextString.equals(BuildConfig.TRAVIS)) {
                        return null;
                    }
                    return new URI(strNextString);
                } catch (URISyntaxException e10) {
                    throw new JsonIOException(e10);
                }
            }
        };
        f90434J = typeAdapter10;
        f90435K = b(URI.class, typeAdapter10);
        TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                return InetAddress.getByName(jsonReader.nextString());
            }
        };
        f90436L = typeAdapter11;
        f90437M = e(InetAddress.class, typeAdapter11);
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                jsonWriter.value(uuid == null ? null : uuid.toString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String strNextString = jsonReader.nextString();
                try {
                    return UUID.fromString(strNextString);
                } catch (IllegalArgumentException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as UUID; at path " + jsonReader.getPreviousPath(), e10);
                }
            }
        };
        f90438N = typeAdapter12;
        f90439O = b(UUID.class, typeAdapter12);
        TypeAdapter<Currency> typeAdapterNullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Currency read(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(strNextString);
                } catch (IllegalArgumentException e10) {
                    throw new JsonSyntaxException("Failed parsing '" + strNextString + "' as Currency; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe();
        f90440P = typeAdapterNullSafe6;
        f90441Q = b(Currency.class, typeAdapterNullSafe6);
        TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(calendar.get(1));
                jsonWriter.name("month");
                jsonWriter.value(calendar.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(calendar.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(calendar.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(calendar.get(12));
                jsonWriter.name("second");
                jsonWriter.value(calendar.get(13));
                jsonWriter.endObject();
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Calendar read(JsonReader jsonReader) throws IOException, NumberFormatException {
                int iNextInt;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String strNextName = jsonReader.nextName();
                    iNextInt = jsonReader.nextInt();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "dayOfMonth":
                            i12 = iNextInt;
                            break;
                        case "minute":
                            i14 = iNextInt;
                            break;
                        case "second":
                            i15 = iNextInt;
                            break;
                        case "year":
                            i10 = iNextInt;
                            break;
                        case "month":
                            i11 = iNextInt;
                            break;
                        case "hourOfDay":
                            i13 = iNextInt;
                            break;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }
        };
        f90442R = typeAdapter13;
        f90443S = d(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(JsonWriter jsonWriter, Locale locale) throws IOException {
                jsonWriter.value(locale == null ? null : locale.toString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Locale read(JsonReader jsonReader) throws IOException {
                String strNextToken;
                String strNextToken2;
                String strNextToken3 = null;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    strNextToken = stringTokenizer.nextToken();
                } else {
                    strNextToken = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    strNextToken2 = stringTokenizer.nextToken();
                } else {
                    strNextToken2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    strNextToken3 = stringTokenizer.nextToken();
                }
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                if (strNextToken3 == null) {
                    return new Locale(strNextToken, strNextToken2);
                }
                return new Locale(strNextToken, strNextToken2, strNextToken3);
            }
        };
        f90444T = typeAdapter14;
        f90445U = b(Locale.class, typeAdapter14);
        JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f90366a;
        f90446V = jsonElementTypeAdapter;
        f90447W = e(k.class, jsonElementTypeAdapter);
        f90448X = EnumTypeAdapter.f90358d;
    }

    public static <TT> v a(final com.google.gson.reflect.a<TT> aVar, final TypeAdapter<TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> v b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> v c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return typeAdapter;
            }
        };
    }

    public static <TT> v d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return typeAdapter;
            }
        };
    }

    public static <T1> v e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }

            @Override // com.google.gson.v
            public <T2> TypeAdapter<T2> create(Gson gson, com.google.gson.reflect.a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                    @Override // com.google.gson.TypeAdapter
                    public T1 read(JsonReader jsonReader) throws IOException {
                        T1 t12 = (T1) typeAdapter.read(jsonReader);
                        if (t12 == null || rawType.isInstance(t12)) {
                            return t12;
                        }
                        throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + t12.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(JsonWriter jsonWriter, T1 t12) throws IOException {
                        typeAdapter.write(jsonWriter, t12);
                    }
                };
            }
        };
    }
}
