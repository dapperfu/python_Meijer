package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Enum;
import java.util.Locale;
import qw.c;
import qw.d;

/* loaded from: classes7.dex */
public class SafeEnumAdapter<E extends Enum<E>> extends TypeAdapter<E> {
    private static final c LOG = d.j(SafeEnumAdapter.class.getName());
    private final Class<E> clazz;
    private final E unknownValue;

    @Override // com.google.gson.TypeAdapter
    public E read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        try {
            return (E) Enum.valueOf(this.clazz, strNextString.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException unused) {
            LOG.g("Unknown type for enum {}: '{}'", this.clazz.getName(), strNextString);
            return this.unknownValue;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, E e10) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    public SafeEnumAdapter(E e10) {
        if (e10 != null) {
            this.unknownValue = e10;
            this.clazz = e10.getDeclaringClass();
            return;
        }
        throw new IllegalArgumentException();
    }
}
