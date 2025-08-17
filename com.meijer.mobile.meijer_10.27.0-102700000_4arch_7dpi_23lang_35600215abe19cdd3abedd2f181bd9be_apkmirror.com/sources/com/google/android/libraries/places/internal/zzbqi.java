package com.google.android.libraries.places.internal;

import Be.p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbqi {
    private static final Logger zza = Logger.getLogger(zzbqi.class.getName());

    private zzbqi() {
    }

    public static Object zza(String str) throws IOException {
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            Object objZzb = zzb(jsonReader);
            try {
                jsonReader.close();
                return objZzb;
            } catch (IOException e10) {
                zza.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e10);
                return objZzb;
            }
        } finally {
        }
    }

    private static Object zzb(JsonReader jsonReader) throws IOException {
        p.x(jsonReader.hasNext(), "unexpected end of JSON");
        boolean z10 = false;
        switch (zzbqh.zza[jsonReader.peek().ordinal()]) {
            case 1:
                jsonReader.beginArray();
                ArrayList arrayList = new ArrayList();
                while (jsonReader.hasNext()) {
                    arrayList.add(zzb(jsonReader));
                }
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    z10 = true;
                }
                p.x(z10, "Bad token: ".concat(String.valueOf(jsonReader.getPath())));
                jsonReader.endArray();
                return Collections.unmodifiableList(arrayList);
            case 2:
                jsonReader.beginObject();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    p.l(!linkedHashMap.containsKey(strNextName), "Duplicate key found: %s", strNextName);
                    linkedHashMap.put(strNextName, zzb(jsonReader));
                }
                if (jsonReader.peek() == JsonToken.END_OBJECT) {
                    z10 = true;
                }
                p.x(z10, "Bad token: ".concat(String.valueOf(jsonReader.getPath())));
                jsonReader.endObject();
                return Collections.unmodifiableMap(linkedHashMap);
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException("Bad token: ".concat(String.valueOf(jsonReader.getPath())));
        }
    }
}
