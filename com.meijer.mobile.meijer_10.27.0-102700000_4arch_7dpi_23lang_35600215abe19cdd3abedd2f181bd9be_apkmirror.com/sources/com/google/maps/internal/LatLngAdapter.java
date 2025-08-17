package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.maps.model.LatLng;
import java.io.IOException;

/* loaded from: classes7.dex */
public class LatLngAdapter extends TypeAdapter<LatLng> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public LatLng read(JsonReader jsonReader) throws IOException, NumberFormatException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        boolean z10 = false;
        double dNextDouble = 0.0d;
        boolean z11 = false;
        double dNextDouble2 = 0.0d;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("lat".equals(strNextName) || "latitude".equals(strNextName)) {
                dNextDouble = jsonReader.nextDouble();
                z10 = true;
            } else if ("lng".equals(strNextName) || "longitude".equals(strNextName)) {
                dNextDouble2 = jsonReader.nextDouble();
                z11 = true;
            }
        }
        jsonReader.endObject();
        if (z10 && z11) {
            return new LatLng(dNextDouble, dNextDouble2);
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, LatLng latLng) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method.");
    }
}
