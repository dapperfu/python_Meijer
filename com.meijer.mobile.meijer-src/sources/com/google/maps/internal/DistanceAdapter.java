package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.maps.model.Distance;
import java.io.IOException;

/* loaded from: classes8.dex */
public class DistanceAdapter extends TypeAdapter<Distance> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Distance read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Distance distance = new Distance();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("text")) {
                distance.humanReadable = jsonReader.nextString();
            } else if (strNextName.equals("value")) {
                distance.inMeters = jsonReader.nextLong();
            }
        }
        jsonReader.endObject();
        return distance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Distance distance) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
