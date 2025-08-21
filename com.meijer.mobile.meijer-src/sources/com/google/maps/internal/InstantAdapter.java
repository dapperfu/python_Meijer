package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import j$.time.Instant;
import java.io.IOException;

/* loaded from: classes8.dex */
public class InstantAdapter extends TypeAdapter<Instant> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Instant read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() == JsonToken.NUMBER) {
            return Instant.ofEpochMilli(jsonReader.nextLong() * 1000);
        }
        throw new UnsupportedOperationException("Unsupported format");
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Instant instant) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
