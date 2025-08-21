package com.google.maps.internal;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.maps.GeolocationApi;
import java.io.IOException;

/* loaded from: classes8.dex */
public class GeolocationResponseAdapter extends TypeAdapter<GeolocationApi.Response> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public GeolocationApi.Response read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        GeolocationApi.Response response = new GeolocationApi.Response();
        LatLngAdapter latLngAdapter = new LatLngAdapter();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("location")) {
                response.location = latLngAdapter.read(jsonReader);
            } else if (strNextName.equals("accuracy")) {
                response.accuracy = jsonReader.nextDouble();
            } else if (strNextName.equals("error")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("code")) {
                        response.code = jsonReader.nextInt();
                    } else if (strNextName2.equals("message")) {
                        response.message = jsonReader.nextString();
                    } else if (strNextName2.equals("errors")) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName3 = jsonReader.nextName();
                                if (strNextName3.equals("reason")) {
                                    response.reason = jsonReader.nextString();
                                } else if (strNextName3.equals("domain")) {
                                    response.domain = jsonReader.nextString();
                                } else if (strNextName3.equals("debugInfo")) {
                                    response.debugInfo = jsonReader.nextString();
                                } else if (strNextName3.equals("message")) {
                                    jsonReader.nextString();
                                } else if (strNextName3.equals("location")) {
                                    jsonReader.nextString();
                                } else if (strNextName3.equals("locationType")) {
                                    jsonReader.nextString();
                                }
                            }
                            jsonReader.endObject();
                        }
                        jsonReader.endArray();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        return response;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, GeolocationApi.Response response) throws IOException {
        throw new UnsupportedOperationException("Unimplemented method.");
    }
}
