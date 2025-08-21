package com.google.crypto.tink.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes8.dex */
public final class JsonParser {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonElementTypeAdapter f89013a = new JsonElementTypeAdapter(null);

    private static final class JsonElementTypeAdapter extends TypeAdapter<com.google.gson.k> {
        private JsonElementTypeAdapter() {
        }

        /* synthetic */ JsonElementTypeAdapter(a aVar) {
            this();
        }

        private com.google.gson.k b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f89014a[jsonToken.ordinal()];
            if (i10 == 3) {
                String strNextString = jsonReader.nextString();
                if (JsonParser.a(strNextString)) {
                    return new com.google.gson.n(strNextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new com.google.gson.n(new b(jsonReader.nextString()));
            }
            if (i10 == 5) {
                return new com.google.gson.n(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i10 == 6) {
                jsonReader.nextNull();
                return com.google.gson.l.f90536a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        private com.google.gson.k c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i10 = a.f89014a[jsonToken.ordinal()];
            if (i10 == 1) {
                jsonReader.beginArray();
                return new com.google.gson.h();
            }
            if (i10 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new com.google.gson.m();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, com.google.gson.k kVar) {
            throw new UnsupportedOperationException("write is not supported");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.k read(JsonReader jsonReader) throws IOException {
            String strNextName;
            boolean z10;
            JsonToken jsonTokenPeek = jsonReader.peek();
            com.google.gson.k kVarC = c(jsonReader, jsonTokenPeek);
            if (kVarC == null) {
                return b(jsonReader, jsonTokenPeek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (kVarC instanceof com.google.gson.m) {
                        strNextName = jsonReader.nextName();
                        if (!JsonParser.a(strNextName)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        strNextName = null;
                    }
                    JsonToken jsonTokenPeek2 = jsonReader.peek();
                    com.google.gson.k kVarC2 = c(jsonReader, jsonTokenPeek2);
                    if (kVarC2 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (kVarC2 == null) {
                        kVarC2 = b(jsonReader, jsonTokenPeek2);
                    }
                    if (kVarC instanceof com.google.gson.h) {
                        ((com.google.gson.h) kVarC).o(kVarC2);
                    } else {
                        com.google.gson.m mVar = (com.google.gson.m) kVarC;
                        if (!mVar.v(strNextName)) {
                            mVar.o(strNextName, kVarC2);
                        } else {
                            throw new IOException("duplicate key: " + strNextName);
                        }
                    }
                    if (z10) {
                        arrayDeque.addLast(kVarC);
                        if (arrayDeque.size() <= 100) {
                            kVarC = kVarC2;
                        } else {
                            throw new IOException("too many recursions");
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (kVarC instanceof com.google.gson.h) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return kVarC;
                    }
                    kVarC = (com.google.gson.k) arrayDeque.removeLast();
                }
            }
        }
    }

    private static final class b extends Number {

        /* renamed from: a, reason: collision with root package name */
        private final String f89015a;

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f89015a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f89015a.equals(((b) obj).f89015a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f89015a);
        }

        public int hashCode() {
            return this.f89015a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f89015a);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(this.f89015a);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(this.f89015a).intValue();
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f89015a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f89015a).longValue();
            }
        }

        public String toString() {
            return this.f89015a;
        }

        public b(String str) {
            this.f89015a = str;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89014a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f89014a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89014a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89014a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89014a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89014a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89014a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char cCharAt = str.charAt(i10);
            int i11 = i10 + 1;
            if (Character.isSurrogate(cCharAt)) {
                if (Character.isLowSurrogate(cCharAt) || i11 == length || !Character.isLowSurrogate(str.charAt(i11))) {
                    return false;
                }
                i10 += 2;
            } else {
                i10 = i11;
            }
        }
        return true;
    }
}
