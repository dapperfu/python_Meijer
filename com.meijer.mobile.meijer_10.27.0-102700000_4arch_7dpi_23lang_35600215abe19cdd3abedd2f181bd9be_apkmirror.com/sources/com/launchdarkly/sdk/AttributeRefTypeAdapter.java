package com.launchdarkly.sdk;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes7.dex */
final class AttributeRefTypeAdapter extends TypeAdapter<AttributeRef> {
    AttributeRefTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AttributeRef read(JsonReader jsonReader) throws IOException {
        return AttributeRef.e(g.b(jsonReader));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, AttributeRef attributeRef) throws IOException {
        jsonWriter.value(attributeRef.toString());
    }
}
