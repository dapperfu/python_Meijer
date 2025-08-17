package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import j$.time.LocalTime;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;

/* loaded from: classes7.dex */
public class LocalTimeAdapter extends TypeAdapter<LocalTime> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public LocalTime read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() != JsonToken.STRING) {
            throw new UnsupportedOperationException("Unsupported format");
        }
        return LocalTime.parse(jsonReader.nextString(), DateTimeFormatter.ofPattern("HHmm"));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, LocalTime localTime) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
