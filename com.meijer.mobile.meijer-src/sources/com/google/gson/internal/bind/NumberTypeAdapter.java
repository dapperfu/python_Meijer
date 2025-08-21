package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b, reason: collision with root package name */
    private static final v f90374b = b(t.f90553b);

    /* renamed from: a, reason: collision with root package name */
    private final u f90375a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90377a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f90377a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90377a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90377a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static v a(u uVar) {
        return uVar == t.f90553b ? f90374b : b(uVar);
    }

    private static v b(u uVar) {
        return new v() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    private NumberTypeAdapter(u uVar) {
        this.f90375a = uVar;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = a.f90377a[jsonTokenPeek.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
            }
            return this.f90375a.a(jsonReader);
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
