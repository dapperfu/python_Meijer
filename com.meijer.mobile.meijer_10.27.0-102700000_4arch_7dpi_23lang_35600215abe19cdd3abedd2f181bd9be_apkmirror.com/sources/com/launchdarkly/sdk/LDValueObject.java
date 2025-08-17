package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import mg.InterfaceC15616b;

@InterfaceC15616b(LDValueTypeAdapter.class)
/* loaded from: classes7.dex */
final class LDValueObject extends LDValue {
    private static final LDValueObject EMPTY = new LDValueObject(Collections.EMPTY_MAP);
    private final Map<String, LDValue> map;

    @Override // com.launchdarkly.sdk.LDValue
    public LDValue g(String str) {
        LDValue lDValue = this.map.get(str);
        return lDValue == null ? LDValue.u() : lDValue;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public i h() {
        return i.OBJECT;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public Iterable<String> m() {
        return this.map.keySet();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public int w() {
        return this.map.size();
    }

    @Override // com.launchdarkly.sdk.LDValue
    public Iterable<LDValue> z() {
        return this.map.values();
    }

    private LDValueObject(Map<String, LDValue> map) {
        this.map = map;
    }

    static LDValueObject C(Map<String, LDValue> map) {
        if (map.isEmpty()) {
            return EMPTY;
        }
        return new LDValueObject(map);
    }

    @Override // com.launchdarkly.sdk.LDValue
    void B(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<String, LDValue> entry : this.map.entrySet()) {
            jsonWriter.name(entry.getKey());
            entry.getValue().B(jsonWriter);
        }
        jsonWriter.endObject();
    }
}
