package com.launchdarkly.sdk;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes8.dex */
final class LDValueTypeAdapter extends TypeAdapter<LDValue> {

    /* renamed from: a, reason: collision with root package name */
    static final LDValueTypeAdapter f91848a = new LDValueTypeAdapter();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91849a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f91849a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91849a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91849a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91849a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91849a[JsonToken.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91849a[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    LDValueTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LDValue read(JsonReader jsonReader) throws IOException {
        switch (a.f91849a[jsonReader.peek().ordinal()]) {
            case 1:
                com.launchdarkly.sdk.a aVarB = LDValue.b();
                jsonReader.beginArray();
                while (jsonReader.peek() != JsonToken.END_ARRAY) {
                    aVarB.a(read(jsonReader));
                }
                jsonReader.endArray();
                return aVarB.b();
            case 2:
                j jVarC = LDValue.c();
                jsonReader.beginObject();
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    jVarC.d(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return jVarC.a();
            case 3:
                return LDValue.t(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return LDValue.u();
            case 5:
                return LDValue.p(jsonReader.nextDouble());
            case 6:
                return LDValue.s(jsonReader.nextString());
            default:
                return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, LDValue lDValue) throws IOException {
        lDValue.B(jsonWriter);
    }
}
