package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.maps.model.PriceLevel;
import java.io.IOException;

/* loaded from: classes8.dex */
public class PriceLevelAdapter extends TypeAdapter<PriceLevel> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public PriceLevel read(JsonReader jsonReader) throws IOException, NumberFormatException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() == JsonToken.NUMBER) {
            int iNextInt = jsonReader.nextInt();
            if (iNextInt == 0) {
                return PriceLevel.FREE;
            }
            if (iNextInt == 1) {
                return PriceLevel.INEXPENSIVE;
            }
            if (iNextInt == 2) {
                return PriceLevel.MODERATE;
            }
            if (iNextInt == 3) {
                return PriceLevel.EXPENSIVE;
            }
            if (iNextInt == 4) {
                return PriceLevel.VERY_EXPENSIVE;
            }
        }
        return PriceLevel.UNKNOWN;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, PriceLevel priceLevel) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}
