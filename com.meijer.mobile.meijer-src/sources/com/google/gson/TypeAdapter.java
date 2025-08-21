package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes8.dex */
public abstract class TypeAdapter<T> {

    private final class NullSafeTypeAdapter extends TypeAdapter<T> {
        private NullSafeTypeAdapter() {
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + TypeAdapter.this + "]";
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter.this.write(jsonWriter, t10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) TypeAdapter.this.read(jsonReader);
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new JsonReader(reader));
    }

    public abstract T read(JsonReader jsonReader) throws IOException;

    public final void toJson(Writer writer, T t10) throws IOException {
        write(new JsonWriter(writer), t10);
    }

    public abstract void write(JsonWriter jsonWriter, T t10) throws IOException;

    public final T fromJsonTree(k kVar) {
        try {
            return read(new com.google.gson.internal.bind.a(kVar));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return !(this instanceof NullSafeTypeAdapter) ? new NullSafeTypeAdapter() : this;
    }

    public final k toJsonTree(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            write(bVar, t10);
            return bVar.a();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }
}
