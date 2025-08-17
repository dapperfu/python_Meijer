package com.launchdarkly.sdk;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import mg.InterfaceC15616b;

@InterfaceC15616b(LDValueTypeAdapter.class)
/* loaded from: classes7.dex */
final class LDValueBool extends LDValue {
    private final boolean value;
    static final LDValueBool TRUE = new LDValueBool(true);
    static final LDValueBool FALSE = new LDValueBool(false);

    static LDValueBool C(boolean z10) {
        return z10 ? TRUE : FALSE;
    }

    @Override // com.launchdarkly.sdk.LDValue
    void B(JsonWriter jsonWriter) throws IOException {
        jsonWriter.value(this.value);
    }

    @Override // com.launchdarkly.sdk.LDValue
    public boolean a() {
        return this.value;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public i h() {
        return i.BOOLEAN;
    }

    @Override // com.launchdarkly.sdk.LDValue
    public String y() {
        return this.value ? "true" : "false";
    }

    private LDValueBool(boolean z10) {
        this.value = z10;
    }
}
