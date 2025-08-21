package com.launchdarkly.sdk;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes8.dex */
final class ContextKindTypeAdapter extends TypeAdapter<d> {
    ContextKindTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d read(JsonReader jsonReader) throws IOException {
        return d.e(g.b(jsonReader));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, d dVar) throws IOException {
        jsonWriter.value(dVar.toString());
    }
}
