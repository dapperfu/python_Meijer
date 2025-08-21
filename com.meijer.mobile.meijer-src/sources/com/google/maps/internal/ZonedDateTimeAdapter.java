package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.io.IOException;

/* loaded from: classes8.dex */
public class ZonedDateTimeAdapter extends TypeAdapter<ZonedDateTime> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public ZonedDateTime read(JsonReader jsonReader) throws IOException, NumberFormatException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        String strNextString = "";
        long jNextLong = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("text")) {
                jsonReader.nextString();
            } else if (strNextName.equals("time_zone")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("value")) {
                jNextLong = jsonReader.nextLong();
            }
        }
        jsonReader.endObject();
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(jNextLong * 1000), ZoneId.of(strNextString));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, ZonedDateTime zonedDateTime) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
