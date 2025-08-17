package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.maps.model.Fare;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes7.dex */
public class FareAdapter extends TypeAdapter<Fare> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Fare read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Fare fare = new Fare();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("currency".equals(strNextName)) {
                fare.currency = Currency.getInstance(jsonReader.nextString());
            } else if ("value".equals(strNextName)) {
                fare.value = new BigDecimal(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return fare;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Fare fare) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
