package com.launchdarkly.sdk.json;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
class LDGson$LDTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private static LDGson$LDTypeAdapterFactory f92180a = new LDGson$LDTypeAdapterFactory();

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        if (!c.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        final Type type = aVar.getType();
        return new TypeAdapter<T>(type) { // from class: com.launchdarkly.sdk.json.LDGson$LDTypeAdapter

            /* renamed from: a, reason: collision with root package name */
            private final Type f92179a;

            @Override // com.google.gson.TypeAdapter
            public T read(JsonReader jsonReader) throws IOException {
                return (T) d.b(new e(jsonReader), this.f92179a);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, T t10) throws JsonIOException, IOException {
                if (t10 == null) {
                    jsonWriter.nullValue();
                } else {
                    d.f(t10, t10.getClass(), new f(jsonWriter));
                }
            }

            {
                this.f92179a = type;
            }
        };
    }

    private LDGson$LDTypeAdapterFactory() {
    }
}
