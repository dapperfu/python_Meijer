package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.maps.model.Duration;
import java.io.IOException;

/* loaded from: classes7.dex */
public class DurationAdapter extends TypeAdapter<Duration> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Duration read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Duration duration = new Duration();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("text")) {
                duration.humanReadable = jsonReader.nextString();
            } else if (strNextName.equals("value")) {
                duration.inSeconds = jsonReader.nextLong();
            }
        }
        jsonReader.endObject();
        return duration;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Duration duration) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
