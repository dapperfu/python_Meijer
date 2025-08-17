package com.google.gson;

import com.google.gson.internal.A;
import com.google.gson.internal.C;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public abstract class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final t f89713a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f89714b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f89715c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f89716d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ t[] f89717e;

    private t(String str, int i10) {
    }

    enum a extends t {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f89713a = aVar;
        t tVar = new t("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.t.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            public Number a(JsonReader jsonReader) throws IOException {
                return new A(jsonReader.nextString());
            }
        };
        f89714b = tVar;
        t tVar2 = new t("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.t.c
            {
                a aVar2 = null;
            }

            private Number b(String str, JsonReader jsonReader) throws NumberFormatException, IOException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!jsonReader.isLenient()) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + str + "; at path " + jsonReader.getPreviousPath(), e10);
                }
            }

            @Override // com.google.gson.u
            public Number a(JsonReader jsonReader) throws JsonParseException, IOException {
                String strNextString = jsonReader.nextString();
                if (strNextString.indexOf(46) >= 0) {
                    return b(strNextString, jsonReader);
                }
                try {
                    return Long.valueOf(Long.parseLong(strNextString));
                } catch (NumberFormatException unused) {
                    return b(strNextString, jsonReader);
                }
            }
        };
        f89715c = tVar2;
        t tVar3 = new t("BIG_DECIMAL", 3) { // from class: com.google.gson.t.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.u
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BigDecimal a(JsonReader jsonReader) throws IOException {
                String strNextString = jsonReader.nextString();
                try {
                    return C.b(strNextString);
                } catch (NumberFormatException e10) {
                    throw new JsonParseException("Cannot parse " + strNextString + "; at path " + jsonReader.getPreviousPath(), e10);
                }
            }
        };
        f89716d = tVar3;
        f89717e = new t[]{aVar, tVar, tVar2, tVar3};
    }

    /* synthetic */ t(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f89717e.clone();
    }
}
