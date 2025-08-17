package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.A;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
class JsonElementTypeAdapter extends TypeAdapter<k> {

    /* renamed from: a, reason: collision with root package name */
    static final JsonElementTypeAdapter f89524a = new JsonElementTypeAdapter();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89525a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f89525a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89525a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89525a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89525a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89525a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89525a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private k b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = a.f89525a[jsonToken.ordinal()];
        if (i10 == 3) {
            return new n(jsonReader.nextString());
        }
        if (i10 == 4) {
            return new n(new A(jsonReader.nextString()));
        }
        if (i10 == 5) {
            return new n(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return l.f89694a;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private k c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = a.f89525a[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new h();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new m();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public k read(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof com.google.gson.internal.bind.a) {
            return ((com.google.gson.internal.bind.a) jsonReader).b();
        }
        JsonToken jsonTokenPeek = jsonReader.peek();
        k kVarC = c(jsonReader, jsonTokenPeek);
        if (kVarC == null) {
            return b(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = kVarC instanceof m ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                k kVarC2 = c(jsonReader, jsonTokenPeek2);
                boolean z10 = kVarC2 != null;
                if (kVarC2 == null) {
                    kVarC2 = b(jsonReader, jsonTokenPeek2);
                }
                if (kVarC instanceof h) {
                    ((h) kVarC).o(kVarC2);
                } else {
                    ((m) kVarC).o(strNextName, kVarC2);
                }
                if (z10) {
                    arrayDeque.addLast(kVarC);
                    kVarC = kVarC2;
                }
            } else {
                if (kVarC instanceof h) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return kVarC;
                }
                kVarC = (k) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, k kVar) throws IOException {
        if (kVar == null || kVar.l()) {
            jsonWriter.nullValue();
            return;
        }
        if (kVar.n()) {
            n nVarF = kVar.f();
            if (nVarF.x()) {
                jsonWriter.value(nVarF.u());
                return;
            } else if (nVarF.v()) {
                jsonWriter.value(nVarF.q());
                return;
            } else {
                jsonWriter.value(nVarF.h());
                return;
            }
        }
        if (kVar.k()) {
            jsonWriter.beginArray();
            Iterator<k> it = kVar.a().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!kVar.m()) {
            throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, k> entry : kVar.e().s()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }

    private JsonElementTypeAdapter() {
    }
}
