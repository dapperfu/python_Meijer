package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import og.InterfaceC16126b;

@InterfaceC16126b(LDValueTypeAdapter.class)
/* loaded from: classes8.dex */
final class LDValueString extends LDValue {
    private static final LDValueString EMPTY = new LDValueString("");
    private final String value;

    @Override // com.launchdarkly.sdk.LDValue
    public boolean l() {
        return true;
    }

    @Override // com.launchdarkly.sdk.LDValue
    void B(JsonWriter jsonWriter) throws IOException {
        jsonWriter.value(this.value);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public i h() {
        return i.STRING;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public String x() {
        return this.value;
    }

    private LDValueString(String str) {
        this.value = str;
    }

    static LDValueString C(String str) {
        if (str.isEmpty()) {
            return EMPTY;
        }
        return new LDValueString(str);
    }
}
